package reservation;

import java.util.Date;
import aeroport.Vol;
/* 
Pour modéliser la relation entre Client et Reservation où un client peut effectuer plusieurs réservations, 
mais une réservation ne peut être effectuée que par un seul client, nous avons ajouter une référence 
à l'objet Client dans la classe Reservation. 
j'ai ajouté un nouvel attribut confirmee de type boolean pour indiquer si la réservation a été confirmée ou non.

Les méthodes confirmer() et annuler() modifient la valeur de cet attribut en conséquence.
Ainsi,les méthodes confirmer() et annuler() mettent à jour l'état de la réservation et indiquer si elle a été confirmée ou non.
*/

/*
-Un passager : représente une personne qui est associée à une réservation et qui sera présent lors du vol.
Le passager est lié à la réservation par la relation "une réservation concerne un passager". 
Le passager peut avoir des informations telles que le nom, l'âge, le sexe, etc.

-Un client : représente la personne qui effectue la réservation. Le client est lié à la réservation par 
la relation "un client effectue une réservation". Le client peut avoir des informations telles que le nom, 
la référence du client, les informations de paiement, les coordonnées de contact, etc. */



/**En résumé, le passager est la personne physique qui sera présente lors du vol, tandis que l
e client est la personne qui effectue la réservation au nom du passager. Dans certaines situations, 
le client peut être le même que le passager, mais il peut aussi y avoir des cas où le client effectue 
la réservation pour un autre passager. */


public class Reservation {
    private Vol vol;
    private Client client;
    private String numero;
    private Date date;
    private boolean confirmee;
    private Passager passager;

    public Reservation(Vol vol, Client client, String numero, Date date) {
    this.vol = vol;
    this.client = client;
    this.numero = numero;
    this.date = date;
    this.confirmee = false; // La réservation est initialement non confirmée
    }


    public Vol getVol(){
        return vol;
    }
    public void setVol(Vol vol) {
        this.vol = vol;
    }



    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }


    public Passager getPassager() { 
        return passager; 
    } 
    public void setPassager(Passager passager) {
         this.passager = passager; 
    }



    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }



    public boolean isConfirmee() {
        return confirmee;
    }
    public void confirmer() {
        this.confirmee = true;
    }
    public void annuler() {
        this.confirmee = false;
    }
}