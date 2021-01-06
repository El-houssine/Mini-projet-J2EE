<%@page import="org.eclipse.jdt.internal.compiler.ast.ForeachStatement"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="metier.LivreService"%>
<%@page import="model.Livre"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>


<% 
LivreService ls=new LivreService();
List<Livre>liste=(List<Livre>)request.getAttribute("livres");


//Livre lvre =(Livre) request.getAttribute("lvr");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Affichage Livre</title>
<link rel=" stylesheet" type="text/css" href="assets/css/bootstrap.min.css">
</head>
<body>
<div class="container mt-5">
<h4 class="text-center mb-4">Affichage informations du livre</h4>
<table class="table">
<tr><th>Titre</th><th>Isbn</th><th>Auteur</th><th>Année</th><th>Pages</th><th>Prix</th></tr>
<% for(Livre lvr:liste) {%>
<tr><td><%=lvr.getTitre() %></td><td><%= lvr.getIsbn() %></td><td><%=lvr.getAuteur() %></td><td><%=lvr.getAnneeParution()%></td><td><%=lvr.getNbPage() %></td><td><%=lvr.getPrix() %></td></tr>
<%} %>
</table>
</div>
</body>
</html>