package com.example.homework;

public class CreditCards {

    int accountNumber;// номер счёта
    int currentAmount;// сумма на счёте
    int generalAmount;// итоговая сумма на счёте

    void creditingToTheAccount(int accrualAmount){// начисление на счёт
        generalAmount = currentAmount + accrualAmount;
    }

    void withdrawFromTheAccount(int withdrawalAmount){// снять со счёта
        if (withdrawalAmount > currentAmount)
            System.out.println("Недостаточно средств на счёте "+ accountNumber +"!" + "\nДля снятия доступно " + currentAmount + "\n");
            generalAmount = currentAmount;
        if (withdrawalAmount <= currentAmount)
            generalAmount = currentAmount - withdrawalAmount;

    }

    void accountInformation(){
        System.out.println("Номер Вашего счёта: " + accountNumber + "\n" + "Сумма на счёте: " + generalAmount + "\n");
    }

    CreditCards(int accountNumber, int currentAmount){
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public static void main(String[] args) {
        CreditCards cardOne = new CreditCards(112345, 10);
        CreditCards cardTwo = new CreditCards(123934, 20);
        CreditCards cardThree = new CreditCards(412141, 30);

        cardOne.creditingToTheAccount(100);
        cardTwo.creditingToTheAccount(500);
        cardThree.withdrawFromTheAccount(30);

        cardOne.accountInformation();
        cardTwo.accountInformation();
        cardThree.accountInformation();
    }
}
