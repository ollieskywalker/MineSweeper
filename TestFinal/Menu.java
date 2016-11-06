import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu extends JFrame{
	private JLabel statusLabel;
	private EasyBoard x;
	private MediumBoard y;
	private HardBoard z;
	public Menu()
	{	
		//***************
		JFrame menu = new JFrame("Minesweeper");

		menu.setLayout(new FlowLayout());
	    menu.setSize(925, 800);
		
		//****************
		JLabel headerLabel = new JLabel("",JLabel.CENTER );
	    JLabel statusLabel = new JLabel("",JLabel.CENTER);  
	    final JMenuBar menuBar = new JMenuBar();
	    
	    menu.add(menuBar);
	    menu.add(headerLabel);
	    menu.add(statusLabel);
	    
	    JMenu gameMenu = new JMenu("Game");
	    JMenu helpMenu = new JMenu("help"); 
	    
	    menu.add(gameMenu);
	    
	    JMenuItem easyMenuItem = new JMenuItem("Easy");
	    easyMenuItem.setMnemonic(KeyEvent.VK_N);
	    easyMenuItem.setActionCommand("Easy");
	    
	    JMenuItem mediumMenuItem = new JMenuItem("Medium");
	    mediumMenuItem.setMnemonic(KeyEvent.VK_N);
	    mediumMenuItem.setActionCommand("Medium");
	      
	    JMenuItem hardMenuItem = new JMenuItem("Hard");
	    hardMenuItem.setMnemonic(KeyEvent.VK_N);
	    hardMenuItem.setActionCommand("Hard");
	    
	    JMenuItem restartItem = new JMenuItem("Restart");
	    hardMenuItem.setMnemonic(KeyEvent.VK_N);
	    hardMenuItem.setActionCommand("Restart");
	    
	    JMenuItem aboutItem = new JMenuItem("Rules");
	    aboutItem.setMnemonic(KeyEvent.VK_N);
	    aboutItem.setActionCommand("Rules");
	    
	    JMenuItem Thanks = new JMenuItem("Thanks");
	    Thanks.setMnemonic(KeyEvent.VK_N);
	    Thanks.setActionCommand("Thanks");
	    
	    easyMenuItem.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	                //Execute when button is pressed
	    		 System.out.println("Hi!");
	    		 x = new EasyBoard();
	    		 EasyBoardSetup blah = new EasyBoardSetup();
	    		 if(y!=null)
	    		 {
		    			y.setVisible(false);
		    			menu.revalidate();
		    	}
		    	if(z!=null)
		    	{
		    		z.setVisible(false);
		    		menu.revalidate();
		    	}
	    		menu.add(x);
	    		menu.revalidate();
	         }
	    });
	    mediumMenuItem.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	                //Execute when button is pressed
	                System.out.println("You clicked the button");
	                y = new MediumBoard();
	                if(x!=null)
		    		{
		    			x.setVisible(false);
		    			menu.revalidate();
		    		}
		    		if(z!=null)
		    		{
		    			z.setVisible(false);
		    			menu.revalidate();
		    		}
	                menu.add(y);
	                menu.revalidate();
	         }
	    });
	    hardMenuItem.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	                //Execute when button is pressed
	                System.out.println("You clicked the button");
	                z = new HardBoard();
	                if(x!=null)
		    		{
		    			x.setVisible(false);
		    			menu.revalidate();
		    		}
		    		if(y!=null)
		    		{
		    			y.setVisible(false);
		    			menu.revalidate();
		    		}
	                menu.add(z);
	                menu.revalidate();
	         }
	    });
	    
	    restartItem.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	                //Execute when button is pressed
	    		System.out.println("You clicked the button");
	    		if(x!=null)
	    		{
	    			x.setVisible(false);
	    			menu.revalidate();
	    		}
	    		if(y!=null)
	    		{
	    			y.setVisible(false);
	    			menu.revalidate();
	    		}
	    		if(z!=null)
	    		{
	    			z.setVisible(false);
	    			menu.revalidate();
	    		}
	    		menu.revalidate();
	         }
	    });
	    
	    aboutItem.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	    		 JOptionPane message = new JOptionPane();
	    		 message.setSize(600,400);
	    		 message.showMessageDialog(null, "Minesweeper is a single-player puzzle video game." + 
	    		 " \nThe objective of the game is to clear a rectangular board containing hidden mines without detonating any of them,"
	    		 +"\nwith help from clues about the number of neighboring mines in each field.");
	    	 }
	    });
	    Thanks.addActionListener(new ActionListener(){
	    	 public void actionPerformed(ActionEvent e){
	    		 JOptionPane message = new JOptionPane();
	    		 message.setSize(600,400);
	    		 message.showMessageDialog(null, "Thank you for a wonderful school year!"+
	    		 "\nSeniors, I wish you all the best wherever life takes you."+
	    		 " \nCongradulations Mr.Shorr!" + 
	    		 "\nTo another four years of EUPHORIA!");
	    	 }
	    });
	    
	    gameMenu.add(easyMenuItem);
	    gameMenu.add(mediumMenuItem);
	    gameMenu.add(hardMenuItem);
	    
	    helpMenu.add(restartItem);
	    helpMenu.add(aboutItem);
	    helpMenu.add(Thanks);
	    
	    menuBar.add(gameMenu);
	    menuBar.add(helpMenu);
	    
	    menu.setJMenuBar(menuBar);
	    menu.setVisible(true);
	}
}
