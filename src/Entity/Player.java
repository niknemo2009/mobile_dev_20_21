package Entity;

import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Card> currentNabor=new ArrayList<>();
    String nik;
    int currentPositionOnPath;
    Game currenGame;

    public Player(String nik) {
        this.nik = nik;
    }

    Game createGame(int countCardPerPlayer){
        return  null;
    }

    Card nextStep(Card card,String association){
        return null;
    }

    Card nextStep(int numberCard,String association){
        return null;
    }

     boolean toJoin(Game game){
        return true;
     }
     String createInvite(){
        return null;
     }
     boolean deleteInvite(){
        return  true;
     }
     private boolean getFirstSetCards(){
        return true;
     }
}
