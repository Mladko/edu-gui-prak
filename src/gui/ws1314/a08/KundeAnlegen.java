/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws1314.a08;

import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;
import utilities.UniversalChangeListener;

/**
 *
 * @author agribu
 */
public class KundeAnlegen extends javax.swing.JPanel {

    /**
     * Creates new form KundAnlegen
     */
    public KundeAnlegen() {
        initComponents();
        this.postInitComponents();
    }

    /**
     * This method is calKundeled from within the constructor to initialKundeize the form. WARNING: Do NOT modify this code. The content of this method is alKundeways regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        lbKundenNr = new javax.swing.JLabel();
        tfKdNr = new javax.swing.JTextField();
        lbAnrede = new javax.swing.JLabel();
        cbAnrede = new javax.swing.JComboBox();
        lbVorname = new javax.swing.JLabel();
        tfVorname = new javax.swing.JTextField();
        lbNachname = new javax.swing.JLabel();
        tfNachname = new javax.swing.JTextField();
        lbStrasse = new javax.swing.JLabel();
        tfStrasse = new javax.swing.JTextField();
        lbHausNr = new javax.swing.JLabel();
        tfHausnr = new javax.swing.JTextField();
        lbPLZ = new javax.swing.JLabel();
        tfPLZ = new javax.swing.JTextField();
        lbOrt = new javax.swing.JLabel();
        tfOrt = new javax.swing.JTextField();
        lbTeleNr = new javax.swing.JLabel();
        tfTeleNr = new javax.swing.JTextField();
        lbKtInhaber = new javax.swing.JLabel();
        tfKtInhaber = new javax.swing.JTextField();
        lbKtNr = new javax.swing.JLabel();
        tfKtNr = new javax.swing.JTextField();
        lbBLZ = new javax.swing.JLabel();
        tfBLZ = new javax.swing.JTextField();
        lbKreditInstitut = new javax.swing.JLabel();
        tfKreditInstitut = new javax.swing.JTextField();
        btSpeichern = new javax.swing.JButton();
        btAbbrechen = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        lbKundenNr.setText("Kundennummer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbKundenNr, gridBagConstraints);

        tfKdNr.setEditable(false);
        tfKdNr.setMinimumSize(new java.awt.Dimension(120, 24));
        tfKdNr.setName("Kundennummer"); // NOI18N
        tfKdNr.setPreferredSize(new java.awt.Dimension(120, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfKdNr, gridBagConstraints);

        lbAnrede.setText("Anrede");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbAnrede, gridBagConstraints);

        cbAnrede.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Herr", "Frau" }));
        cbAnrede.setName("Anrede"); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(cbAnrede, gridBagConstraints);

        lbVorname.setText("Vorname");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbVorname, gridBagConstraints);

        tfVorname.setMinimumSize(new java.awt.Dimension(120, 24));
        tfVorname.setName("Vorname"); // NOI18N
        tfVorname.setPreferredSize(new java.awt.Dimension(120, 24));
        tfVorname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfVornameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfVornameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfVorname, gridBagConstraints);

        lbNachname.setText("Nachname");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbNachname, gridBagConstraints);

        tfNachname.setMinimumSize(new java.awt.Dimension(120, 24));
        tfNachname.setName("Nachname"); // NOI18N
        tfNachname.setPreferredSize(new java.awt.Dimension(120, 24));
        tfNachname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfNachnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNachnameFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfNachname, gridBagConstraints);

        lbStrasse.setText("Straße");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbStrasse, gridBagConstraints);

        tfStrasse.setMinimumSize(new java.awt.Dimension(120, 24));
        tfStrasse.setName("Straße"); // NOI18N
        tfStrasse.setPreferredSize(new java.awt.Dimension(120, 24));
        tfStrasse.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfStrasseFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfStrasseFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfStrasse, gridBagConstraints);

        lbHausNr.setText("Nr.");
        lbHausNr.setName(""); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(lbHausNr, gridBagConstraints);

        tfHausnr.setMinimumSize(new java.awt.Dimension(40, 24));
        tfHausnr.setName("Hausnummer"); // NOI18N
        tfHausnr.setPreferredSize(new java.awt.Dimension(40, 24));
        tfHausnr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfHausnrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfHausnrFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfHausnr, gridBagConstraints);

        lbPLZ.setText("Postleitzahl");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbPLZ, gridBagConstraints);

        tfPLZ.setMinimumSize(new java.awt.Dimension(80, 24));
        tfPLZ.setName("Postleitzahl"); // NOI18N
        tfPLZ.setPreferredSize(new java.awt.Dimension(80, 24));
        tfPLZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPLZFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfPLZFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfPLZ, gridBagConstraints);

        lbOrt.setText("Ort");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(lbOrt, gridBagConstraints);

        tfOrt.setMinimumSize(new java.awt.Dimension(120, 24));
        tfOrt.setName("Ort"); // NOI18N
        tfOrt.setPreferredSize(new java.awt.Dimension(120, 24));
        tfOrt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfOrtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfOrtFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfOrt, gridBagConstraints);

        lbTeleNr.setText("Telefonnummer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbTeleNr, gridBagConstraints);

        tfTeleNr.setMinimumSize(new java.awt.Dimension(120, 24));
        tfTeleNr.setName("Telefonnummer"); // NOI18N
        tfTeleNr.setPreferredSize(new java.awt.Dimension(120, 24));
        tfTeleNr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfTeleNrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfTeleNrFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfTeleNr, gridBagConstraints);

        lbKtInhaber.setText("Kontoinhaber");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbKtInhaber, gridBagConstraints);

        tfKtInhaber.setMinimumSize(new java.awt.Dimension(120, 24));
        tfKtInhaber.setName("Kontoinhaber"); // NOI18N
        tfKtInhaber.setPreferredSize(new java.awt.Dimension(120, 24));
        tfKtInhaber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfKtInhaberFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfKtInhaberFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfKtInhaber, gridBagConstraints);

        lbKtNr.setText("Kontonummer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbKtNr, gridBagConstraints);

        tfKtNr.setMinimumSize(new java.awt.Dimension(120, 24));
        tfKtNr.setName("Kontonummer"); // NOI18N
        tfKtNr.setPreferredSize(new java.awt.Dimension(120, 24));
        tfKtNr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfKtNrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfKtNrFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfKtNr, gridBagConstraints);

        lbBLZ.setText("Bankleitzahl");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbBLZ, gridBagConstraints);

        tfBLZ.setMinimumSize(new java.awt.Dimension(120, 24));
        tfBLZ.setName("Bankleitzahl"); // NOI18N
        tfBLZ.setPreferredSize(new java.awt.Dimension(120, 24));
        tfBLZ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfBLZFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfBLZFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfBLZ, gridBagConstraints);

        lbKreditInstitut.setText("Kreditinstitut");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(lbKreditInstitut, gridBagConstraints);

        tfKreditInstitut.setMinimumSize(new java.awt.Dimension(120, 24));
        tfKreditInstitut.setName("Kreditinstitut"); // NOI18N
        tfKreditInstitut.setPreferredSize(new java.awt.Dimension(120, 24));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(tfKreditInstitut, gridBagConstraints);

        btSpeichern.setText("Speichern");
        btSpeichern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpeichernActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(btSpeichern, gridBagConstraints);

        btAbbrechen.setText("Abbrechen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 20, 0, 0);
        add(btAbbrechen, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void tfVornameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfVornameFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfVornameFocusGained

    private void tfVornameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfVornameFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfVornameFocusLost

    private void tfNachnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNachnameFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfNachnameFocusGained

    private void tfNachnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfNachnameFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfNachnameFocusLost

    private void tfStrasseFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStrasseFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfStrasseFocusGained

    private void tfStrasseFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfStrasseFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfStrasseFocusLost

    private void tfHausnrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHausnrFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfHausnrFocusGained

    private void tfHausnrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHausnrFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfHausnrFocusLost

    private void tfPLZFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPLZFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfPLZFocusGained

    private void tfPLZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPLZFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfPLZFocusLost

    private void tfOrtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfOrtFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfOrtFocusGained

    private void tfOrtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfOrtFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfOrtFocusLost

    private void tfTeleNrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTeleNrFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfTeleNrFocusGained

    private void tfTeleNrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfTeleNrFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfTeleNrFocusLost

    private void tfKtInhaberFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKtInhaberFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfKtInhaberFocusGained

    private void tfKtInhaberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKtInhaberFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfKtInhaberFocusLost

    private void tfKtNrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKtNrFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfKtNrFocusGained

    private void tfKtNrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfKtNrFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfKtNrFocusLost

    private void tfBLZFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBLZFocusGained
        ((JTextComponent) evt.getComponent()).selectAll();
    }//GEN-LAST:event_tfBLZFocusGained

    private void tfBLZFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfBLZFocusLost
        ((JTextComponent) evt.getComponent()).select(0, 0);
    }//GEN-LAST:event_tfBLZFocusLost

    private void btSpeichernActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpeichernActionPerformed
        this.saveContent();
    }//GEN-LAST:event_btSpeichernActionPerformed

    private void postInitComponents() {
        this.hmFormat = setFormatHashMap();
        this.setDefaults();
        this.setTooltips();
    }

    public void setFenster(Fenster f) {
        this.parentFenster = f;
    }

    private void setDefaults() {
        DecimalFormat df = new DecimalFormat("00");;

        this.tfKdNr.setText(Integer.toString(this.AKTUELLES_JAHR)
                + df.format(AKTUELLER_MONAT)
                + this.DECIMAL_FORMAT.format(this.addCounter)
                + "K"
        );
    }

    private void addListener() {
        JTextField[] textFields = {this.tfKdNr, this.tfVorname, this.tfNachname, this.tfStrasse, this.tfHausnr, this.tfPLZ, this.tfOrt, this.tfTeleNr, this.tfKtInhaber, this.tfKtNr, this.tfBLZ, this.tfKreditInstitut};

        for (JTextField t : textFields) {
            t.getDocument().addDocumentListener(this.uniChangeListener);
        }

        this.cbAnrede.addItemListener(this.uniChangeListener);
    }

    private HashMap setFormatHashMap() {
        HashMap<Component, ArrayList<String>> hm = new HashMap<>();
        Component[] nameFields = {this.tfVorname, this.tfNachname, this.tfStrasse, this.tfOrt, this.tfKtInhaber, this.tfKreditInstitut};

        for (Component c : nameFields) {
            hm.put(c, new ArrayList<String>());
            hm.get(c).add(0, "((?U)[\\p{Alpha}-'.\\s]+)?");
            hm.get(c).add(1, "(?U)[\\p{Alpha}-'.\\s]+");
        }

        hm.put(this.tfHausnr, new ArrayList<String>());
        hm.get(this.tfHausnr).add(0, "(([1-9])\\d{0,2}([a-z]?))?");
        hm.get(this.tfHausnr).add(1, "\\w");

        hm.put(this.tfPLZ, new ArrayList<String>());
        hm.get(this.tfPLZ).add(0, "(\\d{5})?");
        hm.get(this.tfPLZ).add(1, "\\d");

        hm.put(this.tfTeleNr, new ArrayList<String>());
        hm.get(this.tfTeleNr).add(0, "(\\d{11,15})?");
        hm.get(this.tfTeleNr).add(1, "\\d");

        hm.put(this.tfKtNr, new ArrayList<String>());
        hm.get(this.tfKtNr).add(0, "(\\d{9,10})?");
        hm.get(this.tfKtNr).add(1, "\\d");

        hm.put(this.tfBLZ, new ArrayList<String>());
        hm.get(this.tfBLZ).add(0, "(\\d{8})?");
        hm.get(this.tfBLZ).add(1, "\\d");

        for (Component c : hm.keySet()) {
            ((JTextComponent) c).setInputVerifier(
                    new UniversalInputVerifier(hm.get(c).get(0)));
            ((JTextComponent) c).setDocument(
                    new UniversalDocument(hm.get(c).get(1)));
        }

        return hm;
    }

    private void setTooltips() {
        this.tfKdNr.setToolTipText("Die Kundennummer wird automatisch generiert und hat folgendes Format: YYYYMM####");
        this.tfVorname.setToolTipText("Der Vorname kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen und Bindestrichen bestehen.");
        this.tfNachname.setToolTipText("Der Nachname kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen und Bindestrichen bestehen.");
        this.tfStrasse.setToolTipText("Der Straßenname kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen und Bindestrichen bestehen.");
        this.tfHausnr.setToolTipText("Die Hausnummer kann maximal drei Dezimalzahlen, sowie optional einen Kleinbuchstaben umfassen.");
        this.tfPLZ.setToolTipText("Die Postleitzahl umfasst fünf Dezimalzahlen.");
        this.tfOrt.setToolTipText("Der Ortsname kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen und Bindestrichen bestehen.");
        this.tfTeleNr.setToolTipText("Die Telefonnummer besteht aus elf bis fünfzehn aufeinander folgenden Ziffern.");
        this.tfKtInhaber.setToolTipText("Der Name des Kontoinhabers kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen bestehen.");
        this.tfKtNr.setToolTipText("Die Kontonummer kann entweder neun oder 10 Ziffern umfassen.");
        this.tfBLZ.setToolTipText("Die Bankleitzahl umfasst acht Ziffern.");
        this.tfKreditInstitut.setToolTipText("Der Name des Kreditinstituts kann aus allen (ebenfalls fremdländischen) Buchstaben, sowie Leerzeichen und Bindestrichen bestehen.");
    }

    private void saveContent() {
        ArrayList<String> alKunde = new ArrayList<>();
        alKunde.add(tfKdNr.getText());
        alKunde.add(cbAnrede.getSelectedItem().toString());
        alKunde.add(tfVorname.getText());
        alKunde.add(tfNachname.getText());
        alKunde.add(tfStrasse.getText());
        alKunde.add(tfHausnr.getText());
        alKunde.add(tfPLZ.getText());
        alKunde.add(tfOrt.getText());
        alKunde.add(tfTeleNr.getText());
        alKunde.add(tfKtInhaber.getText());
        alKunde.add(tfKtNr.getText());
        alKunde.add(tfBLZ.getText());
        alKunde.add(tfKreditInstitut.getText());

        parentFenster.setDataMap("Kunden", alKunde);
        this.addCounter++;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbbrechen;
    private javax.swing.JButton btSpeichern;
    private javax.swing.JComboBox cbAnrede;
    private javax.swing.JLabel lbAnrede;
    private javax.swing.JLabel lbBLZ;
    private javax.swing.JLabel lbHausNr;
    private javax.swing.JLabel lbKreditInstitut;
    private javax.swing.JLabel lbKtInhaber;
    private javax.swing.JLabel lbKtNr;
    private javax.swing.JLabel lbKundenNr;
    private javax.swing.JLabel lbNachname;
    private javax.swing.JLabel lbOrt;
    private javax.swing.JLabel lbPLZ;
    private javax.swing.JLabel lbStrasse;
    private javax.swing.JLabel lbTeleNr;
    private javax.swing.JLabel lbVorname;
    private javax.swing.JTextField tfBLZ;
    private javax.swing.JTextField tfHausnr;
    private javax.swing.JTextField tfKdNr;
    private javax.swing.JTextField tfKreditInstitut;
    private javax.swing.JTextField tfKtInhaber;
    private javax.swing.JTextField tfKtNr;
    private javax.swing.JTextField tfNachname;
    private javax.swing.JTextField tfOrt;
    private javax.swing.JTextField tfPLZ;
    private javax.swing.JTextField tfStrasse;
    private javax.swing.JTextField tfTeleNr;
    private javax.swing.JTextField tfVorname;
    // End of variables declaration//GEN-END:variables

    // Constants
    private final int AKTUELLES_JAHR = Integer.parseInt(new SimpleDateFormat("yyyy").format(Calendar.getInstance().getTime()));
    private final int AKTUELLER_MONAT = Integer.parseInt(new SimpleDateFormat("MM").format(Calendar.getInstance().getTime()));
    private final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0000");
    private final String ERR_BLZ = "Die angegebene Bankleitzahl kann keinem bekannten, deutschen Kreditinstitut zugewiesen werden.";

    // Post-Adding Variables
    private Fenster parentFenster;
    private HashMap hmFormat;
    private int addCounter = 0;
    private UniversalChangeListener uniChangeListener = new UniversalChangeListener();

    // Inner classes
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
