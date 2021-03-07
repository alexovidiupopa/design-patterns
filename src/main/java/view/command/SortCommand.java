package view.command;

import singleton.Logger;
import strategy.AutomaticSorter;
import strategy.ManualSorter;
import strategy.Sorter;

import java.util.Arrays;
import java.util.List;

public class SortCommand extends Command {

    private final Logger LOGGER = Logger.getLogger();
    private static final String STRATEGY = "Manual";
    public SortCommand(String key, String description) {
        super(key, description);
    }

    @Override
    public void execute() {
        // Adapter call
        StringBuilder builder = new StringBuilder().append("sorting array using strategy pattern with strategy ").append(STRATEGY);
        LOGGER.log(builder.toString());
        List<Integer> list = Arrays.asList(3,2,1);
        Sorter sorter;
        if (STRATEGY.equals("Manual")){
            sorter = new ManualSorter();
        }
        else{
            sorter = new AutomaticSorter();
        }
        System.out.println(sorter.sort(list));
    }
}
