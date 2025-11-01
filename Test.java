package tp7;

public class Test {
	public static void main(String[] args) {
		System.out.println("pepiniere GREEN HANDS");
		Pepiniere p = new Pepiniere();
		Fleur rose = new Fleur("Rose", 30, 12, 15.99, "Rouge", 2);
		Fleur tulipe = new Fleur("Tulipe", 20, 8, 12.99, "Jaune", 4);
		Arbre chêne = new Arbre("Chêne", 200, 60, 89.99, "Caduque");
		Arbre sapin = new Arbre("Sapin", 150, 30, 59.99, "Persistant");

		System.out.println("la "+rose.nom+" a le couleur "+rose.getCouleur());
		p.ajoutPlante(rose);
		p.ajoutPlante(tulipe);
		p.ajoutPlante(chêne);
		p.ajoutPlante(sapin);
		p.afficherInventaire();
		System.out.println("Total Aborption CO2"+p.totalAbsorptionTotaleCO2());
		System.out.println("Nombre d'arbres Caduques dans la pepinière : " + p.compterArbresCaduques());

		}

}
