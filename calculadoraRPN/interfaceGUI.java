import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class interfaceGUI extends JFrame {
    private JPanel painel;
    private JButton Botonsin[];
    private JTextField sair;
    private JButton b0, bretroceso, bmais, bmenos, bigual, ac;
    private JButton multi, div, ponto;
    int contador = 0;
    int arr[] = new int[2];

    public static int prioridade(char opcao) {
        if (opcao == '+' || opcao == '-')
            return 1;
        else if (opcao == '*' || opcao == '/')
            return 2;
        return -1;
    }

    public static double resolve(Queue posfixa) {
        Stack pilha = new Stack();
        double resultado, a, b;
        while (posfixa.peek() != null) {
            char data = (Character) posfixa.poll();
            if (Character.isDigit(data))
                pilha.push(data);
            else {
                String Str = pilha.pop().toString();
                b = Double.valueOf(Str).doubleValue();
                Str = pilha.pop().toString();
                a = Double.valueOf(Str).doubleValue();
                if (data == '+')
                    pilha.push(a + b);
                else if (data == '-')
                    pilha.push(a - b);
                else if (data == '*')
                    pilha.push(a * b);
                else if (data == '/')
                    pilha.push(a / b);
            }
        }
        String Str = pilha.pop().toString();
        resultado = Double.valueOf(Str).doubleValue();
        System.out.println(resultado);
        return resultado;
    }

    public static String un(String un) {
        char data, x;
        Queue sair = new java.util.LinkedList();
        Stack pilha = new Stack();
        int i = 0;
        for (i = 0; i < un.length(); i++) {
            data = un.charAt(i);
            if (Character.isDigit(data)) {
                sair.offer(data);
            } 
            else {
                if (pilha.empty() || data == '(' || prioridade(data) > prioridade((Character) pilha.peek()))
                    pilha.push(data);
                else {
                    if (prioridade(data) == prioridade((Character) pilha.peek())) {
                        x = (Character) pilha.peek();
                        if (x == data) {
                            pilha.push(data);
                        } 
                        else {
                            x = (Character) pilha.pop();
                            sair.offer(x);
                            pilha.push(data);
                        }
                    }
                    if (data == ')') {
                        while ((Character) pilha.peek() != '(') {
                            x = (Character) pilha.pop();
                            sair.offer(x);
                        }
                        pilha.pop();

                    }
                }
            }
        }
        while (!pilha.empty()) {
            sair.offer(pilha.pop());
        }
        String aString = Double.toString(resolve(sair));
        return aString;
    }
    public once() {
        super("calculadora");
        multi = new JButton("*");
        div = new JButton("/");
        ponto = new JButton(".");
        b0 = new JButton("0");
        bmais = new JButton("+");
        bmenos = new JButton("-");
        bigual = new JButton("=");
        ac = new JButton("AC");
        ac.setForeground(Color.red);
        bretroceso = new JButton("C");
        bretroceso.setForeground(Color.BLUE);
        sair = new JTextField(10);
        sair.setEditable(false);
        sair.setBorder(BorderFactory.createTitledBorder(BorderFactory.createBevelBorder(1), "Calculadora RPN", 2,
                SwingConstants.SOUTH, new Font("Calibri", 2 + 1, 13), Color.BLACK));
        sair.setBackground(Color.GRAY);
        sair.setFont(new Font("Cambria", 2, 35));
        add(sair);
        Botonsin = new JButton[9];
        painel = new JPanel();
        painel.setLayout(new GridLayout(6, 3));
        for (int contador = 0; contador < Botonsin.length; contador++) {
            Botonsin[contador] = new JButton("" + (contador + 1));
            painel.add(Botonsin[contador]);
        }
        painel.add(ac);
        painel.add(b0);
        painel.add(bretroceso);
        painel.add(ponto);
        painel.add(bmais);
        painel.add(bmenos);
        painel.add(bigual);
        painel.add(multi);
        painel.add(div);
        bretroceso.setEnabled(false);
        ac.setEnabled(false);
        add(painel, BorderLayout.SOUTH);
        b0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "0");
                ativaRetroceso();
            }
        });
        Botonsin[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "1");
                ativaRetroceso();
            }
        });
        Botonsin[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "2");
                ativaRetroceso();
            }
        });
        Botonsin[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "3");
                ativaRetroceso();
            }
        });
        Botonsin[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "4");
                ativaRetroceso();
            }
        });
        Botonsin[4].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "5");
                ativaRetroceso();
            }
        });
        Botonsin[5].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "6");
                ativaRetroceso();
            }
        });
        Botonsin[6].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "7");
                ativaRetroceso();
            }
        });
        Botonsin[7].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "8");
                ativaRetroceso();
            }
        });
        Botonsin[8].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair.setText(sair.getText() + "9");
                ativaRetroceso();
            }
        });
        bretroceso.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String xxx = sair.getText();
                if (xxx != "") {
                    xxx = xxx.substring(0, xxx.length() - 1);
                    sair.setText(xxx);
                }
            }
        });
        ac.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String xxx = sair.getText();
                if (xxx != "") {
                    xxx = "";
                    sair.setText(xxx);
                }
            }
        });
        bigual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String dois = sair.getText();
                sair.setText("");
                sair.setText(sair.getText() + "" + un(dois));
                ativaRetroceso();
            }
        });
        bmais.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = sair.getText();
                sair.setText(sair.getText() + "+");
                ativaRetroceso();
            }
        });
        bmenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = sair.getText();
                sair.setText(sair.getText() + "-");
                ativaRetroceso();
            }
        });
        multi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = sair.getText();
                sair.setText(sair.getText() + "*");
                ativaRetroceso();
            }
        });
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = sair.getText();
                sair.setText(sair.getText() + "/");
                ativaRetroceso();
            }
        });
        ponto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String un = sair.getText();
                sair.setText(sair.getText() + ".");
                ativaRetroceso();
            }
        });
    }// fim do construtor

    public void ativaRetroceso() {
        if (!(sair.getText().equals(""))) {
            bretroceso.setEnabled(true);
            ac.setEnabled(true);
        } 
        else
            bretroceso.setEnabled(false);
    }

    public static void main(String[] args) {
        once janela = new once();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(280, 380);
        janela.setLocation(505, 200);
        janela.setVisible(true);
    }
}
