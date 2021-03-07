package view.command;

import singleton.Logger;

public class ExitCommand extends Command{

    private final Logger LOGGER = Logger.getLogger();

    public ExitCommand(String key, String description) {
        super(key, description);
    }

    public void execute() {
        LOGGER.log("exiting...");
        System.exit(0);
    }
}
