package myPackage;

public class Personne {
		String nom; 
		String prénom;
		String tel;
		String email;
		
		String infoPersonne(String cahier) {
			return ("Bonjour, vous vous appelez :" + nom + " " + prénom + " " + "\nVos coordonnées sont :" + tel + "/" + email);
		}
}
