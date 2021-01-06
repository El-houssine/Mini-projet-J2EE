<%@ page language="java" contentType="text/html; charset=windows-1256"
	pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Information livre</title>
<link rel="stylesheet" type="text/css"
	href="assets/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">


		<h4 class="text-center">
			Saisie Information du livre
			</h4>
			
			
				<form class="form-horizontal col-sm-8 offset-sm-2" action="LivreController" method="post">
				
					<div class="form-group">
						<label class="control-label " for="titre">Titre</label> <input
							class="form-control " type="text" name="titre" required>
					</div>
					<div class="form-group">
						<label class="control-label" for="isbn">ISBN</label> <input
							class="form-control" type="text" name="isbn" required>
					</div >
					<div class="form-group">
						<label class="control-label" for="auteur">Auteur</label> <input
							class="form-control" type="text" name="auteur" required>
					</div>
					<div class="form-group">
						<label class="control-label" for="titre">Année</label> <input
							class="form-control" type="text" name="annee" required>
					</div>
					<div class="form-group">
						<label class="control-label" for="nbPage">Nombre de Pages</label>
						<input class="form-control" type="text" name="nbPage" required>
					</div>
					<div class="form-group">
						<label class="control-label" for="prix">Prix</label> <input
							class="form-control" type="text" name="prix" required>
					</div>
					<input type="submit" class="btn btn-primary" value="Valider">
					
				</form>
			</div>
	




</body>
</html>