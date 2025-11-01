package tp7;

public class Arbre extends Plante{
	private String typeF;
	private final int absMoy=22;
	public Arbre(String nom,double haut,int age,double prix,String typeF) {
		super(nom,haut,age,prix);
		this.typeF=typeF;}
	public void description() {
		super.description();
		System.out.println("type: "+typeF);
		
		}
	public double absorptionCO2() {
		if((haut/100)>50) {
			return absMoy+3;
		}
		else {
			return absMoy;
		}
	}
	public String getTypeF() {
		return typeF;
	}
	
	



}