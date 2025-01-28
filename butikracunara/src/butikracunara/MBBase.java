package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class MBBase implements ComponentBase {
	    public String name;
	    public String brand;
	    public String socket;
	    public double price;
	    public MBBase(String line) {
	    	String[] data = line.split(",");
            name = data[0];
            brand = data[1];
            socket = data[2];
            price = Double.parseDouble(data[3]);
	    }

		public MBBase() {
			
		}

		
		public static List<MBBase> BuildList(List<String> lines) {
			List<MBBase> lb = new ArrayList<MBBase>();
			for(String line : lines) {
				MBBase base = new MBBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<MBBase> l) {
			for(MBBase inst : l) {
				System.out.println(inst.name);
			}
		}
}
