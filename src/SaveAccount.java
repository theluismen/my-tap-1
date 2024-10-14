public class SaveAccount extends Account {
    /* ATRIBUTOS */

    /* MÉTODOS */
    // Constructor
    public SaveAccount ( Customer c, int balance ) {
        this.setOwner( c );
        this.setBalance( balance );
        this.setInterest( 0.2 );
        this.setComission( 10 );
    }
    // Métodos Varios
}