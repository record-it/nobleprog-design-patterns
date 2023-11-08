package interpreter;

public class Context {
    private char[][] drawing;
    private char pen;
    private int x;
    private int y;
    public Context(int width, int height){
        drawing = new char[width][height];
    }

    public void setPen(char pen){
        this.pen = pen;
    }
    public void setAt(int x, int y){
        drawing[x][y] = pen;
    }

    public void draw(){
        for(var line: drawing){
            for(char item: line){
                System.out.print(item != 0 ? item : ' ');
            }
            System.out.println();
        }
    }
}
