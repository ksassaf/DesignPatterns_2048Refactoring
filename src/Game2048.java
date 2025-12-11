package src;

import javax.swing.*;

/**
 * refactored from Konstantin Bulenkov
 */


public class Game2048{
	private JFrame game;
	public Game2048(){
		game = new JFrame();
		game.setTitle("2048 Game");
		game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		game.setSize(340, 400);
		game.setResizable(false);
	}
   public void initialize(String[] args){

    /*MVC setting */
     Controller controller;
     if (args[0].toLowerCase().contains("mouse")) {
     	controller = new MouseController();
	 } else {
     	controller = new KeyController();
	 }
     //TODO
	 /**  assign an instance to the controller.
	     if arg[0] contains "mouse" make it MouseController()
		 otherwise  new KeyController();
		 in the future there may be other controller options
		 or other kinds of args[] options
         set one for default now.
		 isolate this creation logic from the rest of the code.
        why? what would we gain?		 
    */
    

    View view=new View();
    Model model=new Model();
    /** TODO 
	View's state is dependent on Model's state.
	find a way to make this connection
	you may add code here or in the controller
	*/
    controller.initialize(view,model);
    view.initialize(controller);
	
	//no need to change this code.
    game.add(view);
  }
  public void show(){
    game.setLocationRelativeTo(null);
    game.setVisible(true);
  }
  public static void main(String[] args) {
	Game2048 game=new Game2048();
	game.initialize(args);
	game.show();
  }
}