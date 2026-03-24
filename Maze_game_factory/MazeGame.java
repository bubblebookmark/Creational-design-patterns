public class MazeGame {
    public static void main(String[] args) {
        new MazeGame().createMaze();
    }
    protected Maze createMaze() {
        return null;
    }
    protected Maze makeMaze(){
        return new Maze();
    }
    protected Maze makeRoom(int n){
        return new room(n);
    }
    protected Maze makeWall () { return new Wall () ; }
    
    protected Maze makeDoorWall ( Room r1 , Room r2 ) {
        return new DoorWall ( r1 , r2 ) ;
    }
}
