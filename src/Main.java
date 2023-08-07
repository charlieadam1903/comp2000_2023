import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    //public int cellHeightPx;
   // public int gridSizeCells;
    public static void main(String[] args) throws Exception {
       Main window = new Main();
       return;
    }
    class Canvas extends JPanel {  //jpanels an area on the screen you can draw into
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }
        @Override //override calls compiling, also sends up an error and preventing others from modifying crucial bits
         public void paint ( Graphics g) {
            Grid canvasGrid = new Grid (10, 710, 35);
            canvasGrid.buildGrid(g);
            for (int i = 10; i < 710; i += 35 ) {
                for (int j = 10; j < 710; j += 35) {
                    g.setColor(Color.WHITE);
                    g.fillRect(i, j, 35,35);
                    g.setColor(Color.BLACK);
                    g.drawRect(i, j, 35,35);
                }
                
            }
        return;
         }

    }
   

    
   
    private Main() {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack(); //forces the size of the frame to blow up to preferred size
        this.setVisible(true);
        

    }

    
    
}

    
      


