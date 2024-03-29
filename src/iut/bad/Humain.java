package iut.bad;

public class Humain {
	private String nom;
	private String prenom;
	private int age;	
		
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

	@Override
	public String toString() {
		return "Humain [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}
	
	
}
