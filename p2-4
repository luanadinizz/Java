import java.util.Scanner;   
public class questao4 {   
   public static void main (String args[]){  
       short operacao;
       double num1,resultado=0;
       Scanner input = new Scanner(System.in);
       System.out.print("Estado de memória: ");
       System.out.println(resultado);
       do {
            System.out.println("Opções:");
            System.out.println("(1) Somar");     
            System.out.println("(2) Subtrair");     
            System.out.println("(3) Multiplicar");     
            System.out.println("(4) Dividir");     
            System.out.println("(5) limpar memória");
            System.out.println("(6) Sair do programa");
            System.out.print("Qual opção você deseja? ");
            operacao = input.nextShort();
            if (operacao == 6) {
                System.out.println("Bye bye!");
                break;
            }
           
            if (!OperacaoExiste(operacao)) {
                continue;
            }
           
            System.out.print("Digite um valor: ");
            num1 = input.nextDouble();
            if (!ValidaDadosDeEntrada(operacao, num1, resultado)) {
                continue;
            }
      
            System.out.println("RESULTADO:" +Calcular(operacao, num1, resultado) + "\n");
       } while (operacao != 0);
   }
   static double Calcular (short operacao, double num1, double resultado) {
       switch (operacao) {
           case 1: //soma
               resultado = num1 + resultado;
               System.out.print("Estado de memória:  ");
               System.out.println(resultado);
               break;
           case 2: //substração
               resultado = resultado - num1;
               System.out.print("Estado de memória:  ");
               System.out.println(resultado);
               break;
           case 3: //multiplicação
               resultado = num1 * resultado;
               System.out.print("Estado de memória:  ");
               System.out.println(resultado);
               break;
           case 4: //divisão
               resultado = resultado/num1;
               System.out.print("Estado de memória:  ");
               System.out.println(resultado);
               break;
           case 5://limpar memória
               resultado=0;
               System.out.print("Estado de memória:  ");
   System.out.println(resultado);
               break;
       }
       return resultado;
   }
   static boolean OperacaoExiste (short operacao) {
       boolean retorno = true;
       if (operacao > 5) {
           System.out.println("ERRO: Operacao escolhida eh invalida.\n");
           retorno = false;
       }
       return retorno;
   }
   static boolean ValidaDadosDeEntrada (short operacao, double num1, double resultado) {
       boolean retorno = true;
       if (operacao == 5 & resultado == 0) {
            System.out.println("ERRO: Divisor nao pode ser zero.\n");
            retorno = false;
       }
       return retorno;
   }
}
