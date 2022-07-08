/*
 * Copyright (C) 2022 Prof. Dr. David Buzatto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package br.com.davidbuzatto.auroralogo.gui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.DocumentEvent;
import javax.swing.text.JTextComponent;
import org.fife.rsta.ui.UIUtil;
import org.fife.rsta.ui.search.FindReplaceButtonsEnableResult;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;

/**
 * Implementação de uma barra de ferramentas para a ação de substituir.
 *
 * @author Prof. Dr. David Buzatto
 */
public class BarraDeFerramentaSubstituir extends BarraDeFerramentaProcurar {

    private JButton botaoSubstituir;
    private JButton botaoSubstituirTodas;

    protected SearchListener searchListener;

    public BarraDeFerramentaSubstituir( SearchListener listener ) {
        super( listener );
        this.searchListener = listener;
    }

    @Override
    public void addNotify() {
        super.addNotify();
        gerenciarBotoesPressao();
    }

    @Override
    protected Container criarPainelCampos() {

        findFieldListener = new ReplaceFindFieldListener();
        criarBotoesProcurar();
        
        JPanel painel = new JPanel();
        painel.setLayout( new GridBagLayout() );
        
        JLabel labelP = new JLabel( MSG.getString( "FindWhat" ) );
        JLabel labelS = new JLabel( MSG.getString( "ReplaceWith" ) );
        
        comboProcurar = new CustomSearchComboBox( this, false );
        JTextComponent findField = UIUtil.getTextComponent( comboProcurar );
        findFieldListener.instalar( findField );

        comboSubstituir = new CustomSearchComboBox( this, true );
        JTextComponent replaceField = UIUtil.getTextComponent(comboSubstituir );
        findFieldListener.instalar( replaceField );
        
        checkDiferenciar = criarCheckBox( "MatchCase" );
        checkRegex = criarCheckBox( "RegEx" );
        checkPalavraInteira = criarCheckBox( "WholeWord" );
        checkMarcarTodas = criarCheckBox( "MarkAll" );
        checkQuebra = criarCheckBox( "Wrap" );
        
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        painel.add( labelP, gridBagConstraints );
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        painel.add( labelS, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( comboProcurar, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( comboSubstituir, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add(botaoProcurar, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( botaoSubstituir, gridBagConstraints );
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( botaoSubstituirTodas, gridBagConstraints );
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkDiferenciar, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkRegex, gridBagConstraints );
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkPalavraInteira, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkMarcarTodas, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add(checkQuebra, gridBagConstraints );

        return painel;

    }

    @Override
    protected void criarBotoesProcurar() {

        super.criarBotoesProcurar();

        botaoSubstituir = new JButton( SEARCH_MSG.getString( "Replace" ) );
        fazerEnterAtivarBotao( botaoSubstituir );
        botaoSubstituir.setToolTipText( MSG.getString( "Replace.ToolTip" ) );
        botaoSubstituir.setActionCommand( "Replace" );
        botaoSubstituir.addActionListener( listener );
        botaoSubstituir.setEnabled( false );

        botaoSubstituirTodas = new JButton( SEARCH_MSG.getString( "ReplaceAll" ) );
        fazerEnterAtivarBotao( botaoSubstituirTodas );
        botaoSubstituirTodas.setActionCommand( "ReplaceAll" );
        botaoSubstituirTodas.addActionListener( listener );
        botaoSubstituirTodas.setEnabled( false );

    }

    @Override
    protected void handleRegExCheckBoxClicked() {
        super.handleRegExCheckBoxClicked();
        comboSubstituir.setAutoCompleteEnabled( checkRegex.isSelected() );
    }

    @Override
    protected void manipularAcaoBusca( ActionEvent e ) {
        
        String comando = e.getActionCommand();
        super.manipularAcaoBusca( e );
        
        if ( "FindNext".equals( comando ) || "FindPrevious".equals( comando ) ) {
            gerenciarBotoesPressao();
        }
        
    }

    @Override
    protected FindReplaceButtonsEnableResult gerenciarBotoesPressao() {

        FindReplaceButtonsEnableResult enableR = super.gerenciarBotoesPressao();
        boolean shouldReplace = enableR.getEnable();
        botaoSubstituirTodas.setEnabled( shouldReplace );

        if ( shouldReplace ) {
            String text = searchListener.getSelectedText();
            shouldReplace = casaComBuscaPor( text );
        }
        
        botaoSubstituir.setEnabled( shouldReplace );

        return enableR;
        
    }

    private boolean casaComBuscaPor( String texto ) {
        
        if ( texto == null || texto.length() == 0 ) {
            return false;
        }
        
        String buscarPor = comboProcurar.getSelectedString();
        
        if ( buscarPor != null && buscarPor.length() > 0 ) {
            
            boolean conindicirCaixa = checkDiferenciar.isSelected();
            
            if ( checkRegex.isSelected() ) {
                
                int flags = Pattern.MULTILINE;
                flags = RSyntaxUtilities.getPatternFlags( conindicirCaixa, flags );
                Pattern pattern;
                
                try {
                    pattern = Pattern.compile( buscarPor, flags );
                } catch ( PatternSyntaxException pse ) {
                    pse.printStackTrace(); // nunca chega aqui!
                    return false;
                }
                
                return pattern.matcher( texto ).matches();
                
            } else {
                if ( conindicirCaixa ) {
                    return buscarPor.equals( texto );
                }
                return buscarPor.equalsIgnoreCase( texto );
            }
        }
        return false;
    }

    @Override
    public boolean requestFocusInWindow() {
        boolean resultado = super.requestFocusInWindow();
        gerenciarBotoesPressao();
        return resultado;
    }

    @Override
    public void setImagemAssistenteConteudo( Image image ) {
        super.setImagemAssistenteConteudo( image );
        comboSubstituir.setContentAssistImage( image );
    }

    protected class ReplaceFindFieldListener extends FindFieldListener {

        @Override
        protected void handleDocumentEvent( DocumentEvent e ) {
            
            super.handleDocumentEvent( e );
            JTextComponent findField = UIUtil.getTextComponent(comboProcurar );
            JTextComponent replaceField = UIUtil.getTextComponent(comboSubstituir );
            
            if ( e.getDocument().equals( findField.getDocument() ) ) {
                gerenciarBotoesPressao();
            }
            
            if ( e.getDocument() == replaceField.getDocument() ) {
                getSearchContext().setReplaceWith( replaceField.getText() );
            }
            
        }

    }

}
