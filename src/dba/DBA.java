package dba;

import java.util.ArrayList;

public class DBA {

    public static void main(String[] args) {
        
        try {
           DAO dao = new DAO();
           Team team = dao.getTeam(10);
           System.out.println("Team: " + team);
           ArrayList<Team>teams = dao.getAllTeams();
           for (Team team1 : teams){
               System.out.println(team1);
           }
           } catch (Exception ex) {
               ex.printStackTrace();
           }
    }
}
