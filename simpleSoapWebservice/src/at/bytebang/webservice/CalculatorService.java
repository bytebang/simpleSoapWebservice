package at.bytebang.webservice;

import javax.jws.WebService;

@WebService(name = "CalculatorWebService",  serviceName = "CalculatorWebService", portName = "CalculatorWebServicePort", targetNamespace = "http://www.bytebang.at/ws/calculator")
public class CalculatorService {
 
    public float add(float a, float b)
    {
        return a+b;
    }

    public float subtract(float a, float b)
    {
        return a-b;
    }

    public float multiply(float a, float b)
    {
        return a*b;
    }

    public float divide(float a, float b)
    {
        return a/b;
    }

}
