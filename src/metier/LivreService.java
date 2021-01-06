package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Livre;

public class LivreService {
	private List<Livre>listLivre=new ArrayList<Livre>();;
	public void valider(Livre lvr)
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomlivre","root","");
	    PreparedStatement ps=connection.prepareStatement("INSERT INTO livre( titre, isbn, auteur, annee, nbPage, prix) VALUES(?,?,?,?,?,?)");
	    
		ps.setString(1,lvr.getTitre());
		ps.setString(2,lvr.getIsbn());
		ps.setString(3,lvr.getAuteur());
		ps.setString(4,lvr.getAnneeParution());
		ps.setInt(5,lvr.getNbPage());
		ps.setDouble(6,lvr.getPrix());
		ps.executeUpdate();
	    
		  
		    ps.close();
		    connection.close();
		System.out.println("bien fait");
		} catch (Exception e) {
			
			e.getMessage();
		}
		
	}
	
	//liste Produit
	public  List<Livre>livres()
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecomlivre","root","");
		    PreparedStatement ps=connection.prepareStatement("SELECT * FROM livre");
		    ResultSet rs=ps.executeQuery();
		    while (rs.next()) {
				Livre lvr=new Livre();
				lvr.setTitre(rs.getString("titre"));
				lvr.setIsbn(rs.getString("isbn"));
				lvr.setAuteur(rs.getNString("auteur"));
				lvr.setAnneeParution(rs.getNString("annee"));
				lvr.setNbPage(rs.getInt("nbPage"));
				lvr.setPrix(rs.getDouble("prix"));
				listLivre.add(lvr);
				System.out.println("bien ");
				
			}
		    rs.close();
		    ps.close();
		    connection.close();
		} catch (Exception e) { 
			System.out.println(e.getMessage());
		}
	
		return listLivre;
	}

}
