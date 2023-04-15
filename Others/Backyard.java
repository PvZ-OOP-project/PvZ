package Others;

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
            rows[i] = 20 + i*100;
        }
    }

    private void setColumnsCoordinates(){
        columns = new int[10];
        for(int i = 0; i < 9; i++){
            rows[i] = 160 + i*80;
        }        
    }

    public void addZombies(){

    }

    public void addPlants(){

    }

}
