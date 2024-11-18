public class MultiplicationTableBuilder {

    public static void main(String[] args) {
        MultiplicationTableBuilder builder = new MultiplicationTableBuilder();
        int start = 2;
        int end = 4;
        String multiplicationTable = builder.build(start, end);
        System.out.println(multiplicationTable);
    }


    public String build(int start, int end) {
        boolean comparison=ComparisonOfInitialNumbers(start,end);
        boolean Digital=DigitalRangeDetection(start,end);
        boolean pre=PrerequisiteJudgment(comparison,Digital);
        return CalculateTheOutputMultiplicationLine(start,end,pre);
    }
    public boolean ComparisonOfInitialNumbers(int start,int end){
        boolean isTrueInitialComparison=false;
        if(start<=end){
            isTrueInitialComparison=true;
            return isTrueInitialComparison;
        }
        return isTrueInitialComparison;
    }
    public boolean DigitalRangeDetection(int start,int end){
        boolean isTrueRange=false;
        if(start<=1000&&start>=1){
            if(end<=1000&&end>=1){
                isTrueRange=true;
                return isTrueRange;
            }
            else {
                return isTrueRange;
            }
        }
        return isTrueRange;
    }
    public boolean PrerequisiteJudgment(boolean isTrueInitialComparison,boolean DigitalRangeDetection){
        boolean prerequisite=false;
        prerequisite=isTrueInitialComparison&DigitalRangeDetection;
        return prerequisite;
    }
    public String CalculateTheOutputMultiplicationLine(int start,int end,boolean prerequisite) {
        StringBuilder sb;
        if (!prerequisite) {
            return null;
        } else {
            sb = new StringBuilder();
            for (int i = start; i <= end; i++) {
                for (int j = start; j <= i; j++) {
                    int s = j * i;
                    sb.append(j).append("*").append(i).append("=").append(s);
                    if(i!=j){
                        sb.append(" ");
                    }
                }
                sb.append("\n");
            }

        }
        return sb.toString();
    }


}