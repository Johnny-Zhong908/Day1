public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int StartNumber = 2;
        int EndNumber = 4;
        String multiplicationTable = builder.GenerateMultiplicationTable(StartNumber, EndNumber);

        System.out.println(multiplicationTable);
    }

    public String GenerateMultiplicationTable(int start, int end) {
        return "";
    }




}