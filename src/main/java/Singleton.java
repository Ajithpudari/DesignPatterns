
import java.io.FileInputStream;
        import java.io.FileOutputStream;
        import java.io.ObjectInput;
        import java.io.ObjectInputStream;
        import java.io.ObjectOutput;
        import java.io.ObjectOutputStream;
        import java.io.Serializable;

class Single implements Serializable
{
    // public instance initialized when loading the class
    public static Single instance = new Single();

    private Single()
    {
        // private constructor
    }
}


public class Singleton
{

    public static void main(String[] args)
    {
        try
        {
            Single instance1 = Single.instance;
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserialize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
