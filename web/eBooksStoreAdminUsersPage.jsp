<%-- 
   
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Electronic Books Store Manage Users</title>
        <link rel="stylesheet" type="text/css" href="./css/eBooksStoreCSS.css">
    </head>
<body>
        <%-- test if actual user is authenticated and authorized --%>
        <c:choose>
                <c:when test="${validUser == true}">   
                    <!-- include menu -->
                    <%@ include file="./utils/eBooksStoreMenu.jsp" %>
                    <%-- Master view --%>
                        <form action="${pageContext.request.contextPath}/eBooksStoreAdminUsersServlet" method="POST">
                        <sql:setDataSource 
                        var="snapshot" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="ebooksstore"  
                        password="ebooksstore"/>
                        <sql:query dataSource="${snapshot}" var="result">
                            SELECT EBOOKSSTORE_USERS.ID, EBOOKSSTORE_USERS.USERNAME, EBOOKSSTORE_USERS.PASSWORD, EBOOKSSTORE_USERS_ROLES.ROLE FROM EBOOKSSTORE_USERS, EBOOKSSTORE_USERS_ROLES WHERE EBOOKSSTORE_USERS.ROLE = EBOOKSSTORE_USERS_ROLES.ROLE ORDER BY USERNAME, ROLE ASC 
                        </sql:query>
                        <table border="1" width="100%">
                            <tr>
                            <td width="4%" class="thc"> select </td>    
                            <td width="24%" class="thc">USERNAME</td>
                            <td width="24%" class="thc">PASSWORD</td>
                            <td width="24%" class="thc">ROLE <input type="submit" name="admin_userroles_open" value="Admin"></td>
                        </table>    
                        <table border="1" width="100%">    
                            </tr>
                            <c:forEach var="row" varStatus="loop" items="${result.rows}">
                            <tr>
                                <td width="4%" class="tdc"><input type="checkbox" name="admin_users_checkbox" value="${row.id}"></td>
                                <td width="24%" class="tdc"><c:out value="${row.username}"/></td>
                                <td width="24%" class="tdc"><c:out value="${row.password}"/></td>
                                <td width="24%" class="tdc"><c:out value="${row.role}"/></td>
                            </tr>
                            </c:forEach>
                        </table>
                        <%-- Details --%>
                        <sql:setDataSource 
                        var="snapshotroles" 
                        driver="org.apache.derby.jdbc.ClientDriver40"
                        url="jdbc:derby://localhost:1527/ebooksstore;create=true;"
                        user="ebooksstore"  
                        password="ebooksstore"/>
                        <sql:query dataSource="${snapshotroles}" var="resultroles">
                            SELECT ROLE from EBOOKSSTORE_USERS_ROLES ORDER BY ROLE ASC 
                        </sql:query>
                        <table class="tablecenterdwithborder">
                            <tr><td>    
                            <table>
                                <tr>
                                    <td> USERNAME </td>
                                    <td> <input type="text" name="admin_users_username"></input></td>
                                </tr>
                                <tr>
                                    <td> PASSWORD </td>
                                    <td> <input type="password" name="admin_users_password"></input></td>
                                </tr>
                                <tr>
                                    <td> ROLE: </td>
                                    <td>
                                        <select name="admin_user_role" required="true">
                                            <c:forEach var="rowrole" items="${resultroles.rows}">    
                                                <option name="admin_users_roles" value="${rowrole.role}">${rowrole.role}</option>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>     
                            </table>
                            <%-- buttons --%>
                            <table>

                                    <tr><td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_users_insert" value="Insert"></td> 
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_users_update" value="Update"></td>
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_users_delete" value="Delete"></td> 
                                        <td class="tdc"><input type="submit" class="ebooksstorebutton" name="admin_users_cancel" value="Cancel"></td>
                                    </tr>  
                            </table>
                            </td></tr>
                        </table>    
                        </form>
            </c:when>
            <c:otherwise>
                <c:redirect url="./index.jsp"></c:redirect>
            </c:otherwise>
        </c:choose>
</body>    
</html>
