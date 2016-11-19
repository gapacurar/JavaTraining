<%-- 
    Document   : eBooksStoreAdminEBooks
    Created on : Nov 19, 2016, 7:36:42 PM
    Author     : gheor
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>eBooksStore Management </title>
         <link rel="stylesheet" type="text/css" href="./css/eBooksStoreCSS.css">
    </head>
    <body>
        <h1>Manage the books from Electronic Books Store</h1>
        
        <form action="${pageContext.request.contextPath}/eBooksStoreAdminEBooks">
        
            <input type="submit" class="ebooksstorebutton" name="admin_ebooks_insert" value="Insert">
        
        </form>
    </body>
</html>
