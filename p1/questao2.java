import java.util.Scanner;
 
public class exercicio2 {
 
private static Scanner teclado = new Scanner ( System.in);
 
public static void main( String[] args){
   System.out.print("Adivinhe um nome:");
   String nome = teclado.nextLine().trim();
   String prog = "Luana";
   if (nome.compareToIgnoreCase(prog) == 0){
       System.out.println("Acertou");
   }
   else{
       System.out.println("Errou");
   }}}
