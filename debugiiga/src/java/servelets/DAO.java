package servelets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    private String yid;
    private String name;
    private String dept;
    private String email;
    private String collage;
    private String contact;
    Connection conn = null;
    public String getYid() {
        return yid;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public String getEmail() {
        return email;
    }

    public String getCollage() {
        return collage;
    }

    public String getContact() {
        return contact;
    }

    public Connection getConn() {
        return conn;
    }

    public void setYid(String yid) {
        this.yid = yid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    Connection getConnection() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/debaggiga?useSSL=false", "root", "v1");
            return conn;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public int register() {
        int n = 0;
        DAO o = new DAO();
        Connection conn = o.getConnection();
        String sql = "insert into register (yid,name,dept,email,collage,contact)values(?,?,?,?,?,?);";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, yid);
            pst.setString(2, name);
            pst.setString(3, dept);
            pst.setString(4, email);
            pst.setString(5, collage);
            pst.setString(6, contact);
            pst.execute();
            n = 1;

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return n;
    }

    public int update(String yid,int marks) {
        int r = 0;
        DAO o = new DAO();
        Connection conn = o.getConnection();
        String sql = "update register set marks= ? where yid=?";
        try {
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, marks);
            pst.setString(2, yid);
            r=pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return 0;
    }
    public ResultSet select( int mark) throws SQLException
    {
        DAO o = new DAO();
        Connection conn = o.getConnection();
        String sql=" select * from register where marks>="+"\"" + mark + "\"" +";";
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery(sql);
       
        return rs;
    }
    public static void main(String args[]) throws SQLException {
        DAO o = new DAO();
       

    }
}
