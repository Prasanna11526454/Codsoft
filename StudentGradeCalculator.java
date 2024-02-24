import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of subject in Exam : ");
        int n=sc.nextInt();
        int[] SubMarks=new int[n];
      for (int i=0;i<n;i++){
          System.out.println("Marks in Subject"+(i+1)+": ");
          SubMarks[i]=sc.nextInt();
      }
      int totalmarks=0;
      for(int marks:SubMarks){
          totalmarks+=marks;
      }

      double percentage= (double) totalmarks/n;
      String Grade;
      if(percentage>=90){
          Grade="A+";
        } else if (percentage>=80 && percentage<90) {
          Grade="A";
      } else if (percentage>=70&& percentage<80) {
          Grade="B+";
      } else if (percentage>=60 && percentage<70) {
          Grade="B";
      } else if (percentage>=50 && percentage<60) {
          Grade="C";
      } else if (percentage>=40 && percentage<50) {
          Grade="D";
      }else{
          Grade="F";
      }
      System.out.println("Result of User : ");
      System.out.println("Total Marks Obtained : "+totalmarks);
      System.out.println("Percentage Got :" +percentage);
      System.out.println("Grade : " +Grade);

    }
}
