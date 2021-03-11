import nu.pattern.OpenCV;
import view.View;

public class Main {

    public static void main(String[] args) {
        OpenCV.loadLocally();
        View view = new View();
        view.run();
    }
}