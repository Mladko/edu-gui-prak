/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ws1314.a08;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import utilities.UniversalChangeListener;

/**
 *
 * @author agribu
 */
public class Fenster extends javax.swing.JFrame {

    /**
     * Creates new form Aufgabe06
     */
    public Fenster() {
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

        dpInhalt = new javax.swing.JDesktopPane();
        ifWeinAufnehmen = new javax.swing.JInternalFrame();
        tpWeinAufnehmenTabs = new javax.swing.JTabbedPane();
        ifKundeAnlegen = new javax.swing.JInternalFrame();
        tpKundeAnlegenTabs = new javax.swing.JTabbedPane();
        mbMenu = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        costumerMenu = new javax.swing.JMenu();
        addCostumerMenuItem = new javax.swing.JMenuItem();
        editCostumerMenuItem = new javax.swing.JMenuItem();
        deleteCostumerMenuItem = new javax.swing.JMenuItem();
        wineMenu = new javax.swing.JMenu();
        addWineMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        infoMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        ifWeinAufnehmen.setClosable(true);
        ifWeinAufnehmen.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ifWeinAufnehmen.setIconifiable(true);
        ifWeinAufnehmen.setMaximizable(true);
        ifWeinAufnehmen.setResizable(true);
        ifWeinAufnehmen.setTitle("Wein aufnehmen");
        ifWeinAufnehmen.setVisible(false);

        javax.swing.GroupLayout ifWeinAufnehmenLayout = new javax.swing.GroupLayout(ifWeinAufnehmen.getContentPane());
        ifWeinAufnehmen.getContentPane().setLayout(ifWeinAufnehmenLayout);
        ifWeinAufnehmenLayout.setHorizontalGroup(
            ifWeinAufnehmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpWeinAufnehmenTabs)
        );
        ifWeinAufnehmenLayout.setVerticalGroup(
            ifWeinAufnehmenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpWeinAufnehmenTabs)
        );

        dpInhalt.add(ifWeinAufnehmen);
        ifWeinAufnehmen.setBounds(20, 10, 670, 490);

        ifKundeAnlegen.setTitle("Kunde anlegen");
        ifKundeAnlegen.setVisible(true);

        javax.swing.GroupLayout ifKundeAnlegenLayout = new javax.swing.GroupLayout(ifKundeAnlegen.getContentPane());
        ifKundeAnlegen.getContentPane().setLayout(ifKundeAnlegenLayout);
        ifKundeAnlegenLayout.setHorizontalGroup(
            ifKundeAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpKundeAnlegenTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        ifKundeAnlegenLayout.setVerticalGroup(
            ifKundeAnlegenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpKundeAnlegenTabs, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
        );

        dpInhalt.add(ifKundeAnlegen);
        ifKundeAnlegen.setBounds(40, 30, 640, 470);

        fileMenu.setMnemonic('D');
        fileMenu.setText("Datei");
        fileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileMenuActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setMnemonic('f');
        jMenuItem3.setText("Öffnen");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('S');
        jMenuItem1.setText("Speichern");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setMnemonic('u');
        jMenuItem2.setText("Speichern unter...");
        fileMenu.add(jMenuItem2);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/exit.png"))); // NOI18N
        exitMenuItem.setMnemonic('B');
        exitMenuItem.setText("Beenden");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mbMenu.add(fileMenu);

        editMenu.setMnemonic('B');
        editMenu.setText("Bearbeiten");
        mbMenu.add(editMenu);

        costumerMenu.setMnemonic('K');
        costumerMenu.setText("Kunden");

        addCostumerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addCostumerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/add.png"))); // NOI18N
        addCostumerMenuItem.setMnemonic('A');
        addCostumerMenuItem.setText("Aufnehmen");
        addCostumerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCostumerMenuItemActionPerformed(evt);
            }
        });
        costumerMenu.add(addCostumerMenuItem);

        editCostumerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        editCostumerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/stock_properties.png"))); // NOI18N
        editCostumerMenuItem.setMnemonic('e');
        editCostumerMenuItem.setText("Ändern");
        editCostumerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCostumerMenuItemActionPerformed(evt);
            }
        });
        costumerMenu.add(editCostumerMenuItem);

        deleteCostumerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        deleteCostumerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/edit-delete.png"))); // NOI18N
        deleteCostumerMenuItem.setMnemonic('L');
        deleteCostumerMenuItem.setText("Löschen");
        costumerMenu.add(deleteCostumerMenuItem);

        mbMenu.add(costumerMenu);

        wineMenu.setMnemonic('W');
        wineMenu.setText("Wein");

        addWineMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addWineMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/add.png"))); // NOI18N
        addWineMenuItem.setMnemonic('A');
        addWineMenuItem.setText("Aufnehmen");
        addWineMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addWineMenuItemActionPerformed(evt);
            }
        });
        wineMenu.add(addWineMenuItem);

        mbMenu.add(wineMenu);

        helpMenu.setMnemonic('?');
        helpMenu.setText("?");

        infoMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        infoMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/utilities/icons/help-faq.png"))); // NOI18N
        infoMenuItem.setMnemonic('I');
        infoMenuItem.setText("Info");
        infoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(infoMenuItem);

        mbMenu.add(helpMenu);

        setJMenuBar(mbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpInhalt, javax.swing.GroupLayout.DEFAULT_SIZE, 745, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpInhalt, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        this.schliessfeldBetaetigt();
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void fileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuActionPerformed

    private void addCostumerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCostumerMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCostumerMenuItemActionPerformed

    private void editCostumerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCostumerMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editCostumerMenuItemActionPerformed

    private void addWineMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addWineMenuItemActionPerformed
        this.ifWeinAufnehmen.setVisible(true);
        this.tpWeinAufnehmenTabs.addTab("Aufnehmen", pWeinAufnehmen);
        this.tpWeinAufnehmenTabs.addTab("Trinkreife", pWeinDiagramm);
    }//GEN-LAST:event_addWineMenuItemActionPerformed

    private void infoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoMenuItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.schliessfeldBetaetigt();
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void postInitComponents() {
        pWeinAufnehmen = new WeinAufnehmen();
        pWeinDiagramm = new WeinDiagramm();
        pKundeAnlegen = new KundeAnlegen();
        
        tpWeinAufnehmenTabs.addTab("Aufnehmen", pWeinAufnehmen);
        tpWeinAufnehmenTabs.addTab("Trinkreife", pWeinDiagramm);
        tpKundeAnlegenTabs.addTab("Anlegen", pKundeAnlegen);
        
        this.pWeinAufnehmen.setDia(pWeinDiagramm);
        this.pWeinDiagramm.setWeinAufnehmen(pWeinAufnehmen);
        this.pWeinAufnehmen.setFenster(this);
        this.pKundeAnlegen.setFenster(this);
    }
    
    public void closeWeinAufnehmen(UniversalChangeListener ucl) {
        this.ucl = ucl;
        
        if (beenden() != JOptionPane.YES_OPTION) {
            return;
        }
        this.ifWeinAufnehmen.setVisible(false);
        clearAll();
    }

    private void schliessfeldBetaetigt() {
        if (beenden() == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private int beenden() {
        int antwort = JOptionPane.showConfirmDialog(
                this, "Wollen Sie wirklich das Fenster schließen?", "Fenster schließen.",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return antwort;
    }

    public void clearAll() {
        dim = this.getSize();

        this.getContentPane().removeAll();
        initComponents();
        //pWeinAufnehmen.postInitComponents();

        this.setSize(dim);
        this.ucl.reset();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addCostumerMenuItem;
    private javax.swing.JMenuItem addWineMenuItem;
    private javax.swing.JMenu costumerMenu;
    private javax.swing.JMenuItem deleteCostumerMenuItem;
    private javax.swing.JDesktopPane dpInhalt;
    private javax.swing.JMenuItem editCostumerMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JInternalFrame ifKundeAnlegen;
    private javax.swing.JInternalFrame ifWeinAufnehmen;
    private javax.swing.JMenuItem infoMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuBar mbMenu;
    private javax.swing.JTabbedPane tpKundeAnlegenTabs;
    private javax.swing.JTabbedPane tpWeinAufnehmenTabs;
    private javax.swing.JMenu wineMenu;
    // End of variables declaration//GEN-END:variables

    private Dimension dim;
    private WeinAufnehmen pWeinAufnehmen;
    private WeinDiagramm pWeinDiagramm;
    private KundeAnlegen pKundeAnlegen;
    private UniversalChangeListener ucl;
}
