import javax.swing.*;
import java.awt.*;

public class Grid {
    
        int lowerLimit;
        int upperLimit;
        int increment;
        
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
             return;
        
        
           }
        
        
         }

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
            return;

        }
    }

