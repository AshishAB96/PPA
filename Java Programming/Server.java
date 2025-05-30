import java.net.*;
import java.io.*; 


class Server
{
    public static void main(String Arg[])
    {
        System.out.println("Server application is running...");

        try
        {
            ServerSocket ssobj = new ServerSocket(2100);
            System.out.println("Server is waiting for client at port number 2100");

            Socket sobj = ssobj.accept();   // Accept the request from the client
            System.out.println("Connection established with the client..");

            PrintStream ps = new PrintStream(sobj.getOutputStream()); // baher pathvanare 
            BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));  // samorcahr kadun yenar ayk
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); // pativ 
            String str1, str2;
            System.out.println("Chat Massanger application started...");
            while((str1 = br1.readLine()) != null)
            {
                System.out.println("Client says : "+str1);
                System.out.println("Enter message for client : ");
                str2 = br2.readLine();
                ps.println(str2);
            }
        }
        catch (Exception obj)
        {
            
        }
        System.out.println("Thank you for using the Marvellous Chat Application..");
    }
}