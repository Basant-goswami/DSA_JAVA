package TCS_Prep;
import java.util.*;

public class PlayersAndMethods {

     public static ArrayList<Player> playerByMatchType(Player[] players, String mt){ ArrayList<Player> arr = new ArrayList<>(); for(Player p : players){ if(p.getMatchType().equalsIgnoreCase(mt)){ arr.add(p); } } if(arr.isEmpty()){ return null; } Collections.sort(arr,Comparator.comparingInt(Player::getPlayerId).reversed()); return arr; }
    public static int lowestRun(Player[] players, String pt){ ArrayList<Player> ans = new ArrayList<>(); for(Player p : players){ if(p.getPlayerType().equalsIgnoreCase(pt)){ ans.add(p); } } if(ans.isEmpty()){ return 0; } Collections.sort(ans, Comparator.comparingInt(Player::getRuns)); return ans.get(0).getRuns(); }
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         Player[] players = new Player[4];
         for(int i=0;i<4;i++){
             int playerId = sc.nextInt();
             sc.nextLine();
             String playerName = sc.nextLine();
             int runs = sc.nextInt(); sc.nextLine(); String playerType = sc.nextLine(); String matchType = sc.nextLine();
             players[i] = new Player(playerId,playerName,runs,playerType,matchType); }
         String inp1 = sc.nextLine(); String inp2 = sc.nextLine(); int res1 = lowestRun(players,inp1); if(res1 > 0){ System.out.println(res1); } else { System.out.println("No such player"); } ArrayList<Player> arr = playerByMatchType(players,inp2); if(arr == null){ System.out.println("No Player with given matchType"); } else { for(Player p : arr){ System.out.println(p.getPlayerId()); } } } } class Player{ int playerId; String playerName; int runs; String playerType; String matchType; public Player(int playerId,String playerName, int runs,String playerType,String matchType){ this.playerId = playerId; this.playerName = playerName; this.runs = runs; this.playerType = playerType; this.matchType = matchType; } public int getPlayerId(){return playerId;} public String getPlayerName(){ return playerName;} public int getRuns(){ return runs;} public String getPlayerType(){ return playerType;} public String getMatchType(){ return matchType;}
}
