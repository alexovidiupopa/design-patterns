package decorator;

public abstract class ImageDecorator implements Shape {

    protected Shape decoratedBorder;

    public ImageDecorator(Shape decoratedBorder) {
        this.decoratedBorder = decoratedBorder;
    }

    @Override
    public void draw(String path) {
        this.decoratedBorder.draw(path);
    }
}
