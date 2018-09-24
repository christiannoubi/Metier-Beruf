public class Personne {

    protected String nom;
    protected String adresse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void affiche(){
        System.out.println("le nom du " + this.getClass().getName() + " est "+this.nom+" et il habite à "+this.adresse);
    }
}
