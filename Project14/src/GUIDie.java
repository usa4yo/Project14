import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;

public class GUIDie extends JComponent {

    private static final long serialVersionUID = 1L;
    
    private Die singleDie;
    private static final int PIP_DIAM = 18;
    
    public GUIDie(){
        this.setPreferredSize(new Dimension(120, 120));
        this.setSingleDie(new Die());
    }
    
    private Die getSingleDie(){
        return this.singleDie;
    }
    
    private Die setSingleDie(Die newSingleDie){
        return this.singleDie = newSingleDie;
    }
    
    public int getCurrentValue(){
        return this.getSingleDie().getCurrentValue();
    }
    
    public int roll(){
        this.getSingleDie().roll();
        this.repaint();
        return this.getCurrentValue();
    }
    
    public void paintComponent(Graphics g){
        int width = this.getWidth();
        int height = this.getHeight();
        
        g.setColor(Color.WHITE);
        g.fillRoundRect(0, 0, width, height, 50, 50);
        
        g.setColor(Color.BLACK);
        g.drawRoundRect(0, 0, width - 1, height - 1, 50, 50);
        switch(this.getCurrentValue()){
            case 1:
                this.drawPip(g, width/2, height/2);
                
                break;
            case 3:
                this.drawPip(g, width/2, height/2);
            case 2:
                this.drawPip(g, width/4, height/4);
                this.drawPip(g, 3+width/4, 3*height/4);
                break;
            case 5:
                this.drawPip(g, width/2, height/2);
            case 4:
                this.drawPip(g, width/4, height/4);
                this.drawPip(g, 3*width/4, 3*height/4);
                this.drawPip(g, 3*width/4, height/4);
                this.drawPip(g, width/4, 3*height/4);
                break;
            case 6:
                this.drawPip(g, width/4, height/4);
                this.drawPip(g, 3*width/4, 3*height/4);
                this.drawPip(g, 3*width/4, height/4);
                this.drawPip(g, width/4, 3*height/4);
                this.drawPip(g, width/4, height/2);
                this.drawPip(g, 3*width/4, height/2);
        }
    }
        
        private void drawPip(Graphics g, int x, int y){
            g.fillOval(x - PIP_DIAM,  y - PIP_DIAM, PIP_DIAM, PIP_DIAM);
        }
}   // Ending bracket of GUIDie class
