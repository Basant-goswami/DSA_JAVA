package Advance_java;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageHandling {
    private static BufferedImage readFileInput(int width,int height, BufferedImage image){
        try {
            File inputFile = new File("D:\\java_advance\\pexels.jpg");
            image = new BufferedImage(width,height,BufferedImage.TYPE_4BYTE_ABGR);
            // reading file/image
            image = ImageIO.read(inputFile);
            System.out.println("reading completed ");
        } catch (IOException e){
            System.out.println(e);
        }
        return image;
    }

    public static void writeFileInput(BufferedImage image) {
        try {
            File outputFile = new File("D:\\java_advance\\pexelscopy.jpg");
            // writing image
            ImageIO.write(image, "jpg", outputFile);
            System.out.println("writing completed");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main (String[]args) throws IOException {
        BufferedImage image = null;
        int width = 600;
        int height = 400;
        image = readFileInput(width, height, image);

        writeFileInput(image);
    }
}
