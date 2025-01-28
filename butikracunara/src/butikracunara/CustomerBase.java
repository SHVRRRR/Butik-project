package butikracunara;

import java.util.ArrayList;
import java.util.List;

public class CustomerBase implements ComponentBase {
	    public String ime;
	    public String prezime;
	    public String jmbg;
	    public String email;
	    public String telefon;
	    public String adresa;
	    public String grad;
	    public String ptt;
	    public CustomerBase(String line) {
	    	String[] data = line.split(",");
            ime = data[0];
            prezime = data[1];
            jmbg = data[2];
            email = data[3];
            telefon = data[4];
            adresa = data[5];
            grad = data[6];
            ptt = data[7];
	    }

		public CustomerBase() {
			
		}

		
		public static List<CustomerBase> BuildList(List<String> lines) {
			List<CustomerBase> lb = new ArrayList<CustomerBase>();
			for(String line : lines) {
				CustomerBase base = new CustomerBase(line);
				lb.add(base);
			}
			return lb;
		}
		
		public static void ReadList(List<CustomerBase> l) {
			for(CustomerBase inst : l) {
				System.out.println(inst.ime + " " + inst.prezime + "-" + inst.jmbg);
			}
		}
}
