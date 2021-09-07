package br.uff.ic.agenda.controller;

import br.uff.ic.agenda.model.Contato;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ControleCarregar implements ListSelectionListener {

    private final JList<Contato> listaContatos;
    private final JTextField campoNome;
    private final JTextField campoTelefone;
    private final JTextField campoEndr;
    private final JTextField campoEndc;
    private final JTextArea campoDetalhes;
    
    
    public ControleCarregar (JList<Contato> listaContatos, JTextField campoNome, JTextField campoTelefone,JTextField campoEndr, JTextField campoEndc, JTextArea campoDetalhes) {
        this.listaContatos = listaContatos;
        this.campoNome = campoNome;
        this.campoTelefone = campoTelefone;
        this.campoEndr = campoEndr;
        this.campoEndc = campoEndc; 
        this.campoDetalhes = campoDetalhes;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        Contato contatoSelecionado = listaContatos.getSelectedValue();
        
        if (contatoSelecionado != null) {
            campoNome.setText(contatoSelecionado.getNome());
            campoTelefone.setText(contatoSelecionado.getTelefone());
            campoEndr.setText(contatoSelecionado.getEndr());
            campoEndc.setText(contatoSelecionado.getEndc());
            campoDetalhes.setText(contatoSelecionado.getDetalhes());
        } else {
            campoNome.setText("");
            campoTelefone.setText("");
            campoEndr.setText("");
            campoEndc.setText(""); 
            campoDetalhes.setText("");
        }

        campoNome.setEnabled(contatoSelecionado != null);
        campoTelefone.setEnabled(contatoSelecionado != null);
        campoEndr.Enabled(contatoSelecionado != null);
        campoEndc.setEnabled(contatoSelecionado != null); 
        campoDetalhes.setEnabled(contatoSelecionado != null);

        listaContatos.repaint();        
    }
}
