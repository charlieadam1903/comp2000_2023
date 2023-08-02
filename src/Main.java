import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
       Main window = new Main();
    }
    class Canvas extends JPanel {  //jpanels an area on the screen you can draw into
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }
        // @Override
         public void paint (Graphics g) {
            Grid canvasGrid = new Grid (10, 710, 35);
            canvasGrid.buildGrid(g);
        //     for (int i = 10; i < 710; i += 35 ) {
        //         for (int j = 10; j < 710; j += 35) {
        //             g.setColor(Color.WHITE);
        //             g.fillRect(i, j, 35,35);
        //             g.setColor(Color.BLACK);
        //             g.drawRect(i, j, 35,35);
        //         }
                
        //     }
        
         }

    }

    class Cell {
       int cellX;
       int cellY;
       Color cellFill;
       Color cellLines;
       int cellSize;
      
       public Cell(int x, int y, Color fillColor, Color linesColor, int size) {
        this.cellX = x;
        this.cellY = y;
        this.cellFill = fillColor;
        this.cellLines = linesColor;
        this.cellSize = size;
       }
       public void paintCell(Graphics gr) {
        gr.setColor(cellFill);
        gr.fillRect(cellX,cellY, cellSize, cellSize);
        gr.setColor(cellLines);
        gr.drawRect(cellX, cellY, cellSize, cellSize);


      }


    }

    class Grid {
        int lowerLimit;
        int upperLimit;
        int increment;
        
        

        public Grid (int lower, int upper, int incr) {
            this.lowerLimit = lower;
            this.upperLimit = upper;
            this.increment = incr;
           

        }
        public void buildGrid(Graphics gr)  {
            
            
            for(int i = lowerLimit; i < upperLimit; i += increment) {
                for (int j = lowerLimit; j < upperLimit; j += increment) {
                    Cell gridCells = new Cell(i, j, Color.WHITE, Color.BLACK, increment);
                    gridCells.paintCell(gr);

                }

            }

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

