package Sep12;
import java.util.Scanner;

public class ChanllengingConditionalStatementsInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please set a 4 digit PIN: ");
        String PIN = sc.nextLine();
        while (true) {
            if (PIN.length() != 4) {
                System.out.print("Your PIN has to be 4 digit: ");
                PIN = sc.nextLine();
            } else {
                break;
            }
        }

        System.out.print("Please enter the PIN to login: ");
        String inputPIN = sc.nextLine();
        for (byte i = 0; i < 2; i++) {
            if (!inputPIN.equals(PIN)) {
                System.out.print("PIN is not correct, try again: ");
                inputPIN = sc.nextLine();
                if (i == 1) {
                    System.out.println("Account Locked!");
                    System.exit(0);
                }
            } else {
                System.out.println("Login Success!");
                break;
            }
        }

        float balance = 0;
        String balance_input;
        float balanceChange;
        while (true) {
            System.out.println("------------ATM Menu-----------");
            System.out.println("Choose Your Action: ");
            System.out.println("1 -> Check Balance");
            System.out.println("2 -> Deposit Funds");
            System.out.println("3 -> Withdraw Funds");
            System.out.println("4 -> Exit program");

            String action = sc.nextLine().trim();

            switch (action) {
                case "1":
                    System.out.printf("You have $%.2f in your account.%n", balance);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    break;
                case "2":
                    System.out.print("How much you want to deposit: ");
                    balance_input = sc.nextLine();
                    while (true) {
                        try {
                            balanceChange = Float.parseFloat(balance_input);
                            if (balanceChange >= 0) {
                                balance += balanceChange;
                                System.out.printf("Success, You have $%.2f in your account.%n", balance);
                                break;
                            } else {
                                System.out.println("You have to put an number");
                                balance_input = sc.nextLine();
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("You have to put an number");
                            balance_input = sc.nextLine();
                        }
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    break;
                case "3":
                    System.out.print("How much you want to withdraw: ");
                    balance_input = sc.nextLine();

                    while (true) {
                        try {
                            balanceChange = Float.parseFloat(balance_input);
                            if (balanceChange >= 0 && (balance - balanceChange) >= 0) {
                                balance -= balanceChange;
                                System.out.printf("Success, You have $%.2f in your account.%n", balance);
                                break;
                            } else {
                                System.out.println("You have to put an positive number or insufficient funds");
                                balance_input = sc.nextLine();
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("You have to put an number");
                            balance_input = sc.nextLine();
                        }
                    }
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    break;
                case "4":
                    System.out.println("You chose to exit, Bye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid action, please try again.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                    }
                    break;
            }
        }
    }
}