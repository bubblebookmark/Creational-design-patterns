public class MagicMazeFactory extends MazeFactory{
    @SuppressWarnings("unused")
    private String pickSpell(){
        return "nuw spell found";
    }
    public Maze makeRoom(int n){
        return new Room(n);
    }
    public Maze makeDoorWall(Room r1, Room r2){
        return new MagicDoorWall(r1,r2);
    }

}
