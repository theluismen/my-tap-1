import java.util.*;
import java.util.stream.Collectors;

public class Bank {
    /* ATRIBUTOS */
    Dictionary<Integer, Account> accounts;
    List<Customer> customers;

    /* METODOS */
    // Constructor
    public Bank () {
        this.accounts  = new Hashtable<>();
        this.customers = new ArrayList<>();
    }

    // Métodos varios
    public void addCustomer( Customer customer ) {
        this.customers.add( customer );
    }

    public void addAccount( Account account ) {
        this.accounts.put( account.getOwner().getId(), account );
    }

    public Account getAccountByOwner( Customer owner ) {
        return Collections.list(this.accounts.elements()).stream().filter(
                account -> account.getOwner().equals(owner) )
                .collect(Collectors.toList()).get(0);
    }

    public Account getAccountById( int id ) {
        return this.accounts.get( id );
    }

    public void monthlyReview () {
        for ( Account account : Collections.list(accounts.elements()) ) {
            account.monthlyReview();
        }
    }

    public void lottery () {
        int n = this.accounts.size();
        this.accounts.get( (new Random()).nextInt(n) + 1 ).depositMoney( 300 );
    }

    public void showAccounts() {
        for ( Account account : Collections.list(accounts.elements()) ) {
            System.out.println(account.toString());
        }
    }
}
