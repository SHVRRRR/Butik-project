package butikracunara;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class butikGlavni {
	public static Connection conn;
	public static CSVProcessor processor = new CSVProcessor();
	public static List<CPUBase> cpuDB = new ArrayList<CPUBase>();
	public static List<GPUBase> gpuDB = new ArrayList<GPUBase>();
	public static List<RAMBase> ramDB = new ArrayList<RAMBase>();
	public static List<MBBase> mbDB = new ArrayList<MBBase>();
	public static List<STRBase> strDB = new ArrayList<STRBase>();
	public static List<PSUBase> psuDB = new ArrayList<PSUBase>();
	public static List<CustomerBase> cusDB = new ArrayList<CustomerBase>();
	public static List<OrderBase> ordDB = new ArrayList<OrderBase>();
	public static void InitDB() {
		processor.parseCSV("processori.csv");
		cpuDB = CPUBase.BuildList(processor.lines);
		processor.parseCSV("graficke.csv");
		gpuDB = GPUBase.BuildList(processor.lines);
		processor.parseCSV("ram.csv");
		ramDB = RAMBase.BuildList(processor.lines);
		processor.parseCSV("mobo.csv");
		mbDB = MBBase.BuildList(processor.lines);
		processor.parseCSV("storage.csv");
		strDB = STRBase.BuildList(processor.lines);
		processor.parseCSV("psu.csv");
		psuDB = PSUBase.BuildList(processor.lines);
		processor.parseCSV("musterije.csv");
		cusDB = CustomerBase.BuildList(processor.lines);
		processor.parseCSV("narudzbine.csv");
		ordDB = OrderBase.BuildList(processor.lines);
	}
	public static void main(String[] args) {
		
		InitDB();
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ButikMM bm = new ButikMM();
				bm.setVisible(true);
			}
			
		});
	}
}
