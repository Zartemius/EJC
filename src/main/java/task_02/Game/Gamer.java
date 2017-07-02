package task_02.Game;

/**
 * Created by artem on 02.07.17.
 */
public class Gamer {

    private int m_treasury = 500;
    private int m_entry = 0;

    public void setEntry(int entry){

        m_entry = entry;
    }

    public void winnerReceivedPrize(){

        m_treasury += m_entry*2;
    }

    public void loserLostMoney(){

        m_treasury -= m_entry;
    }

    public void showCurrentStatusOfTreasury(){

        System.out.println(m_treasury);
    }

    public boolean isMoneyInTreasury(){

        if(m_treasury > 0){

            return true;
        }
        else{

            return false;
        }
    }

}
