package butikracunara;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Toolkit;

public class ButikMM extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButikMM frame = new ButikMM();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ButikMM() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ButikMM.class.getResource("/butikracunara/radexpress1x.png")));
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 410, 238);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{30, 30, 56, 132, 0, 0};
		gbl_contentPane.rowHeights = new int[]{29, 0, 22, 24, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnCustomers = new JButton("Menadzer Musterija");
		btnCustomers.setBackground(SystemColor.control);
		btnCustomers.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MusterijaManager mm = new MusterijaManager();
				mm.setVisible(true);
			}
		});
		
		JButton btnInventory = new JButton("Menadzer Inventara");
		btnInventory.setBackground(SystemColor.control);
		btnInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InventarManager im = new InventarManager();
				im.setVisible(true);
			}
		});
		
		JButton btnOrders = new JButton("Narudzbine");
		btnOrders.setBackground(SystemColor.control);
		btnOrders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NarudzbineManager nm = new NarudzbineManager();
				nm.setVisible(true);
			}
		});
		
		JButton pcBuilderBtn = new JButton("Nova Konfiguracija");
		pcBuilderBtn.setBackground(SystemColor.control);
		pcBuilderBtn.setForeground(Color.BLACK);
		pcBuilderBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BuildMeni buildmeni = new BuildMeni();
				buildmeni.setVisible(true);
			}
		});
		GridBagConstraints gbc_pcBuilderBtn = new GridBagConstraints();
		gbc_pcBuilderBtn.fill = GridBagConstraints.BOTH;
		gbc_pcBuilderBtn.anchor = GridBagConstraints.WEST;
		gbc_pcBuilderBtn.insets = new Insets(0, 0, 5, 5);
		gbc_pcBuilderBtn.gridx = 1;
		gbc_pcBuilderBtn.gridy = 1;
		contentPane.add(pcBuilderBtn, gbc_pcBuilderBtn);
		GridBagConstraints gbc_btnOrders = new GridBagConstraints();
		gbc_btnOrders.fill = GridBagConstraints.BOTH;
		gbc_btnOrders.anchor = GridBagConstraints.WEST;
		gbc_btnOrders.insets = new Insets(0, 0, 5, 5);
		gbc_btnOrders.gridx = 1;
		gbc_btnOrders.gridy = 2;
		contentPane.add(btnOrders, gbc_btnOrders);
		GridBagConstraints gbc_btnInventory = new GridBagConstraints();
		gbc_btnInventory.fill = GridBagConstraints.BOTH;
		gbc_btnInventory.anchor = GridBagConstraints.WEST;
		gbc_btnInventory.insets = new Insets(0, 0, 5, 5);
		gbc_btnInventory.gridx = 1;
		gbc_btnInventory.gridy = 3;
		contentPane.add(btnInventory, gbc_btnInventory);
		GridBagConstraints gbc_btnCustomers = new GridBagConstraints();
		gbc_btnCustomers.fill = GridBagConstraints.BOTH;
		gbc_btnCustomers.anchor = GridBagConstraints.WEST;
		gbc_btnCustomers.insets = new Insets(0, 0, 5, 5);
		gbc_btnCustomers.gridx = 1;
		gbc_btnCustomers.gridy = 4;
		contentPane.add(btnCustomers, gbc_btnCustomers);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About ab = new About();
				ab.setVisible(true);
			}
		});
		btnAbout.setBackground(SystemColor.control);
		GridBagConstraints gbc_btnAbout = new GridBagConstraints();
		gbc_btnAbout.anchor = GridBagConstraints.WEST;
		gbc_btnAbout.insets = new Insets(0, 0, 0, 5);
		gbc_btnAbout.gridx = 1;
		gbc_btnAbout.gridy = 6;
		contentPane.add(btnAbout, gbc_btnAbout);
		
		JButton btnNewButton = new JButton("Osvezi Bazu");
		btnNewButton.setBackground(SystemColor.control);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				butikGlavni.InitDB();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.gridx = 3;
		gbc_btnNewButton.gridy = 6;
		contentPane.add(btnNewButton, gbc_btnNewButton);
	}

}
