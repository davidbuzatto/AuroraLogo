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

import br.com.davidbuzatto.auroralogo.utils.Utils;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.BorderFactory;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;
import org.fife.rsta.ui.AssistanceIconPanel;
import org.fife.rsta.ui.UIUtil;
import org.fife.rsta.ui.search.FindReplaceButtonsEnableResult;
import org.fife.rsta.ui.search.SearchEvent;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rtextarea.SearchContext;

/**
 * Implementação de uma barra de ferramentas para a ação de procurar.
 *
 * @author Prof. Dr. David Buzatto
 */
public class BarraDeFerramentaProcurar extends JPanel {

    private SearchContext contexto;
    protected ToolBarListener listener;
    protected FindFieldListener findFieldListener;
    protected CustomSearchComboBox comboProcurar;
    protected CustomSearchComboBox comboSubstituir;
    protected JButton botaoProcurar;
    protected JButton botaoBuscarAnterior;
    protected JCheckBox checkDiferenciar;
    protected JCheckBox checkPalavraInteira;
    protected JCheckBox checkRegex;
    protected JCheckBox checkMarcarTodas;
    protected JCheckBox checkQuebra;
    private Timer timerMarcarTodas;

    private boolean settingFindTextFromEvent;

    protected static final ResourceBundle SEARCH_MSG = ResourceBundle.getBundle(
            "org.fife.rsta.ui.search.Search" );
    protected static final ResourceBundle MSG = ResourceBundle.getBundle(
            "org.fife.rsta.ui.search.SearchToolBar" );

    public BarraDeFerramentaProcurar( SearchListener listener ) {

        setFocusCycleRoot( true );

        timerMarcarTodas = new Timer( 300, new MarkAllEventNotifier() );
        timerMarcarTodas.setRepeats( false );

        setLayout( new BorderLayout() );
        setBorder( BorderFactory.createEmptyBorder( 2, 5, 2, 5 ) );
        addSearchListener( listener );
        
        this.listener = new ToolBarListener();
        setSearchContext( new SearchContext() );
        
        add( criarPainelCampos(), BorderLayout.LINE_START );
        
    }

    public void addSearchListener( SearchListener l ) {
        listenerList.add( SearchListener.class, l );
    }

    protected Container criarPainelCampos() {

        findFieldListener = new FindFieldListener();
        criarBotoesProcurar();
        
        JPanel painel = new JPanel();
        painel.setLayout( new GridBagLayout() );
        
        JLabel labelP = new JLabel( MSG.getString( "FindWhat" ) );
        
        comboProcurar = new CustomSearchComboBox( this, false );
        JTextComponent findField = UIUtil.getTextComponent(comboProcurar );
        findFieldListener.instalar( findField );
        
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
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( comboProcurar, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( botaoProcurar, gridBagConstraints );
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkDiferenciar, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkPalavraInteira, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkQuebra, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkRegex, gridBagConstraints );

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        painel.add( checkMarcarTodas, gridBagConstraints );

        return painel;

    }

    protected JCheckBox criarCheckBox( String key ) {
        JCheckBox cb = new JCheckBox( SEARCH_MSG.getString( key ) );
        cb.addActionListener( listener );
        cb.addMouseListener( listener );
        return cb;
    }

    protected Container criarPainelAssistenteConteudo( JComponent comp ) {
        JPanel painel = new JPanel( new BorderLayout() );
        painel.add( comp );
        AssistanceIconPanel aip = new AssistanceIconPanel( comp );
        painel.add( aip, BorderLayout.LINE_START );
        return painel;
    }

    /**
     * Creates the buttons for this toolbar.
     */
    protected void criarBotoesProcurar() {

        botaoBuscarAnterior = new JButton( MSG.getString( "FindPrev" ) );
        fazerEnterAtivarBotao( botaoBuscarAnterior );
        botaoBuscarAnterior.setActionCommand( "FindPrevious" );
        botaoBuscarAnterior.addActionListener( listener );
        botaoBuscarAnterior.setEnabled( false );

        botaoProcurar = new JButton( SEARCH_MSG.getString( "Find" ) ) {
            @Override
            public Dimension getPreferredSize() {
                return botaoBuscarAnterior.getPreferredSize();
            }
        };
        
        fazerEnterAtivarBotao( botaoProcurar );
        botaoProcurar.setToolTipText( "Shift+Enter executa busca no sentido contrário" );
        botaoProcurar.setActionCommand( "FindNext" );
        botaoProcurar.addActionListener( listener );
        botaoProcurar.setEnabled( false );

    }

