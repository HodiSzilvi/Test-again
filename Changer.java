/**
 * Created by Home on 2016.11.20..
 */
import java.util.*;

public class Changer extends Node{
    List<Node> from;
    Node[] to = new Node[2];
    enum chooseTo { FIRST, SECOND };
    Package p;

    Changer(){ //Konstruktor, minden bele  ---> nem kell végül!

    }

    public boolean fallenItem(Package p){
        //Az ide esett csomagot fogadjuk
        return false;
    }

    public int move(){
        //Elküldjük a kiválasztott irányba
        return 0;
    }
    
    public int gitHubChange(){
        System.out.println("Ez változott, so much happines");
        return 13;
    }
    
    public string test2(){
        return "Hello from the otherside!";
    }
}
