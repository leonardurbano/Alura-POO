package entities;

public class Credit {
    private double balance;


    public Credit(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean debitValue(double value) {
        if(this.getBalance() >= value){
            this.balance -= value;
            return true;
        }
        return false;
    }

   public void extractValue(){
        System.out.printf("Saldo do cartão: R$ " + String.format("%.2f%n", this.getBalance()) + "****************************");
    }

}
