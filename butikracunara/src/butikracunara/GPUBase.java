package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class GPUBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public int mem;
	    public double price;
	    public GPUBase(String line) {
	    	String[] data = line.split(",");
			name = data[0];
            brand = data[1];
            mem = Integer.parseInt(data[2]);
            price = Double.parseDouble(data[3]);
	    }
	    
	    public GPUBase() {
	    	
	    }
		
		public static List<GPUBase> BuildList(List<String> lines) {
			List<GPUBase> lb = new ArrayList<GPUBase>();
			for(String line : lines) {
				GPUBase base = new GPUBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<GPUBase> l) {
			for(GPUBase cpu : l) {
				System.out.println(cpu.name);
			}
		}
}
