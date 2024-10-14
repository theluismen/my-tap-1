import exceptions.NoRetrieve;

public class Main {
    public static void main( String[] args ) {
        Bank bank = new Bank();

        // Clientes
        Customer c1 = new Customer ( 1,"Luis","Calle","660" );
        Customer c2 = new Customer ( 2,"Fary","Banco","660" );
        Customer c3 = new Customer ( 3,"Pepe","Cajero","660" );

        // Añadir Clientes
        bank.addCustomer( c1 );
        bank.addCustomer( c2 );
        bank.addCustomer( c3 );

        // Añadir Cuentas
        bank.addAccount( new SaveAccount( c1, 10 ) );
        bank.addAccount( new InvestFund ( c2, 100) );
        bank.addAccount( new CheckingAccount( c3, 100) );

        // TEST: Retirar dinero si no tengo suficiente
        try {
            bank.getAccountByOwner(c1).withdrawMoney(15);
        } catch ( NoRetrieve ex ) {
            System.out.println( ex.getMessage() );
        }

        // TEST: Retirar dinero de una InvestFund
        try {
            bank.getAccountByOwner(c2).withdrawMoney(10);
        } catch ( NoRetrieve ex ) {
            System.out.println( ex.getMessage() );
        }

        // TEST: Montly Review
        System.out.println("=> Before Monthly Review...");
        bank.showAccounts();
        bank.monthlyReview();
        System.out.println("=> After Monthly Review...");
        bank.showAccounts();

        // TEST: Lottery
        System.out.println("=> Performing Lottery...");
        bank.lottery();
        System.out.println("=> After Lottery...");
        bank.showAccounts();
    }
}