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
		
		JButton btnNewButton_7 = new JButton("Remover Curso");
		sl_panel.putConstraint(SpringLayout.WEST, btnNewButton_7, 18, SpringLayout.EAST, comboBox_1);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnNewButton_7, 0, SpringLayout.SOUTH, comboBox_1);
		panel.add(btnNewButton_7);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Disciplina", null, panel_2, null);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblNewLabel_5 = new JLabel("Nome da Disciplina");
		panel_2.add(lblNewLabel_5);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setEditable(true);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_4, 121, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_4, -354, SpringLayout.EAST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 4, SpringLayout.NORTH, comboBox_4);
		sl_panel_2.putConstraint(SpringLayout.EAST, lblNewLabel_5, -6, SpringLayout.WEST, comboBox_4);
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_4, 33, SpringLayout.NORTH, panel_2);
		panel_2.add(comboBox_4);
		
		JButton btnNewButton_8 = new JButton("Remover");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_8, -4, SpringLayout.NORTH, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_8, 7, SpringLayout.EAST, comboBox_4);
		panel_2.add(btnNewButton_8);
		
		JLabel lblNewLabel_6 = new JLabel("Horarios");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 27, SpringLayout.SOUTH, comboBox_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel_5);
		panel_2.add(lblNewLabel_6);
		
		JList<? extends E> list_3 = new JList();
		sl_panel_2.putConstraint(SpringLayout.NORTH, list_3, 47, SpringLayout.SOUTH, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.WEST, list_3, 0, SpringLayout.WEST, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, list_3, 113, SpringLayout.SOUTH, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.EAST, list_3, 94, SpringLayout.WEST, panel_2);
		panel_2.add(list_3);
		
		JButton btnNewButton_9 = new JButton("Remover horario");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_9, 107, SpringLayout.SOUTH, comboBox_4);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_9, 0, SpringLayout.WEST, comboBox_4);
		panel_2.add(btnNewButton_9);
		
		JComboBox comboBox_5 = new JComboBox();
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_5, 6, SpringLayout.SOUTH, lblNewLabel_6);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_5, 0, SpringLayout.WEST, lblNewLabel_5);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_5, 0, SpringLayout.EAST, list_3);
		panel_2.add(comboBox_5);
		
		JButton btnNewButton_10 = new JButton("Adicionar horario");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_10, 0, SpringLayout.NORTH, comboBox_5);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_10, 0, SpringLayout.WEST, comboBox_4);
		panel_2.add(btnNewButton_10);
		
		JLabel lblNewLabel_7 = new JLabel("Aluno");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 47, SpringLayout.SOUTH, list_3);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNewLabel_7, 0, SpringLayout.WEST, lblNewLabel_5);
		panel_2.add(lblNewLabel_7);
		
		JComboBox comboBox_6 = new JComboBox();
		sl_panel_2.putConstraint(SpringLayout.NORTH, comboBox_6, 6, SpringLayout.SOUTH, lblNewLabel_7);
		sl_panel_2.putConstraint(SpringLayout.WEST, comboBox_6, 27, SpringLayout.WEST, panel_2);
		panel_2.add(comboBox_6);
		
		JButton btnNewButton_11 = new JButton("Adicionar aluno");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_11, 91, SpringLayout.SOUTH, btnNewButton_9);
		sl_panel_2.putConstraint(SpringLayout.EAST, comboBox_6, -6, SpringLayout.WEST, btnNewButton_11);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnNewButton_11, 0, SpringLayout.EAST, comboBox_4);
		panel_2.add(btnNewButton_11);
		
		JList<? extends E> list_4 = new JList();
		sl_panel_2.putConstraint(SpringLayout.NORTH, list_4, 19, SpringLayout.SOUTH, comboBox_6);
		sl_panel_2.putConstraint(SpringLayout.WEST, list_4, 27, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, list_4, -33, SpringLayout.SOUTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, list_4, 0, SpringLayout.EAST, comboBox_6);
		panel_2.add(list_4);
		
		JButton btnNewButton_12 = new JButton("Remover aluno");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnNewButton_12, 70, SpringLayout.SOUTH, btnNewButton_11);
		sl_panel_2.putConstraint(SpringLayout.WEST, btnNewButton_12, 0, SpringLayout.WEST, btnNewButton_11);
		panel_2.add(btnNewButton_12);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Aluno", null, panel_3, null);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel lblNewLabel_8 = new JLabel("Alunos");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 38, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_8, 33, SpringLayout.WEST, panel_3);
		panel_3.add(lblNewLabel_8);
		
		JButton btnNewButton_14 = new JButton("Remover");
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnNewButton_14, -4, SpringLayout.NORTH, lblNewLabel_8);
		panel_3.add(btnNewButton_14);
		
		JLabel lblNewLabel_10 = new JLabel("Disciplinas com o aluno cadastrado");
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, lblNewLabel_8);
		panel_3.add(lblNewLabel_10);
		
		JComboBox comboBox_8 = new JComboBox();
		sl_panel_3.putConstraint(SpringLayout.WEST, btnNewButton_14, 6, SpringLayout.EAST, comboBox_8);
		sl_panel_3.putConstraint(SpringLayout.NORTH, comboBox_8, -4, SpringLayout.NORTH, lblNewLabel_8);
		sl_panel_3.putConstraint(SpringLayout.WEST, comboBox_8, 6, SpringLayout.EAST, lblNewLabel_8);
		sl_panel_3.putConstraint(SpringLayout.EAST, comboBox_8, -433, SpringLayout.EAST, panel_3);
		panel_3.add(comboBox_8);
		
		JList<? extends E> list_5 = new JList();
		sl_panel_3.putConstraint(SpringLayout.NORTH, list_5, 242, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, list_5, 33, SpringLayout.WEST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, list_5, -79, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, list_5, -477, SpringLayout.EAST, panel_3);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNewLabel_10, -13, SpringLayout.NORTH, list_5);
		panel_3.add(list_5);
		
		JLabel lblNewLabel_9 = new JLabel("Curso cadastrado");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_9, 29, SpringLayout.SOUTH, comboBox_8);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_9, 0, SpringLayout.WEST, lblNewLabel_8);
		panel_3.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("*nome do curso*");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 11, SpringLayout.SOUTH, lblNewLabel_9);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNewLabel_11, 0, SpringLayout.WEST, lblNewLabel_8);
		panel_3.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Nota:");
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNewLabel_12, -203, SpringLayout.SOUTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel_12, 0, SpringLayout.EAST, comboBox_8);
		panel_3.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Horario");
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNewLabel_13, 0, SpringLayout.SOUTH, lblNewLabel_9);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblNewLabel_13, 0, SpringLayout.EAST, comboBox_8);
		panel_3.add(lblNewLabel_13);
		
		JList<? extends E> list_6 = new JList();
		sl_panel_3.putConstraint(SpringLayout.NORTH, list_6, 6, SpringLayout.SOUTH, lblNewLabel_13);
		sl_panel_3.putConstraint(SpringLayout.WEST, list_6, 0, SpringLayout.WEST, lblNewLabel_13);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, list_6, 103, SpringLayout.SOUTH, lblNewLabel_13);
		sl_panel_3.putConstraint(SpringLayout.EAST, list_6, 177, SpringLayout.EAST, lblNewLabel_11);
		panel_3.add(list_6);
	}
}
