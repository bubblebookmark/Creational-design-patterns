
import java.util.HashMap;
import java.util.Map;

public class Room extends Maze{
    private Map<Direction, Wall> sides = new HashMap<>();
    private int roomNo;
    public Room(int roomNo){
        this.roomNo = roomNo;
    }
    public Wall getSide(Direction direction){
        return sides.get(direction);
    }
    public void setSide(Direction direction, Wall wall){
        sides.put(direction, wall);
    }
    public int getroomNo(){
        return roomNo;
    }

}
