package butikracunara;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.ImageIcon;
import java.awt.Window.Type;

public class About extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public About() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 189);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 184, 0, 0};
		gbl_contentPane.rowHeights = new int[]{18, 0, 26, 17, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(About.class.getResource("/butikracunara/tfzr.png")));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.gridheight = 3;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblButikRacunar = new JLabel("Racunarski Butik");
		GridBagConstraints gbc_lblButikRacunar = new GridBagConstraints();
		gbc_lblButikRacunar.anchor = GridBagConstraints.WEST;
		gbc_lblButikRacunar.insets = new Insets(0, 0, 5, 5);
		gbc_lblButikRacunar.gridx = 4;
		gbc_lblButikRacunar.gridy = 1;
		contentPane.add(lblButikRacunar, gbc_lblButikRacunar);
		
		JLabel lblNewLabel = new JLabel("Veljko Kovacevic SI 17/21");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 2;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblOgnjenColicSi = new JLabel("Ognjen Colic SI 45/21");
		GridBagConstraints gbc_lblOgnjenColicSi = new GridBagConstraints();
		gbc_lblOgnjenColicSi.anchor = GridBagConstraints.WEST;
		gbc_lblOgnjenColicSi.insets = new Insets(0, 0, 5, 5);
		gbc_lblOgnjenColicSi.gridx = 4;
		gbc_lblOgnjenColicSi.gridy = 3;
		contentPane.add(lblOgnjenColicSi, gbc_lblOgnjenColicSi);
		
		JLabel lblNewLabel_2 = new JLabel("Tehni\u010Dki Fakultet \"Mihajlo Pupin\" Zrenjanin");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Maj 2023.");
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.gridx = 5;
		gbc_lblNewLabel_2_1.gridy = 4;
		contentPane.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
	}

}
