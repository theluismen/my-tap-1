import exceptions.NoRetrieve;

public abstract class Account {
    /* ATRIBUTOS */
    private Customer owner;
    private double      balance;
    private double      interest;
    private double      comission;

    /* MÉTODOS */
    // Getters
    public Customer getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getInterest() {
        return this.interest;
    }

    public double getComission() {
        return this.comission;
    }

    // Setters
    public void setOwner( Customer owner ) {
        this.owner = owner;
    }

    public void setBalance( double balance ) {
        this.balance = balance;
    }

    public void setInterest( double interest ) {
        this.interest = interest;
    }

    public void setComission( double comission ) {
        this.comission = comission;
    }

    // Métodos Varios
    public void depositMoney ( int m ) {
        this.balance += m;
    }

    public void withdrawMoney ( int m ) throws NoRetrieve {
        if ( this.balance < m )
            throw new NoRetrieve("Not enough money to withdraw !");
        this.balance -= m;
    }

    public double checkBalance () {
        return this.balance;
    }

    public void changeOwner ( Customer c ) {
        this.owner = c;
    }

    public void monthlyReview () {
        this.balance = this.balance + this.balance * this.interest - this.comission;
    }

    // Métodos Auxiliares
    public String toString() {
        return "{"
                + "\"owner\": " + ( this.owner != null ? this.owner.toString() : "null") + ", "
                + "\"balance\": " + this.balance + ", "
                + "\"interest\": " + this.interest + ", "
                + "\"comission\": " + this.comission
                + "}";
    }
}
