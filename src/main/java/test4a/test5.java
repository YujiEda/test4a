package test4a;

import java.net.URL;
import java.io.*;
import javax.net.ssl.HttpsURLConnection;

public class test5 {
	
    public static void main(String[] args) throws Exception {
        String httpsURL = "https://www.google.com/finance/getprices?q=6420&x=TYO&i=86400&p=1Y&f=d,c,v,o,h,l&df=cpct&auto=1&ts=1489550582260&ei=4rrIWJHoIYya0QS1i4IQ";
        URL myUrl = new URL(httpsURL);
        HttpsURLConnection conn = (HttpsURLConnection)myUrl.openConnection();
        InputStream is = conn.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String inputLine;

        while ((inputLine = br.readLine()) != null) {
            System.out.println(inputLine);
        }

        br.close();
    }

}
