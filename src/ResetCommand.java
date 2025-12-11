package src;

public class ResetCommand implements Command {
    public void execute(Model model) {
        model.resetGame();
    }
}