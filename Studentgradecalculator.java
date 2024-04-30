import java.util.*;

public class Studentgradecalculator {
    // /**
    //  * @param args
    //  * @throws InterruptedException 
    //  */
    public static void main(String[] args) throws InterruptedException {
        int nofsubjects =0;
        int sumofmarks=0 ;
        int averagepercentage;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter total no of subjects");
        nofsubjects =scanner.nextInt();
        int subjects[ ] =new int[nofsubjects];
        for(int i=0;i<nofsubjects;i++)
        {

            System.out.println(  "enter marks of subject"+i );
            subjects[i]=scanner.nextInt();
         }

         for(int j=0;j< nofsubjects;j++)
         {
              sumofmarks +=subjects[j];
            
         
         }
         System.out.println("the sum of marks are " +sumofmarks);
         Thread.sleep(2000);

         averagepercentage =(sumofmarks/nofsubjects);
         Thread.sleep(2000);
         System.out.println("the average percentage is" +averagepercentage);
         if(averagepercentage >averagepercentage/2)
         {
            System.out.println("you  are eligible to have grade");
            Thread.sleep(7000);
                    if(averagepercentage>= 90)
                    {
                        System.out.println("you have obtained o grade");
                    }
                    else if(averagepercentage>=80){
                        System.out.println( "you have obtained a+ grade");
                    }
                    else if(averagepercentage>=70){
                        System.out.println( "you have obtained a grade");
                    }
                    else if(averagepercentage>=60){
                        System.out.println( "you have obtained b+ grade");
                    }
                    else {
                        System.out.println( "you have obtained  b  grade");
                    }

         }
         else{
            System.out.println("you marks are too low to  have grades");
         }     
    }   
}
