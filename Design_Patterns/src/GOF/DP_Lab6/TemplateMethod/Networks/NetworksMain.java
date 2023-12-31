/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GOF.DP_Lab6.TemplateMethod.Networks;

/**
 *
 * @author Zain
 */

//import GOF.DP_Lab6.TemplateMethod.Networks.Facebook;
//import GOF.DP_Lab6.TemplateMethod.Networks.Network;
//import GOF.DP_Lab6.TemplateMethod.Networks.Twitter;
//import GOF.DP_Lab6.TemplateMethod.Networks.LinkedIn;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworksMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Input user name: ");
        String userName = reader.readLine();
        System.out.print("Input password: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Input message: ");
        String message = reader.readLine();

        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter\n" +
                "3 - LinkedIn" 
                
        );
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        } else if (choice == 3) {
            network = new LinkedIn(userName, password);
        } else {
            System.out.println("\nInvalid Option...");
        }
        network.post(message);
    }
}
