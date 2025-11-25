package personnages;

public class Samourai extends Ronin {
	private String seigneur;
	public Samourai(String nom,String seigneur, String boisson, int argent) {
		super(nom, boisson, argent);
		this.seigneur = seigneur;
	}
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Je suis fier de servir le seigneur " + seigneur );
	}

}
