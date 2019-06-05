<%-- 
    Document   : index
    Created on : 21/04/2019, 21:28:23
    Author     : dreis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="negocio.Calculo" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Calculadora</h1>

        <form action='' method='get' name='formCalculadora'>
            Valor 1: <input type='text' name='valor1'><br>
            Valor 2: <input type='text' name='valor2'><br><br>
            <input type='submit' name='btnCalcular' value='+'>&nbsp;
            <input type='submit' name='btnCalcular' value='-'>&nbsp;
            <input type='submit' name='btnCalcular' value='x'>&nbsp;
            <input type='submit' name='btnCalcular' value='/'>
        </form>
        
        <%
        if (request.getParameter("valor1") != null &&
            request.getParameter("valor1").length() > 0 &&
            request.getParameter("valor2") != null &&
            request.getParameter("valor2").length() > 0){
            // recupera os valores informados e os converte para float
            float v1 = Float.parseFloat(request.getParameter("valor1"));
            float v2 = Float.parseFloat(request.getParameter("valor2"));
            // instancia objeto da regra de negócio
            Calculo objCalc = new Calculo(v1, v2);
            // recupera a operação arimética desejada
            String operacao = request.getParameter("btnCalcular");
            // executa a operação selecionada
            if (operacao.equals("+")){
                objCalc.somar();
            }
            else if (operacao.equals("-")){
                objCalc.subtrair();
            }
            else if (operacao.equals("x")){
                objCalc.multiplicar();
            }
            else if (operacao.equals("/")){
                objCalc.dividir(); 
            }
        %>
        
            <!-- exibe o resultado -->
            <br><b>Resultado: <%= String.format("%.2f", objCalc.getResultado()) %><b><br>
        <%
        }
        %>
        
    </body>
</html>
