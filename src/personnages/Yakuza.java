package personnages;

public class Yakuza extends Humain {

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	
	private String clan;
	private int reputation = 4;
	
	public void extorquer(Commercant victime) {
		int gagne = victime.getArgent();
		gagnerArgent(gagne);
		victime.perdreArgent(gagne);
		reputation++;
		parler("J'ai pique les " + gagne + " sous de " + victime + ", ce qui le fait " + argent
				+ " dans ma poche. Hi!Hi!");
	}

	public void gagner(Ronin adversaire) {
		int gagne = adversaire.getArgent();
		gagnerArgent(gagne);
		adversaire.perdreArgent(gagne);
		adversaire.modifierHonneur(1);
		adversaire.parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		parler("Ce ronin pensait vraiment battre Yaku Le Noir du clan de "+ clan+ " ? Je l'ai dépouillé de ses "+ gagne + " sous");
	}
	
	public void perdre(Ronin adversaire) {
		int gagne = argent;
		perdreArgent(gagne);
		adversaire.gagnerArgent(gagne);
		adversaire.modifierHonneur(-1);
		adversaire.parler(" Je t'ai eu petit yakuza!");
		parler("J’ai perdu mon duel et mes "+ gagne + " sous, snif... J'ai desonore le clan de " + clan);
	}

}
