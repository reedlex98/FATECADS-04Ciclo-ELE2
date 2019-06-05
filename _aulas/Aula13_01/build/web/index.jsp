<%-- 
    Document   : index
    Created on : 21/05/2019, 19:37:03
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h2>JSP - meu primeiro JSP</h2>
        <!-- Scriptlet Java -->
        <%
            // abaixo segue o código em Java normalmente
            out.println("Capturando a data atual: <br>");
            // instancia objeto do tipo Date
            java.util.Date data = new java.util.Date();
        %>
        <br>Agora são (via scriptlet):
        <%  
            // exibe o resultado da data atual (obtida através do Date)
            out.println(String.valueOf(data));
        %>
        <br>Agora são (via expressão scriptlet):
        <%= data %>        
    </body>
</html>
