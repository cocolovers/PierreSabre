package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Commercant;

public class HistoireTP4 {
	public static void main(String[] args) {
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Marco", null, 20);
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.extorquer(marco);
		marco.seFaireExtorquer();
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.donner(marco);
		marco.recevoir(marco.getArgent());
		roro.provoquer(yaku);
		
	}
}
