import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Map;
import java.util.HashMap; 


public class KeyController extends Controller implements KeyListener{
/**
   need to provide an implementation to decide 
   what to do based on the InputEvent e.
   */
   

/**
   InputEvent e;
   KeyEvent ke=(KeyEvent)e;
   Integer code=ke.getKeyCode();
   
Integer values to be used. 
	KeyEvent.VK_ESCAPE    use this keycode for reset.
	KeyEvent.VK_LEFT     use this keycode to make model.left()
    KeyEvent.VK_RIGHT
	KeyEvent.VK_DOWN 
	KeyEvent.VK_UP
   
  */

   
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