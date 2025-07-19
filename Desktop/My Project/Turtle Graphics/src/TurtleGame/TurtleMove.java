package TurtleGame;

public class TurtleMove {
    private final int[][] turtleMove = new int[20][20];
    int row = 0;
    final static int shapesMoves = 10;
    final static int moveRightAndLeft = 1;
    int column = 0;
    public void penUp(){
        turtleMove[row][column] = 0;
    }
    public int[] checkPosition(){
        return new int[]{row, column};
    }
    public void penDown(){
        turtleMove[row][column] = 1;
    }
    public void moveRight(){
        if(column >= turtleMove[0].length){
            moveRow();
            column = 0;
        }else column += moveRightAndLeft;
    }

    private void moveRow() {
        row += moveRightAndLeft;
    }
    public int checkForShapes(){
        int shapes = 0;
        for(int shape =0; shape < turtleMove.length; shape++){
            for(int innersquare = 0; innersquare < turtleMove[shape].length; innersquare++){
                if(turtleMove[shape][innersquare] == 0){
                    shapes += 1;
                }
            }
        }
        return shapes;

    }
    public void moveLeft(){
        if(column > 0){
            column -= moveRightAndLeft;
        }
    }
    public void moveSpace(){
         if(column >= shapesMoves){
             moveRow();
             column = shapesMoves;

         }else column += shapesMoves;
    }
    public void displayShapesMoveWhenPenIsDown(){
        for (int i = 0; i < turtleMove.length; i++) {
            for (int j = 0; j < turtleMove[i].length; j++) {
                if (turtleMove[i][j] == 1) {
                    System.out.print("*" + "\t");
                } else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
