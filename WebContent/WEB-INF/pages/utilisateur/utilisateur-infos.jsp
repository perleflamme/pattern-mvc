<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="ressources/css/utilisateur/utilisateur-infos.css" />

<meta charset="UTF-8">
<div id="conteneur">
<title>infos utilisateur</title>
</head>
<body>
<h1>Infos Utilisateur</h1>
<div>

<h2>Nom: ${utilisateur.nom} </h2>
<h2>Prenom: ${utilisateur.prenom} </h2>
<h2>Age: ${utilisateur.age} </h2>

<img src="${utilisateur.urlImage}" />



</div>
</body>
</html>