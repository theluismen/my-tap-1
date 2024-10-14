import exceptions.NoRetrieve;

public class InvestFund extends Account {
    /* ATRIBUTOS */

    /* MÉTODOS */
    // Constructor
    public InvestFund ( Customer c, int balance ) {
        this.setOwner( c );
        this.setBalance( balance );
        this.setInterest( 0.34 );
        this.setComission( 10 );
    }
    // Métodos Varios

    public void withdrawMoney( int m ) throws NoRetrieve {
        throw new NoRetrieve("No Withdrawal from IF allowed !");
    }
}