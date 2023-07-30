import client.Client;
import client.ClientService;
import client.Migration;
import connection.DataBase;


public class Main{

    public static void main(String[] args) {
        new Migration().migrate();
    }
}