
public class MagicRoom extends Room {
    public String spell;

    public MagicRoom(int roomNo) {
        super(roomNo);
    }

    public Room MagicRoom(int n, String pickSpell) {
        return new Room(n);
    }

    

}
