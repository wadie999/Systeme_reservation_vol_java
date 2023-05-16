package aeroport;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import aeroport.Aeroport;
import aeroport.Compagnie;



public class Vol {

    private String numero;
    private Aeroport depart;
    private Aeroport arrivee;
    private Compagnie compagnie;
    private Date dateDepart;
    private Date dateArrivee;
    /* Dans cette version, la classe Vol a été mise à jour pour inclure une liste de 
    Date pour représenter les escales. La classe Aeroport n'a qu'un attribut 
    "nom" pour représenter le nom de l'aéroport.
    Lorsque vous créez une instance de la classe Vol, vous pouvez ajouter des escales 
    en utilisant la méthode addEscales(Dateescale).
    L'utilisation de cette approche permet de représenter les escales directement dans la classe Vol, 
    ce qui simplifie la structure du modèle sans avoir besoin d'une classe séparée pour les escales.*/
    private List<Escale> escales;

    public Vol(String numero, Aeroport depart, Aeroport arrivee, Date dateDepart, Date dateArrivee) {
        this.numero = numero;
        this.depart = depart;
        this.arrivee = arrivee;
        this.dateDepart = dateDepart;
        this.dateArrivee = dateArrivee;
        this.escales = new ArrayList<>();
    }

    public Duration obtenirDuree() {
        if(this.dateDepart != null && this.dateArrivee != null) {
            return Duration.of(dateArrivee.getTime() - dateDepart.getTime(), ChronoUnit.MILLIS);
        }
        return null;
    }

    public Date getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public Vol() {
    }

    protected Vol(String numero){
        this.numero = numero;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        if(compagnie!=null) {
            compagnie.addVolWithoutBidirectional(this);
        }
        if(this.compagnie!=null){
            this.compagnie.removeVolWithoutBidirectional(this);
        }
        this.compagnie = compagnie;
    }

    protected void setCompagnieWithoutBidirectional(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Aeroport getDepart() {
        return depart;
    }

    public void setDepart(Aeroport depart) {
        this.depart = depart;
    }

    public Aeroport getArrivee() {
        return arrivee;
    }

    public void setArrivee(Aeroport arrivee) {
        this.arrivee = arrivee;
    }
    public List <Escale> getEscales() {
        return escales;
    }
    public void addEscale(Escale escale){
        escales.add(escale);
    }
    @Override
    public boolean equals(Object obj) {
        try {
            return ((Vol) obj).getNumero().equals(this.numero);
        } catch (Exception e){
            return false;
        }
    }
}
