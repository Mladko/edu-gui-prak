/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws1314.a06;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

/**
 *
 * @author agribu
 */
public class WeinAufnehmen extends javax.swing.JPanel {

    /**
     * Creates new form WeinAufnehmen
     */
    public WeinAufnehmen() {
        initComponents();
        postInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bgFarben = new javax.swing.ButtonGroup();
        lbBestellNr = new javax.swing.JLabel();
        tfBestellNr = new javax.swing.JTextField();
        lbJahrgang = new javax.swing.JLabel();
        tfJahrgang = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lbFarbe = new javax.swing.JLabel();
        rbWeiss = new javax.swing.JRadioButton();
        rbRot = new javax.swing.JRadioButton();
        rbRose = new javax.swing.JRadioButton();
        lbRebsorte = new javax.swing.JLabel();
        cbRebsorteSelect1 = new javax.swing.JComboBox();
        cbRebsorteSelect2 = new javax.swing.JComboBox();
        cbRebsorteSelect3 = new javax.swing.JComboBox();
        lbAnbaugebiet = new javax.swing.JLabel();
        cbAnbaugebietSelectLand = new javax.swing.JComboBox();
        cbAnbaugebietSelectRegion = new javax.swing.JComboBox();
        lbAlkohol = new javax.swing.JLabel();
        cbAlkohol = new javax.swing.JComboBox();
        lbLagerfaehigkeit = new javax.swing.JLabel();
        tfLagerfaehigkeit = new javax.swing.JTextField();
        tfFlaschenpreis = new javax.swing.JTextField();
        lbFlaschenGr = new javax.swing.JLabel();
        lbEuro = new javax.swing.JLabel();
        cbFlaschenGr = new javax.swing.JComboBox();
        lbFlaschenpreis = new javax.swing.JLabel();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        lbBestellNr.setText("Bestellnummer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbBestellNr, gridBagConstraints);

        tfBestellNr.setToolTipText("");
        tfBestellNr.setAlignmentX(0.0F);
        tfBestellNr.setMinimumSize(new java.awt.Dimension(220, 24));
        tfBestellNr.setPreferredSize(new java.awt.Dimension(120, 24));
        tfBestellNr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBestellNrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBestellNrFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(tfBestellNr, gridBagConstraints);

        lbJahrgang.setText("Jahrgang");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbJahrgang, gridBagConstraints);

        tfJahrgang.setToolTipText("");
        tfJahrgang.setAlignmentX(0.0F);
        tfJahrgang.setMinimumSize(new java.awt.Dimension(100, 24));
        tfJahrgang.setPreferredSize(new java.awt.Dimension(100, 24));
        tfJahrgang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfJahrgangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfJahrgangFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(tfJahrgang, gridBagConstraints);

        lbName.setText("Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbName, gridBagConstraints);

        tfName.setToolTipText("");
        tfName.setAlignmentX(0.0F);
        tfName.setMinimumSize(new java.awt.Dimension(220, 24));
        tfName.setPreferredSize(new java.awt.Dimension(220, 24));
        tfName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(tfName, gridBagConstraints);

        lbFarbe.setText("Farbe");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbFarbe, gridBagConstraints);

        bgFarben.add(rbWeiss);
        rbWeiss.setText("Weiß");
        rbWeiss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWeissActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(rbWeiss, gridBagConstraints);

        bgFarben.add(rbRot);
        rbRot.setText("Rot");
        rbRot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRotActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(rbRot, gridBagConstraints);

        bgFarben.add(rbRose);
        rbRose.setText("Rose");
        rbRose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRoseActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(rbRose, gridBagConstraints);

        lbRebsorte.setText("Rebsorte");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbRebsorte, gridBagConstraints);

        cbRebsorteSelect1.setAlignmentX(0.0F);
        cbRebsorteSelect1.setMinimumSize(new java.awt.Dimension(150, 24));
        cbRebsorteSelect1.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(cbRebsorteSelect1, gridBagConstraints);

