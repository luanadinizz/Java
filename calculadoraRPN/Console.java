
import java.util.Scanner;
import java.util.Stack;
public class Console {
    private static Scanner scanner = new Scanner(System.in);
    private static Stack<Integer> buffer = new Stack<>();
    public static void main(String[] args) {
        System.out.println("Calculadora RPN");
        System.out.println("Digite um número ou uma operacao (bye para sair): ");
        System.out.print("-> ");
        String input = "";
        while (!input.equals("bye")) {
            input = scanner.next();
            System.out.println("Digite um número ou uma operacao (bye para sair): ");
            System.out.print("-> ");
            if (isInteger(input)) {
                buffer.push(Integer.parseInt(input));
            } else if (isOperation(input)) {
                int current = parseOperation(input, buffer);
                if (buffer.size() == 0) {
                    System.out.println("Resultado = " + current);
					System.out.println("Digite um número ou uma operacao (bye para sair): ");
                    System.out.print("-> ");
                } 
                else{
                    System.out.println("Resultado =  " + current);
					System.out.println("Digite um número ou uma operacao (bye para sair): ");
					System.out.print("-> ");
                }
                buffer.push(current);
            }
        }
        if(input.equals("bye")){
            System.exit(0);
        }
    }
    public static int parseOperation(String operation, Stack<Integer> buffer) {
        int result = (buffer.empty()) ? 0 : buffer.pop();
        if (!buffer.empty()) {
            result = operate(operation, buffer.pop(), result);
        }
        return result;
    }
    public static int operate(String operation, int left, int right) {

        switch (operation) {
            case "+": return right + left;
            case "-": return right - left;
            case "*": return right * left;
            case "/": {
                if (left == 0) {
                    System.out.println("ERRO: nao podemos dividir por 0");
                    return right;
                }
                return right / left;
            }
            default: return right;
        }
    }
    public static boolean isInteger(String input) {
        if (input == null) return false;
        try {
            Integer.parseInt(input);
        } 
        catch (NumberFormatException ex) {
            return false;
        }
        return true;
    }
    public static boolean isOperation(String input) {
        if (input == null) return false;
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }
}
