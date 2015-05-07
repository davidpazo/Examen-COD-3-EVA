package superficies;

import javax.swing.JOptionPane;

/**
 *
 * @author dpazolopez
 */
public class Vista {
    
    public static void introducir(Modelo obj) {
     int opc = JOptionPane.showOptionDialog(
                null, "Elija objeto", "MENÚ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{
                    "1",
                    "2",
                    "3",
                    "4"},
                "Exit") + 1;
        switch (opc) {
            case 1:
                obj.
                break;
            case 2:
                obj
                break;
            case 3:
                obj
                break;
            case 4:
                obj
                break;
            default:
                System.exit(0);
        }
}
}