import java.util.*;

public class week6_lab3 {

    public static class GradeItem {
        private final String assignmentName;
        private final double earnedPoints, possiblePoints;
        public GradeItem(String assignmentName, double earnedPoints, double possiblePoints) {
            this.assignmentName = assignmentName;
            this.earnedPoints = earnedPoints;
            this.possiblePoints = possiblePoints;
        }
        public double getEarned() {
            return earnedPoints;
        }
        public double getTotal() {
            return possiblePoints;
        }
        public double calcPercent() {
            return earnedPoints/possiblePoints * 100;
        }
        @Override public String toString() {
            return assignmentName + ": " + String.format("%.0f", earnedPoints) + "/" + String.format("%.0f", possiblePoints) + " (" + String.format("%.2f", calcPercent()) + "%)\n";
        }
    }

    public static void main(String[] args) {
        double totalEarned = 0, totalPossible = 0;
        ArrayList<GradeItem> list = new ArrayList<>();

        list.add(new GradeItem("Assignment 1", 9, 10));
        list.add(new GradeItem("Assignment 2", 6, 10));
        list.add(new GradeItem("Test 1", 78, 100));
        list.add(new GradeItem("Test 2", 67, 100));
        list.add(new GradeItem("Test 3", 86, 100));

        for (GradeItem elem : list) {
            System.out.print(elem.toString());
            totalEarned += elem.getEarned();
            totalPossible += elem.getTotal();
        }
        System.out.println("Final Grade: " + String.format("%.2f", totalEarned/totalPossible * 100) + "%\n");
    }

}