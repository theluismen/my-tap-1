public class CheckingAccount extends Account {
    /* ATRIBUTOS */

    /* MÉTODOS */
    // Constructor
    public CheckingAccount ( Customer c, int balance ) {
        this.setOwner( c );
        this.setBalance( balance );
        this.setInterest( 0.1 );
        this.setComission( 0 );
    }
    // Métodos Varios
}
