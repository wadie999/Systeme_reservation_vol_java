import java.util.List;
import java.util.ArrayList;



public class Compagnie {
    private String nom;
    private List<Vol> vols;
    
    public Compagnie(String nom) {
        this.nom = nom;
        this.vols = new ArrayList<>();
    }
    
    public String getNom() {
        return this.nom;
    }
    
    public List<Vol> getVols() {
        return this.vols;
    }
    
    public void ajouterVol(Vol vol) {
        this.vols.add(vol);
    }
    
    public void supprimerVol(Vol vol) {
        this.vols.remove(vol);
    }
}
