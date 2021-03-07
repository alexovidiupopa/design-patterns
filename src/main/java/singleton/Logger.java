package singleton;

import java.io.*;

public class Logger {
    private OutputStream os;
    private static Logger LOGGER;

    Logger(){
        initOS();
    }

    public static Logger getLogger(){
        if (LOGGER==null){
            LOGGER = new Logger();
        }
        return LOGGER;
    }

    private void initOS() {
        try {
            this.os = new FileOutputStream(new File("D:\\Facultate\\design-patterns\\src\\main\\resources\\log.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void log(String data) {
        try {
            data += "\n";
            this.os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
