package package1;

public class CarnetCoordonnees {
	private Coordonnees [] carnet;
   private int nbCoordonnees=0;
    public CarnetCoordonnees (int tailleCarnet) {
    	if(tailleCarnet > 100)
    		tailleCarnet=100;
    	carnet = new Coordonnees[tailleCarnet];
    }
    public void ajouter (Coordonnees coordonnees) {
    	if (nbCoordonnees < carnet.length )
    		carnet[nbCoordonnees]=coordonnees;
    	
    }
    public void chercher (String nom,String prenom) {
    	int i=0;
    	boolean isExist=false;
    	while((i < carnet.length) && (isExist==false)) {
    		if(carnet[i].getNom().equals(nom) && carnet[i].getPrenom().equals(prenom)) {
    			isExist=true;
    			System.out.println("l'adresse de "+nom+":"+carnet[i].getAdresse());
    			System.out.println("le telephone de "+nom+":"+carnet[i].getTelephone());
    		}
    		i++;
    		
    		
    	}
    	if (isExist==false)
    		System.out.println("Cette personne n'existe pas ");
    		
    }
    public void setCarnet (Coordonnees[] carnet) {
    	this.carnet=carnet;
    }
    public Coordonnees[] getCarnet() {
    	return carnet;
    	
    }
    public String toString() {
    	String ch="";
    	for(int i=0;i<carnet.length ;i++) {
    	ch +=carnet[i].getNom()+" "+carnet[i].getPrenom()+" "+carnet[i].getAdresse()+" "+carnet[i].getTelephone();
    	}
    	return ch;
    	
    }

}
