package view.command;

import facade.WebcamHandler;
import singleton.Logger;

import java.io.IOException;

public class CameraCommand extends Command {

    private static final Logger LOGGER = Logger.getLogger();
    private static final String PATH="D:\\Facultate\\design-patterns\\src\\main\\resources\\hello-world.png";

    public CameraCommand(String key, String description) {
        super(key, description);
    }

    @Override
    public void execute() {
        WebcamHandler webcamHandler = new WebcamHandler();
        try {
            webcamHandler.takePicture(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
