import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;


public class Vol {
    private int id_vol;
    private char Aereport_depart;
    private char Aereport_arrivee;
    private LocalDate date_depart;
    private LocalTime heure_depart;
    private LocalDate date_arrivee;
    private LocalTime heure_arrivee;
    public Vol(int id_vol, char Aereport_depart, char Aereport_arrivee, LocalDate date_depart, LocalTime heure_depart, LocalDate date_arrivee, LocalTime heure_arrivee) {
        this.id_vol = id_vol;
        this.Aereport_depart = Aereport_depart;
        this.Aereport_arrivee = Aereport_arrivee;
        this.date_depart = date_depart;
        this.heure_depart = heure_depart;
        this.date_arrivee = date_arrivee;
        this.heure_arrivee = heure_arrivee;
    }
    
}
