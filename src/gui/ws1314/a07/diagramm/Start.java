package gui.ws1314.a07.diagramm;

import java.io.IOException;

/**
 *
 * @author Benjamin Schuermann <agribu>
 * @since 2013/11/04 
 * @version 0.5
 */
public class Start {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        Fenster f = new Fenster();
        f.getDiagramm().setzeJSpinner(f.jSpinner);
        TastaturEingabe te = new TastaturEingabe();
        f.setVisible(true);

        // Behandlung der Benutzereingabe
        while (true) {
            try {
                te.pruefeEingabe();
                f.getDiagramm().setzeEingabe(te.jahrgang(), te.lagerdauer());
                f.jSpinner.setValue(te.lagerdauer());
                f.getDiagramm().repaint();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
