package src;

public class LeftCommand implements Command {
    public void execute(Model model) {
        model.left();
    }
}