/*
 * 09/20/2013
 *
 * ReplaceToolBar - A toolbar for "replace" operations in text areas.
 *
 * This library is distributed under a modified BSD license.  See the included
 * RSTAUI.license.txt file for details.
 */
package br.com.davidbuzatto.auroralogo.gui.custom;

import java.awt.*;
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
import org.fife.rsta.ui.search.FindToolBar;
import org.fife.rsta.ui.search.ReplaceDialog;
import org.fife.rsta.ui.search.SearchListener;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;

/**
 * A toolbar for replace operations in a text editor application. This provides
 * a more seamless experience than using a Find or Replace dialog.
 *
 * @author Robert Futrell
 * @version 0.5
 * @see FindToolBar
 * @see ReplaceDialog
 * Modificado por Prof. Dr. David Buzatto
 */
public class CustomReplaceToolBar extends CustomFindToolBar {

    private JButton replaceButton;
    private JButton replaceAllButton;

    /**
     * Our search listener, cached so we can grab its selected text easily.
     */
    protected SearchListener searchListener;

    /**
     * Creates the toolbar.
     *
     * @param listener An entity listening for search events.
     */
    public CustomReplaceToolBar( SearchListener listener ) {
        super( listener );
        this.searchListener = listener;
    }

    @Override
    public void addNotify() {
        super.addNotify();
        handleToggleButtons();
    }

    @Override
    protected Container createFieldPanel() {

        findFieldListener = new ReplaceFindFieldListener();
        createFindButtons();
        
        JPanel panel = new JPanel();
        panel.setLayout( new GridBagLayout() );
        
        JLabel labelP = new JLabel( MSG.getString( "FindWhat" ) );
        JLabel labelS = new JLabel( MSG.getString( "ReplaceWith" ) );
        
        findCombo = new CustomSearchComboBox( this, false );
        JTextComponent findField = UIUtil.getTextComponent( findCombo );
        findFieldListener.install( findField );

        replaceCombo = new CustomSearchComboBox( this, true );
        JTextComponent replaceField = UIUtil.getTextComponent( replaceCombo );
        findFieldListener.install( replaceField );
        
        matchCaseCheckBox = createCB( "MatchCase" );
        regexCheckBox = createCB( "RegEx" );
        wholeWordCheckBox = createCB( "WholeWord" );
        markAllCheckBox = createCB( "MarkAll" );
        wrapCheckBox = createCB( "Wrap" );
        
        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        panel.add( labelP, gridBagConstraints );
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        panel.add( labelS, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( findCombo, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( replaceCombo, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( findButton, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( replaceButton, gridBagConstraints );
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( replaceAllButton, gridBagConstraints );
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( matchCaseCheckBox, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( regexCheckBox, gridBagConstraints );
        
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( wholeWordCheckBox, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( markAllCheckBox, gridBagConstraints );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        panel.add( wrapCheckBox, gridBagConstraints );

        return panel;

    }

    /*@Override
    protected Container createFieldPanel() {
        JPanel temp = new JPanel( new SpringLayout() );
        return temp;
    }*/

    @Override
    protected void createFindButtons() {

        super.createFindButtons();

        replaceButton = new JButton( SEARCH_MSG.getString( "Replace" ) );
        makeEnterActivateButton( replaceButton );
        replaceButton.setToolTipText( MSG.getString( "Replace.ToolTip" ) );
        replaceButton.setActionCommand( "Replace" );
        replaceButton.addActionListener( listener );
        replaceButton.setEnabled( false );

        replaceAllButton = new JButton( SEARCH_MSG.getString( "ReplaceAll" ) );
        makeEnterActivateButton( replaceAllButton );
        replaceAllButton.setActionCommand( "ReplaceAll" );
        replaceAllButton.addActionListener( listener );
        replaceAllButton.setEnabled( false );

    }

    /**
     * Called when the regex checkbox is clicked (or its value is modified via a
     * change to the search context). Subclasses can override to add custom
     * behavior, but should call the super implementation.
     */
    @Override
    protected void handleRegExCheckBoxClicked() {
        super.handleRegExCheckBoxClicked();
        // "Content assist" support
        boolean b = regexCheckBox.isSelected();
        replaceCombo.setAutoCompleteEnabled( b );
    }

    @Override
    protected void handleSearchAction( ActionEvent e ) {
        String command = e.getActionCommand();
        super.handleSearchAction( e );
        if ( "FindNext".equals( command ) || "FindPrevious".equals( command ) ) {
            handleToggleButtons(); // Replace button could toggle state
        }
    }

    @Override
    protected FindReplaceButtonsEnableResult handleToggleButtons() {

        FindReplaceButtonsEnableResult er = super.handleToggleButtons();
        boolean shouldReplace = er.getEnable();
        replaceAllButton.setEnabled( shouldReplace );

        // "Replace" is only enabled if text to search for is selected in
        // the UI.
        if ( shouldReplace ) {
            String text = searchListener.getSelectedText();
            shouldReplace = matchesSearchFor( text );
        }
        replaceButton.setEnabled( shouldReplace );

        return er;
    }

    private boolean matchesSearchFor( String text ) {
        if ( text == null || text.length() == 0 ) {
            return false;
        }
        String searchFor = findCombo.getSelectedString();
        if ( searchFor != null && searchFor.length() > 0 ) {
            boolean matchCase = matchCaseCheckBox.isSelected();
            if ( regexCheckBox.isSelected() ) {
                int flags = Pattern.MULTILINE; // '^' and '$' are done per line.
                flags = RSyntaxUtilities.getPatternFlags( matchCase, flags );
                Pattern pattern;
                try {
                    pattern = Pattern.compile( searchFor, flags );
                } catch ( PatternSyntaxException pse ) {
                    pse.printStackTrace(); // Never happens
                    return false;
                }
                return pattern.matcher( text ).matches();
            } else {
                if ( matchCase ) {
                    return searchFor.equals( text );
                }
                return searchFor.equalsIgnoreCase( text );
            }
        }
        return false;
    }

    /**
     * Overridden to possibly toggle the enabled state of the replace button.
     */
    @Override
    public boolean requestFocusInWindow() {
        boolean result = super.requestFocusInWindow();
        handleToggleButtons(); // Replace button state may change
        return result;
    }

    @Override
    public void setContentAssistImage( Image image ) {
        super.setContentAssistImage( image );
        replaceCombo.setContentAssistImage( image );
    }

    /**
     * Listens for the user typing into the search field.
     */
    protected class ReplaceFindFieldListener extends FindFieldListener {

        @Override
        protected void handleDocumentEvent( DocumentEvent e ) {
            super.handleDocumentEvent( e );
            JTextComponent findField = UIUtil.getTextComponent( findCombo );
            JTextComponent replaceField = UIUtil.getTextComponent( replaceCombo );
            if ( e.getDocument().equals( findField.getDocument() ) ) {
                handleToggleButtons();
            }
            if ( e.getDocument() == replaceField.getDocument() ) {
                getSearchContext().setReplaceWith( replaceField.getText() );
            }
        }

    }

}
