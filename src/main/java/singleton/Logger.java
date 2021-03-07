package singleton;

import java.io.*;

public class Logger {
    private static OutputStream os;
    private static Logger LOGGER;

    Logger(){
        initOS();
    }

    private static void initOS() {
        try {
            os = new FileOutputStream(new File("D:\\Facultate\\design-patterns\\src\\main\\java\\singleton\\log.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Logger getLogger(){
        if (LOGGER==null){
            LOGGER = new Logger();
        }
        return LOGGER;
    }

    public void log(String data) {
        try {
            data += "\n";
            Logger.os.write(data.getBytes(), 0, data.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
