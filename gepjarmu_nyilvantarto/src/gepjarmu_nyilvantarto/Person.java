package gepjarmu_nyilvantarto;
import java.util.ArrayList;


public class Person {
	private int szulEv;
	private String nev;
	private String lakcim;
	private ArrayList<Vehicle> cars;
	
	public Person(int szulEv, String nev, String lakcim){
		this.szulEv=szulEv;
		this.nev=nev;
		this.lakcim=lakcim;
		cars=new ArrayList<Vehicle>();
	}
	
	public int getSzulEv(){return this.szulEv;}
	public String getNev(){return this.nev;}
	public String getLakcim(){return this.lakcim;}
	public ArrayList<Vehicle> getCars(){return cars;}
	public String toString(){return"("+this.nev+")-("+this.szulEv+")-("+this.lakcim+")";}
	public void addCar(Vehicle v){cars.add(v); v.setOwner(this);}
	
	public void removeCar(String r) throws Exception{
		for (int i = 0; i < cars.size(); i++) 
		{
			if(cars.get(i) != null) 
			{
				if(cars.get(i).getRendszam().equals(r)) 
				{
					cars.get(i).setOwner(null);
					cars.remove(i);
					return;
				}
			}
		}
		
		throw new Exception("Hibás rendszám!");
	}
	
	public String listCars(){return cars.toString();}
	
}
