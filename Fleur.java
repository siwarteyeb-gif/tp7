package tp7;

public class Fleur extends Plante{
	private String couleur;
	private int moisF;
	public Fleur(String nom,double haut,int age,double prix,String couleur,int moisF) {
		super(nom,haut,age,prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getMoisF() {
		return moisF;
	}
	public void description() {
		super.description();
		System.out.println("couleur"+couleur);
		if(moisF==4 || moisF==5 || moisF==6) {
			System.out.println("le Fleur est en fleur");
		}
		else {
			System.out.println("le Fleur n'est pas en fleur");
			
		}
	}
	

}
