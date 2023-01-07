package package1;
public class CrTP {
	public static void main (String[] args) {
	Coordonnees c1= new Coordonnees();
	CarnetCoordonnees carnet = new CarnetCoordonnees(3);
	Coordonnees c2= new Coordonnees("Nsibi","Sihem","xyz 31",123456789);
	Coordonnees c3= new Coordonnees ("aloui","med","abc 32");
       c1.setNom("tahri");
       c1.setPrenom("mahdi");
       c1.setAdresse("dfg 34");
       c1.setTelephone(987654321);
       c3.setTelephone(563214789);
       carnet.ajouter(c1); 
       carnet.ajouter(c2); 
       carnet.ajouter(c3); 
       System.out.println(carnet.toString());
       
       
	

}

}
