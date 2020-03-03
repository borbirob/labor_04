package gepjarmu_nyilvantarto;

public class Vehicle {
	private int ev;
	private String rendszam;
	private String tipus;
	private Person owner;
	
	public Vehicle(int ev, String rendszam, String tipus) {
		this.ev=ev;
		this.rendszam=rendszam;
		this.tipus=tipus;
	}
	
	public int getEv(){return this.ev;}
	public String getRendszam(){return this.rendszam;}
	public String getTipus(){return this.tipus;}
	public String toString(){return "("+this.ev+")-("+this.rendszam+")-("+this.tipus+")";}
	public Person getOwner(){return this.owner;}
	public void setOwner(Person t){this.owner=t;}
}
