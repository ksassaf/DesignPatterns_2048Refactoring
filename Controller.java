import java.awt.event.InputEvent;
import java.util.EventListener;
 // refactored from the author Konstantin Bulenkov
 
public abstract class Controller implements EventListener{

    /*MVC pattern. controller sits between model and view */
    private View view;   
    private Model model;
    
    public void resetGame(){
        model.resetGame();
		/**
		model's state has changed.
		make sure tiles, win,loose of the View object
		is consistent with that of model.
		*/
    }
  
	/** Either keyController or MouseController will the 
	the input listener of the View.
	I cannot decide now. 
	Let the subclass register itself as the listener.
    */	
    protected abstract void setListenerofView(View v);  
	
    public void initialize(View view, Model model){
        this.view=view;
        this.model=model;
		/** other initializations if needed */
		setListenerofView(view); //keylistener or mouse listener of view
    }
	
    /**Event dispatch logic*/
	/**is there a design pattern used here? */
    public void handle(InputEvent e) {
      boolean myWin = model.getWin();
      boolean myLose = model.getLose();
      
      if (!model.canMove()) {
        myLose = true;
        model.lose();
      }

	  /**
	  At this point
	  Decide what to do based on the Input Event e in the subclass.
	  in other words, resolve what action to take based on the event e.
      */
      
      
      if (!myWin && !myLose) { //you may modify this condition
	    /**
		do the action. up() down() left() right() methods of the model.
		*/
        myWin = model.getWin();
        myLose = model.getLose();
      }
  
      if (!myWin && !model.canMove()) {
            myLose = true;
            model.lose();
      }
  
      /**
	  request handled. model's state is changed.
	  make sure that view is consistent with model's state
	  **/
	  
      view.repaint();
    }
      
    
}