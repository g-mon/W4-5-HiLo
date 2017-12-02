
public class ComputerPlayer
{
    private Hilo comp;
    private int guessescomp;
    
    public ComputerPlayer(){
        comp= new Hilo();
        guessescomp=1;
    }
     public void playComp(){
        int thought;
        thought=1;
        while(guessescomp<201){
        if(thought==comp.answer){
            System.out.println("The answer is " + thought + ". I found it in " + guessescomp + " guesses");
            guessescomp=201;
        }
        else{
            System.out.println("I incorrectly guessed "+thought);
            thought++;
            guessescomp++;
        }}}
    }
    