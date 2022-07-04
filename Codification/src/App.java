import java.util.Scanner;

import models.Chambre;
import models.Pavillon;
import models.TypeChambre;
import service.IService;
import service.ServiceTableau;

public class App {
    IService service = new ServiceTableau();
    Pavillon pavillon = new Pavillon();
    Chambre chambre = new Chambre();
    
    public void afficheTout(){
        System.out.println("Pour AJouter Un Pavillon Veuillez Saisir 1\nPour AJouter Un Chambre Veuillez Saisir 2");
        try(Scanner scanner = new Scanner(System.in)) {
            int menu = scanner.nextInt();
            if(menu==1){
                affichePavillon();
               
            }if(menu==2){
                afficheChambre();
            }

        }
       

       
    }

    public void affichePavillon(){
        try(Scanner scan = new Scanner(System.in)) {
               
    
                System.out.println("Veuillez saisir l'id du pavillon");
                int idpave = scan.nextInt();
                pavillon.setIdpav(idpave);
                System.out.println("Veuillez saisi le nombre d'étage");
                int nbreDetages = scan.nextInt();
                pavillon.setNbreDetages(nbreDetages);
                System.out.println("Veuillez saisir le numero de pavillon");
                int numPav = scan.nextInt();
                pavillon.setNumPav(numPav);
                System.out.println("Voulez-vous continuer pour ajouter des chambres dans la pavillon \n1:Pour continuer\n0:Pour quitter");
                int dem = scan.nextInt();
                if(dem == 1) {
                    afficheChambre() ;
                }else{
                    exit();
                }
        }
           
    }
    public void afficheChambre(){
        try(Scanner scan = new Scanner(System.in)) {
        System.out.println("Veuillez saisir l'Id du chambre");
        int idcha = scan.nextInt();
        chambre.setId(idcha);
        System.out.println("Veuillez saisir le numero du chambre");
        int numChambre = scan.nextInt();
        chambre.setNumChambre(numChambre);
        System.out.println("Veuillez saisir le numero d'etage chambre");
        int numEtage = scan.nextInt();
        chambre.setNumEtage(numEtage);
        chambre.setPavillon(pavillon);

        //Ajouter Type de Chambre   
        System.out.println("Veuillez choisir un type de chambre\n1:pour INDIVIDUEL\n2:Pour DOUBLE");
        int choice = scan.nextInt();
        if(choice==1){
            chambre.setType(TypeChambre.DOUBLE);
        } if(choice==2){   
            chambre.setType(TypeChambre.INDIVIDUEL);
        }
        service.addChambre(chambre);
        service.listerChambre();
    }
}
   
    private static void exit() {

}
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        App affiche=new App();
        affiche.afficheTout();

}
}

