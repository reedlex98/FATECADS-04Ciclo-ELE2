<%-- 
    Document   : index.jsp
    Created on : Jun 4, 2019, 9:13:04 PM
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
        <h1>Calcular Figura</h1>
        <h3>Elder Louzada</h3><h3>Noturno</h3><h3>ADS</h3>
        <form action="ServletFigura" method="get">
            <label for="height">Altura:</label>
            <input type="number" name="height">
            <label for="base">Base: </label>
            <input type="number" name="base">
            <input type="submit" name="submit" value="Enviar">
        </form>
    </body>
</html>
