package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom,"the", argent);
	}
	public int seFaireExtorquer() {
		int sommeperdue = argent;
		this.argent -= argent;
		parler("J'ai tout perdu! Le monde est trop injuste... ");
		return sommeperdue;
	}
	
	public void recevoir(int argent) {
		this.argent += argent;
		parler(argent + " sous! Je te remercie genereux donateur !");
	}

}
