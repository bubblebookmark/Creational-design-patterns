public class MazeFactory {
public Maze makeMaze () { return new Maze () ; }

 public Maze makeRoom ( int n ) { return new Room ( n ) ; }

 //public Maze makeWall () { return new Wall () ; } 

 //public Maze makeDoorWall ( Room r1 , Room r2 ) {return new DoorWall ( r1 , r2 ) ;}
}