    protected void marcarTodas( boolean delay ) {
        if ( contexto.getMarkAll() && !settingFindTextFromEvent ) {
            if ( delay ) {
                timerMarcarTodas.restart();
            } else {
                dispararEventoMarcarTodas();
            }
        }
    }

    void doSearch( boolean forward ) {
        if ( forward ) {
            botaoProcurar.doClick( 0 );
        } else {
            botaoBuscarAnterior.doClick( 0 );
        }
    }

    private void dispararEventoMarcarTodas() {
        SearchEvent se = new SearchEvent( this, SearchEvent.Type.MARK_ALL,
                contexto );
        dispararEventoProcurar( se );
    }

    protected void dispararEventoProcurar( SearchEvent e ) {
        
        SearchListener[] listeners = listenerList.
                getListeners( SearchListener.class );
        
        int cont = listeners == null ? 0 : listeners.length;
        
        for ( int i = cont - 1; i >= 0; i-- ) {
            listeners[i].searchEvent( e );
        }
        
    }

    protected String getFindText() {
        return UIUtil.getTextComponent( comboProcurar ).getText();
    }

    public int getMarkAllDelay() {
        return timerMarcarTodas.getInitialDelay();
    }

    protected String getReplaceText() {
        
        if ( comboSubstituir == null ) {
            return null;
        }
        
        return UIUtil.getTextComponent( comboSubstituir ).getText();
        
    }

    public SearchContext getSearchContext() {
        return contexto;
    }

    protected void handleRegExCheckBoxClicked() {
        gerenciarBotoesPressao();
        comboProcurar.setAutoCompleteEnabled( checkRegex.isSelected() );
    }

    protected void manipularAcaoBusca( ActionEvent e ) {

        SearchEvent.Type tipo = null;
        boolean paraFrente = true;
        String acao = e.getActionCommand();
        
        int modsPermitidos
                = InputEvent.CTRL_DOWN_MASK | InputEvent.SHIFT_DOWN_MASK;

        if ( "FindNext".equals( acao ) ) {
            
            tipo = SearchEvent.Type.FIND;
            int mods = e.getModifiers();
            paraFrente = ( mods & modsPermitidos ) == 0;
            
            JTextComponent tc = UIUtil.getTextComponent( comboProcurar );
            comboProcurar.addItem( tc.getText() );
            
        } else if ( "FindPrevious".equals( acao ) ) {
            
            tipo = SearchEvent.Type.FIND;
            paraFrente = false;
            
            JTextComponent tc = UIUtil.getTextComponent( comboProcurar );
            comboProcurar.addItem( tc.getText() );
            
        } else if ( "Replace".equals( acao ) ) {
            
            tipo = SearchEvent.Type.REPLACE;
            int mods = e.getModifiers();
            paraFrente = ( mods & modsPermitidos ) == 0;
            
            JTextComponent tc = UIUtil.getTextComponent( comboProcurar );
            comboProcurar.addItem( tc.getText() );
            
            tc = UIUtil.getTextComponent( comboSubstituir );
            comboSubstituir.addItem( tc.getText() );
            
        } else if ( "ReplaceAll".equals( acao ) ) {
            
            tipo = SearchEvent.Type.REPLACE_ALL;
            
            JTextComponent tc = UIUtil.getTextComponent( comboProcurar );
            comboProcurar.addItem( tc.getText() );
            
            tc = UIUtil.getTextComponent( comboSubstituir );
            comboSubstituir.addItem( tc.getText() );
            
        }

        contexto.setSearchFor( getFindText() );
        
        if ( comboSubstituir != null ) {
            contexto.setReplaceWith( comboSubstituir.getSelectedString() );
        }

        SearchContext contextoADisparar = contexto;
        if ( paraFrente != contexto.getSearchForward() ) {
            contextoADisparar = contexto.clone();
            contextoADisparar.setSearchForward( paraFrente );
        }

        SearchEvent se = new SearchEvent( this, tipo, contextoADisparar );
        dispararEventoProcurar( se );
        gerenciarBotoesPressao();

    }

