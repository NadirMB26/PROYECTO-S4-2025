
package co.edu.unicolombo.poo;

import co.edu.unicolombo.poo.Gui.MainWindow;

public class Main {


    public static void main(String[] args) {
        MainWindow window=new MainWindow();
        window.setTitle("VENTANA EJEMPLO");
       // window.setLocationRelativeTo(null);
        window.setExtendedState(MainWindow.MAXIMIZED_BOTH);
        window.setVisible(true);
    }
    
}
