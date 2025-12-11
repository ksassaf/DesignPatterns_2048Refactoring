package src;

public class UpCommand implements Command {
    public void execute(Model model) {
        model.up();
    }
}