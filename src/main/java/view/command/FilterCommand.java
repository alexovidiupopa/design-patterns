package view.command;

import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import singleton.Logger;
import strategy.BinomialFilter;
import strategy.Filter;
import strategy.GaussianFilter;

import java.io.IOException;
import java.util.Scanner;

public class FilterCommand extends Command{
    private final Logger LOGGER = Logger.getLogger();

    public FilterCommand(String key, String description) {
        super(key, description);
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the filter(binomial/gaussian): ");
        String input = scanner.nextLine();
        Filter filter;
        if (input.equals("Binomial")){
            LOGGER.log("applying bino filter...");
            filter=new BinomialFilter();
        }
        else{
            LOGGER.log("applying gaussian filter...");
            filter = new GaussianFilter();
        }
        try {
            Mat result = filter.apply();
            Imgcodecs.imwrite("src\\main\\resources\\copy.png",result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
