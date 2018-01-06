import java.util.Scanner;

public class main {
	public static void main(String argz[]){
		String prenom = null;
		// Sexe : 1 = homme et 2 = femme. On place 1 par défaut
		int sexe =1;
		
		prenom = demanderPrenom();
		sexe = demanderSexe();
		String voeux = GeneratorVoeuxNoel.VoeuxFemme(sexe, prenom);
		System.out.println(voeux);
	}
	
	public static String demanderPrenom(){
		String prenom = null;
		String reponse = "non";
		Scanner saisie = new Scanner(System.in);
		
		while(reponse.equalsIgnoreCase("non")){
			System.out.println("Entrez votre prénom : ");
			prenom = saisie.next();
			System.out.println("Ok votre prénom est bien : " + prenom + " ?");
			reponse = saisie.next();	
		}
		
		return prenom;
	}
	
	public static int demanderSexe(){
		String sexe = null;
		int sexeInt = 1;
		String reponse = "non";
		Scanner saisie = new Scanner(System.in);
		
		// Tant que la reponse est non alors on repose la question
		while(reponse.equalsIgnoreCase("non")){
			System.out.println("Entrez votre sexe \nFemme ou Homme : ");
			sexe = saisie.next();
			if(sexe.equalsIgnoreCase("femme")){ 
				sexeInt = 2; 
			} else{
				sexeInt = 1;
			}
			
			System.out.println("Ok votre sexe est bien : " + sexe + " ?");
			reponse = saisie.next();	
		}
		
		// On retourne la valeur du sexe en tant qu'entier 1 ou 2 pour le moment
		return sexeInt;
	}
}
