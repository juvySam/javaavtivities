import java.uti.*;
public class GradeRating {
    
    public static void main(String[] args) {
        
        int score = 105 ;
        
        if(score<=100 && score >= 90){
            System.out.println("You got A grade ");
        }
        else if(score<=89 && score>= 80){
            System.out.println("You got B grade ");
        }
        else if(score<=79 && score>= 70){
            System.out.println("You got C grade ");
        }
        else if(score<=69 && score>= 60){
            System.out.println("You got D grade ");
        }
        else if(score <=60){
            System.out.println("You got F grade ");
        }
        else System.out.println("Invalid score ");
        
    }
  }
}
