import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts = new ArrayList<>();

    public void printAll() {
        for (int i = 0; i < accounts.size(); ++i) {
            Account a = accounts.get(i);
            System.out.println("konto: " + a.getName() + " | saldo: " + a.getBalance());
        }
    }

    public void createAccount(String name, int balance) {
        Account account = new Account(name, balance);
        accounts.add(account);
    }
}
