class GarbageCollection{
    public GarbageCollection(){
        System.err.println("Object Created");
    }

    protected void finalize(){
        System.err.println("Object Deleted");
    }
}
public class Task8 {
    public static void main(String[] args) {
        GarbageCollection garbage1 = new GarbageCollection();
        garbage1 = null;
        
        GarbageCollection garbage2 = new GarbageCollection();
        GarbageCollection garbage3 = new GarbageCollection();
        garbage2 = garbage3;

        new GarbageCollection();
        System.gc();
    }
}
