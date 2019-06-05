<%-- 
    Document   : resposta
    Created on : 28/05/2019, 19:21:06
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP com Servlet - página de resultado</title>
    </head>
    <body>
        <h2>JSP com Servlet - página 'resultado.jsp'</h2>
        <%
            String textoInformado = request.getAttribute("textoInformado").toString();
        %>
        <h3><%= textoInformado %></h3>    
    </body>
</html>