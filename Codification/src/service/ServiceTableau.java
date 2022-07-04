package service;

import models.Etudiant;
import models.Pavillon;
import models.TypeChambre;
import models.BoursiersLoges;
import models.Chambre;


public class ServiceTableau implements IService {
 private final int TAILLE=10;
 private final int TAILLETABCHAMBRE=50;
 private final int TAILLETYPECHAMBRE=1;

 private TypeChambre[] typeChambres= new TypeChambre[TAILLETYPECHAMBRE];
 private Pavillon[] pavillons= new Pavillon[TAILLE];
 private Chambre[] chambres= new Chambre[TAILLETABCHAMBRE];
 private int indexTypeChambre;
 private int indexPavillon;
  private int indexChambre;
    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
          pavillons[indexPavillon]=pavillon;
          
          indexPavillon++;
        }else{
            System.out.println("le tableau est plein");
        } 
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) {
            if(p!=null){
                System.out.println(p);
            }
        }
        
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
        
        
    }

    @Override
    public void addChambre(Chambre chambre) {

        if(indexTypeChambre<TAILLETABCHAMBRE){
            chambres[indexChambre]=chambre;
            indexChambre++;
          }else{
              System.out.println("le tableau est plein");
          } 
        
    }

    @Override
    public void listerChambre() {
        
        for (Chambre c : chambres) {
            if(c!=null){
                System.out.println(c);
            }
        }
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        
    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
        
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        
    }

    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, BoursiersLoges boursiersLoges) {
        
    }

    
    @Override
    public void listerTypeChambre() {

        for (TypeChambre tc : typeChambres) {
            if(tc!=null){
                System.out.println(tc);
            }
        }
    }

    @Override
    public void addTypeChambre(TypeChambre typeChambre) {
        if(indexTypeChambre<TAILLETYPECHAMBRE){
            typeChambres[indexTypeChambre]=typeChambre;
            indexChambre++;
          }else{
              System.out.println("le tableau est plein");
          } 
    }

   
}