        cbRebsorteSelect2.setMinimumSize(new java.awt.Dimension(150, 24));
        cbRebsorteSelect2.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 200, 0, 0);
        add(cbRebsorteSelect2, gridBagConstraints);

        cbRebsorteSelect3.setMinimumSize(new java.awt.Dimension(150, 24));
        cbRebsorteSelect3.setPreferredSize(new java.awt.Dimension(150, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 350, 0, 0);
        add(cbRebsorteSelect3, gridBagConstraints);

        lbAnbaugebiet.setText("Anbaugebiet");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbAnbaugebiet, gridBagConstraints);

        cbAnbaugebietSelectLand.setAlignmentX(0.0F);
        cbAnbaugebietSelectLand.setMinimumSize(new java.awt.Dimension(220, 24));
        cbAnbaugebietSelectLand.setPreferredSize(new java.awt.Dimension(220, 24));
        cbAnbaugebietSelectLand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbAnbaugebietSelectLandItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(cbAnbaugebietSelectLand, gridBagConstraints);

        cbAnbaugebietSelectRegion.setMinimumSize(new java.awt.Dimension(220, 24));
        cbAnbaugebietSelectRegion.setPreferredSize(new java.awt.Dimension(220, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(cbAnbaugebietSelectRegion, gridBagConstraints);

        lbAlkohol.setText("Alkoholgehalt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbAlkohol, gridBagConstraints);

        cbAlkohol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0%", "7%", "7.5%", "8%", "8.5%", "9%", "9.5%", "10%", "10.5%", "11%", "11.5%", "12%", "12.5%", "13% " }));
        cbAlkohol.setAlignmentX(0.0F);
        cbAlkohol.setMinimumSize(new java.awt.Dimension(100, 24));
        cbAlkohol.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(cbAlkohol, gridBagConstraints);

        lbLagerfaehigkeit.setText("Lagerfähigkeit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbLagerfaehigkeit, gridBagConstraints);

        tfLagerfaehigkeit.setToolTipText("");
        tfLagerfaehigkeit.setAlignmentX(0.0F);
        tfLagerfaehigkeit.setMinimumSize(new java.awt.Dimension(100, 24));
        tfLagerfaehigkeit.setPreferredSize(new java.awt.Dimension(100, 24));
        tfLagerfaehigkeit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfLagerfaehigkeitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfLagerfaehigkeitFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(tfLagerfaehigkeit, gridBagConstraints);

        tfFlaschenpreis.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        tfFlaschenpreis.setToolTipText("");
        tfFlaschenpreis.setAlignmentX(0.0F);
        tfFlaschenpreis.setMinimumSize(new java.awt.Dimension(100, 24));
        tfFlaschenpreis.setPreferredSize(new java.awt.Dimension(100, 24));
        tfFlaschenpreis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfFlaschenpreisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfFlaschenpreisFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(tfFlaschenpreis, gridBagConstraints);

        lbFlaschenGr.setText("Flaschengröße");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbFlaschenGr, gridBagConstraints);

        lbEuro.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 160, 0, 0);
        add(lbEuro, gridBagConstraints);

        cbFlaschenGr.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,187 l", "0,25 l", "0,375 l", "0,5 l", "0,62 l", "0,7 l", "0,75 l", "0,8 l", "1 l", "1,5 l " }));
        cbFlaschenGr.setAlignmentX(0.0F);
        cbFlaschenGr.setMinimumSize(new java.awt.Dimension(100, 24));
        cbFlaschenGr.setPreferredSize(new java.awt.Dimension(100, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 50, 0, 0);
        add(cbFlaschenGr, gridBagConstraints);

        lbFlaschenpreis.setText("Flaschenpreis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(lbFlaschenpreis, gridBagConstraints);

        btSave.setText("Speichern");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        add(btSave, gridBagConstraints);

        btCancel.setText("Abbrechen");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        add(btCancel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void cbAnbaugebietSelectLandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbAnbaugebietSelectLandItemStateChanged
        ArrayList<String> gebiete = ((ArrayList<String>) this.hmLocations.get(evt.getItem().toString()));
        Collections.sort(gebiete);
        cbAnbaugebietSelectRegion.setModel(new DefaultComboBoxModel(gebiete.toArray()));
    }//GEN-LAST:event_cbAnbaugebietSelectLandItemStateChanged

    private void rbWeissActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWeissActionPerformed
        this.setColor("weiss");
    }//GEN-LAST:event_rbWeissActionPerformed

    private void rbRotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRotActionPerformed
        this.setColor("rot");
    }//GEN-LAST:event_rbRotActionPerformed

    private void rbRoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRoseActionPerformed
        this.setColor("rose");
    }//GEN-LAST:event_rbRoseActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        if (uniChangeListener.hasChanged()) {
//            Aufgabe06.closeWeinAufnehmen(); // FIXME static content in frame
        }
    }//GEN-LAST:event_btCancelActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        JTextComponent[] tfList = {this.tfBestellNr,
            this.tfFlaschenpreis,
            this.tfJahrgang,
            this.tfLagerfaehigkeit,
            this.tfName};

        for (JTextComponent tf : tfList) {
            if (tf.getText().equals("")) {
                JOptionPane.showMessageDialog(this, tf.getToolTipText(), "Fehlerhafte Eingabe!", JOptionPane.ERROR_MESSAGE);
                tf.setBackground(Color.decode("#FAA598"));
                tf.requestFocus();
                return;
            }
        }

        // Wertebereich der Lagerfaehigkeit
        if (Integer.parseInt(this.tfLagerfaehigkeit.getText()) > (Integer.parseInt(this.tfJahrgang.getText()) + this.MAX_LAGERDAUER)
                || Integer.parseInt(this.tfLagerfaehigkeit.getText()) < (Integer.parseInt(this.tfJahrgang.getText()) + this.MIN_LAGERDAUER)) {
                JOptionPane.showMessageDialog(this, "Der Wert der Lagerfähigkeit liegt außerhalb des Wertebereichs!\n" 
                        + tfLagerfaehigkeit.getToolTipText(), "Fehlerhafte Eingabe!", JOptionPane.ERROR_MESSAGE);
                tfLagerfaehigkeit.setBackground(Color.decode("#FAA598"));
                tfLagerfaehigkeit.requestFocus();
                return;
        }
        
        // Wertebereich des Jahrgangs
        if (Integer.parseInt(this.tfJahrgang.getText()) > (Integer.parseInt(this.tfJahrgang.getText()) + this.MAX_JAHRGANG)
                || Integer.parseInt(this.tfJahrgang.getText()) < (Integer.parseInt(this.tfJahrgang.getText()) + this.MIN_JAHRGANG)) {
                JOptionPane.showMessageDialog(this, "Der Wert des Jahrgangs liegt außerhalb des Wertebereichs!\n" 
                        + tfJahrgang.getToolTipText(), "Fehlerhafte Eingabe!", JOptionPane.ERROR_MESSAGE);
                tfJahrgang.setBackground(Color.decode("#FAA598"));
                tfJahrgang.requestFocus();
                return;
        }        

        //Die wohl behindertste aber funktionierende Implementation ever
        int reb1 = cbRebsorteSelect1.getSelectedIndex();
        int reb2 = cbRebsorteSelect2.getSelectedIndex();
        int reb3 = cbRebsorteSelect3.getSelectedIndex();

        if (reb1 + reb2 + reb3 == 0
                || (reb1 == reb2 && reb1 + reb2 != 0)
                || (reb2 == reb3 && reb2 + reb3 != 0)
                || (reb1 == reb3 && reb1 + reb3 != 0)) {
            JOptionPane.showMessageDialog(this, "Rebsorte bitte nur einmal wählen.", "Fehlerhafte Eingabe!", JOptionPane.ERROR_MESSAGE);
            return;
        }

        saveContent();
        setValues();
        setDefaults();
    }//GEN-LAST:event_btSaveActionPerformed

    private void tfBestellNrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBestellNrFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfBestellNrFocusLost

    private void tfJahrgangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJahrgangFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfJahrgangFocusLost

    private void tfNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfNameFocusLost

    private void tfLagerfaehigkeitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLagerfaehigkeitFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfLagerfaehigkeitFocusLost

    private void tfFlaschenpreisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFlaschenpreisFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfFlaschenpreisFocusLost

    private void tfBestellNrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBestellNrFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfBestellNrFocusGained

    private void tfJahrgangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfJahrgangFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfJahrgangFocusGained

    private void tfNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNameFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfNameFocusGained

    private void tfLagerfaehigkeitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfLagerfaehigkeitFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfLagerfaehigkeitFocusGained

    private void tfFlaschenpreisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFlaschenpreisFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFlaschenpreisFocusGained

    public void postInitComponents() {
        this.hmFormat = setFormatHashMap();
        this.setValues();
        this.setDefaults();
        this.setTooltips();
    }

    private HashMap setFormatHashMap() {
        HashMap<Component, ArrayList<String>> hm = new HashMap<>();
        hm.put(tfBestellNr, new ArrayList<String>());
        hm.get(tfBestellNr).add(0, "(\\d{12})?"); //Format for InputVerifier
        hm.get(tfBestellNr).add(1, "\\d"); //Format for Document

        hm.put(tfJahrgang, new ArrayList<String>());
        hm.get(tfJahrgang).add(0, "(((198[8-9])|(199\\d{1}))|((200\\d{1})|(201[0-3])))?");
        hm.get(tfJahrgang).add(1, "\\d");

        hm.put(tfName, new ArrayList<String>());
        hm.get(tfName).add(0, "((\\w)?(\\s)?)*");
        hm.get(tfName).add(1, "[\\w\\s]");

        hm.put(tfLagerfaehigkeit, new ArrayList<String>());
        hm.get(tfLagerfaehigkeit).add(0, "((201[3-9])|(202\\d{1})|(203[0-8]))?");
        hm.get(tfLagerfaehigkeit).add(1, "\\d");

        hm.put(tfFlaschenpreis, new ArrayList<String>());
        hm.get(tfFlaschenpreis).add(0, "(^\\d+(,)?\\d{0,2}$|,)?");
        hm.get(tfFlaschenpreis).add(1, "^\\d+(,)?\\d{0,2}$|,");

        for (Component c : hm.keySet()) {
            ((JTextComponent) c).setInputVerifier(
                    new UniversalInputVerifier(hm.get(c).get(0)));
            ((JTextComponent) c).setDocument(
                    new UniversalDocument(hm.get(c).get(1)));
        }

        return hm;
    }

    private void setValues() {
        this.hmRebsorten = new DataSetManager().parseFile("src/utilities/datasets/reb.txt");
        this.hmLocations = new DataSetManager().parseFile("src/utilities/datasets/loc.txt");

        this.hmLocations.put("", new ArrayList<String>()); // Empty Selection for Index 0

        ((ArrayList<String>) this.hmRebsorten.get("rot")).add(""); // Empty Selection for Index 0
        ((ArrayList<String>) this.hmRebsorten.get("weiss")).add(""); // Empty Selection for Index 0
        ((ArrayList<String>) this.hmRebsorten.get("rose")).add(""); // Empty Selection for Index 0

        ArrayList<String> countries = new ArrayList<>(this.hmLocations.keySet());
        Collections.sort(countries);
        cbAnbaugebietSelectLand.setModel(new DefaultComboBoxModel(countries.toArray()));

        addListener();
    }

    private void setTooltips() {
        tfBestellNr.setToolTipText("Die Bestellnummer umfasst 12 Dezimalzahlen im Format 123456789012.");
        tfJahrgang.setToolTipText("Der Jahrgang umfasst 4 Dezimalzahlen im Format: " + this.MIN_JAHRGANG + " bis " + this.MAX_JAHRGANG);
        tfName.setToolTipText("Der Name kann beliebig gewählt werden.");
        tfLagerfaehigkeit.setToolTipText("Die Lagerfähigkeit beschreibt das Jahr, bis zu dem der Wein gelagert werden kann. "
                + "Format: " + (this.AKTUELLES_JAHR + this.MIN_LAGERDAUER) + " bis " + (this.AKTUELLES_JAHR + MAX_LAGERDAUER));
        tfFlaschenpreis.setToolTipText("Der Preis umfasst eine Ganzzahl mit zwei Nachkommestellen, im Format: 23,22.");
    }

    private void setDefaults() {
        tfBestellNr.setText("000000000000"); //FIXME not shown
        tfJahrgang.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))); //FIXME not shown

        rbWeiss.setSelected(true);
        this.setColor("weiss");

        cbAnbaugebietSelectLand.setSelectedIndex(3); //Frankreich
        cbAlkohol.setSelectedIndex(8);
        tfJahrgang.setText(String.valueOf(Calendar.getInstance().get(Calendar.YEAR))); //FIXME not shown
        cbFlaschenGr.setSelectedIndex(6);
        tfFlaschenpreis.setText("0,00");
        tfLagerfaehigkeit.setText("");
        tfName.setText("");
    }

    private void addListener() {
        tfBestellNr.getDocument().addDocumentListener(uniChangeListener);
        tfJahrgang.getDocument().addDocumentListener(uniChangeListener);
        tfName.getDocument().addDocumentListener(uniChangeListener);
        tfLagerfaehigkeit.getDocument().addDocumentListener(uniChangeListener);
        tfFlaschenpreis.getDocument().addDocumentListener(uniChangeListener);

        cbAlkohol.addItemListener(uniChangeListener);
        cbAnbaugebietSelectLand.addItemListener(uniChangeListener);
        cbAnbaugebietSelectRegion.addItemListener(uniChangeListener);
        cbFlaschenGr.addItemListener(uniChangeListener);
        cbRebsorteSelect1.addItemListener(uniChangeListener);
        cbRebsorteSelect2.addItemListener(uniChangeListener);
        cbRebsorteSelect3.addItemListener(uniChangeListener);

        rbRose.addItemListener(uniChangeListener);
        rbRot.addItemListener(uniChangeListener);
        rbWeiss.addItemListener(uniChangeListener);

    }

    private void setColor(String s) {
        ArrayList<String> cbRebSelList = ((ArrayList<String>) hmRebsorten.get(s));
        Collections.sort(cbRebSelList);

        cbRebsorteSelect1.setModel(new DefaultComboBoxModel(cbRebSelList.toArray()));
        cbRebsorteSelect2.setModel(new DefaultComboBoxModel(cbRebSelList.toArray()));
        cbRebsorteSelect3.setModel(new DefaultComboBoxModel(cbRebSelList.toArray()));

        rbSelectedColor = s;

        cbRebsorteSelect1.setSelectedIndex(1);
    }

    private void saveContent() {
        String save;
        save = ("Bestellnummer: " + tfBestellNr.getText()
                + "\nJahrgang: " + tfJahrgang.getText()
                + "\nName: " + tfName.getText()
                + "\nFarbe: " + rbSelectedColor
                + "\nRebsorte: " + cbRebsorteSelect1.getSelectedItem().toString()
                + ((cbRebsorteSelect2.getSelectedIndex() == 0) ? "" : (" " + cbRebsorteSelect2.getSelectedItem().toString()))
                + ((cbRebsorteSelect3.getSelectedIndex() == 0) ? "" : (" " + cbRebsorteSelect2.getSelectedItem().toString()))
                + "\nAnbaugebiet Land: " + cbAnbaugebietSelectLand.getSelectedItem().toString() + cbAnbaugebietSelectRegion.getSelectedItem().toString()
                + "\nAlkoholgehalt: " + cbAlkohol.getSelectedItem().toString()
                + "\nLagerfähigkeit: " + tfLagerfaehigkeit.getText()
                + "\nFlaschengröße: " + cbFlaschenGr.getSelectedItem().toString()
                + "\nFlaschenpreis: " + tfFlaschenpreis.getText());
        System.out.println(save);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgFarben;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox cbAlkohol;
    private javax.swing.JComboBox cbAnbaugebietSelectLand;
    private javax.swing.JComboBox cbAnbaugebietSelectRegion;
    private javax.swing.JComboBox cbFlaschenGr;
    private javax.swing.JComboBox cbRebsorteSelect1;
    private javax.swing.JComboBox cbRebsorteSelect2;
    private javax.swing.JComboBox cbRebsorteSelect3;
    private javax.swing.JLabel lbAlkohol;
    private javax.swing.JLabel lbAnbaugebiet;
    private javax.swing.JLabel lbBestellNr;
    private javax.swing.JLabel lbEuro;
    private javax.swing.JLabel lbFarbe;
    private javax.swing.JLabel lbFlaschenGr;
    private javax.swing.JLabel lbFlaschenpreis;
    private javax.swing.JLabel lbJahrgang;
    private javax.swing.JLabel lbLagerfaehigkeit;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbRebsorte;
    private javax.swing.JRadioButton rbRose;
    private javax.swing.JRadioButton rbRot;
    private javax.swing.JRadioButton rbWeiss;
    private javax.swing.JTextField tfBestellNr;
    private javax.swing.JTextField tfFlaschenpreis;
    private javax.swing.JTextField tfJahrgang;
    private javax.swing.JTextField tfLagerfaehigkeit;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    // Post-Adding Variables
    private HashMap hmFormat;
    private HashMap hmRebsorten;
    private HashMap hmLocations;
    private String rbSelectedColor;
    UniversalChangeListener uniChangeListener = new UniversalChangeListener();

    // Constants
    private final int AKTUELLES_JAHR = Calendar.getInstance().get(Calendar.YEAR);
    private final int MIN_JAHRGANG = AKTUELLES_JAHR - 25;
    private final int MAX_JAHRGANG = AKTUELLES_JAHR;
    private final int MIN_LAGERDAUER = 1;
    private final int MAX_LAGERDAUER = 25;

    // Inner Classes
    class UniversalDocument extends PlainDocument {

        private final String format;

        public UniversalDocument(String format) {
            this.format = format;
        }

        @Override
        public void insertString(int offs, String s, AttributeSet a) throws BadLocationException {
            for (int i = 0; i < s.length(); i++) {
                if (!s.matches(format)) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("\nVisual Bell: Ungültiges Zeichen!\n");
                    return;
                }
            }
            super.insertString(offs, s, a);
        }
    }

    class UniversalInputVerifier extends InputVerifier {

        private final String allowedChars;

        public UniversalInputVerifier(String allowedChars) {
            this.allowedChars = allowedChars;
        }

        @Override
        public boolean verify(JComponent input) {
            if (((JTextComponent) input).getText().matches(allowedChars)) {
                input.setBackground(Color.white);
                return true;
            } else {
                this.printErrorMessage(input);
                return false;
            }
        }

        public void printErrorMessage(JComponent input) {
            JOptionPane.showMessageDialog(null, "Bitte das Format einhalten!\n"
                    + ((JTextComponent) input).getToolTipText(),
                    "Formatfehler!", JOptionPane.WARNING_MESSAGE);

            input.setBackground(Color.decode("#FAA598"));
        }

    }
}
