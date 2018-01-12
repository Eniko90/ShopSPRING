package mod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.validation.constraints.NotNull;

public class Sale {
    
    @NotNull
    private int user_id;
    @NotNull
    private int product_id;
    @NotNull
    private int quantity;

    public int getUser_id() {
        return user_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }
    
              public void purchase() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1807");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into sale (user_id,product_id,quantity)value('"+user_id+"','"+product_id+"','"+quantity+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }

                      
       public void upd() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
             
                            st.execute("update products set state=state-'"+quantity+"' where product_id='"+product_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        } 
}
    
    
    
}
