/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui.ws1314.a07;

import javax.swing.SpinnerNumberModel;
import gui.ws1314.a07.diagramm.*;

/**
 *
 * @author agribu
 */
public class WeinDiagramm extends javax.swing.JPanel {

    /**
     * Creates new form WeinDiagramm
     */
    public WeinDiagramm() {
        initComponents();
        this.getDiagramm().setzeJSpinner(this.jSpinner);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        jSpinner = new javax.swing.JSpinner();
        jPanelRightMargin = new javax.swing.JPanel();
        jPanelLeftMargin = new javax.swing.JPanel();
        jPanelBottomMargin = new javax.swing.JPanel();
        jPanelCenter = new javax.swing.JPanel();
        reifeDiagramm = new gui.ws1314.a07.diagramm.ReifeDiagramm();
        jPanelCenterGap = new javax.swing.JPanel();
        legende = new gui.ws1314.a07.diagramm.Legende();

        setLayout(new java.awt.BorderLayout());

        jPanelTop.setLayout(new javax.swing.BoxLayout(jPanelTop, javax.swing.BoxLayout.LINE_AXIS));

        jLabel.setText("Lagerdauer");
        jPanelTop.add(jLabel);

        jSpinner.setModel(new SpinnerNumberModel((int) reifeDiagramm.lagerdauer, 1, 25, 1));
        jSpinner.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerStateChanged(evt);
            }
        });
        jPanelTop.add(jSpinner);

        add(jPanelTop, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout jPanelRightMarginLayout = new javax.swing.GroupLayout(jPanelRightMargin);
        jPanelRightMargin.setLayout(jPanelRightMarginLayout);
        jPanelRightMarginLayout.setHorizontalGroup(
            jPanelRightMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelRightMarginLayout.setVerticalGroup(
            jPanelRightMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        add(jPanelRightMargin, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanelLeftMarginLayout = new javax.swing.GroupLayout(jPanelLeftMargin);
        jPanelLeftMargin.setLayout(jPanelLeftMarginLayout);
        jPanelLeftMarginLayout.setHorizontalGroup(
            jPanelLeftMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanelLeftMarginLayout.setVerticalGroup(
            jPanelLeftMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );

        add(jPanelLeftMargin, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout jPanelBottomMarginLayout = new javax.swing.GroupLayout(jPanelBottomMargin);
        jPanelBottomMargin.setLayout(jPanelBottomMarginLayout);
        jPanelBottomMarginLayout.setHorizontalGroup(
            jPanelBottomMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        jPanelBottomMarginLayout.setVerticalGroup(
            jPanelBottomMarginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanelBottomMargin, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout reifeDiagrammLayout = new javax.swing.GroupLayout(reifeDiagramm);
        reifeDiagramm.setLayout(reifeDiagrammLayout);
        reifeDiagrammLayout.setHorizontalGroup(
            reifeDiagrammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        reifeDiagrammLayout.setVerticalGroup(
            reifeDiagrammLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCenterGapLayout = new javax.swing.GroupLayout(jPanelCenterGap);
        jPanelCenterGap.setLayout(jPanelCenterGapLayout);
        jPanelCenterGapLayout.setHorizontalGroup(
            jPanelCenterGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 447, Short.MAX_VALUE)
        );
        jPanelCenterGapLayout.setVerticalGroup(
            jPanelCenterGapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout legendeLayout = new javax.swing.GroupLayout(legende);
        legende.setLayout(legendeLayout);
        legendeLayout.setHorizontalGroup(
            legendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        legendeLayout.setVerticalGroup(
            legendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanelCenterLayout = new javax.swing.GroupLayout(jPanelCenter);
        jPanelCenter.setLayout(jPanelCenterLayout);
        jPanelCenterLayout.setHorizontalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reifeDiagramm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelCenterGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(legende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelCenterLayout.setVerticalGroup(
            jPanelCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenterLayout.createSequentialGroup()
                .addComponent(reifeDiagramm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanelCenterGap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(legende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        add(jPanelCenter, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerStateChanged
        this.reifeDiagramm.setzeEingabe((int) this.reifeDiagramm.jahrgang, (int) this.jSpinner.getValue());
        this.weinAufnehmen.setLagerfaehigkeit((int) this.jSpinner.getValue());
        this.reifeDiagramm.repaint();
    }//GEN-LAST:event_jSpinnerStateChanged

    /**
     * Liefert das ReifeDiagramm des Fensters
     *
     * @return ReifeDiagramm
     */
    public ReifeDiagramm getDiagramm() {
        return this.reifeDiagramm;
    }
    
    public void setzeWerte(int jahrgang, int lagerdauer) {
        this.reifeDiagramm.setzeEingabe(jahrgang, lagerdauer);
    }

    /**
     * Liefert die Legende des Fensters
     *
     * @return Legende
     */
    public Legende getLegende() {
        return this.legende;
    }
    
    public void setWeinAufnehmen(WeinAufnehmen wa) {
        this.weinAufnehmen = wa;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanelBottomMargin;
    private javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelCenterGap;
    private javax.swing.JPanel jPanelLeftMargin;
    private javax.swing.JPanel jPanelRightMargin;
    private javax.swing.JPanel jPanelTop;
    public javax.swing.JSpinner jSpinner;
    private gui.ws1314.a07.diagramm.Legende legende;
    private gui.ws1314.a07.diagramm.ReifeDiagramm reifeDiagramm;
    // End of variables declaration//GEN-END:variables

    private WeinAufnehmen weinAufnehmen;
}