    protected FindReplaceButtonsEnableResult gerenciarBotoesPressao() {

        FindReplaceButtonsEnableResult resultado
                = new FindReplaceButtonsEnableResult( true, null );

        String texto = getFindText();
        if ( texto.length() == 0 ) {
            resultado = new FindReplaceButtonsEnableResult( false, null );
        } else if ( checkRegex.isSelected() ) {
            try {
                Pattern.compile( texto );
            } catch ( PatternSyntaxException pse ) {
                resultado = new FindReplaceButtonsEnableResult( false,
                        pse.getMessage() );
            }
        }

        boolean habilitar = resultado.getEnable();
        botaoProcurar.setEnabled( habilitar );
        botaoBuscarAnterior.setEnabled( habilitar );

        JTextComponent tc = UIUtil.getTextComponent( comboProcurar );
        tc.setForeground( habilitar ? UIManager.getColor( "TextField.foreground" )
                : UIUtil.getErrorTextForeground() );

        String tooltip = Utils.getToolTip( resultado );
        tc.setToolTipText( tooltip );

        return resultado;

    }
    
    private void iniciarUIDoContexto() {
        
        if ( comboProcurar == null ) {
            return;
        }
        
        setTextoProcurar( contexto.getSearchFor() );
        
        if ( comboSubstituir != null ) {
            setReplaceText( contexto.getReplaceWith() );
        }
        
        checkDiferenciar.setSelected( contexto.getMatchCase() );
        checkPalavraInteira.setSelected( contexto.getWholeWord() );
        checkRegex.setSelected( contexto.isRegularExpression() );
        checkMarcarTodas.setSelected( contexto.getMarkAll() );
        checkQuebra.setSelected( contexto.getSearchWrap() );
        
    }

