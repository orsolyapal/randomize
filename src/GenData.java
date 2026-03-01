import java.util.Random;
import java.util.Vector;
public class GenData {
    private Random rand;

    public GenData(){
        rand = new Random();
    }

    public int genInt(){
        int rndNumber = rand.nextInt();
        return rndNumber;
    }

    public double genDouble(){
        double rndNumber = rand.nextDouble();
        return rndNumber;
    }

    public char genUpperSpell(){
        int rndAscii = rand.nextInt(26) + 65;
        return (char) rndAscii;
    }

    public char genLowerSpell(){
        int rndAscii = rand.nextInt(26) + 97;
        return (char) rndAscii;
    }

    public char genSpell(){
        int rndAscii = rand.nextInt(52) + 65;
        if (rndAscii > 90) {
            rndAscii += 6;
        }
        return (char) rndAscii;
    }

    public void printUnicodeCharacters(){
        for(int i = 28; i < Math.pow(2,8); i++)
        System.out.print("[" + i + ": " + (char) i + "]");
    }

    public Vector<Integer> genIntVector(){
        Vector<Integer> numbers = new Vector<>();
        for(int i = 0; i < 100; i++){
            numbers.add(rand.nextInt());
        }
        return numbers;
    }

    public Vector<Integer> genIntVector(int size){
        Vector<Integer> numbers = new Vector<>();
        for(int i = 0; i < size; i++){
            numbers.add(rand.nextInt());
        }
        return numbers;
    }

    public Vector<Integer> genIntVector(int size, int from, int to){
        Vector<Integer> numbers = new Vector<>();
        if (from < to) {
            for(int i = 0; i < size; i++){
                numbers.add(rand.nextInt(to-from) + from);
            }
        } else if (to < from){
            for(int i = 0; i < size; i++){
                numbers.add(rand.nextInt(from-to) + to);
            }
        } else {
           for(int i = 0; i < size; i++){
                numbers.add(from);
            } 
        }
        return numbers;
    }

    public Vector<Integer> genDistinctInt(int size, int from, int to){
        Vector<Integer> numbers = new Vector<>();
        int rndNumber;
        int scale = Math.abs(to-from);
        size = scale < size ? scale : size;
        int min = from < to ? from : to;
        for(int i = 0; i < size; i++){
            do {
                rndNumber = rand.nextInt(scale) + min;
            } while (numbers.contains(rndNumber));
            numbers.add(rndNumber);
        }       
        return numbers;
    }

    public Vector<Double> genDoubleVector(){
        Vector<Double> rndNumbers = new Vector<>();
        for(int i = 0; i < 100; i++){
            rndNumbers.add(rand.nextDouble());
        }
        return rndNumbers;
    }

    public Vector<Double> genDoubleVector(int size){
        Vector<Double> rndNumbers = new Vector<>();
        for(int i = 0; i < size; i++){
            rndNumbers.add(rand.nextDouble());
        }
        return rndNumbers;
    }

     public Vector<Double> genDoubleVector(int size, double from, double to){
        Vector<Double> rndNumbers = new Vector<>();
        if (from < to) {
            for(int i = 0; i < size; i++){
                rndNumbers.add(rand.nextDouble(to-from) + from);
            }
        } else if (to < from){
            for(int i = 0; i < size; i++){
                rndNumbers.add(rand.nextDouble(from-to) + to);
            }
        } else {
           for(int i = 0; i < size; i++){
                rndNumbers.add(from);
            } 
        }
        return rndNumbers;
    }
}
