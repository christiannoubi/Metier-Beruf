public class TestMetiers {


    public static void main(String []argv){

        Personne[] personnes = new Personne[3];
        personnes [0]= new Menuisier("Paul","Allersbergerstraße 21, 90461 Nürnberg");
        personnes [1]= new Plombier("Jean","Allersbergerstraße 21, 90461 Nürnberg");
        personnes [2]= new Menuisier("Adrien","Allersbergerstraße 21, 90461 Nürnberg");

        for (int i= 0; i<personnes.length; i++){
          personnes[i].affiche();
        }
    }
}
