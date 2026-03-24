public class MagicWall extends DoorWall{
    private String spell;
    public MagicWall(room r1, room r2,String spell){
        super(r1, r2);
        this.spell = spell;
    }
    
}
