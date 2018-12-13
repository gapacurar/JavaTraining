/*
 * a-sti.ro
 */
package ioxml;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gheorgheaurelpacurar
 */
public class InputAndOutputStreamsAsFiles {
    public static void main(String[] args) throws IOException{
        // create two streams variables, one for input and one for output
        FileInputStream in=null;
        FileOutputStream out= null;
        // create two streams, one for input and one for output
        try {
                in = new FileInputStream("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\in.txt");
                out = new FileOutputStream("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\out.txt");
                // create an int variable to be loaded from input file and to be written to output stream
                int val;
                // read the int value from input stream and write it to output stream
                while ((val = in.read()) != -1) {
                    out.write(val);
                }
        } catch (FileNotFoundException ex) {
                Logger.getLogger(InputAndOutputStreamsAsFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
                Logger.getLogger(InputAndOutputStreamsAsFiles.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            if (in != null) {
                    in.close();
            }
            if (out != null) {
                    out.close();
            }
        }
        // same code using decorators or wrappers;
        InputStreamReader inWrapper = new InputStreamReader(new FileInputStream("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\inwrapper.txt"));
        OutputStreamWriter outWrapper = new OutputStreamWriter(new FileOutputStream("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\outwrapper.txt"));
        int inWrapperValue = inWrapper.read();
        outWrapper.write(inWrapperValue);
        System.out.println(inWrapperValue);
        inWrapper.close();
        outWrapper.close();
        // same code using buffered streams
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\bufferedIn.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\bufferedout.txt"));
        int bufferedValue = br.read();
        System.out.println(bufferedValue);
        bw.write(bufferedValue);
        br.close();
        bw.close();
        // read content of a file using NIO (New IO) and channels
        File file = new File("C:\\Users\\gheor\\OneDrive\\Documents\\NetBeansProjects\\JavaTrainings\\JavaTraining\\src\\ioxml\\in.txt");
        Path path = file.toPath();
        FileChannel fc = FileChannel.open(path);
        ByteBuffer buf = ByteBuffer.allocate(1024);
        int bytesRead = fc.read(buf);
        while (bytesRead != -1) {
            System.out.println("bytes read: " + bytesRead);
            buf.flip(); //make buffer ready for read
            byte[] dst = new byte[bytesRead];
            buf.get(dst);
            System.out.println(new String(dst, "UTF-8"));
            buf.clear(); //make buffer ready for writing
            bytesRead = fc.read(buf);
        }
        //
    }
}
