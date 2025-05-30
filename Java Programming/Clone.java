import java.util.zip.DeflaterOutputStream;

class Demo implements Cloneable 
{
    public int no;
    public String str;

    public void fun()
    {
        System.out.println("Inside fun ");
    }

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
class Clone
{
    public static void main(String a[]) throws Exception
    {
        Demo dobj = new Demo();

        Demo dobj1 = (Demo)dobj.clone();
        
    }
}