import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.html.HTML;
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
public class extracting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        // TODO code application logic here
        String url1 = "https://www.alexu.edu.eg/index.php/en/discover-au/4025-diamond-jubilee-celebrations-launch-in-alexandria-university";
           //  String url = "https://www.google.com/";
             Validation z = new Validation();
                
        try {
          Document   doc = Jsoup.connect(url1).get();
          Elements e = doc.select("a[href]");
          System.out.println(e.size());
        for (int i = 0; i < e.size(); i++) {
            String y = e.get(i).attr("href");
                    
            if (z.validate(url1)) 
            System.out.println("valid:"+y );
            else 
                System.out.println("invalid:"+y);
        }
    
        } catch (IOException ex) {
            Logger.getLogger(extracting.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
        
    }
}
