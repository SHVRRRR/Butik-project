package butikracunara;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BuildMeni extends JFrame {

	private JPanel contentPane;
	private List<JComboBox> jcb;
	private ActionListener aL;
	public BuildMeni() {
		initializeListener();
		jcb = new ArrayList<>();
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuildMeni.class.getResource("/butikracunara/account-login-2x.png")));
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 414, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 29, 92, 46, 102, 0, 0};
		gbl_contentPane.rowHeights = new int[]{39, 0, 0, 0, 0, 0, 0, 23, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_4 = new JLabel("Sklopite svoju konfiguraciju.");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridwidth = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 0;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/cpu2x.png")));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 1;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Processor");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_1_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_3.gridx = 2;
		gbc_lblNewLabel_1_3.gridy = 1;
		contentPane.add(lblNewLabel_1_3, gbc_lblNewLabel_1_3);
		
		JComboBox comboBoxProcessor = new JComboBox();
		comboBoxProcessor.setToolTipText("comboProc");
		GridBagConstraints gbc_comboBoxProcessor = new GridBagConstraints();
		gbc_comboBoxProcessor.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxProcessor.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxProcessor.gridx = 4;
		gbc_comboBoxProcessor.gridy = 1;
		contentPane.add(comboBoxProcessor, gbc_comboBoxProcessor);
		comboBoxProcessor.setSelectedIndex(-1);
		comboBoxProcessor.addActionListener(aL);
		jcb.add(comboBoxProcessor);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/mobo2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 1;
		gbc_lblNewLabel_3_1.gridy = 2;
		contentPane.add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Motherboard");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 2;
		gbc_lblNewLabel_1_2.gridy = 2;
		
		contentPane.add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		JComboBox comboBoxMob = new JComboBox();
		comboBoxMob.setEnabled(false);
		comboBoxMob.setToolTipText("comboMob");
		GridBagConstraints gbc_comboBoxMob = new GridBagConstraints();
		gbc_comboBoxMob.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMob.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMob.gridx = 4;
		gbc_comboBoxMob.gridy = 2;
		comboBoxMob.setSelectedIndex(-1);
		comboBoxMob.setEnabled(false);
		contentPane.add(comboBoxMob, gbc_comboBoxMob);
		//comboBoxMob.addActionListener(aL);
		jcb.add(comboBoxMob);
		
		JLabel lblNewLabel_3_2 = new JLabel("");
		lblNewLabel_3_2.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/cpu2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_2 = new GridBagConstraints();
		gbc_lblNewLabel_3_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_2.gridx = 1;
		gbc_lblNewLabel_3_2.gridy = 3;
		contentPane.add(lblNewLabel_3_2, gbc_lblNewLabel_3_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Memory");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 3;
		contentPane.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JComboBox comboBoxRAM = new JComboBox();
		comboBoxRAM.setToolTipText("comboMem");
		GridBagConstraints gbc_comboBoxRAM = new GridBagConstraints();
		gbc_comboBoxRAM.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxRAM.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRAM.gridx = 4;
		gbc_comboBoxRAM.gridy = 3;
		contentPane.add(comboBoxRAM, gbc_comboBoxRAM);
		//comboBoxRAM.addActionListener(aL);
		jcb.add(comboBoxRAM);
		
		JLabel lblNewLabel_3_3 = new JLabel("");
		lblNewLabel_3_3.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/gpu2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_3 = new GridBagConstraints();
		gbc_lblNewLabel_3_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_3.gridx = 1;
		gbc_lblNewLabel_3_3.gridy = 4;
		contentPane.add(lblNewLabel_3_3, gbc_lblNewLabel_3_3);
		
		JLabel lblNewLabel_1 = new JLabel("Graphics Card");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 4;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		
		JComboBox comboBoxGPU = new JComboBox();
		comboBoxGPU.setToolTipText("comboGPU");
		GridBagConstraints gbc_comboBoxGPU = new GridBagConstraints();
		gbc_comboBoxGPU.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxGPU.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxGPU.gridx = 4;
		gbc_comboBoxGPU.gridy = 4;
		contentPane.add(comboBoxGPU, gbc_comboBoxGPU);
		//comboBoxGPU.addActionListener(aL);
		jcb.add(comboBoxGPU);
		
		JLabel lblNewLabel_3_4 = new JLabel("");
		lblNewLabel_3_4.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/ssd2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_4 = new GridBagConstraints();
		gbc_lblNewLabel_3_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_4.gridx = 1;
		gbc_lblNewLabel_3_4.gridy = 5;
		contentPane.add(lblNewLabel_3_4, gbc_lblNewLabel_3_4);
		
		JLabel lblNewLabel_2 = new JLabel("Hard Disk");
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 2;
		gbc_lblNewLabel_2.gridy = 5;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JComboBox comboBoxStorage = new JComboBox();
		comboBoxStorage.setToolTipText("comboStorage");
		GridBagConstraints gbc_comboBoxStorage = new GridBagConstraints();
		gbc_comboBoxStorage.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxStorage.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxStorage.gridx = 4;
		gbc_comboBoxStorage.gridy = 5;
		contentPane.add(comboBoxStorage, gbc_comboBoxStorage);
		//comboBoxStorage.addActionListener(aL);
		jcb.add(comboBoxStorage);
		
		JLabel lblNewLabel_3_5 = new JLabel("");
		lblNewLabel_3_5.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/flash-2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_5 = new GridBagConstraints();
		gbc_lblNewLabel_3_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_5.gridx = 1;
		gbc_lblNewLabel_3_5.gridy = 6;
		contentPane.add(lblNewLabel_3_5, gbc_lblNewLabel_3_5);
		
		JLabel lblNewLabel = new JLabel("Napajanje");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 6;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox comboBoxPSU = new JComboBox();
		comboBoxPSU.setToolTipText("comboPSU");
		GridBagConstraints gbc_comboBoxPSU = new GridBagConstraints();
		gbc_comboBoxPSU.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxPSU.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPSU.gridx = 4;
		gbc_comboBoxPSU.gridy = 6;
		contentPane.add(comboBoxPSU, gbc_comboBoxPSU);
		jcb.add(comboBoxPSU);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("");
		lblNewLabel_3_5_1.setIcon(new ImageIcon(BuildMeni.class.getResource("/butikracunara/person-2x.png")));
		GridBagConstraints gbc_lblNewLabel_3_5_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_5_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_5_1.gridx = 1;
		gbc_lblNewLabel_3_5_1.gridy = 7;
		contentPane.add(lblNewLabel_3_5_1, gbc_lblNewLabel_3_5_1);
		
		JLabel lblMusterija = new JLabel("Musterija");
		lblMusterija.setFont(new Font("Tahoma", Font.PLAIN, 11));
		GridBagConstraints gbc_lblMusterija = new GridBagConstraints();
		gbc_lblMusterija.anchor = GridBagConstraints.EAST;
		gbc_lblMusterija.insets = new Insets(0, 0, 5, 5);
		gbc_lblMusterija.gridx = 2;
		gbc_lblMusterija.gridy = 7;
		contentPane.add(lblMusterija, gbc_lblMusterija);
		
		JComboBox comboBoxMus = new JComboBox();
		comboBoxMus.setToolTipText("comboMusterija");
		GridBagConstraints gbc_comboBoxMus = new GridBagConstraints();
		gbc_comboBoxMus.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxMus.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMus.gridx = 4;
		gbc_comboBoxMus.gridy = 7;
		contentPane.add(comboBoxMus, gbc_comboBoxMus);
		jcb.add(comboBoxMus);
		
		JButton btnNewButton = new JButton("Naruci");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Transakcija();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 4;
		gbc_btnNewButton.gridy = 8;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		initializeValues();
		
	}

	public void initializeValues() {
		for (CPUBase comp : butikGlavni.cpuDB ) {
			jcb.get(0).addItem(comp.name);
		}
		for (MBBase comp : butikGlavni.mbDB ) {
			//jcb.get(1).addItem(comp.name);
		}
		for (RAMBase comp : butikGlavni.ramDB ) {
			jcb.get(2).addItem(comp.name);
		}
		for (GPUBase comp : butikGlavni.gpuDB ) {
			jcb.get(3).addItem(comp.name);
		}
		for (STRBase comp : butikGlavni.strDB ) {
			jcb.get(4).addItem(comp.name);
		}
		for (PSUBase comp : butikGlavni.psuDB ) {
			jcb.get(5).addItem(comp.name);
		}
		for	(CustomerBase comp : butikGlavni.cusDB) {
			jcb.get(6).addItem(comp.ime + " " + comp.prezime + " - " + comp.jmbg);
		}
	}
	
	public void initializeListener() {
		aL = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jb = (JComboBox) e.getSource();
				switch(jb.getToolTipText()) {
					case "comboProc":
						jcb.get(1).removeAllItems();
						for(MBBase comp: butikGlavni.mbDB) {
							if(comp.socket.equals(butikGlavni.cpuDB.get(jcb.get(0).getSelectedIndex()).socket))
							jcb.get(1).addItem(comp.name);
						}
						jcb.get(1).setEnabled(true);
						break;
					default: 
						System.out.println("Default Case Triggered, object: " + e.getSource().getClass());
				}
			}
		};
	}
	
	public void Transakcija() {
		
		StringBuilder str = new StringBuilder();
		str.append(jcb.get(6).getSelectedItem().toString().split(" - ")[1]); str.append(",");
		str.append(jcb.get(0).getSelectedItem().toString()); str.append(",");
		str.append(jcb.get(1).getSelectedItem().toString()); str.append(",");
		str.append(jcb.get(2).getSelectedItem().toString()); str.append(",");
		str.append(jcb.get(3).getSelectedItem().toString()); str.append(",");
		str.append(jcb.get(4).getSelectedItem().toString()); str.append(",");
		str.append(jcb.get(5).getSelectedItem().toString());
		System.out.println(str.toString());
		OrderBase ob = new OrderBase(str.toString());
		BuildPotvrda bp = new BuildPotvrda(ob);
		bp.setVisible(true);
	}
	
	
	
	
}
