<%--
    Document   : cursos
    Created on : 03/05/2016, 10:57:44
    Author     : Mayara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
    <head>
        <title>Sistema de Cadastro de Cursos</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/estilo.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>

        <h4>Cursos Disponíveis:</h4>

        <table>
            <tr>
                <th>Vagas</th>
                <th>Nome</th>
                <th>Palestrante</th>
                <th>Matricular</th>
            </tr>
            <c:forEach items="${cursos}" var="cursos">
                <tr>
                    <td><c:out value="${cursos.vagas}" /></td>
                    <td><c:out value="${cursos.nome}" /></td>
                    <td><c:out value="${cursos.palestrante}" /></td>
                    <td><a href="FrontController?action=GravarMatricula&codigo=<c:out value='${cursos.codigo}'/>" class="glyphicon glyphicon-ok"></a>&nbsp;&nbsp;
                </tr>
            </c:forEach>
        </table><br/><br/>
        <p>${msg}</p>
        <a href="FrontController?action=VoltarInicio">Voltar</a>
        <a href="FrontController?action=LerMatricula">Listar matriculas</a>
    </body>
</html>
