package src;

public class DownCommand implements Command {
    public void execute(Model model) {
        model.down();
    }
}
