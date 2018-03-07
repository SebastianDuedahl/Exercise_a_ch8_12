package Chapter_8_a;

public class Exercise_12_a
{
    public static void main(String[] args)
    {
       Exercise_12_a Hanne = new Exercise_12_a("Hanne",500.5);
       Exercise_12_a Hans = new Exercise_12_a("Hans", 40);

        System.out.println(Hanne);
        System.out.println(Hans);

    }


        String name;
        double balance;
        double transactionFee;

    public void deposit(double amount)
    {

        balance = balance + amount;

    }
    //metode til at hæve penge, hvis der er nok penge på.
    public void withdraw(double amount)
    {
        if (balance - amount - transactionFee < 0)
        {
            System.out.println("Insufficient funds");

        } else
        {
            balance = balance - amount - transactionFee;

            System.out.println("your balance is:" + balance);
        }
    }
    //Contructor til customer
    public Exercise_12_a(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }
    // toString metoder til customer
    public String toString(){
        return name + ", " + balance;
    }
}