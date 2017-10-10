package hu.torpedo.mark;

import java.awt.*;

public class Grid extends Canvas
{
    int row, column, height, width;

    public Grid(int row, int column, int height, int width) {
        this.row = row;
        this.column = column;
        setSize(this.width = width, this.height = height);
    }
    public void paint(Graphics g){
        int k;
        width =getSize().width;
        height = getSize().height;
    }
}