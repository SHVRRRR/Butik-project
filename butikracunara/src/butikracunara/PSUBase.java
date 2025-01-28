package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class PSUBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public int wattage;
	    public double price;
	    public PSUBase(String line) {
	    	String[] data = line.split(",");
			name = data[0];
            brand = data[1];
            wattage = Integer.parseInt(data[2]);
            price = Double.parseDouble(data[3]);
	    }
	    
	    public PSUBase() {
	    	
	    }
		
		public static List<PSUBase> BuildList(List<String> lines) {
			List<PSUBase> lb = new ArrayList<PSUBase>();
			for(String line : lines) {
				PSUBase base = new PSUBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<PSUBase> l) {
			for(PSUBase cpu : l) {
				System.out.println(cpu.name);
			}
		}
}
