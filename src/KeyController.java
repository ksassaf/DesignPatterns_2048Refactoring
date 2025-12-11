import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.HashMap; 


public class KeyController extends Controller implements KeyListener {
    private Map<Integer, Command> commands = new HashMap<>();

    public KeyController() {
        commands.put(KeyEvent.VK_LEFT,  new LeftCommand());
        commands.put(KeyEvent.VK_RIGHT, new RightCommand());
        commands.put(KeyEvent.VK_UP,    new UpCommand());
        commands.put(KeyEvent.VK_DOWN,  new DownCommand());
        commands.put(KeyEvent.VK_ESCAPE,new ResetCommand());
    }

    @Override
    protected Command resolveCommand(InputEvent e) {
        KeyEvent ke = (KeyEvent)e;
        return commands.get(ke.getKeyCode());
    }
   
   //no need to change these
   protected void setListenerofView(View view){
    view.addKeyListener(this);
   }
    /*KeyListener  methods */  
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
    public void keyPressed(KeyEvent e) {
      super.handle(e);
    }    
}