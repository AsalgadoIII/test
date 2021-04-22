import java.sql.*;
public class DBdemo
{
   public static void main(String[] args)
   {
      try
      {
         String url = "jdbc:mysql://cs.neiu.edu:3306/CS3151SP21_asalgado32?serverTimezone=UTC&";
         url += "user=CS3151SP21_asalgado32&password=asalgado32677567";
         
         Connection conn = DriverManager.getConnection(url);
         
         Statement stmt = conn.createStatement();
         
         String query = " SELECT * FROM Students";
         
         ResultSet rs = stmt.executeQuery(query);
         
         while(rs.next ())
         {
            int id = rs.getInt("studentid");
            String name = rs.getString("studentName");
            
            System.out.println("ID: " + id + "\tName: " + name);
         }
      }
      catch(SQLException ex) 
      {
         ex.printStackTrace();
      }
   }
}

