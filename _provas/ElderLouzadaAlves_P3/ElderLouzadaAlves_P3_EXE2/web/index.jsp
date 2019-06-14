<%-- 
    Document   : index
    Created on : Jun 13, 2019, 9:36:31 PM
    Author     : elder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form action="servletCalculo" method="get">
            <label for="val1">Primeiro valor: </label><input type="number" name="val1">
            <label for="val2">Segundo valor: </label><input type="number" name="val2">
            <input type='submit' name='btnCalcular' value='+'>&nbsp;
            <input type='submit' name='btnCalcular' value='-'>&nbsp;
            <input type='submit' name='btnCalcular' value='x'>&nbsp;
            <input type='submit' name='btnCalcular' value='/'>
        </form>
    </body>
</html>
