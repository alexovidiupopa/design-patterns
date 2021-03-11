package facade;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class WebcamHandler {

    public void takePicture(String path) throws IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.setViewSize(new Dimension(640,480));
        webcam.open();
        ImageIO.write(webcam.getImage(), "PNG", new File(path));
        webcam.close();
    }
}
