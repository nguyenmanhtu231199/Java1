package Buoi5.Interface1;

public interface IBank {
    int credit(int amount);
    int debit(int amount);
    int transferTo(Account account, int amount);

}
