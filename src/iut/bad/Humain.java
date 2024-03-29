package iut.bad;

public class Humain implements Consommation {
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
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
    public void manger() {
        System.out.println(nom +" "+prenom+ " est en train de manger.");
    }

	@Override
    public void boire() {
        System.out.println(nom +" "+prenom+ " est en train de boire.");
    }
	
	public void ami(Humain ami) {
        System.out.println(nom +" "+ prenom +" est maintenant ami avec " + ami.getNom() +" "+ ami.getPrenom() + ".");
    }
}
