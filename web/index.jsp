<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<c:if test="${mensagem==null}">
    <c:set var="mensagem" value="Não Aplicavel." />   
</c:if>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operações :: Aplicação Teste Funcional</title>
    </head>
    <body>
        <font face="tahoma">
            <h1>Aplicação Teste Funcional</h1><br><br>
    
            <a href="calcular_imc.jsp">1. Calcular IMC</a><br>

        
            <br><br>
            <b>Mensagem do Sistema:</b> <c:out value="${mensagem}" />
        </font>
    
    </body>
</html>
