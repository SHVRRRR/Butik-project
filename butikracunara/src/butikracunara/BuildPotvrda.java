package butikracunara;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Font;

public class BuildPotvrda extends JFrame {

	private JPanel contentPane;
	private OrderBase ob;
	private BuildPotvrda bp;

	/**
	 * Create the frame.
	 */
	public BuildPotvrda(OrderBase obParam) {
		setBackground(SystemColor.info);
		setIconImage(Toolkit.getDefaultToolkit().getImage(BuildPotvrda.class.getResource("/butikracunara/check-2x.png")));
		ob = obParam;
		bp = this;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 343, 399);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.info);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{31, 130, 116, 0, 0};
		gbl_contentPane.rowHeights = new int[]{34, 260, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("POTVRDA NARUDZBINE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Verdana", Font.PLAIN, 12));
		textPane.setEditable(false);
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.gridwidth = 2;
		gbc_textPane.insets = new Insets(0, 0, 5, 5);
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 1;
		gbc_textPane.gridy = 1;
		contentPane.add(textPane, gbc_textPane);
		
		JLabel lblNewLabel_1 = new JLabel("Da li potvrdjujete narudzbinu?");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.gridwidth = 2;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Potvrdi");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Potvrda(ob);
				bp.dispose();
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnPonisti = new JButton("Ponisti");
		btnPonisti.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				bp.dispose();
			}
		});
		GridBagConstraints gbc_btnPonisti = new GridBagConstraints();
		gbc_btnPonisti.anchor = GridBagConstraints.WEST;
		gbc_btnPonisti.insets = new Insets(0, 0, 0, 5);
		gbc_btnPonisti.gridx = 2;
		gbc_btnPonisti.gridy = 3;
		contentPane.add(btnPonisti, gbc_btnPonisti);
		
		FillDetails(textPane);
	}
		public void FillDetails(JTextPane jtp) {
			ob.CalculatePrices();
			StringBuilder str = new StringBuilder();
			str.append(ob.cpu + " - " + ob.prices[0]);str.append("\n");
			str.append(ob.mobo + " - " + ob.prices[1]);str.append("\n");
			str.append(ob.ram + " - " + ob.prices[2]);str.append("\n");
			str.append(ob.gpu + " - " + ob.prices[3]);str.append("\n");
			str.append(ob.str + " - " + ob.prices[4]);str.append("\n");
			str.append(ob.psu + " - " + ob.prices[5]);str.append("\n");
			str.append("Konacna Cena: " + String.format("%.2f",ob.total));
			jtp.setText(str.toString());
		}
		
		public void Potvrda(OrderBase a) {
			butikGlavni.ordDB.add(a);
			try(FileWriter wr = new FileWriter("narudzbine.csv",true)) {
				wr.append(a.orig + "," + a.total);
				wr.append("\n");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

}
