package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class OrderBase implements ComponentBase {
	    public String jmbg;
	    public String cpu,mobo,ram,gpu,str,psu;
	    public double[] prices;
	    public double total;
	    public String orig;
	    
	    public OrderBase(String line) {
	    	orig = line;
	    	System.out.println(line);
	    	String[] data = line.split(",");
	    	System.out.println(data.length);
            jmbg = data[0];
            cpu = data[1];
            mobo = data[2];
            ram = data[3];
            gpu = data[4];
            str = data[5];
            psu = data[6];
            if(data.length > 7)
            total = Double.parseDouble(data[7]);
            
            prices = new double[6];
            total = 0;
            CalculatePrices();
	    }
	    
	    public void CalculatePrices() {
	    	for(CPUBase c : butikGlavni.cpuDB) {
            	if(c.name.equals(cpu)) {
            		prices[0] = c.price;
            	}
            }
            for(MBBase c : butikGlavni.mbDB) {
            	if(c.name.equals(mobo))
            		prices[1] = c.price;
            }
            for(RAMBase c : butikGlavni.ramDB) {
            	if(c.name.equals(ram))
            		prices[2] = c.price;
            }
            for(GPUBase c : butikGlavni.gpuDB) {
            	if(c.name.equals(gpu))
            		prices[3] = c.price;
            }
            for(STRBase c : butikGlavni.strDB) {
            	if(c.name.equals(str))
            		prices[4] = c.price;
            }
            for(PSUBase c : butikGlavni.psuDB) {
            	if(c.name.equals(psu))
            		prices[5] = c.price;
            }
            for(double d : prices) {
            	total += d;
            }
	    }
		public OrderBase() {
			
		}

		
		public static List<OrderBase> BuildList(List<String> lines) {
			List<OrderBase> lb = new ArrayList<OrderBase>();
			for(String line : lines) {
				OrderBase base = new OrderBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<OrderBase> l) {
			for(OrderBase inst : l) {
				System.out.println(inst.jmbg + " - " + inst.cpu);
			}
		}
}
