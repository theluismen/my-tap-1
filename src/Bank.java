import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bank {
    /* ATRIBUTOS */
    List<Account>  accounts;
    List<Customer> customers;

    /* METODOS */
    // Constructor
    public Bank () {
        this.accounts  = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Métodos varios
    public void addCustomer( Customer customer ) {
        this.customers.add( customer );
    }

    public void addAccount( Account account ) {
        this.accounts.add( account );
    }

    public Account getAccountByOwner( Customer owner ) {
        return this.accounts.stream().filter(
                account -> account.getOwner().equals(owner) )
                .collect(Collectors.toList()).get(0);
    }

    public void monthlyReview () {
        for (Account account : this.accounts) {
            account.monthlyReview();
        }
    }

    public void showAccounts() {
        for (Account account : this.accounts) {
            System.out.println(account.toString());
        }
    }
}
