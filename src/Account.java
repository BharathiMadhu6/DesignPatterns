public class Account {
    private float balance;

    public void setBalance(float balance) {
        if(balance > 0) {
            this.balance = balance;
        }
    }

    public float getBalance() {
        return this.balance;
    }

    public void deposit(float amount) {
        if(amount > 0) {
            this.balance += amount;
        }
    }

    public void withdraw(float amount) {
        if(amount > 0 && amount < 10000) {
            this.balance -= amount;
        }
    }
}
