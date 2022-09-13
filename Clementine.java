/**
 *
 * @author roudet
 */
public class Clementine {
    private double prix;
    private String origine;
	
    public Clementine() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Clementine(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Clementine de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Clementines sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Clementine or = (Clementine) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Clementine a des pepins
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	
    Clementine o=new Clementine(2, "Cote d'ivoire");
    System.out.println(o);
    Clementine o2=new Clementine(3, "France");
    System.out.println(o2);
    
   }
}
