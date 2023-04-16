package Others;

import java.awt.event.MouseEvent;
import java.lang.reflect.Array;

public class Backyard {
    private int[] rows;
    private int[] columns;

    public Backyard(){
        setRowsCoordinates();
        setColumnsCoordinates();
    }

    private void setRowsCoordinates(){
        rows = new int[5];
        for(int i = 0; i < 5; i++){
            rows[i] = 130 + i*100;
        }
    }

    private void setColumnsCoordinates(){
        columns = new int[10];
        for(int i = 0; i < 10; i++){
            columns[i] = 210 + i*80;
        }        
    }

    public int[] getRows(){
        return rows;
    }

    public int[] getColumns(){
        return columns;
    }   

    public int[] qualifiedPosition(MouseEvent e){
        int[] a = {0,0,0};
        for(int i = 0; i < 5;i++){
            for(int j = 1;j < 10;j++){
                if (((e.getX() - columns[j])*(e.getX() - columns[j])/(40*40) + (e.getY() - rows[i])*(e.getY() - rows[i])/(50*50)) <= 1){
                    a[1] = rows[i];
                    a[0] = columns[j];
                    a[2] = 1;
                    return a;
                }  
            }   
        }
        return a;
    }

}
