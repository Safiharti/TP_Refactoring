package iut.bad;


public class Femme extends Humain{
	
	public Femme() {
		super();
	}
	
	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	public static void main(String[] args) {
    	Humain femme = new Humain("Marie", "Jeanne", 30);
    	Humain homme = new Humain("Robert", "Pilier", 35);

    	femme.ami(homme);
    }
}
