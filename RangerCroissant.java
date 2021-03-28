import java.util.Scanner;
class RangerCroissant {
    public static void main(String[] args) {
        int nombre1;
        int nombre2;
        int nombre3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le premier nombre :");
        nombre1 = scan.nextInt();
        System.out.print("Entrez le deuxieme nombre :");
        nombre2 = scan.nextInt();
        System.out.print("Entrez le troixieme nombre :");
        nombre3 = scan.nextInt();
        scan.close();
        if ((nombre1 < nombre2) && (nombre2 < nombre3)){
            System.out.println("Les numéros triés par ordre croissants est :  " + nombre1 + " " + nombre2 + " " + nombre3);
            }
        if ((nombre1 < nombre2) && (nombre2 > nombre3)){
            System.out.println("Les numéros triés par ordre croissants est : " + nombre1 + " " + nombre2 + " " + nombre3);
            }
        if ((nombre1 > nombre2) && (nombre2 > nombre3)){
            System.out.println("Les numéros triés par ordre croissants est : " +  nombre3 + " " + nombre2 + " " + nombre1);
            }
        if ((nombre1 > nombre2) && (nombre2 < nombre3)){
            System.out.println("Les numéros triés par ordre croissants est :  " + nombre2 + " " + nombre1 + " " + nombre3);
            }
        
        
    }

}