import java.util.HashMap;
import java.util.Map;

public class Maze {
    private Map <Integer,room > rooms = new HashMap<Integer,room>();
    public Maze(){

    }
    public void addRoom(room r1){
        rooms.put(r1.getRoomno(),r1);
    }
    public room roomNo(int r){
        return rooms.get(r);
    }
    
}
