<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete a customer</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Delete customer :</h2>
         <form:form action="delete_customer.htm" method="post" commandName="customers2">
                 
               <div>
                <form:label path="user_id">Customer ID for deletion is :</form:label><br>
                <form:input path="user_id" /> 
                <form:errors path="user_id" cssClass="error"></form:errors>
                </div> <br>  
                
                <input type="submit" value="Delete">
                 </form:form><br><br>
        
        
        <h2>Available options :</h2>
        
                 <ul id="list">
			    <li><a href="index.htm">Home page</a></li>
			    <li><a href="add_customer.htm">Add a customer</a></li>
			    <li><a href="update_customer.htm">Update a customer</a></li>
			    <li><a href="delete_customer.htm">Delete a customer</a></li>
			    <li><a href="add_product.htm">Add a product</a></li>
			    <li><a href="update_product.htm">Update a product</a></li>
                            <li><a href="delete_product.htm">Delete a product</a></li>
			    <li><a href="purchase.htm">Purchase</a></li>
		     </ul>  
         </div>
    </body>
</html>