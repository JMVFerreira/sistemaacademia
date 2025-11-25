/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaacademia;

import br.com.academia.view.TelaPrincipal;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author Dev
 */
public class SistemaAcademia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // usa o visual do sistema operacional
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        javax.swing.SwingUtilities.invokeLater(() -> 
            new br.com.academia.view.TelaPrincipal().setVisible(true)
        );
    }
    
}
