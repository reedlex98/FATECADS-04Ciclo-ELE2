<%-- 
    Document   : index
    Created on : 21/04/2019, 21:33:45
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP com Servlet</title>
    </head>
    <body>
        <h1>Formulário para conversão de massa</h1>
            
        <form action='ConversaoDeMassa' method='get'>
        Massa original: <input type='text' name='massaOriginal'><br><br>
        <input type='submit' name='btnConverter' value='de lb para kg'>&nbsp;
        <input type='submit' name='btnConverter' value='de kg para lb'>
        </form>
            
    </body>
</html>
