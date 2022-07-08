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

import java.util.ArrayList;
import java.util.List;
import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;
import org.fife.rsta.ui.UIUtil;
import org.fife.rsta.ui.search.RegexAwareComboBox;

/**
 * Combo box da busca.
 *
 * @author Prof. Dr. David Buzatto
 */
public class CustomSearchComboBox extends RegexAwareComboBox<String> {

    private BarraDeFerramentaProcurar toolBar;

    public CustomSearchComboBox( BarraDeFerramentaProcurar toolBar, boolean trocar ) {
        
        super( trocar );
        this.toolBar = toolBar;
        
        UIUtil.fixComboOrientation( this );
        updateTextFieldKeyMap();
        
    }

    @Override
    public void addItem( String item ) {

        int indiceAtual = getIndexOf( item );
        
        if ( indiceAtual == -1 ) {
            super.addItem( item );
        } else if ( indiceAtual > 0 ) {
            removeItem( item );
            insertItemAt( item, 0 );
        }

        setSelectedIndex( 0 );
        
    }

    private int getIndexOf( String item ) {
        for ( int i = 0; i < dataModel.getSize(); i++ ) {
            if ( dataModel.getElementAt( i ).equals( item ) ) {
                return i;
            }
        }
        return -1;
    }
    
    public String getSelectedString() {
        JTextComponent comp = UIUtil.getTextComponent( this );
        return comp.getText();
    }
    
    public List<String> getSearchStrings() {

        int indiceSelecionado = getSelectedIndex();
        
        if ( indiceSelecionado == -1 ) {
            addItem( getSelectedString() );
        } else if ( indiceSelecionado > 0 ) {
            String item = ( String ) getSelectedItem();
            removeItem( item );
            insertItemAt( item, 0 );
            setSelectedIndex( 0 );
        }

        int quantidadeItens = getItemCount();
        List<String> strings = new ArrayList<>( quantidadeItens );
        for ( int i = 0; i < quantidadeItens; i++ ) {
            strings.add( getItemAt( i ) );
        }

        return strings;

    }
    
    private void updateTextFieldKeyMap() {
        JTextComponent comp = UIUtil.getTextComponent( this );
        InputMap im = comp.getInputMap();
        im.put( KeyStroke.getKeyStroke( "ctrl H" ), "none" );
    }

    @Override
    public void updateUI() {
        super.updateUI();
        if ( toolBar != null ) {
            toolBar.botaoProcurarUpdateUICallback( this );
        }
        updateTextFieldKeyMap();
    }

}
