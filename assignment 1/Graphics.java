import java.awt.*;

public class Graphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
			//draw a panel
				DrawingPanel panel = new DrawingPanel(500, 500);
						
			//get instance of a graphics object to draw on the panel
				Graphics2D g = panel.getGraphics();
				//draw a line
				g.drawLine(275, 303, 275, 345);
				g.drawLine(275, 310, 305, 316);
				g.drawLine(275, 310, 240, 316);
				g.drawLine(275, 344, 259, 383);
				g.drawLine(275, 344, 287, 383);
				g.drawOval(230, 314, 10, 10);
				g.drawOval(305, 315, 10, 10);
				
				
				g.drawOval(250,250,50,50);
				g.setColor(Color.BLUE);
				g.drawOval(265, 265, 5, 5);
				g.drawOval(285, 265, 5, 5);
		
				
				//use color
				panel.setBackground(Color.WHITE);
				g.setColor(Color.WHITE);
				g.fillOval(150, 50, 40, 20);
				g.setColor(Color.WHITE);
				
				
				
		}

	}



