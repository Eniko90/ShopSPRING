<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Purchase</title>
                  <style>
            .error{
                color:red;
            }
        </style>
    </head>
    <body style="background-color: dimgrey;">
         <div style="broder-width:2px;border-color: black;border-style: solid;border-radius: 20px;background-color: azure;width: 1000px;padding: 20px;margin: 20px;margin-left: auto;margin-right: auto">
        <h2>Purchase :</h2>
            <form:form action="purchase.htm" method="post" commandName="sale">
                <div>
                <form:label path="user_id">Your ID :</form:label><br>
                <form:input path="user_id" /> 
                <form:errors path="user_id" cssClass="error"></form:errors>
                </div> <br>
                <div>
                <form:label path="product_id">Product ID :</form:label><br>
                <form:input path="product_id" /> 
                <form:errors path="product_id" cssClass="error"></form:errors>
                </div><br>
                <div>
                <form:label path="quantity">Quantity :</form:label><br>
                <form:input path="quantity" /> 
                <form:errors path="quantity" cssClass="error"></form:errors>
                </div> <br>
                                             
                <input type="submit" value="Buy">
        </form:form><br><br>
                <label for="list" id="all_products">Product list :</label><br>
                <textarea id="list" rows="20" cols="50" readonly>${listt}</textarea><br><br>
                
                        
        
        
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
