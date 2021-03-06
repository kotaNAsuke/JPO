public class Punkt {
    //VARIABLES
    private int masa;
    //CONSTRUCTORS
    public Punkt()
    {
        this.masa=1;
    }
    public Punkt(int masa)
    {
        setMasa(masa);
    }
    //METHODS
    public double momBez()
    {
        int i = 0;
        return i;

    }
    public double momBezSt(int x)
    {
        return  this.momBez() + this.getMasa()*x*x;

    }
    public void opis()
    {
        System.out.println("Punkt Materialny");
        System.out.println("masa: " + this.getMasa());
    }

    //ACCESSORS
    public void setMasa(int masa)
    {
        if(masa >0)
        {
            this.masa = masa;
            return;
        }
        else
        {
            System.out.println("Podana bledna mase, ustawiono domyslna wartosc 1 ");
            this.masa = 1;
        }
    }
    public int getMasa()
    {
        return this.masa;
    }
}
