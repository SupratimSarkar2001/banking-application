package banking;

import java.sql.SQLException;

public interface bankManagementDao {
    boolean createAccount(String name, int passCode);
    boolean loginAccount(String name, int passCode);
    void getBalance(int acNo);
    boolean transferMoney(int sender_ac, int reveiver_ac, int amount) throws SQLException;

}
