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
package br.com.davidbuzatto.auroralogo.gui.custom;

import java.util.Vector;

import javax.swing.InputMap;
import javax.swing.KeyStroke;
import javax.swing.text.JTextComponent;

import org.fife.rsta.ui.UIUtil;
import org.fife.rsta.ui.search.RegexAwareComboBox;

/**
 * The combo box used for entering text to "find" and "replace" in both the
 * Find/Replace dialogs and toolbars.
 *
 * @author Robert Futrell
 * @version 1.0
 * Modificado por Prof. Dr. David Buzatto
 */
// NOTE: This class is public to facilitate applications creating other
// subclasses, such as a FindInFilesDialog.
public class CustomSearchComboBox extends RegexAwareComboBox<String> {

    private CustomFindToolBar toolBar;

    /**
     * Constructor.
     *
     * @param toolBar The toolbar that owns this combo box, or {@code null} if
     * it is not in a toolbar.
     * @param replace Whether this combo box is for "replace" text (as opposed
     * to "find" text).
     */
    public CustomSearchComboBox( CustomFindToolBar toolBar, boolean replace ) {
        super( replace );
        this.toolBar = toolBar;
        UIUtil.fixComboOrientation( this );
        updateTextFieldKeyMap();
    }

    /**
     * Overridden to always select the newly-added item. If the item is already
     * in the list of choices, it is moved to the top before being selected.
     *
     * @param item The item to add.
     */
    @Override
    public void addItem( String item ) {

        // If they just searched for an item that's already in the list
        // other than the first, move it to the first position.
        int curIndex = getIndexOf( item );
        if ( curIndex == -1 ) {
            super.addItem( item );
        } else if ( curIndex > 0 ) {
            removeItem( item );
            insertItemAt( item, 0 );
        }

        // Always leave with the new item selected
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

    /**
     * Returns the text in the text field of the combo box.
     *
     * @return The text entered into this combo box.
     */
    public String getSelectedString() {
        JTextComponent comp = UIUtil.getTextComponent( this );
        return comp.getText();
        //return (String)getSelectedItem();
    }

    /**
     * Returns the <code>Strings</code> contained in this combo box.
     *
     * @return A <code>java.util.Vector</code> of strings found in this combo
     * box. If that combo box is empty, then a zero-length <code>Vector</code>
     * is returned.
     */
    public Vector<String> getSearchStrings() {

        // First, ensure that the item in the editor component is indeed in the
        // combo box.
        int selectedIndex = getSelectedIndex();
        if ( selectedIndex == -1 ) {
            addItem( getSelectedString() );
        } // If they just searched for an item that's already in the list other
        // than the first, move it to the first position.
        else if ( selectedIndex > 0 ) {
            String item = ( String ) getSelectedItem();
            removeItem( item );
            insertItemAt( item, 0 );
            setSelectedIndex( 0 );
        }

        int itemCount = getItemCount();
        Vector<String> vector = new Vector<>( itemCount );
        for ( int i = 0; i < itemCount; i++ ) {
            vector.add( getItemAt( i ) );
        }

        return vector;

    }

    /**
     * Updates the input map of the text field inside this search combo.
     */
    private void updateTextFieldKeyMap() {
        JTextComponent comp = UIUtil.getTextComponent( this );
        // Swing maps Ctrl+H to "delete previous", when applications
        // typically map it to "display 'Replace' UI."
        InputMap im = comp.getInputMap();
        im.put( KeyStroke.getKeyStroke( "ctrl H" ), "none" );
    }

    @Override
    public void updateUI() {
        super.updateUI();
        if ( toolBar != null ) {
            toolBar.searchComboUpdateUICallback( this );
        }
        updateTextFieldKeyMap();
    }

}
