import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int n;
        n=sc.nextInt();
        int marks[]=new int[n];
       
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();

        }
        int totalmarks=0;
        
        for(int i=0;i<n;i++){
           totalmarks=marks[i]+totalmarks;
        }
        System.out.print("total marks=");

        System.out.println(totalmarks);

        float calavg=totalmarks/n;

        System.out.printf("avg marks of students=%f \n",calavg);
        if(calavg>89){
            System.out.println("O Grade");
        }
        if(calavg>79 && calavg<89){
            System.out.println("E Grade");
        }
        if(calavg>69 && calavg<79){
            System.out.println("A Grade");
        }
        if(calavg>59 && calavg<69){
            System.out.println("B Grade");
        }
        if(calavg>49 && calavg<59){
            System.out.println("C Grade");
        }
        if(calavg>39 && calavg<49){
            System.out.println("D Grade");
        }
        if(calavg>79 && calavg<89){
            System.out.println("Student is fail");
        }
    }
}
