package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class RAMBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public int mem;
	    public String gen;
	    public double price;
	    public RAMBase(String line) {
	    	String[] data = line.split(",");
			name = data[0];
            brand = data[1];
            mem = Integer.parseInt(data[2]);
            gen = data[3];
            price = Double.parseDouble(data[4]);
	    }
	    
	    public RAMBase() {
	    	
	    }
		
		public static List<RAMBase> BuildList(List<String> lines) {
			List<RAMBase> lb = new ArrayList<RAMBase>();
			for(String line : lines) {
				RAMBase base = new RAMBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<RAMBase> l) {
			for(RAMBase cpu : l) {
				System.out.println(cpu.name);
			}
		}
}
