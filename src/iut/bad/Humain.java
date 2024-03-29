package iut.bad;

public class Humain {
	protected String nom;
	protected String prenom;
	protected int age;	
		
	public Humain() {
		
	}

	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	public void detail() {
		System.out.println(toString());
	}

	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
    public void manger() {
        System.out.println(nom +" "+prenom+ " est en train de manger.");
    }

    
    public void boire() {
        System.out.println(nom +" "+prenom+ " est en train de boire.");
    }
	
}
