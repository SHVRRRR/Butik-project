package butikracunara;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JComboBox;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InventarManager extends JFrame {
	
	private String[] izbori = {"processori.csv", "mobo.csv", "graficke.csv", "storage.csv","ram.csv", "psu.csv"};
	private String izbor = "processori.csv";
	private JPanel contentPane;
	private JTable table;
	private DefaultTableModel dtm;
	private JScrollPane scrollPane;
	private JComboBox comboBox;
	private JButton btnAddRow;
	private JButton btnDelRow;
	/**
	 * Create the frame.
	 */
	public InventarManager() {
		setType(Type.UTILITY);
		dtm = new DefaultTableModel();
		LoadTable();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{63, 56, 286, 0};
		gbl_contentPane.rowHeights = new int[]{39, 171, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoadTable();
			}
		});
		btnNewButton.setIcon(new ImageIcon(MusterijaManager.class.getResource("/butikracunara/reload-2x.png")));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				SaveTable();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(MusterijaManager.class.getResource("/butikracunara/check-2x.png")));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 1;
		gbc_btnNewButton_1.gridy = 0;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izbor = (String) comboBox.getSelectedItem();
				LoadTable();
			}
		});
		
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 0;
		for(String s : izbori){
			comboBox.addItem(s);
		}
		contentPane.add(comboBox, gbc_comboBox);
		
		btnAddRow = new JButton("");
		btnAddRow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dtm.addRow(new String[]{});
			}
		});
		btnAddRow.setIcon(new ImageIcon(InventarManager.class.getResource("/butikracunara/plus-2x.png")));
		GridBagConstraints gbc_btnAddRow = new GridBagConstraints();
		gbc_btnAddRow.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddRow.gridx = 3;
		gbc_btnAddRow.gridy = 0;
		contentPane.add(btnAddRow, gbc_btnAddRow);
		
		btnDelRow = new JButton("");
		btnDelRow.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    dtm.removeRow(selectedRow);
                }
			}
		});
		btnDelRow.setIcon(new ImageIcon(InventarManager.class.getResource("/butikracunara/trash-2x.png")));
		GridBagConstraints gbc_btnDelRow = new GridBagConstraints();
		gbc_btnDelRow.insets = new Insets(0, 0, 5, 0);
		gbc_btnDelRow.gridx = 4;
		gbc_btnDelRow.gridy = 0;
		contentPane.add(btnDelRow, gbc_btnDelRow);
		
		table = new JTable(dtm);
		
		scrollPane = new JScrollPane(table);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 5;
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		contentPane.add(scrollPane, gbc_scrollPane);
	}

	
	public void LoadTable() {
		String line;
		dtm.setRowCount(0);
        try (BufferedReader reader = new BufferedReader(new FileReader(izbor))) {
            // Read the header line and split into column names
            String headerLine = reader.readLine();
            String[] columnNames = headerLine.split(",");

            // Set the column names in the table model
            dtm.setColumnIdentifiers(columnNames);
            // Read the remaining lines and add data rows to the table model
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                dtm.addRow(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void SaveTable() {
		 try (FileWriter writer = new FileWriter(izbor)) {
	            TableModel tableModel = table.getModel();

	            // Write the column headers
	            int columnCount = tableModel.getColumnCount();
	            for (int i = 0; i < columnCount; i++) {
	                writer.append(tableModel.getColumnName(i));
	                if (i < columnCount - 1) {
	                    writer.append(",");
	                }
	            }
	            writer.append("\n");

	            // Write the data rows
	            int rowCount = tableModel.getRowCount();
	            for (int row = 0; row < rowCount; row++) {
	                for (int col = 0; col < columnCount; col++) {
	                    Object value = tableModel.getValueAt(row, col);
	                    writer.append(value != null ? value.toString() : "");
	                    if (col < columnCount - 1) {
	                        writer.append(",");
	                    }
	                }
	                writer.append("\n");
	            }

	            writer.flush();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}

}
