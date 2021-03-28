import java.util.Scanner;
class SigneEntier 
{
    public static void main(String[] args) 
    {
        int nombre;
        Scanner scan = new Scanner(System.in);
        System.out.print("Entrez un nombre pour verifier son signe :");
        nombre = scan.nextInt();
        scan.close();
        if(nombre > 0)
        {
            System.out.println(nombre+" est un nombre positif ");
        }
        else if(nombre < 0)
        {
            System.out.println(nombre+" est un nombre negatif");
        }
        else
        {
            System.out.println(nombre+" n'est ni negatif ni positif");
        }
    }
}