package personnages;

public class Ronin extends Humain {

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	private int honneur = 1;

	public void modifierHonneur(int points) {
		honneur += points;
	}

	public void donner(Commercant beneficiaire) {
		int don = argent * 10 / 100;
		beneficiaire.gagnerArgent(don);
		perdreArgent(don);
		parler(beneficiaire + " prend ces " + don + " sous");
	}
	public void provoquer(Yakuza adversaire) {
		parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int force = honneur*2;
		if (force <= adversaire.getReputation()) {
			adversaire.gagner(this);
		} else {
			adversaire.perdre(this);
		}
	}

}
