<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update a customer</title>
        <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Update a customer :</h2>
         <form:form action="update_customer.htm" method="post" commandName="customers1">
                 
               <div>
                <form:label path="user_id">Customer ID for update is :</form:label><br>
                <form:input path="user_id" /> 
                <form:errors path="user_id" cssClass="error"></form:errors>
                </div> <br>            
                <div>
                <form:label path="name">Name :</form:label><br>
                <form:input path="name" /> 
                <form:errors path="name" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="last_name">Last name :</form:label><br>
                <form:input path="last_name" /> 
                <form:errors path="last_name" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="phone">Phone :</form:label><br>
                <form:input path="phone" /> 
                <form:errors path="phone" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="email">Email :</form:label><br>
                <form:input path="email" />
                <form:errors path="email" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="address">Address :</form:label><br>
                <form:input path="address" /> 
                <form:errors path="address" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="city">City :</form:label><br>
                <form:input path="city" /> 
                <form:errors path="city" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="country">Country :</form:label><br>
                <form:input path="country" /> 
                <form:errors path="country" cssClass="error"></form:errors>
                </div><br>
              
                <input type="submit" value="Update">
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

