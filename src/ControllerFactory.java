package src;

public class ControllerFactory {
    public static Controller create(String arg) {
        if (arg != null && arg.toLowerCase().contains("mouse")) {
            return new MouseController();
        }
        return new KeyController();
    }
}