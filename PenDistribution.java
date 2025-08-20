public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int students = 3;

        int pensPerStudent = totalPens / students; // Quantity each student gets
        int remainingPens = totalPens % students;  // Non-distributed pens

        System.out.println("The Pen Per Student is " + pensPerStudent +
                           " and the remaining pen not distributed is " + remainingPens);
    }
}
