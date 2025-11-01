package tp7;

public class Pepiniere {
	private Plante[]inventaire;
    private final int Max=1000;
	private int nb=0;
	public Pepiniere() {
		inventaire=new Plante[Max];
	}
	public void ajoutPlante(Plante p) {
		if(nb<Max) {
			inventaire[nb]=p;
			nb++;
		}
		else {
			System.out.println("pepiniere est pleine");
		}
	}
	public void afficherInventaire() {
		System.out.println("inventaire de la pepiniere");
		for(int i=0;i<nb;i++) {
			System.out.println("Plante#"+i+1);
			inventaire[i].description();
		}
	}
	public double totalAbsorptionTotaleCO2() {
		double tot=0;
		for(int i=0;i<nb;i++) {
			if(inventaire[i] instanceof Arbre ) {
				tot+=((Arbre)inventaire[i]).absorptionCO2();
			}
		}
		return tot;
	}
	public int compterArbresCaduques() {
		int nbc=0;
		for(int i=0;i<nb;i++) {
			if(inventaire[i] instanceof Arbre ) {
				if((((Arbre)inventaire[i]).getTypeF()).equalsIgnoreCase("caduque")){
					nbc++;
				}
			}
		}
		return nbc;
	}

}
