class Deposit {
    private long principal;
    private int Time;
    private double rate;
    private double totalAmt;

    // Constructor1
    Deposit() {
        this.principal=0;
        this.Time=0;
        this.rate=0.0;
        this.totalAmt=0.0;
    }

    // Constructor2
    Deposit(long p, int t, double r) {
        this.principal = p;
        this.Time = t;
        this.rate = r;
        this.totalAmt = 0.0;
    }

    // Constructor3
    Deposit(long p, int t) {
        this.principal = p;
        this.Time = t;
        this.rate = 0.0;
        this.totalAmt = 0.0;
    }

    // Constructor4
    Deposit(long p, double r) {
        this.principal = p;
        this.Time = 0;
        this.rate = r;
        this.totalAmt = 0.0;
    }

    // method to calculate total amount
    public void calcAmt() {
        this.totalAmt = this.principal + (this.principal * this.rate * this.Time) / 100;
    }

    // method to display instance variables
    public void display() {
        System.out.println("Principal: " + this.principal);
        System.out.println("Time: " + this.Time);
        System.out.println("Rate: " + this.rate);
        System.out.println("Total Amount: " + this.totalAmt);
    }
}


public class Q3 {
    public static void main(String[] args) {
        // create an instance of Deposit using Constructor2
        Deposit deposit = new Deposit(10000, 5, 8.5);
        deposit.calcAmt();
        deposit.display();
 
        // create an instance of Deposit using Constructor3
        Deposit deposit2 = new Deposit(20000, 3);
        deposit2.calcAmt();
        deposit2.display();
 
        // create an instance of Deposit using Constructor4
        Deposit deposit3 = new Deposit(30000, 9.0);
        deposit3.calcAmt();
        deposit3.display();
    }
}
