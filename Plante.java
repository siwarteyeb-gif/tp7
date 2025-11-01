package tp7;

public class Plante {
	protected String nom;
	protected double haut;
	protected int age;
	protected double prix;
	public Plante(String nom,double haut,int age,double prix) {
		this.nom=nom;
		this.haut=haut;
		this.age=age;
		this.prix=prix;
	}
	public String toString() {
		return "nom "+nom+"  hauteur "+haut+" cm "+" age "+age+" ans "+" prix "+prix+" DT";
	}
	public void description() {
		System.out.println(toString());
	}

}
