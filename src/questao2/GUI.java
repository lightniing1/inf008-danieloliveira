package questao2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JSeparator;

public class GUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 696, 552);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Cadastrar", null, panel_1, null);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 47, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 37, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, -4, SpringLayout.NORTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -26, SpringLayout.EAST, panel_1);
		panel_1.add(btnNewButton);
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, -3, SpringLayout.NORTH, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNewLabel);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, -13, SpringLayout.WEST, btnNewButton);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Cursos", null, panel, null);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JLabel lblNewLabel_1 = new JLabel("Cursos Cadastrados");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 26, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 28, SpringLayout.WEST, panel);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Horarios");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel.add(lblNewLabel_2);
		
		JList list = new JList();
		sl_panel.putConstraint(SpringLayout.WEST, list, 28, SpringLayout.WEST, panel);
		panel.add(list);
		
		JLabel lblNewLabel_3 = new JLabel("Disciplinas");
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, list, -43, SpringLayout.NORTH, lblNewLabel_3);
		panel.add(lblNewLabel_3);
		
		JList list_1 = new JList();
		sl_panel.putConstraint(SpringLayout.NORTH, list_1, 331, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, list_1, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, list_1, -49, SpringLayout.SOUTH, panel);
		panel.add(list_1);
		
		JComboBox comboBox = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox, 102, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -13, SpringLayout.NORTH, comboBox);
		sl_panel.putConstraint(SpringLayout.NORTH, list, 21, SpringLayout.SOUTH, comboBox);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox, -572, SpringLayout.EAST, panel);
		panel.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Adicionar Horario");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, comboBox);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_1, 14, SpringLayout.EAST, comboBox);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir Horario");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_2, 120, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, list, -17, SpringLayout.WEST, btnNewButton_2);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_2, 41, SpringLayout.SOUTH, btnNewButton_1);
		panel.add(btnNewButton_2);
		
		JComboBox comboBox_1 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_1, -4, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_1, 16, SpringLayout.EAST, lblNewLabel_1);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_1, -327, SpringLayout.EAST, panel);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_2, 28, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, -19, SpringLayout.NORTH, comboBox_2);
		sl_panel.putConstraint(SpringLayout.SOUTH, comboBox_2, -18, SpringLayout.NORTH, list_1);
		panel.add(comboBox_2);
		
		JButton btnNewButton_3 = new JButton("Adicionar Disciplina");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_3, 166, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_2, -18, SpringLayout.WEST, btnNewButton_3);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_3, 102, SpringLayout.SOUTH, btnNewButton_2);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Excluir Disciplina");
		sl_panel.putConstraint(SpringLayout.EAST, list_1, -18, SpringLayout.WEST, btnNewButton_4);
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_4, 57, SpringLayout.SOUTH, btnNewButton_3);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_4, 0, SpringLayout.WEST, btnNewButton_3);
		panel.add(btnNewButton_4);
		
		JLabel lblNewLabel_4 = new JLabel("Alunos");
		sl_panel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_panel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 280, SpringLayout.EAST, lblNewLabel_2);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox_3 = new JComboBox();
		sl_panel.putConstraint(SpringLayout.NORTH, comboBox_3, 13, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.WEST, comboBox_3, 116, SpringLayout.EAST, btnNewButton_1);
		panel.add(comboBox_3);
		
		JButton btnNewButton_5 = new JButton("Adicionar Aluno");
		sl_panel.putConstraint(SpringLayout.EAST, comboBox_3, -20, SpringLayout.WEST, btnNewButton_5);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_5, 532, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_5, 0, SpringLayout.SOUTH, comboBox);
		panel.add(btnNewButton_5);
		
		JList list_2 = new JList();
		sl_panel.putConstraint(SpringLayout.NORTH, list_2, 0, SpringLayout.NORTH, list);
		sl_panel.putConstraint(SpringLayout.WEST, list_2, 0, SpringLayout.WEST, lblNewLabel_4);
		sl_panel.putConstraint(SpringLayout.SOUTH, list_2, 195, SpringLayout.SOUTH, comboBox_3);
		sl_panel.putConstraint(SpringLayout.EAST, list_2, 223, SpringLayout.EAST, btnNewButton_3);
		panel.add(list_2);
		
		JButton btnNewButton_6 = new JButton("Remover Aluno");
		sl_panel.putConstraint(SpringLayout.NORTH, btnNewButton_6, 74, SpringLayout.SOUTH, btnNewButton_5);
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_6, 0, SpringLayout.WEST, btnNewButton_5);
		panel.add(btnNewButton_6);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Disciplina", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Aluno", null, panel_3, null);
	}
}