    protected void fazerEnterAtivarBotao( JButton button ) {

        InputMap im = button.getInputMap();

        im.put( KeyStroke.getKeyStroke( "ENTER" ), "pressed" );
        im.put( KeyStroke.getKeyStroke( "released ENTER" ), "released" );

        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_ENTER, InputEvent.SHIFT_DOWN_MASK,
                false ), "pressed" );
        im.put( KeyStroke.getKeyStroke( KeyEvent.VK_ENTER, InputEvent.SHIFT_DOWN_MASK,
                true ), "released" );

    }

    public void removerOuvinteBusca( SearchListener l ) {
        listenerList.remove( SearchListener.class, l );
    }

    @Override
    public boolean requestFocusInWindow() {
        JTextComponent botaoProcurar = UIUtil.getTextComponent( comboProcurar );
        botaoProcurar.selectAll();
        return botaoProcurar.requestFocusInWindow();
    }

    void botaoProcurarUpdateUICallback( CustomSearchComboBox combo ) {
        findFieldListener.instalar( UIUtil.getTextComponent( combo ) );
    }

    public void setImagemAssistenteConteudo( Image image ) {
        comboProcurar.setContentAssistImage( image );
    }

    protected void setTextoProcurar( String text ) {
        UIUtil.getTextComponent( comboProcurar ).setText( text );
    }

    public void setMarkAllDelay( int millis ) {
        timerMarcarTodas.setInitialDelay( millis );
    }

    protected void setReplaceText( String text ) {
        if ( comboSubstituir != null ) {
            UIUtil.getTextComponent( comboSubstituir ).setText( text );
        }
    }
    
    public void setSearchContext( SearchContext context ) {
        
        if ( this.contexto != null ) {
            this.contexto.removePropertyChangeListener( listener );
        }
        
        this.contexto = context;
        this.contexto.addPropertyChangeListener( listener );
        iniciarUIDoContexto();
        
    }

    private class ToolBarListener extends MouseAdapter
            implements ActionListener, PropertyChangeListener {

        @Override
        public void actionPerformed( ActionEvent e ) {

            Object source = e.getSource();

            if ( source == checkDiferenciar ) {
                contexto.setMatchCase(checkDiferenciar.isSelected() );
                if ( checkMarcarTodas.isSelected() ) {
                    marcarTodas( false );
                }
            } else if ( source == checkPalavraInteira ) {
                contexto.setWholeWord(checkPalavraInteira.isSelected() );
                if ( checkMarcarTodas.isSelected() ) {
                    marcarTodas( false );
                }
            } else if ( source == checkRegex ) {
                contexto.setRegularExpression(checkRegex.isSelected() );
                if ( checkMarcarTodas.isSelected() ) {
                    marcarTodas( false );
                }
            } else if ( source == checkMarcarTodas ) {
                contexto.setMarkAll(checkMarcarTodas.isSelected() );
                dispararEventoMarcarTodas();
            } else if ( source == checkQuebra ) {
                contexto.setSearchWrap(checkQuebra.isSelected() );
            } else {
                manipularAcaoBusca( e );
            }

        }

        @Override
        public void mouseClicked( MouseEvent e ) {
            if ( e.getSource() instanceof JCheckBox ) {
                findFieldListener.selectAll = false;
                comboProcurar.requestFocusInWindow();
            }
        }

        @Override
        public void propertyChange( PropertyChangeEvent e ) {

            String prop = e.getPropertyName();

            if ( SearchContext.PROPERTY_MATCH_CASE.equals( prop ) ) {
                boolean newValue = ( Boolean ) e.getNewValue();
                checkDiferenciar.setSelected( newValue );
            } else if ( SearchContext.PROPERTY_MATCH_WHOLE_WORD.equals( prop ) ) {
                boolean newValue = ( Boolean ) e.getNewValue();
                checkPalavraInteira.setSelected( newValue );
            } else if ( SearchContext.PROPERTY_USE_REGEX.equals( prop ) ) {
                boolean newValue = ( Boolean ) e.getNewValue();
                checkRegex.setSelected( newValue );
                handleRegExCheckBoxClicked();
            } else if ( SearchContext.PROPERTY_MARK_ALL.equals( prop ) ) {
                boolean newValue = ( Boolean ) e.getNewValue();
                checkMarcarTodas.setSelected( newValue );
            } else if ( SearchContext.PROPERTY_SEARCH_FOR.equals( prop ) ) {
                String newValue = ( String ) e.getNewValue();
                String oldValue = getFindText();
                if ( !newValue.equals( oldValue ) ) {
                    settingFindTextFromEvent = true;
                    setTextoProcurar( newValue );
                    settingFindTextFromEvent = false;
                }
            } else if ( SearchContext.PROPERTY_REPLACE_WITH.equals( prop ) ) {
                String newValue = ( String ) e.getNewValue();
                String oldValue = getReplaceText();
                if ( !newValue.equals( oldValue ) ) {
                    settingFindTextFromEvent = true;
                    setReplaceText( newValue );
                    settingFindTextFromEvent = false;
                }
            } else if ( SearchContext.PROPERTY_SEARCH_WRAP.equals( prop ) ) {
                boolean newValue = ( Boolean ) e.getNewValue();
                checkQuebra.setSelected( newValue );
            }

        }

    }

    protected class FindFieldListener extends KeyAdapter
            implements DocumentListener, FocusListener {

        protected boolean selectAll;

        @Override
        public void changedUpdate( DocumentEvent e ) {
        }

        @Override
        public void focusGained( FocusEvent e ) {
            JTextField campo = ( JTextField ) e.getComponent();
            if ( selectAll ) {
                campo.selectAll();
            }
            selectAll = true;
        }

        @Override
        public void focusLost( FocusEvent e ) {
        }

        protected void handleDocumentEvent( DocumentEvent e ) {
            
            gerenciarBotoesPressao();
            
            if ( !settingFindTextFromEvent ) {
                
                JTextComponent findField = UIUtil.getTextComponent(comboProcurar );
                
                if ( e.getDocument() == findField.getDocument() ) {
                    contexto.setSearchFor( findField.getText() );
                    if ( contexto.getMarkAll() ) {
                        marcarTodas( true );
                    }
                } else {
                    JTextComponent replaceField = UIUtil.getTextComponent(comboSubstituir );
                    contexto.setReplaceWith( replaceField.getText() );
                }
                
            }
            
        }

        @Override
        public void insertUpdate( DocumentEvent e ) {
            handleDocumentEvent( e );
        }

        public void instalar( JTextComponent field ) {
            field.getDocument().addDocumentListener( this );
            field.addKeyListener( this );
            field.addFocusListener( this );
        }

        @Override
        public void keyTyped( KeyEvent e ) {
            if ( e.getKeyChar() == '\n' ) {
                int mod = e.getModifiersEx();
                int ctrlShift = InputEvent.CTRL_DOWN_MASK | InputEvent.CTRL_DOWN_MASK;
                boolean forward = ( mod & ctrlShift ) == 0;
                doSearch( forward );
            }
        }

        @Override
        public void removeUpdate( DocumentEvent e ) {
            handleDocumentEvent( e );
        }

    }

    private class MarkAllEventNotifier implements ActionListener {

        @Override
        public void actionPerformed( ActionEvent e ) {
            dispararEventoMarcarTodas();
        }

    }

}
