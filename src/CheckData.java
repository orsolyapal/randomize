public class CheckData {
    public static void main(String[] args) throws Exception {
        GenData generator = new GenData();

        System.out.println("Double: " + generator.genDouble());
        System.out.println("Integer: " + generator.genInt());
        System.out.println("LowerSpell: " + generator.genLowerSpell());
        System.out.println("UpperSpell: " + generator.genUpperSpell());
        System.out.println("Spell: " + generator.genSpell());

        System.out.println("Integers: " + generator.genIntVector(10));
        System.out.println("Doubles: " + generator.genDoubleVector(4));
        System.out.println("Integers [-23, 25]:" + generator.genIntVector(10, -23, 25));
        System.out.println("Distinct Integers [-23, 25]:" + generator.genDistinctInt(10, 0, 9));
        //generator.printUnicodeCharacters();
    }
}
