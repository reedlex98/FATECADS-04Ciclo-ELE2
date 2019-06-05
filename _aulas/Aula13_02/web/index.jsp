<%-- 
    Document   : index
    Created on : 21/05/2019, 19:39:54
    Author     : DaviS.M.dos
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Tabela JSP + HTML</h1>
        <table border="1">
            <tr><td></td><td>Coluna 1</td><td>Coluna 2</td><td>Coluna 3</td></tr>
            <%
                for(int row = 1; row <= 10; row++){
            %>
                    <tr>
                        <td>Linha: <%= row %></td>
                        <%
                            for (int col = 1; col <= 3; col++){
                            %>
                                <td><%= row %>, <%= col %></td>
                            <%
                            }
                        %>
                    </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
