package aeroport;
import java.util.Date;


/* 
* Classe Escale représentant une escale d'un vol. 
* Une escale est définie par une heure d'arrivée et une heure de départ. 
* Cette classe a été créée pour modéliser les escales dans le système de réservation de vol, 
* conformément au diagramme UML qui spécifie qu'un vol peut comporter des escales.
* En associant des instances de cette classe à un objet de la classe Vol, il est possible de 
  représenter les différentes escales effectuées par un vol lors de son trajet 
 
 */
public class Escale {
    private Date heureArrivee;
    private Date heureDepart;

    public Escale(Date heureArrivee, Date heureDepart) {
        this.heureArrivee = heureArrivee;
        this.heureDepart = heureDepart;
    }

    public Date getHeureArrivee() {
        return heureArrivee;
    }

    public Date getHeureDepart() {
        return heureDepart;
    }
}
