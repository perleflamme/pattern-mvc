<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="ressources/css/produit/produit-infos.css" />

<meta charset="UTF-8">
<div id="conteneur">
<title>infos produit</title>
</head>
<body>
<h1>Infos Produit</h1>
<div>

<h2>Nom: ${produit.nom} </h2>

<img src= "${produit.lienImage}" />

<h2>prix: ${produit.prix} €</h2>

<h2><a href="${produit.lienSiteOff}">Lien du site du produit </a>
</h2>
</div>








</body>
</html>