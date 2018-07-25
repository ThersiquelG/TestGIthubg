package myPackage;

public class Cuisine {
	
	
	static Personne P1 = new Personne();
	static Personne P2 = new Personne();
	
	static Verre V1 = new Verre();
	static Verre V2 = new Verre();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Première instance de Personne();
		P1.nom = "Thersiquel";
		P1.prénom = "Greg" ;
		P1.tel = "00.00.00.00.00";
		P1.email= "myemail@caramail.com";
		
		//Première instance de Verre();
		V1.nomVerre = "ikea";
		V1.forme = "triangulaire";
		V1.taille = "grand";
		
		
		
		
		//Instruction pour "P1" 
		String monCahier= "cahier";
		System.out.println(P1.infoPersonne(monCahier));
		
		
		
		
		System.out.println();
		
		
		//Instruction pour "V1"
		System.out.println("Vous désirez boire quelque chose ?");
		String monVerre = "monVerre" ;
		System.out.println(V1.infoVerre(monVerre));
		
		
		
		
		
	}

}
