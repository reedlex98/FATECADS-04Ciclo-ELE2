<%-- 
    Document   : exibeResultado
    Created on : Jun 4, 2019, 9:33:14 PM
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
        <h1>Resultado</h1>
        <h3>Elder Louzada</h3><h3>Noturno</h3><h3>ADS</h3>
        <p> |Resultado| <%= request.getAttribute("calculado").toString() %>
        </p>
    </body>
</html>
