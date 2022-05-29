package pl.sdacademy.java.advanced.exercieses.nbp;

//import com.fasterxml.jackson.databind.ObjectMapper;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        URL nbp = new URL("http://api.nbp.pl/api/exchangerates/tables/a/?format=json");
//        InputStream inputStream = nbp.openConnection().getInputStream();
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(nbp.openConnection().getInputStream()))) {
            String inputLine;
            while ((inputLine = br.readLine()) != null){
                result += inputLine;
            }
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
        System.out.println(result);
    }
    ObjectMapper om = new ObjectMapper();
    om.readValue(result, Root.class)


}
