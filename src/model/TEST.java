package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import metier.LivreService;

public class TEST {

	public static void main(String[] args) {
		//Livre lvr=new Livre("dfsd","sdf","sdf","345",345,345);
		LivreService ls=new LivreService();
		//.valider(lvr);
		List<Livre>lst=new ArrayList<Livre>();
		lst=ls.livres();
		for (Livre l : lst) {
			System.out.println("hhh"+l.toString());
		}
		
		
	}

}
