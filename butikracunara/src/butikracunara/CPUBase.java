package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class CPUBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public String socket;
	    public double price;
	    public String maxRam;
	    

	    public CPUBase(String line) {
	    	String[] data = line.split(",");
            name = data[0];
            brand = data[1];
            socket = data[2];
            price = Double.parseDouble(data[3]);
            maxRam = data[4];
	    }

		public CPUBase() {
			
		}

		
		public static List<CPUBase> BuildList(List<String> lines) {
			List<CPUBase> lb = new ArrayList<CPUBase>();
			for(String line : lines) {
				CPUBase base = new CPUBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<CPUBase> l) {
			for(CPUBase cpu : l) {
				System.out.println(cpu.name);
			}
		}
}
