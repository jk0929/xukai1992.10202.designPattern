package creationPattern.prototypePatten;

import java.io.IOException;

public class PrototypeTest {
    public static void main(String[] args) throws
            CloneNotSupportedException, IOException, ClassNotFoundException {
        Prototype pt1 = new Prototype();
        SerializableObject serId = new SerializableObject();
        pt1.setString("abc");
        pt1.setObj(serId);
        Prototype pt2 = (Prototype) pt1.deepClone();

        System.out.println("pt1:  "+pt1.getString()+"-----"+pt1.getObj().toString());
        System.out.println("pt2:  "+ pt2.getString()+"-----"+pt2.getObj().toString());

        serId = new SerializableObject();
        pt1.setObj(serId);

        System.out.println("");
        System.out.println("pt1:  "+pt1.getString()+"-----"+pt1.getObj().toString());
        System.out.println("pt2:  "+ pt2.getString()+"-----"+pt2.getObj().toString());
    }
}
