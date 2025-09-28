import java.util.*;

public class week6_lab {
    public static class GradeItem {
        private final double score, total;
        public GradeItem(double score, double total) {
            this.score = score;
            this.total = total;
        }
        public double gradePercent() {
            return score/total;
        }
        @Override public String toString() {
            return "Earned " + score + "/" + total + " (" + gradePercent() * 100 + "%)";
        }
    }
    public static void main(String[] args) {
        ArrayList<GradeItem> list = new ArrayList<>();
        list.add(new GradeItem(9, 10));
        System.out.println(list.get(0));
    }
}