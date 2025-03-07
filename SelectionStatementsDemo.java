public class SelectionStatementsDemo {
    public static void main(String[] args) {
int studentScore = 82;
if (studentScore >= 60) {
   System.out.println("You passed the exam!");
if (studentScore >= 90) {
   System.out.println("Excellent performance!");
} else {
   System.out.println("Keep improving!");
}
if (studentScore >= 60) {
   if (studentScore >= 90) {
      System.out.println("Grade: A");
   } else {
      if (studentScore >= 75) {
            System.out.println("Grade: B");
      } else {
            System.out.println("Grade: C");
      }
   }
} else {
   System.out.println("Grade: F");
}

}
    }
}