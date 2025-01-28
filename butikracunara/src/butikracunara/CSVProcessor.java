package butikracunara;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVProcessor {
	public List<String> lines = new ArrayList<String>();
    public CSVProcessor(String fn) { parseCSV(fn); }
    public CSVProcessor(){};
    
    public void parseCSV(String filename) {
    	lines = null;
    	lines = new ArrayList<String>();
    	System.out.println("Parsing..." + filename);
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        	String line;
            
            boolean isFirstLine = true;

            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue; // Skip the header line
                }
            System.out.println(filename + "= " + line);
            lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public List<String> getList(){
    	return lines;
    }
    
}