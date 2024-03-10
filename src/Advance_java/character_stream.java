package Advance_java;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//      it can read charecters only
public record character_stream() {
    public static void main(String[] args) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        try {
            reader = new FileReader("D:\\Garbage\\source.txt");
            writer = new FileWriter("D:\\Garbage\\cDes.txt");

            int content;
            while ((content = reader.read()) != -1){
                writer.write((char) content);
            }
        } finally {
            if(reader != null){
                reader.close();
                if(writer != null){
                    writer.close();

                }
            }
        }
    }
}



