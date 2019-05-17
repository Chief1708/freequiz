/*
 * GPLv3; Free Software
 */
package freequiz;

/**
 *
 * @author dmusiolik, cfchong & jwolter
 */
public class FreeQuiz {

    public static void main(String[] args) {
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        MainFrame hauptfenster = new MainFrame();
        hauptfenster.show();
        System.out.println("ready.");
    }
    
}
