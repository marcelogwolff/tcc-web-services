package servico;

import javax.xml.ws.Endpoint;

import org.tempuri.PessoaImpl;

public class MyServiceEndpoint{

public static void main(String[] params){
  Endpoint endPoint =  Endpoint.create(new PessoaImpl());
  endPoint.publish("http://localhost:9001/pessoa"); //supply your desired url to the publish method to actually expose the service.
   }
}