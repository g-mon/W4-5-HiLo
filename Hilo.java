
/**
 * Write a description of class HiLo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hilo
{
    public int answer;
    
    public Hilo(){
        answer= (int)(Math.random()*200)+1;
    }
    public String guess(int g){
        if(g==answer){
            return "You Win";
        }
        if(g>answer){
            return "Lower";
        }
        else{
            return "Higher";
        }
    }
}
