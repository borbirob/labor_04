package gepjarmu_nyilvantarto;
import java.util.ArrayList;
import java.util.Calendar;

public class Main {
public static ArrayList<Vehicle> oldCars(ArrayList<Vehicle> list,int t){
	ArrayList<Vehicle> olds=new ArrayList<Vehicle>();
	
	for(int i=0;i<list.size();i++) {
		if( list.get(i).getEv()<t){
			olds.add(list.get(i));
		}
	}
	return olds;
}


public static ArrayList<Person> oldOwners(ArrayList<Person> list){
	ArrayList<Person> owners=new ArrayList<Person>();
	ArrayList<Vehicle> autok=new ArrayList<Vehicle>();
	
	
	for(int i=0;i<list.size();i++) {
		autok=list.get(i).getCars();
		
		for(int y=0;y<autok.size();y++) {
			if(autok.get(y).getEv()<(Calendar.getInstance().get(Calendar.YEAR))-10){
				owners.add(list.get(i));
				break;
			}
		}
	}
	return owners;
}


public static void main(String[] args){
	ArrayList<Vehicle> jarmuvek=new ArrayList<Vehicle>();
	ArrayList<Person> szemelyek=new ArrayList<Person>();
	

	Vehicle a=new Vehicle(2005,"ABC-123","volvo");
	Vehicle b=new Vehicle(2019,"NKV-577","opel");
	Vehicle c=new Vehicle(1997,"GZT-765","mercedes");
	
	Person d=new Person(2000,"Balázs","Infopark G-épület");
	Person g=new Person(2001,"Ákos","Váci utca 6.");
	Person f=new Person(1997,"Peti","Kenyérmezõ utca 6.");
	
	//jármûvek-személyek listához adása
	jarmuvek.add(a);
	jarmuvek.add(b);
	jarmuvek.add(c);
	
	szemelyek.add(d);
	szemelyek.add(g);
	szemelyek.add(f);
	
	
	
	
	//auto hozzáadás
	d.addCar(a);
	f.addCar(b);
	g.addCar(c);
	
	//auto törlés
	try {
		f.removeCar("NKV-577");
		}catch(Exception e){
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}
	
	
	//10 évnél régebi autóval rendelkezõk nevei
	System.out.println("10 évnél régebi autóval rendelkezõk nevei:");
	ArrayList<Person> oreg_autok=oldOwners(szemelyek);
	for(int i=0;i<oreg_autok.size();i++) {
		System.out.println(oreg_autok.get(i).getNev());
	}
	
	
	
	//kiiratás
	/*System.out.println(a.toString());
	System.out.println(b.toString());
	System.out.println(c.toString());
	System.out.println(d.toString());
	System.out.println(g.toString());
	System.out.println(f.toString());*/
	//System.out.println(d.listCars());
}
}
 