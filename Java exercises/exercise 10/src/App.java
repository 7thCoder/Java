/*
 * Greed is a dice game played with five six-sided dice. Your mission, 
 * should you choose to accept it, is to score a throw according to these rules. 
 * You will always be given an array with five six-sided dice values.
 *
    Three 1's => 1000 points
    Three 6's =>  600 points
    Three 5's =>  500 points
    Three 4's =>  400 points
    Three 3's =>  300 points
    Three 2's =>  200 points
    One   1   =>  100 points
    One   5   =>   50 point
 * 
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,1,1,3,1};
        
        System.out.println(greedy(arr));
    }


    public static int greedy(int[] dice){
        int count = 0;
        int score = 0;
        int a = 1;

        for(int i:dice){
            count = 0;
            for(int j:dice){
                if( i == j){
                count += 1;
                }
            }

            if(count >= 3){
                while(a <3){
                    switch(i){
                        case 1:
                            score = 1000;
                            break;
                        case 6:
                            score = 600;
                            break;
                        case 5:
                            score = 500;
                            break;
                        case 4:
                            score = 400;
                            break;
                        case 3:
                            score = 300;
                            break;
                        case 2:
                            score = 200;
                            break;
                        default:  
                    }
                    a++;
                }
                
                if(a > 3){
                    for(int b = 0; b < (count-3); b++){
                        switch(i){
                            case 1:
                                score += 100;
                                break;
                            case 5:
                                score += 50;
                                break;
                            default:
                            
                        }
                    }
                }
            }
            
               
            switch(i){
                case 1:
                    score += 100;
                    break;
                case 5:
                    score += 50;
                    break;
                default:
                
            } 
                
        }
        
        return score ;
    }
}
