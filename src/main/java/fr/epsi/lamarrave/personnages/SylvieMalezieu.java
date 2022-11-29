package fr.epsi.lamarrave.personnages;

/**
 * Adversaire commun mais coriace
 */
public class SylvieMalezieu extends Adversaire {

	private int forceParDefault;

	/**
	 * Default constructor
	 */
	public SylvieMalezieu() {
		super();
		this.force += 6;
		this.vie += 12;
		this.armure += 2;
		this.vieMax = this.vie;
		this.forceParDefault = this.force;
	}

	@Override
	public String récupérerAttaque() {
		double taChance = Math.random()*10;
		if (taChance <7) {
			return sortCommun();
		} else if(taChance<9) {
			return sortCritique();
		} else return sortUltime();
	}
	
	public String sortCommun(){
		this.force = this.forceParDefault;
		return "attaque commune vous n'aurez pas très mal";
	}

	public String sortCritique() {
		this.force = this.forceParDefault + 10;
		return "attaque critique, tu n'as pas de chance";
	}
	
	public String sortUltime() {
		this.force = this.forceParDefault + 15;
		return "attaque ultime, si tu survis pense à remercier les dieux";
	}

}