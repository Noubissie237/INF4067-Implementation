package packages;

public final class Singleton {
    private static Singleton instance = null;
    private String attrib1;
    private int attrib2;

    private Singleton(){
        super();
    }

    public static Singleton getInstance()
    {
        if (instance == null)
            return new Singleton();
        return instance;
    }

    public void operation1(int x, int y, int z)
    {
        this.attrib2 = x+y+z;
        this.attrib1 = "OPERATION 1 (ADDITION) : "+x+" + "+y+" + "+z+" = "+this.attrib2;
        System.out.println(this.attrib1);
    }

    public void operation2(int x, int y, int z)
    {
        this.attrib2 = x-y-z;
        this.attrib1 = "OPERATION 2 (SOUSTRACTION) : "+x+" - "+y+" - "+z+" = "+this.attrib2;
        System.out.println(this.attrib1);
    }

    public void operation3(int x, int y, int z)
    {
        this.attrib2 = x*y*z;
        this.attrib1 = "OPERATION 3 (MULTIPLICATION) : "+x+" x "+y+" x "+z+" = "+this.attrib2;
        System.out.println(this.attrib1);
    }

}
