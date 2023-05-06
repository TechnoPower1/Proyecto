<%-- 
    Document   : IniciarSesion
    Created on : 23/04/2023, 07:10:09 PM
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesion</title>
    </head>
    <body>
        <h1>Iniciar sesion</h1>
        <form action="./InicioSesionServlet" method="POST">
            <table>
                <tr>
                    <td>Cedula: </td>
                    <td><input type="text" name="cedula" value="" /></td>
                </tr>
                <tr>
                    <td>Contraseña: </td>
                    <td><input type="password" name="nombre" value="" /></td>
                </tr>
                
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Iniciar sesion" />
                        <!--<input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />-->
                    </td>
                </tr>
            </table>
        </form>
        <br>
         <!--<table border="1">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Year Level</th>
                 <c:forEach items="${allStudents}" var="stud">
                <tr>
                    <td>${stud.studentid}</td>
                    <td>${stud.firstname}</td>
                    <td>${stud.lastname}</td>
                    <td>${stud.yearlevel}</td>
                </tr>
            </c:forEach> -->
        </table>
    </body>
</html>
