import java.until.Scanner;
public class Condicao {
    public static void main (String[] args) {
        Scanner v1= new Scanner (System.in);
        System.out.println("Entre um número: ");
        int n1= v1.nextInt();
        Scanner v2= new Scanner (System.in);
        System.out.println("Digite outro número: ");
        int n2 = v2.nextInt();
        v1.close();
        v2.close();
        if (n1 > n2) {
            System.out.printIn(n1 + " é maior que " + n2);
        } else {
            System.out.printIn(n1 + " é menor que " + n2);
        }
    }
}