public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);
        System.out.println(multiplicationTable);
    }

    public String build(int start, int end) {
        return "";
    }
    public boolean ComparisonOfInitialNumbers(int start,int end){
        boolean isTrueInitialComparison=false;
        if(start<=end){
            isTrueInitialComparison=true;
            return isTrueInitialComparison;
        }
        return isTrueInitialComparison;
    }

}