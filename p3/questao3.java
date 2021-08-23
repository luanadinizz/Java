import java.util.Scanner;
public class primos{
    private static Scanner teclado = new Scanner (System.in);
    public static void main (String[]args){
        new Thread(calculaprimo).start();
    }
   private static Runnable calculaprimo = new Runnable(){
       public void run(){
           int n,primo=0,total=0;
           System.out.println("Digite um número:");
           n=teclado.nextInt();
           for (int i=0; i<=n;i++){
               for (int j=1;j<=i;j++){
                   if(i%j==0){
                       primo++;
                    }
                }
                if(primo==2){
                    System.out.println("O número "+i+" é primo!");
                    total++;
                    
                }
                primo=0;
            }
            System.out.println("Existem "+total+" números primos entre 0 e o número digitado!");
        }
    };
    }
