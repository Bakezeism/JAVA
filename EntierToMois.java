import java.util.Scanner;
class EntierToMois {
    public static void main(String[] args) {
    int nombre;
    Scanner scan = new Scanner(System.in);
    System.out.print("Entrez un nombre entre 1 et 12  pour Afficher le mois :");
    nombre = scan.nextInt();
    scan.close();
    switch (nombre){
    case 1:
        System.out.println (" 1 ==> JANVIER ");
        break;
    case 2:
        System.out.println (" 2 ==> FEVRIER");
        break;
    case 3:
        System.out.println (" 3 ==> MARS");
        break;
    case 4:
        System.out.println (" 4 ==> AVRIL");
        break;
    case 5:
        System.out.println (" 5 ==> MAI");
        break;
    case 6:
        System.out.println (" 6 ==> JUIN");
        break;
    case 7:
        System.out.println (" 7 ==> JUILLET ");
        break;
    case 8:
        System.out.println (" 8 ==> AOUT");
        break;
    case 9:
        System.out.println (" 9 ==> SEPTEMBRE");
        break;
    case 10:
        System.out.println (" 10 ==> OCTOBRE");
        break;
    case 11:
        System.out.println (" 11 ==> NOVEMBRE");
        break;
    case 12:
        System.out.println (" 12 ==> DECEMBRE");
        break;
        default:
            System.out.println ("Vous avez entrez un nombre invalide *-(*");
    }
        
    }
    
}