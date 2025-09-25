public class week6_lab3 {

    public class GradeItem {
        private final String name;
        private final double x, y;
        public GradeItem(String name, double x, double y) {
            this.name = name;
            this.x = x;
            this.y = y;
        }
        public double calcPercent() {
            return x/y;
        }
        public String naming() {
            return name;
        }
    }

    public static void main(String[] args) {
        
    }
}