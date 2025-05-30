import java.sql.*;          // 1

class Database
{
    public static void main(String arg[]) throws Exception
    {
        String URL = "jdbc:mysql://localhost:3306/PPA51";
        String Username = "root";
        String Password = "root";
        String Query = "select * from student";

        Connection cobj = DriverManager.getConnection(URL,Username,Password);   // 2
        
        Statement sobj = cobj.createStatement();        // 3

        ResultSet robj = sobj.executeQuery(Query);      // 4

        while(robj.next())          // 5
        {
            System.out.println("RID : "+robj.getInt("Rollno"));
            System.out.println("Name : "+robj.getString("Name"));
            System.out.println("City : "+robj.getString("Age"));
            System.out.println("Marks : "+robj.getInt("marks")); 
            System.out.println("Address : "+robj.getString("address"));                                     
        }
    }
}
// execute()            Create table
// executeQuery()       select
// executeUpdate()      delete / update / alter / insert