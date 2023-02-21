class Gettersetter {
public double interestrate=0.0;
private double bal=0.0;


Gettersetter(double bal,double interestrate)
{
       
        this.bal=bal;
        this.interestrate=interestrate;

}
  double Interest()
{
   System.out.println("Balance Rs:"+bal);
   double rate=bal*interestrate;
   System.out.println("Interest amount = Rs:"+rate);
   return bal=bal+rate;

}

public static void main (String args [])
{

Gettersetter getset=new Gettersetter(12000,0.05);

System.out.println("Current total Balance Rs:"+getset.Interest());

}


}