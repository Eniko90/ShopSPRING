package mod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;


public class Customers {
    
    
    @NotNull
    private int user_id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String last_name;
    @NotEmpty
    private String phone;
    @Email(message="Not a valid email!")
    @NotEmpty
    private String email;
    @NotEmpty
    private String address;
    @NotEmpty
    private String city;
    @NotEmpty
    private String country;

    public int getUser_id() {
        return user_id;
    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }


    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry (String country) {
        this.country = country;
    }
    
     public void add () throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("insert into customers (name,last_name,phone,email,address,city,country)value('"+name+"','"+last_name+"','"+phone+"','"+email+"','"+address+"','"+city+"','"+country+"')");
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
      public void update() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("update customers set name='"+name+"',last_name='"+last_name+"',phone='"+phone+"',email='"+email+"',address='"+address+"',city='"+city+"',country='"+country+"' where user_id='"+user_id+"' ");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
        public void delete() throws ClassNotFoundException{
           Class.forName("com.mysql.jdbc.Driver");
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/webshop", "root", "1804");) {
             
                            Statement st = conn.createStatement();
                            st.execute("delete from customers where user_id='"+user_id+"'");
                            
                           
                        } catch (Exception exc) {
                            System.out.println("Bad connection! :\n" + exc.getMessage());
                        }       
    }
    
    
    
}
