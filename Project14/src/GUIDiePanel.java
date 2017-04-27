import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;

public class GUIDiePanel extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    private GUIDie leftDie;
    private GUIDie rightDie;
    private JButton rollButton;
    
    public GUIDiePanel(){
        this.leftDie = new GUIDie();
        this.rightDie = new GUIDie();
        this.rollButton = new JButton("Roll Them!");
        this.rollButton.addActionListener(this);
        
        this.setBackground(Color.BLUE);
        this.setLayout(new BorderLayout());
        this.add(this.leftDie, BorderLayout.WEST);
        this.add(this.rightDie, BorderLayout.EAST);
        this.add(this.rollButton, BorderLayout.SOUTH);
    }
    
    public void actionPerformed(ActionEvent e){
        this.leftDie.roll();
        this.rightDie.roll();
    }

}
