import java.util.Scanner;

class notHexadecimalException extends Exception {

    notHexadecimalException(String message) {
        System.out.println(message);
    }
}

class HexadecimalCheck {
    String number;

    HexadecimalCheck(String number) {
        this.number = number;
    }

    void numberCheck() throws notHexadecimalException {

        int flag = 0;

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == '1' || number.charAt(i) == '2' || number.charAt(i) == '3' || number.charAt(i) == '4'
                    || number.charAt(i) == '5' || number.charAt(i) == '6' || number.charAt(i) == '7'
                    || number.charAt(i) == '8' || number.charAt(i) == '9' || number.charAt(i) == 'A'
                    || number.charAt(i) == 'B' || number.charAt(i) == 'C' || number.charAt(i) == 'D'
                    || number.charAt(i) == 'E' || number.charAt(i) == 'F') {
                flag = 0;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Given string is a hexadecimal number.");
        } else {
            throw new notHexadecimalException("Given string is not a hexadecimal number.");
        }

    }
}

public class lab_5_2_Exception {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hexadecimal number : ");
        String num = sc.nextLine().toUpperCase();

        HexadecimalCheck h1 = new HexadecimalCheck(num);
        try {
            h1.numberCheck();
        } catch (Exception e) {
            System.out.println("Enter correct hexadecimal number !");
        }
    }
}