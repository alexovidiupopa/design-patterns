package strategy;

import org.opencv.core.Mat;

import java.io.IOException;

public interface Filter {
    String PATH = "src\\main\\resources\\hello-world.png";

    Mat apply() throws IOException;
}
