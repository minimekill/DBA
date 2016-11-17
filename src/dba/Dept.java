/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dba;

/**
 *
 * @author Peter
 */
public class Dept {
    
        private int deptno;
    private String dname;
    private String loc;
    
    public Dept(int no, String name, String location) {
        deptno = no;
        dname = name;
        loc = location;
    }

    @Override
    public String toString() {
        return "Dept{" + "deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + '}';
    }
    
    
    
}
