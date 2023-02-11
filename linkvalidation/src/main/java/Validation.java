
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.HTML;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author omar_
 */
public class Validation {

  
    

    public boolean validate(String url) throws IOException{
  boolean  validate = false;
      

        try {
        Document    doc = Jsoup.connect(url).get();
            validate = true;
        } catch (HttpStatusException ex) {
            validate =false;
        }
        return validate;

}

     
    
    
}
