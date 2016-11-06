 

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class MediumBoard extends JPanel{
	private final int X = 16;
	private final int Y = 16;
	private final int NUMBOMBS = 40;
	private final Tile[][]grids = new Tile[X][Y];
	public boolean firstClick = true;
	public boolean ready = false;
	private int uX;
	private int uY;

	
	public MediumBoard()
	{
		setLayout(new GridBagLayout());
		setBorder(BorderFactory.createLineBorder(Color.black));
		setPreferredSize(new Dimension(650,700));
		setLayout(new GridLayout(X,Y+1));
		
		for (int i = 0; i < grids.length; i++) {
			for (int k = 0; k < grids[0].length; k++) {
				grids[i][k] = new Tile(false);
				add(grids[i][k]);
				final int x = i;
				final int y = k;
				grids[i][k].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (firstClick) {
							firstClick = false;
							System.out.println("HEHEHEH");
							int h = 40;
							while (h > 0) {
								Random generator = new Random();
								int nx = generator.nextInt(15) + 1;
								Random generator2 = new Random();
								int ny = generator.nextInt(15) + 1;

								if ((nx != x + 1 && ny != y) && (nx != x + 1 && ny != y + 1) && (nx != x && ny != y + 1)
										&& (nx != x - 1 && ny != y + 1) && (nx != x - 1 && ny != y)
										&& (nx != x - 1 && ny != y - 1) && (nx != x && ny != y - 1)
										&& (nx != x + 1 && ny != y - 1)) {
									grids[nx][ny].convert();
					                grids[nx][ny].setNum();
									h--;
								}
							}
							for(int i = 0; i < grids.length;i++)
							{
								for(int k = 0; k < grids[0].length;k++)
								{
									int mx = i - 1;
					                int gx = i + 1;
					                int my = k - 1;
					                int gy = k + 1;
					                
									int amountOfBombs = 0;
					                if(mx >= 0&&my >= 0&&grids[mx] [my].getBomb()) grids[i][k].increaseTileNum();
					                if(mx >= 0&&my >= 0&&grids[mx] [k].getBomb()) grids[i][k].increaseTileNum();
					                if(mx >= 0&&gy < 9&&grids[mx] [gy].getBomb()) grids[i][k].increaseTileNum();
					                if(my >= 0&&grids[i] [my].getBomb()) grids[i][k].increaseTileNum();
					                
					                if(gy < 9&&grids[i] [gy].getBomb()) grids[i][k].increaseTileNum();
					                if(gx < 9&&my >= 0&&grids[gx] [my].getBomb()) grids[i][k].increaseTileNum();
					                if(gx < 9&&grids[gx] [k].getBomb()) grids[i][k].increaseTileNum();
					                if(gx < 9&&gy < 9&&grids[gx] [gy].getBomb()) grids[i][k].increaseTileNum();
					                
					                grids[i][k].setNum();
								}
							}
						}
					}
				});
			}
		}
	}
}