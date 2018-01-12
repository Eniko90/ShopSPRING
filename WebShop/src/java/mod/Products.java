package mod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

public class Products {
    
    @NotNull
    private int product_id;
    @NotEmpty
    private String product_name;
    @NotNull
    private int state;
    @NotEmpty
    private String price;
    @NotNull
    private int quantity;

    public int getProduct_id() {
        return product_id;
    }


    public String getProduct_name() {
        return product_name;
    }

    public int getState() {
        return state;
    }

    public String getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setProduct_name (String product_name) {
        this.product_name = product_name;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    
    
         public void add() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into products (product_name,state,price)value('"+product_name+"','"+state+"','"+price+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
               public void update () throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("update products set product_name='"+product_name+"',state='"+state+"',price='"+price+"' where product_id='"+product_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
                       public void delete() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("delete from products where product_id='"+product_id+"'");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
                       public static String listPro () throws ClassNotFoundException{
                           StringBuilder allPro=new StringBuilder();
                              Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.executeQuery("select product_id,group,product_name,state,price from products");
                            ResultSet rs=st.getResultSet();
                            
                            while(rs.next()){
                                allPro.append(rs.getString("product_id"));
                                allPro.append(";  ");
                                allPro.append(rs.getString("product_name"));
                                allPro.append(";  ");
                                allPro.append(rs.getString("state"));
                                allPro.append(";  ");
                                allPro.append(rs.getString("price"));
                                allPro.append("\n");
                            }
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }  
        return allPro.toString();
                       }
    
    
}
