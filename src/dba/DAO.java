package dba;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
    
public class DAO {
    private final Connection conn;
        public DAO() throws Exception {
        this.conn = new Connection();
    }

    
    
    
        public Dept getTeam(int id) throws Exception {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select teamname from dept where team_id = " + id;
        Dept dept = null;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int teamNo = rs.getInt("deptno");
                String tname = rs.getString("dname");
                String location = rs.getString("loc");
                dept = new Dept(teamNo, tname, location);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return dept;

    }
public ArrayList<Dept> getAllTeams() throws Exception {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from dept";
        ArrayList<Dept> depts = new ArrayList<Dept>();
        Dept dept = null;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int deptno = rs.getInt("deptno");
                String dname = rs.getString("dname");
                String location = rs.getString("loc");
                dept = new Dept(deptno, dname, location);
                depts.add(dept);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return depts;
    }








}
