import java.util.Scanner;
class Comparer {
 public static void main( String args[] )    
    {   
        int nombre1;
        int nombre2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez le premier nombre :");
        nombre1 = scan.nextInt();
        System.out.print("Entrez le deuxieme nombre :");
        nombre2 = scan.nextInt();
        scan.close();
        if(nombre1 > nombre2){
            System.out.println(nombre1 + " > " + nombre2);
            }
            else if(nombre1 < nombre2){
            System.out.println(nombre1 + " < " +  nombre2);
            }
            else{
            System.out.println(nombre1 + " = " + nombre2);
            }         
    }
}