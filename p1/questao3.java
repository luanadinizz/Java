import java.util.Scanner;
public class exercicio3 {
private static Scanner teclado = new Scanner ( System.in);
public static void main( String[] args){
   System.out.print("Digite a idade do atleta:");
    int idade = teclado.nextInt();
    if (idade>4 & idade <8){
        System.out.println("Atleta classificado para a categoria A");
    }
    else if (idade>7 & idade <11){
       System.out.println("Atleta classificado para a categoria B");
    }
    else if (idade>10 & idade <14){
       System.out.println("Atleta classificado para a categoria Juvenil A");
    }
    else if (idade>13 & idade <18){
       System.out.println("Atleta classificado para a categoria Juvenil B");
    }
    else if (idade>=18){
       System.out.println("Atleta classificado para a categoria Adulto");
    }
    else{
       System.out.println("Atleta não classificado por idade");
    }
}
}
