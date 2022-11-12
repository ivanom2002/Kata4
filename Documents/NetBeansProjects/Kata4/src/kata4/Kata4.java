package kata4;

import view.FileLoader;
import view.Loader;
import view.EmailLoader;
import view.HistogramDisplay;
import model.Histogram;
import java.io.File;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        
        Histogram<String> histogram = new Histogram<>();
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> emails = loader.load();
        for (String email : emails) {
            histogram.increment(email);
        }
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram Display", histogram);
        histogramDisplay.execute();
    }
    
}

