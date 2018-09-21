package Latihan1;
class Pertama
{
    private int a = 10;
    
    protected void terprotek ()
    {
        System.out.println("Alfina Hidayati / X RPL 6 / 06");
        System.out.println("ethod ini hanya untuk anaknya");
    }
    
    public void info ()
    {
        System.out.println("a = "+a);
        System.out.println("Dipanggil pada = "+this.getClass().getName());
    }
}
