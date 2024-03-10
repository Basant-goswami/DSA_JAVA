package Advance_java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//     using byte stream
//      input stream can read, image, table, docs, mathematical expression etc
public class input_output_stream {
    public static void main(String[] args) throws IOException {
        FileInputStream inStream = null;
        FileOutputStream outputStream = null;

        try {
            inStream = new FileInputStream("D:\\java_advance\\src.txt");
            outputStream = new FileOutputStream("D:\\java_advance\\dst.txt");

            int content;

            while ((content = inStream.read()) != -1){
                outputStream.write((byte) content);
            }
        } finally {
            if(inStream != null){
                inStream.close();
            } if (outputStream != null){
                outputStream.close();
            }
        }
    }
}
