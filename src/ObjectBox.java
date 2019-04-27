import java.util.*;



public class ObjectBox {
    Collection collection = new ArrayList();
    boolean result = false;

    public ObjectBox(Object collection) {

    }

    public Object addOject(Object addObject){
            result = collection.add(addObject);
            return result;
    }

    public Object deleteObject(Object deleteObject){
            result  = collection.remove(deleteObject);
            return result;
    }

    public void dump(){
        System.out.println("Содержимое коллекции " + collection.toString());

    }
}
