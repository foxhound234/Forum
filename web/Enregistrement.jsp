<%-- 
    Document   : Enregistrement
    Created on : 3 déc. 2018, 11:41:18
    Author     : Rabelais
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="Entete.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enregistrement</h1>
            <form action="Enregistrement" method="post">
			<table style="with: 50%">
				<tr>
					<td>Login</td>
					<td><input type="text" class="form-control" name="Login" /></td>
				</tr>
				<tr>
					<td>MDP</td>
					<td><input type="password" class="form-control" name="mdp" /></td>
				</tr>
		       </table>
			<input type="submit" class="btn btn-primary" value="Enregistrement" /></form>
    </body>
</html>
