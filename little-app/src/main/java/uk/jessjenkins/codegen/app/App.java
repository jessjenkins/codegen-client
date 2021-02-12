package uk.jessjenkins.codegen.app;

import uk.jessjenkins.codegen.client.ApiException;
import uk.jessjenkins.codegen.client.DefaultApi;
import uk.jessjenkins.codegen.client.Message;
import uk.jessjenkins.codegen.client.Something;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Something something = new Something();

        System.out.println( "Hello World! " + something.getSomething() );

        DefaultApi apiInstance = new DefaultApi();
        try {
            for (int i = 0; i < 10 ; i++) {
                Message result = apiInstance.helloGet();
                System.out.println(result);
            }
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#helloGet");
            e.printStackTrace();
        }
    }
}
