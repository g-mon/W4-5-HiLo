
public class GameManager
{
    private Hilo game1;
    private Hilo game2;
    private Hilo game3;
    private int guesses1;
    private int guesses2;
    private int guesses3;
    private int vicHuman;
    private int vicComp;
    
    public GameManager(){
        game1 = new Hilo();
        game2 = new Hilo();
        game3= new Hilo();
        guesses1=0;
        guesses2=0;
        guesses3=0;
    }
    public String guess1(int h){
        guesses1++;
        return game1.guess(h);
            }
    public String guess2(int h){
       guesses2++;
       return game2.guess(h);
       
            }
    public String guess3(int h){
        guesses3++;
        return game3.guess(h);
            }
   
    public int av(){
        return (guesses1+guesses2+guesses3)/3;
    }
    public void vsComp(){
        ComputerPlayer gameC;
        gameC = new ComputerPlayer();
        gameC.playComp();
        Hilo gameH;
        gameH = new Hilo();
        
        }
    }