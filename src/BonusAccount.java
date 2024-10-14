public class BonusAccount extends Account {
    /* ATRIBUTOS */

    /* MÉTODOS */
    // Constructor
    public BonusAccount ( Customer c, int balance ) {
        this.setOwner( c );
        this.setBalance( balance );
        this.setInterest( 0.6 );
        this.setComission( 10 );
    }
    // Métodos Varios
}