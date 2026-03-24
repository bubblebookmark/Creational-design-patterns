import java.util.HashMap;
import java.util.Map;

public class room {
    private int roomno;
    private Map <Direction, Wall> sides = new HashMap<Direction, Wall>();

    public Wall getside(Direction direction){
        return sides.get(direction);
    }
    public Wall setside(Direction direction, Wall wall){
        return sides.put(direction, wall);
    }
    public void enter(){
        
    }
    public room(int n){
        this.roomno = n;
    }

    public int getRoomno() {
        return roomno;
    }
    
}
