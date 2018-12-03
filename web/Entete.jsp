<%-- 
    Document   : Entete
    Created on : 3 déc. 2018, 11:07:12
    Author     : Rabelais
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Forum Sio !!!</title>
          <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
            function afficheOuvertures(tableauHTML) //Utile pour l'affichage des ouvertures (choix 4)
            {
                var tab = document.getElementById('ouvertures');
                tab.innerHTML = tableauHTML;
            } 
        </script>
    </head>
<div id="entete">
            <span class="titre">Bienvenue dans le forum sio</span>
        <br/>
        <nav class="navbar navbar-default">
             <div class="container-fluid">
    <ul class="nav navbar-nav">
      <li class="active"><a href="Utilisateur?choix=0">Home</a></li>
      <li><a href="Utilisateur?choix=1">Forum</a></li>
      <li><a href="Utilisateur?choix=3">Connexion</a></li>
     <li> <a href="Utilisateur?choix=2">Enregistrement</a></li>
    </ul>
        <hr>
        </div>
     </nav>