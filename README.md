# JAVA
import java.util.Scanner;
class Menu {
    public static void main (String[]args){
        int a=0;
        int r;
        int x;
        System.out.println("t"+" MENU");
        System.out.println("1- Ajouter une classe");
        System.out.println("2- Lister une classe");
        System.out.println("3- inscrire etudiant dans une classe");
        System.out.println("4- affecter une classe d'un enseignant ");
        System.out.println("5- lister les Etudiants d'une classe ");
        System.out.println(" ");
        Scanner scan = new Scanner(System.in);
        System.out.print("entrer le numero correspondant à votre choix : ");
        a = scan.nextInt();
        scan.close();
        switch(a){
        case 1: System.out.println("vous avez selectionné‚ le choix "+a);break;
        case 2: System.out.println("vous avez selectionné‚ le choix "+a);break;
        case 3: System.out.println("vous avez selectionné‚ le choix "+a);break;
        case 4: System.out.println("vous avez selectionné‚ le choix "+a);break;
        default: {System.out.println("vous n'avez selectionné‚ aucun choix ");}
        }
        
   }
}
   

