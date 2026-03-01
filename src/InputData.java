import java.util.Scanner;
public class InputData {

    public Scanner scan = new Scanner(System.in);

    public char getSpell(String inputText){
        String spells = scan.next(inputText);
        if (!spells.isEmpty()){
            return spells.charAt(0);
        }
        else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public char getUpperSpell(String inputText){
        String spells = scan.next(inputText);
        if (!spells.isEmpty()){
            return spells.toUpperCase(). charAt(0);
        }
        else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public char getLowerSpell(String inputText){
        String spells = scan.next(inputText);
        if (!spells.isEmpty()){
            return spells.toLowerCase().charAt(0);
        } else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public int getInt(String inputText){
        String number = scan.next();
        if (number.matches("0|-?[1-9][0-9]*")){
            return Integer.parseInt(number);
        } else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public int getPositive(String inputText){
        String number = scan.next();
        if (number.matches("0|[1-9][0-9]*")){
            return Integer.parseInt(number);
        } else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public int getNegative(String inputText){
        String number = scan.next();
        if (number.matches("0|-[1-9][0-9]*")){
            return Integer.parseInt(number);
        } else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }

    public double getDouble(String inputText){
        String number = scan.next();
        if (number.matches("0|0\\.0+|-?0.0*[1-9]+0*|[1-9][0-9]*(\\.[0-9]+)?")){
            return Double.parseDouble(number);
        } else {
            System.out.println("Adatbeviteli hiba!");
            return 0;
        }
    }
}

