package multiprocess;


import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java6multithreading.Multiprocess;

/*
 * Class launches 3 processes of Notepad.exe
 */

/**
 *
 * @author gheor
 */
public class LaunchNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb = new ProcessBuilder("notepad");
            pb.directory(new File("C:\\Users\\gheor\\Desktop"));
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
        } catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
    }
}
