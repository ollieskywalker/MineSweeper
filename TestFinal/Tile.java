 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Tile extends JButton implements ActionListener, Sky, MouseListener {
	private boolean bomb;
	int tileNum = 0;
	public static int f = 0;
	public boolean ready = false;
	private int total = 8;
	
	public Tile(boolean bomb) {
		this.bomb = bomb;
		if (bomb) {
			setText("*");
		}
		this.setBackground(Color.GRAY.brighter());
		addActionListener(this);
		addMouseListener(this);

	}

	public boolean getBomb() {
		boolean r = false;
		if (bomb) {
			r = true;
			return r;
		} else {
			return r;
		}
	}

	/**
	 * Returns the tile number of the certain tile
	 * 
	 * @return The tile Number
	 */
	public int getTileNum() {
		return tileNum;
	}

	/**
	 * Increases the number of the tile
	 */
	public void increaseTileNum() {
		tileNum++;
	}

	public void convert() {
		this.bomb = true;
	}

	public void setNum() {
		Icon one = new ImageIcon("E:\\MinesweeperFINAL\\one.png");
		Icon two = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\two.png");
		Icon three = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\three.png");
		Icon four = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\four.png");
		if (this.getTileNum() == 0 && !bomb) {
			this.setBackground(Color.WHITE);
		}

		if (this.getTileNum() == 1 && !bomb) {
			this.setIcon(one);
		}
		if (this.getTileNum() == 2 && !bomb) {
			this.setIcon(two);
		}
		if (this.getTileNum() == 3 && !bomb) {
			this.setIcon(three);
		}
		if (this.getTileNum() == 4 && !bomb) {
			this.setIcon(four);
		}
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		if (this.getBomb()) {
			System.out.println("You LOSE");
			Icon bombIcon = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\bomb.png");
			this.setIcon(bombIcon);
			System.exit(0);
		}
		Icon one = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\one.png");
		Icon two = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\two.png");
		Icon three = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\three.png");
		Icon four = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\four.png");
		if (this.getTileNum() == 0 && !bomb) {
			this.setBackground(Color.WHITE);
		}

		if (this.getTileNum() == 1) {
			this.setIcon(one);
		}
		if (this.getTileNum() == 2) {
			this.setIcon(two);
		}
		if (this.getTileNum() == 3) {
			this.setIcon(three);
		}
		if (this.getTileNum() == 4) {
			this.setIcon(four);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		switch (e.getButton()) {
		case MouseEvent.BUTTON1:
			break;
		case MouseEvent.BUTTON2:
			break;
		case MouseEvent.BUTTON3:
			System.out.println("Left mouse");
			Icon bombIcon = new ImageIcon("D:\\Docs\\Eclipsefolder\\Minesweeper\\Minesweeper\\src\\5cRKaAxKi.png");
			this.setIcon(bombIcon);
			total--;
			break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}