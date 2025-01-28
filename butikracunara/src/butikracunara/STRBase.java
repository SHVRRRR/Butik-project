package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class STRBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public int capacity;
	    public String type;
	    public double price;
	    public STRBase(String line) {
	    	String[] data = line.split(",");
			name = data[0];
            brand = data[1];
            capacity = Integer.parseInt(data[2]);
            type = data[3];
            price = Double.parseDouble(data[4]);
	    }
	    
	    public STRBase(){}
		
		public static List<STRBase> BuildList(List<String> lines) {
			List<STRBase> lb = new ArrayList<STRBase>();
			for(String line : lines) {
				STRBase base = new STRBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<STRBase> l) {
			for(STRBase cpu : l) {
				System.out.println(cpu.name);
			}
		}
}
