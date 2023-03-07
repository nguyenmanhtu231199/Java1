package Buoi4.OPP.ex6;

public class account {
    private int id;
    private String name;
    private int balance = 0;

    private account( int id, String name){
        this.id=id;
        this.name=name;
    }
    private account( int id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit( int amount ){
    return  balance += amount;
         // balance = balance+ amount;
        // return balance;
    }
    public  int debit(int amount){
        if(amount<= balance){
            balance = balance-amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return  balance;
    }
    public  int trasferTo(account another, int amount){
        // A- balance: 100$, B- balance: 80$
        // A--> B :30$
        // A-30$ , B+30$
        if(this.balance<amount){
            System.out.println("Amount exceeded balance");
        }
        else {
            this.balance= this.balance +amount;
            another.balance= this.balance -amount;
        }
        return this.balance;
    }

    @Override
    public String toString() {
        return "account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
