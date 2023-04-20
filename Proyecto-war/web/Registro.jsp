<%-- 
    Document   : Registro
    Created on : 12/04/2023, 06:44:29 PM
    Author     : julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de usuario</title>
    </head>
    <body>
        <h1>Formulario de registro</h1>
        <form action="./RegistroUsuarioServlet" method="POST">
            <table>
                <tr>
                    <td>Cedula: </td>
                    <td><input type="text" name="cedula" value="${registro.cedula}" /></td>
                </tr>
                <tr>
                    <td>Nombre: </td>
                    <td><input type="text" name="nombre" value="${registro.nombre}" /></td>
                </tr>
                <tr>
                    <td>Apellido: </td>
                    <td><input type="text" name="apellido" value="${registro.apellido}" /></td>
                </tr>
                <tr>
                    <td>Correo electronico: </td>
                    <td><input type="email" name="correo" value="${registro.correo}" /></td>
                </tr>
                <tr>
                    <td>Ciudad: </td>
                    <td><input type="text" name="ciudad" value="Bogota D.C" readonly onmousedown="return false;"/></td>
                </tr>
                <tr>
                    <td>Contraseña: </td>
                    <td><input type="password" name="contraseña"  /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Registrarse" />
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
