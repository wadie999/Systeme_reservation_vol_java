package reservation;

public class Client {
    private String nom;
    private String reference;
    private String paiement;
    private String contact;

    public Client(String nom,String reference,String paiement, String contact){
        this.nom = nom;
        this.reference = reference;
        this.paiement = paiement;
        this.contact = contact;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPaiement() {
        return paiement;
    }

    public void setPaiement(String paiement) {
        this.paiement = paiement;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}