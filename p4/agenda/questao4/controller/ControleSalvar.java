package br.uff.ic.agenda.controller;

import br.uff.ic.agenda.model.Contato;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControleSalvar extends KeyAdapter {

    private final JList<Contato> listaContatos;
    private final JTextField campoNome;
    private final JTextField campoTelefone;
    private final JTextField campoEndr;
    private final JTextField campoEndc;
    private final JTextArea campoDetalhes;
    
    public ControleSalvar (JList<Contato> listaContatos, JTextField campoNome, JTextField campoTelefone,JTextField campoEndr, JTextField campoEndc, JTextArea campoDetalhes) {
        this.listaContatos = listaContatos;
        this.campoNome = campoNome;
        this.campoTelefone = campoTelefone;
        this.campoEndr = campoEndr;
        this.campoEndc = campoEndc; 
        this.campoDetalhes = campoDetalhes;
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        Contato contatoSelecionado = listaContatos.getSelectedValue();
        if (contatoSelecionado != null) {
            contatoSelecionado.setNome(campoNome.getText());
            contatoSelecionado.setTelefone(campoTelefone.getText());
            contatoSelecionado.setEndr(campoEndr.getText());
            contatoSelecionado.setEndc(campoEndc.getText());
            contatoSelecionado.setDetalhes(campoDetalhes.getText());
        }
        listaContatos.repaint();        
    }    
}
