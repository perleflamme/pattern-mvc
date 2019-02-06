<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>utilisateur</title>
<link rel="stylesheet" href="ressources/css/utilisateur/utilisateur.css" />
</head>
<body>
	<h1>Utilisateur</h1>

	<div id="conteneur">
		<c:forEach items="${ utilisateur }" var="utilisateur" varStatus="status">
			<div class="block_produit">
				<div class="prix">
					<label> ${ utilisateur.age } ans</label>
				</div>
				<a href="utilisateur-infos?i=${ status.index }"> <img
					src="${ utilisateur.urlImage }" />
				</a>
				<div class="description">${ utilisateur.nom }</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>