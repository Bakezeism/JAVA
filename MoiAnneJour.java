import java.util.Scanner;
public class MoiAnneJour {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int Nbjrmoi = 0; 
        String nomdumoi = "Unknown";

        System.out.print("Entrez un moi : ");
        int mois = input.nextInt();

        System.out.print("Entrez une anne: ");
        int anne = input.nextInt();

        switch (mois) {
            case 1:
                nomdumoi = "JANVIER";
                Nbjrmoi = 31;
                break;
            case 2:
                nomdumoi = "FEVRIER";
                if ((anne % 400 == 0) || ((anne % 4 == 0) && (anne % 100 != 0))) {
                    Nbjrmoi = 29;
                } else {
                    Nbjrmoi = 28;
                }
                break;
            case 3:
                nomdumoi = "Mars";
                Nbjrmoi = 31;
                break;
            case 4:
                nomdumoi = "Avril";
                Nbjrmoi = 30;
                break;
            case 5:
                nomdumoi = "Mai";
                Nbjrmoi = 31;
                break;
            case 6:
                nomdumoi = "Juin";
                Nbjrmoi = 30;
                break;
            case 7:
                nomdumoi = "Juillet";
                Nbjrmoi = 31;
                break;
            case 8:
                nomdumoi = "Aout";
                Nbjrmoi = 31;
                break;
            case 9:
                nomdumoi = "September";
                Nbjrmoi = 30;
                break;
            case 10:
                nomdumoi  = "Octobre";
                Nbjrmoi = 31;
                break;
            case 11:
                nomdumoi = "Novembre";
                Nbjrmoi = 30;
                break;
            case 12:
                nomdumoi = "Decembre";
                Nbjrmoi = 31;
        }
        System.out.print( nomdumoi + " " + anne + " est " +  Nbjrmoi + " jours \n");
    }
}