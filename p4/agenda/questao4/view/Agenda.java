package agenda;
import ControlePersistencia;
import ControleCarregar;
import ControleRemover;
import ControleSalvar;
import agenda.model.Contato;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import java.util.Scanner;
public class Agenda extends JFrame {
    private static final String ICONE_ADICIONA = "/toolbarButtonGraphics/general/Add16.gif";
    private static final String ICONE_REMOVE = "/toolbarButtonGraphics/general/Delete16.gif";
    private final DefaultListModel<Contato> contatos = new DefaultListModel<>();
    private final JList<Contato> listaContatos = new JList<>(contatos);
    private final JTextField campoNome = new JTextField();
    private final JTextField campoTelefone = new JTextField();
    private final JTextArea campoDetalhes = new JTextArea();
    private final JTextField campoEndc = new JTextField();
    private final JTextArea campoEndr= new JTextField(); 
    public Agenda() {
        super("Agenda");        
        montaJanela();
    }
    private void montaJanela() {        
        private String cont,busca;
        // Criando um painel com a lista de contatos
        JPanel painelLista = new JPanel(new BorderLayout());
        painelLista.setBorder(BorderFactory.createTitledBorder("Contatos"));
        listaContatos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelLista.add(new JScrollPane(listaContatos), BorderLayout.CENTER);
        // Criando um painel com os botões sob a lista
        JButton botaoAdicionar = new JButton(new ImageIcon(getClass().getResource(ICONE_ADICIONA)));
        JButton botaoRemover = new JButton(new ImageIcon(getClass().getResource(ICONE_REMOVE)));
        JPanel painelBotoes = new JPanel(new GridLayout(1, 2));
        painelBotoes.add(botaoAdicionar);
        painelBotoes.add(botaoRemover);
        painelLista.add(painelBotoes, BorderLayout.SOUTH);   

        // Criando um painel com o nome
        JPanel painelNome = new JPanel(new BorderLayout());
        painelNome.add(new JLabel("Nome:"), BorderLayout.WEST); 
        campoNome.setEnabled(false);
        painelNome.add(campoNome, BorderLayout.CENTER);

        // Criando um painel com o telefone
        JPanel painelTelefone = new JPanel(new BorderLayout());
        painelTelefone.add(new JLabel("Telefone:"), BorderLayout.WEST);
        campoTelefone.setEnabled(false);
        painelTelefone.add(campoTelefone, BorderLayout.CENTER);

        // Criando um painel com o endereco residencial
        JPanel painelEndr = new JPanel(new BorderLayout());
        painelEndr.add(new JLabel("Endereco residencial:"), BorderLayout.WEST); 
        campoEndr.setEnabled(false);
        painelEndr.add(campoEndr, BorderLayout.CENTER); 

        // Criando um painel com o endereco comercial
        JPanel painelEndc = new JPanel(new BorderLayout());
        painelEndc.add(new JLabel("Endereco comercial:"), BorderLayout.WEST); 
        campoEndc.setEnabled(false);
        painelEndc.add(campoEndc, BorderLayout.CENTER);


        // Criando um painel que contem tanto o nome, telefone e enderecos
        JPanel painelCampos = new JPanel(new GridLayout(4, 1));
        painelCampos.add(painelNome);
        painelCampos.add(painelTelefone);
        painelCampos.add(painelEndr);
        painelCampos.add(painelEndc); 
        
        // Criando um painel com os detalhes
        JPanel painelDetalhes = new JPanel(new BorderLayout());
        painelDetalhes.setBorder(BorderFactory.createTitledBorder("Detalhes"));
        campoDetalhes.setEnabled(false);
        painelDetalhes.add(new JScrollPane(campoDetalhes), BorderLayout.CENTER);
       
        // Criando um painel central que combina os campos de texto, a área de texto e os botões
        JPanel painelCentral = new JPanel(new BorderLayout());
        painelCentral.add(painelCampos, BorderLayout.NORTH);
        painelCentral.add(painelDetalhes, BorderLayout.CENTER);

        // Criando um painel do tipo split, que combina a lista com os demais componentes
        JSplitPane painelPrincipal = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, painelLista, painelCentral);
        painelPrincipal.setDividerLocation(200);
        this.setContentPane(painelPrincipal);

        // Configurando os listeners
        listaContatos.addListSelectionListener(new ControleCarregar(listaContatos, campoNome, campoTelefone,campoEndr, campoEndc,campoDetalhes));
        botaoAdicionar.addActionListener(new ControleAdicionar(contatos)); 
        botaoRemover.addActionListener(new ControleRemover(listaContatos, contatos));
        ControleSalvar salvar = new ControleSalvar(listaContatos, campoNome, campoTelefone,campoEndr, campoEndc,campoDetalhes);
        campoNome.addKeyListener(salvar);
        campoTelefone.addKeyListener(salvar);
        campoEndr.addKeyListener(salvar);
        campoEndc.addKeyListener(salvar);
        campoDetalhes.addKeyListener(salvar);
        
        this.addWindowListener(new ControlePersistencia(contatos));
        this.pack();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }       
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
    }
}
