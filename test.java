import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalTime;

public class test {
   public static void main(String[] args) {
      // Créer une compagnie
      Compagnie compagnie = new Compagnie("Air France");

      // Créer des vols
      Vol vol1 = new Vol(1, 'A', 'B', LocalDate.of(2023, 4, 1), LocalTime.of(9, 0), LocalDate.of(2023, 4, 1), LocalTime.of(11, 0));
      Vol vol2 = new Vol(2, 'B', 'C', LocalDate.of(2023, 4, 1), LocalTime.of(12, 0), LocalDate.of(2023, 4, 1), LocalTime.of(14, 0));

      // Ajouter les vols à la compagnie
      compagnie.ajouterVol(vol1);
      compagnie.ajouterVol(vol2);

      // Afficher les vols de la compagnie
      List<Vol> vols = compagnie.getVols();
      for (Vol vol : vols) {
         System.out.println(vol);
      }
   }
}
