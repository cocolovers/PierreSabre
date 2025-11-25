package personnages;

public class Humain {
	private String nom;
	private String boisson;
	protected int argent;
	protected int nbConnaissance;
	protected Humain[] memoire = new Humain[3];

	public Humain(String nom, String boisson, int argent) {
		super();
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ")- " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offir " + bien + " a " + prix + " sous");
			this.argent -= prix;
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne meme pas m'offir " + bien + " a " + prix + " sous");
		}
		
	}

	protected void gagnerArgent(int gain) {
		this.argent += gain;
	}

	protected void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	private void memoriser(Humain humain) {
		if (nbConnaissance == 3) {
			for(int i=1;i<3;i++) memoire[i-1] = memoire[i];
			nbConnaissance -= 1;
		}
		memoire[nbConnaissance] = humain;
		nbConnaissance++;
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
		autreHumain.repondre(this);
	}
	
	public void listerConnaissance() {
		parler("Je connais beaucoup de monde dont: ");
		for (int i=0;i<=nbConnaissance-2;i++)
			System.out.print(memoire[i] + ", ");
		System.out.print(memoire[nbConnaissance-1]);
		System.out.print("\n");
		
	}

}
