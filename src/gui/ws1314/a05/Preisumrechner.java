/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.ws1314.a05;

import java.awt.Component;
import java.awt.Container;
import java.awt.FocusTraversalPolicy;
import java.awt.Toolkit;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import javax.swing.text.PlainDocument;

/**
 *
 * @author agribu
 */
public class Preisumrechner extends javax.swing.JPanel {

    /**
     * Creates new form Preisumrechner
     */
    public Preisumrechner() {
        initComponents();
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

        textFlaschengroesse = new javax.swing.JLabel();
        ListCellRenderer renderer = new DefaultListCellRenderer();
        ((JLabel) renderer).setHorizontalAlignment(SwingConstants.RIGHT);
        flaschengroesse = new javax.swing.JComboBox();
        flaschengroesse.setRenderer(renderer);
        textFlaschenpreis = new javax.swing.JLabel();
        flaschenpreis = new javax.swing.JTextField();
        jPanelButtons = new javax.swing.JPanel();
        buttonDown = new javax.swing.JButton();
        buttonFiller = new javax.swing.Box.Filler(new java.awt.Dimension(33, 24), new java.awt.Dimension(33, 24), new java.awt.Dimension(32767, 0));
        buttonUp = new javax.swing.JButton();
        textLiterpreis = new javax.swing.JLabel();
        euroFlaschenpreis = new javax.swing.JLabel();
        literpreis = new javax.swing.JTextField();
        euroLiterpreis = new javax.swing.JLabel();

        setFocusTraversalPolicy(new FocusOrder(getOrder()));
        setFocusTraversalPolicyProvider(true);
        setLayout(new java.awt.GridBagLayout());

        textFlaschengroesse.setText("Flaschengroesse");
        add(textFlaschengroesse, new java.awt.GridBagConstraints());

        flaschengroesse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0,187 l", "0,25 l", "0,375 l", "0,5 l", "0,62 l", "0,7 l", "0,75 l", "0,8 l", "1 l", "1,5 l" }));
        flaschengroesse.setSelectedIndex(6);
        flaschengroesse.setPreferredSize(new java.awt.Dimension(100, 24));
        flaschengroesse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flaschengroesseActionPerformed(evt);
            }
        });
        add(flaschengroesse, new java.awt.GridBagConstraints());

        textFlaschenpreis.setText("Flaschenpreis");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(textFlaschenpreis, gridBagConstraints);

        flaschenpreis.setDocument(new DecimalDocument()
        );
        flaschenpreis.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        flaschenpreis.setInputVerifier(decimalVerifier);
        flaschenpreis.setName("Flaschenpreis"); // NOI18N
        flaschenpreis.setPreferredSize(new java.awt.Dimension(100, 24));
        flaschenpreis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                flaschenpreisFocusGained(evt);
            }
        });
        flaschenpreis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                flaschenpreisKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(flaschenpreis, gridBagConstraints);

        jPanelButtons.setPreferredSize(new java.awt.Dimension(100, 24));
        jPanelButtons.setLayout(new javax.swing.BoxLayout(jPanelButtons, javax.swing.BoxLayout.LINE_AXIS));

        buttonDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/arrow_down.png"))); // NOI18N
        buttonDown.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonDown.setMinimumSize(new java.awt.Dimension(33, 24));
        buttonDown.setPreferredSize(new java.awt.Dimension(33, 24));
        buttonDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDownActionPerformed(evt);
            }
        });
        jPanelButtons.add(buttonDown);
        jPanelButtons.add(buttonFiller);

        buttonUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/arrow_up.png"))); // NOI18N
        buttonUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buttonUp.setMinimumSize(new java.awt.Dimension(33, 24));
        buttonUp.setName(""); // NOI18N
        buttonUp.setPreferredSize(new java.awt.Dimension(33, 24));
        buttonUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpActionPerformed(evt);
            }
        });
        jPanelButtons.add(buttonUp);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(25, 25, 25, 25);
        add(jPanelButtons, gridBagConstraints);

        textLiterpreis.setText("Preis pro l");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(textLiterpreis, gridBagConstraints);

        euroFlaschenpreis.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(25, 0, 0, 0);
        add(euroFlaschenpreis, gridBagConstraints);

        literpreis.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        literpreis.setName("Literpreis"); // NOI18N
        literpreis.setPreferredSize(new java.awt.Dimension(100, 24));
        literpreis.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                literpreisFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                literpreisFocusLost(evt);
            }
        });
        literpreis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                literpreisKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(literpreis, gridBagConstraints);

        euroLiterpreis.setText("€");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        add(euroLiterpreis, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDownActionPerformed
        richtung = ButtonRichtung.UNTEN;
        preisBerechnung();
    }//GEN-LAST:event_buttonDownActionPerformed

    private void literpreisFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_literpreisFocusLost
        JTextComponent input = literpreis;
        String format = "^\\d+((,)?\\d{1,2})?$";
        String inhalt = ((JTextComponent) input).getText();

        if (!((JTextComponent)input).getText().matches(format)) {
            JOptionPane.showMessageDialog(null, 
                    "Bitte eine Dezimalzahl mit maximal zwei Nachkommastellen fuer " 
                            + ((JTextComponent) input).getName() 
                            + " eingeben.",
                    "Formatfehler", JOptionPane.WARNING_MESSAGE);
            literpreis.requestFocus();
        }
    }//GEN-LAST:event_literpreisFocusLost

    private void flaschenpreisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_flaschenpreisFocusGained
        flaschenpreis.selectAll();
    }//GEN-LAST:event_flaschenpreisFocusGained

    private void literpreisFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_literpreisFocusGained
        literpreis.selectAll();
    }//GEN-LAST:event_literpreisFocusGained

    private void flaschenpreisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_flaschenpreisKeyTyped
        if (!((String) literpreis.getText()).isEmpty()) literpreis.setText(null);
    }//GEN-LAST:event_flaschenpreisKeyTyped

    private void literpreisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_literpreisKeyTyped
        if (!((String) flaschenpreis.getText()).isEmpty()) flaschenpreis.setText(null);
    }//GEN-LAST:event_literpreisKeyTyped

    private void flaschengroesseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flaschengroesseActionPerformed
        if (!flaschenpreis.getText().equals("") && !literpreis.getText().equals("")) preisBerechnung();
    }//GEN-LAST:event_flaschengroesseActionPerformed

    private void buttonUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpActionPerformed
        richtung = ButtonRichtung.OBEN;
        preisBerechnung();
    }//GEN-LAST:event_buttonUpActionPerformed

    private Vector getOrder() {
        Vector<Component> order = new Vector<Component>(5);
        order.add(this.flaschengroesse);
        order.add(this.flaschenpreis);
        order.add(this.buttonDown);
        order.add(this.literpreis);
        order.add(this.buttonUp);
        return order;
    }
    
    private void preisBerechnung() {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN);
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        nf.setGroupingUsed(false); //Tausender Trenner disable

        switch (richtung) {
            case UNTEN:
                try {
                    double preisProFlasche = nf.parse(this.flaschenpreis.getText()).doubleValue();
                    double flaschengroesse = nf.parse(this.flaschengroesse.getItemAt(this.flaschengroesse.getSelectedIndex()).toString()).doubleValue();
                    literpreis.setText(nf.format(preisProFlasche / flaschengroesse));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Falsche Format!", "Bitte deutsches Währungsformat fuer Flaschenpreis einhalten!", JOptionPane.ERROR_MESSAGE);
                }
                break;
            case OBEN:
                try {
                    double preisProLiter = nf.parse(this.literpreis.getText()).doubleValue();
                    double flaschengroesse = nf.parse(this.flaschengroesse.getItemAt(this.flaschengroesse.getSelectedIndex()).toString()).doubleValue();
                    flaschenpreis.setText(nf.format(preisProLiter * flaschengroesse));
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Falsche Format!", "Bitte deutsches Währungsformat fuer Literpreis einhalten!", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                return;
        }
                
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDown;
    private javax.swing.Box.Filler buttonFiller;
    private javax.swing.JButton buttonUp;
    private javax.swing.JLabel euroFlaschenpreis;
    private javax.swing.JLabel euroLiterpreis;
    private javax.swing.JComboBox flaschengroesse;
    private javax.swing.JTextField flaschenpreis;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JTextField literpreis;
    private javax.swing.JLabel textFlaschengroesse;
    private javax.swing.JLabel textFlaschenpreis;
    private javax.swing.JLabel textLiterpreis;
    // End of variables declaration//GEN-END:variables

    private enum ButtonRichtung {
        UNTEN,
        OBEN
    };
    
    private ButtonRichtung richtung;
    
    private InputVerifier decimalVerifier = new InputVerifier() {
        @Override
        public boolean verify(JComponent input) {
            String format = "^\\d+((,)?\\d{1,2})?$";
            String inhalt = ((JTextComponent) input).getText();

            if (((JTextComponent)input).getText().matches(format)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Bitte eine Dezimalzahl mit maximal zwei Nachkommastellen fuer " 
                                + ((JTextComponent) input).getName() 
                                + " eingeben.",
                        "Formatfehler!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
    };
    
    class FocusOrder extends FocusTraversalPolicy {
        Vector<Component> order;

        public FocusOrder(Vector<Component> order) {
          this.order = new Vector<Component>(order.size());
          this.order.addAll(order);
        }

        @Override
        public Component getComponentAfter(Container focusCycleRoot,
            Component aComponent) {
          int idx = (order.indexOf(aComponent) + 1) % order.size();
          return order.get(idx);
        }

        @Override
        public Component getComponentBefore(Container focusCycleRoot,
            Component aComponent) {
          int idx = order.indexOf(aComponent) - 1;
          if (idx < 0) {
            idx = order.size() - 1;
          }
          return order.get(idx);
        }

        @Override
        public Component getDefaultComponent(Container focusCycleRoot) {
          return order.get(0);
        }

        @Override
        public Component getLastComponent(Container focusCycleRoot) {
          return order.lastElement();
        }

        @Override
        public Component getFirstComponent(Container focusCycleRoot) {
          return order.get(0);
        } 
    }
    
    class DecimalDocument extends PlainDocument {
        @Override
        public void insertString(int offs, String s, AttributeSet a) throws BadLocationException {
            for (int i = 0; i < s.length(); i++) {
                if (!s.matches("^\\d+(,)?\\d{0,2}$|,")) {
                    Toolkit.getDefaultToolkit().beep();
                    System.out.println("Visual Bell: Ungültiges Zeichen!");
                    return;
                }
            }
            super.insertString(offs, s, a);
        }
    }
}
