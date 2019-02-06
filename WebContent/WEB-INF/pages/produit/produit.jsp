<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="ressources/css/produit/produit.css" />

<meta charset="UTF-8">
<title>produits</title>
</head>
<body>
	<h1>Liste des Miels</h1>

<div id="conteneur">
		<c:forEach items="${ produits }" var="produit" varStatus="status">
			<div class="block_produit">
				<div class="prix">
					<label>${ produit.prix }</label>
				</div>
				<a href="produit-infos?i=${status.index} " >
					<img src="${ produit.lienImage }" />
				</a>
				<div class="description">${ produit.nom }</div>
			</div>
			</c:forEach>
	</div>

</body>
</html>