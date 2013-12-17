/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author agribu
 */
public class UniversalChangeListener implements DocumentListener, ItemListener {

    private boolean changed = false;

    public void reset() {
        this.changed = false;
    }

    public boolean hasChanged() {
        return this.changed;
    }

    @Override
    public void insertUpdate(DocumentEvent de) {
        this.changed = true;
    }

    @Override
    public void removeUpdate(DocumentEvent de) {
        this.changed = true;
    }

    @Override
    public void changedUpdate(DocumentEvent de) {
        this.changed = true;
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        this.changed = true;
    }
}
