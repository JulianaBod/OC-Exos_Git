
public class GeneratorVoeuxNoel {
	public static String VoeuxFemme (String sexe, String prenom){
		String voeux = null;
		if(sexe.equalsIgnoreCase("femme")){
			voeux = "Ma chère " + prenom;
		} else if(sexe.equalsIgnoreCase("homme")){
			voeux = "Mon chèr " + prenom;
		} else { 
			voeux = "Qui es-tu, " + prenom + "?" ;
		}
		return voeux;
	}
}
