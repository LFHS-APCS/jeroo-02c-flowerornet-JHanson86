/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    /** 
     * Is there a clear path to a net or flower two spaces away
     *     in the front of the Jeroo?
     *  No side effects and no errors.
     */
    public boolean isFlowerOrNetNearInFront() {
    if (isClear(AHEAD)){
        hop();
        if (isNet(AHEAD)){
          turn(LEFT);
          turn(LEFT);
          hop();
          turn(LEFT);
          turn(LEFT);
          return true;
        } else if(isFlower(AHEAD)){
          turn(LEFT);
          turn(LEFT);
          hop();
          turn(LEFT);
          turn(LEFT);
          return true;
        } else {
          turn(LEFT);
          turn(LEFT);
          hop();
          turn(LEFT);
          turn(LEFT);
          return false;
        }
    } else {
      return false;
    }
  }


    // Do NOT touch the code below here
    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}
}

