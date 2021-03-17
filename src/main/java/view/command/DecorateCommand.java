package view.command;

import decorator.TextOnImageDecorator;
import decorator.ImageDecorator;
import decorator.Rectangle;

public class DecorateCommand extends Command{
    public DecorateCommand(String key, String description) {
        super(key, description);
    }

    @Override
    public void execute() {
        ImageDecorator decorator = new TextOnImageDecorator(new Rectangle());
        decorator.draw("src\\main\\resources\\drawn.png");
    }
}
