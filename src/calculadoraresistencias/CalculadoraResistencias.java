/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraresistencias;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import vistas.VentanaPrincipal;




/**
 *
 * @author rjbr
 */
public class CalculadoraResistencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
////        
        // TODO code application logic here

//        SwingUtilities.invokeLater ( new Runnable ()
//       {
//            public void run ()
//            {
//                // Install WebLaF as application L&F
//                WebLookAndFeel.install ();
//
//                // Create you Swing application here
//                // JFrame frame = ...
//                
//                
//            }
//        } );
//        
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
         new PantallaCargandoMain();
          VentanaPrincipal v = new VentanaPrincipal();
           
            v.setVisible(true);
            v.setLocationRelativeTo(null);

        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
//try {
//    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
//        if ("Nimbus".equals(info.getName())) {
//            UIManager.setLookAndFeel(info.getClassName());
//            break;
//            
//            
//            
//        }
//    }
//         
//            
//} catch (Exception e) {
//    // If Nimbus is not available, you can set the GUI to another look and feel.
//}
//    }
    }
}
