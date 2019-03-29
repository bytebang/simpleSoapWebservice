package at.bytebang.server;

import javax.xml.ws.Endpoint;

import at.bytebang.webservice.CalculatorService;
 
public class Server {
 
   /**
    * @param args
    */
   public static void main(String[] args) {
      // open in your Browser:
      // http://localhost:9202/calculator/CalculatorWebService?wsdl
      Endpoint.publish("http://localhost:9202/calculator", new CalculatorService());      
      System.out.println("CalculatorWebService-Server is up and running!");
 
   }
 
}