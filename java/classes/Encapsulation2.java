public class Encapsulation2 {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.creditAmount(500);

        System.out.println(ba.checkBalance());

        ba.debitAmount(100);
       
        System.out.println(ba.checkBalance());

    }
}

class BankAccount {
    private float balance;

    void creditAmount(float amount){
        this.balance += amount;
        // this.balance = this.balance + amount;
    }

    void debitAmount(float amount){
        this.balance -= amount;
        // this.balance = this.balance - amount;
    }

    float checkBalance(){
        return this.balance;
    }
}