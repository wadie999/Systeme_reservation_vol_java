import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.text.ParseException;

import aeroport.Compagnie;
import aeroport.Vol;
import aeroport.Aeroport;
import aeroport.Escale;

import reservation.Client;
import reservation.Passager;
import reservation.Reservation;

public class Start {
     private static Date getDate(String dateString) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                return format.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }
    public static void main(String[] args){
    

    /************************ tester tout le systeme ****************************** ************************************/
    /*******************************************************************************************************************/
    /*
                ---------------------------------------------------------
                |                        Aeroports                      |
                ---------------------------------------------------------
                | Nom Aeroport | Ville |
                ---------------------------------------------------------
                | "Paris CDG"  | "Paris" |
                | "Marseille"  | "Marseille" |
                | "Lyon"       | "Lyon" |
                | "Nice"       | "Nice" |
                | "Toulouse"   | "Toulouse" |
                | "Bordeaux"   | "Bordeaux" |
                ---------------------------------------------------------
                */

                /*
                ---------------------------------------------------------
                |                      Compagnies                       |
                ---------------------------------------------------------
                | Nom Compagnie |
                ---------------------------------------------------------
                | "Air France" |
                | "Lufthansa" |
                | "British Airways" |
                ---------------------------------------------------------
                */

    

                /*
                -------------------------------------------------------------------------------------------------------------------------------------
                |                                                     Vols                                                                        |
                -------------------------------------------------------------------------------------------------------------------------------------
                | Numero Vol | Compagnie | Aeroport Depart | Aeroport Arrivee | Date Depart | Date Arrivee | Escale |
                -------------------------------------------------------------------------------------------------------------------------------------
                | V001 | "Air France" | "Paris CDG" | "Marseille" | 2023-05-01 10:00 | 2023-05-01 12:00 | - |
                | V002 | "Lufthansa" | "Marseille" | "Lyon" | 2023-05-02 14:00 | 2023-05-02 15:30 | - |
                | V003 | "British Airways" | "Lyon" | "Nice" | 2023-05-03 09:30 | 2023-05-03 11:15 | "Paris CDG" |
                | V004 | "Air France" | "Nice" | "Toulouse" | 2023-05-04 16:45 | 2023-05-04 18:30 | "Lyon" |
                | V005 | "Lufthansa" | "Toulouse" | "Bordeaux" | 2023-05-05 11:15 | 2023-05-05 12:30 | - |
                | V006 | "British Airways" | "Bordeaux" | "Paris CDG" | 2023-05-06 13:30 | 2023-05-06 15:00 | "Marseille" |
                | V007 | "Air France" | "Paris CDG" | "Lyon" | 2023-05-07 08:45 | 2023-05-07 10:00 | - |
                | V008 | "Lufthansa" | "Lyon" | "Nice" | 2023-05-08 14:30 | 2023-05-08 16:15 | "Paris CDG" |
                -------------------------------------------------------------------------------------------------------------------------------------
                */


    /*
                ---------------------------------------------------------------------------------------
                |                                   Clients                                           |
                ---------------------------------------------------------------------------------------
                | Nom Client | Référence | Mode de Paiement | Contact |
                ---------------------------------------------------------------------------------------
                | "Pierre Dupont" | "REF001" | "Carte de crédit" | "pierre@example.com" |
                | "Sophie Lefèvre" | "REF002" | "PayPal" | "sophie@example.com" |
                | "Thomas Leroy" | "REF003" | "Virement bancaire" | "thomas@example.com" |
                | "Emma Dubois" | "REF004" | "Carte de crédit" | "emma@example.com" |
                | "Hugo Martin" | "REF005" | "Chèque" | "hugo@example.com" |
                | "Léa Robert" | "REF006" | "Carte de crédit" | "lea@example.com" |
                | "Camille Moreau" | "REF007" | "PayPal" | "camille@example.com" |
                | "Lucas Girard" | "REF008" | "Virement bancaire" | "lucas@example.com" |
                | "Clara Laurent" | "REF009" | "Chèque" | "clara@example.com" |
                | "Lucas Lefèvre" | "REF010" | "Carte de crédit" | "lucas@example.com" |
                ---------------------------------------------------------------------------------------
                */

                /*
                ---------------------------------------------------------------------------------------
                |                                   Passagers                                         |
                ---------------------------------------------------------------------------------------
                | Nom Passager | 
                ---------------------------------------------------------------------------------------
                | "Pierre Dupont" |
                | "Sophie Lefèvre" |
                | "Thomas Leroy" |
                | "Emma Dubois" |
                | "Hugo Martin" |
                | "Léa Robert" |
                | "Camille Moreau" |
                | "Lucas Girard" |
                | "Clara Laurent" |
                ---------------------------------------------------------------------------------------
                */

        // Aéroports
        Aeroport parisAirport = new Aeroport("Paris CDG", "Paris");
        Aeroport marseilleAirport = new Aeroport("Marseille", "Marseille");
        Aeroport lyonAirport = new Aeroport("Lyon", "Lyon");
        Aeroport niceAirport = new Aeroport("Nice", "Nice");
        Aeroport toulouseAirport = new Aeroport("Toulouse", "Toulouse");
        Aeroport bordeauxAirport = new Aeroport("Bordeaux", "Bordeaux");

        // Compagnies aériennes
        Compagnie compagnie1 = new Compagnie("Air France");
        Compagnie compagnie2 = new Compagnie("Lufthansa");
        Compagnie compagnie3 = new Compagnie("British Airways");

    

        // Clients
        Client client1 = new Client("Pierre Dupont", "REF001", "Carte de crédit", "pierre@example.com");
        Client client2 = new Client("Sophie Lefèvre", "REF002", "PayPal", "sophie@example.com");
        Client client3 = new Client("Thomas Leroy", "REF003", "Virement bancaire", "thomas@example.com");
        Client client4 = new Client("Emma Dubois", "REF004", "Carte de crédit", "emma@example.com");
        Client client5 = new Client("Hugo Martin", "REF005", "Chèque", "hugo@example.com");
        Client client6 = new Client("Léa Robert", "REF006", "Carte de crédit", "lea@example.com");
        Client client7 = new Client("Camille Moreau", "REF007", "PayPal", "camille@example.com");
        Client client8 = new Client("Lucas Girard", "REF008", "Virement bancaire", "lucas@example.com");
        Client client9 = new Client("Clara Laurent", "REF009", "Chèque", "clara@example.com");
        Client client10 = new Client("Lucas Lefèvre", "REF010", "Carte de crédit", "lucas@example.com");

        // Création des passagers
        Passager passager1 = new Passager("Jean Martin");
        Passager passager2 = new Passager("Marie Durand");
        Passager passager3 = new Passager("Laura Dupuis");
        Passager passager4 = new Passager("Alexandre Lambert");
        Passager passager5 = new Passager("Manon Petit");
        Passager passager6 = new Passager("Hugo Leroy");
        Passager passager7 = new Passager("Juliette Dupont");
        Passager passager8 = new Passager("Emma Lambert");
        Passager passager9 = new Passager("Thomas Durand");
        Passager passager10 = new Passager("Clara Martin");



        // Vols
        Vol vol1 = new Vol("V1", parisAirport, marseilleAirport, getDate("2023-05-01 10:00"), getDate("2023-05-01 12:00"));
        Vol vol2 = new Vol("V2", marseilleAirport, lyonAirport, getDate("2023-05-02 14:00"), getDate("2023-05-02 15:30"));
        Vol vol3 = new Vol("V3", lyonAirport, niceAirport, getDate("2023-05-03 09:30"), getDate("2023-05-03 11:15"));
        // Escales
        Escale escale1 = new Escale(getDate("2023-05-01 12:00"), getDate("2023-05-01 13:00"));
        Escale escale2 = new Escale(getDate("2023-05-02 15:30"), getDate("2023-05-02 16:30"));
        Escale escale3 = new Escale(getDate("2023-05-03 11:15"), getDate("2023-05-03 12:15"));

        vol1.addEscale(escale1);
        vol1.addEscale(escale2);
        vol2.addEscale(escale3);


        // Réservations pour le vol V1
        Reservation reservation1 = new Reservation(vol1, client1, "R1", getDate("2023-05-01"));
        reservation1.setPassager(passager1);

        // Réservations pour le vol V2
        Reservation reservation2 = new Reservation(vol1, client2, "R2", getDate("2023-05-02"));
        reservation2.setPassager(passager2);

        // Réservations pour le vol V3
        Reservation reservation3 = new Reservation(vol1, client3, "R3", getDate("2023-05-03"));
        reservation3.setPassager(passager3);
    }

}
