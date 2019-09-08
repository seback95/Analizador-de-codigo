package FrontEnd;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;




import javax.swing.JButton;
import javax.swing.JComboBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTextField;
import javax.swing.JTextPane;

import javax.swing.UIManager;


import BackEnd.Archivo;
import BackEnd.Clase;
import BackEnd.Metodo;
import BackEnd.Packag;
import BackEnd.Proyecto;
import BackEnd.sourceP;


public class Interfaz {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				javax.swing.ToolTipManager.sharedInstance().setDismissDelay(90000000);
				javax.swing.ToolTipManager.sharedInstance().setInitialDelay(100);
				javax.swing.ToolTipManager.sharedInstance().setReshowDelay(10);
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					System.out.println("Error setting native LAF: " + e);
				}
				try {
					Interfaz window = new Interfaz();
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
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Code Analyzer");
		frame.setBounds(100, 100, 725, 457);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0 };
		gridBagLayout.rowHeights = new int[] { 26, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		frame.getContentPane().setLayout(gridBagLayout);

		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 0;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 529, 73, 59, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		textField = new JTextField();

		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 0, 5);
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel_1.add(textField, gbc_textField);
		textField.setColumns(10);

		JButton buscar = new JButton("Buscar");
		GridBagConstraints gbc_buscar = new GridBagConstraints();
		gbc_buscar.insets = new Insets(0, 0, 0, 5);
		gbc_buscar.gridx = 1;
		gbc_buscar.gridy = 0;
		panel_1.add(buscar, gbc_buscar);

		JButton analizar = new JButton("Analizar");
		GridBagConstraints gbc_analizar = new GridBagConstraints();
		gbc_analizar.gridx = 2;
		gbc_analizar.gridy = 0;
		panel_1.add(analizar, gbc_analizar);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 473, 0, 0 };
		gbl_panel.rowHeights = new int[] { 98, 237, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 2;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 0;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 238, 239, 259, 0 };
		gbl_panel_3.rowHeights = new int[] { 0, 0, 16, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		JTextPane recomendacion = new JTextPane();
		recomendacion.setEditable(false);
		GridBagConstraints gbc_recomendacion = new GridBagConstraints();
		gbc_recomendacion.insets = new Insets(0, 0, 0, 5);
		gbc_recomendacion.fill = GridBagConstraints.BOTH;
		gbc_recomendacion.gridx = 0;
		gbc_recomendacion.gridy = 2;
		panel.add(recomendacion, gbc_recomendacion);

		JLabel lblProyecto = new JLabel("Proyecto");
		GridBagConstraints gbc_lblProyecto = new GridBagConstraints();
		gbc_lblProyecto.insets = new Insets(0, 0, 5, 5);
		gbc_lblProyecto.gridx = 0;
		gbc_lblProyecto.gridy = 0;
		panel_3.add(lblProyecto, gbc_lblProyecto);

		JLabel lblSourcePackage = new JLabel("Source Package");
		GridBagConstraints gbc_lblSourcePackage = new GridBagConstraints();
		gbc_lblSourcePackage.insets = new Insets(0, 0, 5, 5);
		gbc_lblSourcePackage.gridx = 1;
		gbc_lblSourcePackage.gridy = 0;
		panel_3.add(lblSourcePackage, gbc_lblSourcePackage);

		JLabel lblPackage = new JLabel("Package");
		GridBagConstraints gbc_lblPackage = new GridBagConstraints();
		gbc_lblPackage.insets = new Insets(0, 0, 5, 0);
		gbc_lblPackage.gridx = 2;
		gbc_lblPackage.gridy = 0;
		panel_3.add(lblPackage, gbc_lblPackage);

		JComboBox<Proyecto> proyecto = new JComboBox<Proyecto>();
		GridBagConstraints gbc_proyecto = new GridBagConstraints();
		gbc_proyecto.insets = new Insets(0, 0, 5, 5);
		gbc_proyecto.fill = GridBagConstraints.HORIZONTAL;
		gbc_proyecto.gridx = 0;
		gbc_proyecto.gridy = 1;
		panel_3.add(proyecto, gbc_proyecto);

		
		
		JComboBox<sourceP> sourcepackage = new JComboBox<sourceP>();
		GridBagConstraints gbc_sourcepackage = new GridBagConstraints();
		gbc_sourcepackage.insets = new Insets(0, 0, 5, 5);
		gbc_sourcepackage.fill = GridBagConstraints.HORIZONTAL;
		gbc_sourcepackage.gridx = 1;
		gbc_sourcepackage.gridy = 1;
		panel_3.add(sourcepackage, gbc_sourcepackage);

		JComboBox<Packag> paquete = new JComboBox<Packag>();
		GridBagConstraints gbc_paquete = new GridBagConstraints();
		gbc_paquete.insets = new Insets(0, 0, 5, 0);
		gbc_paquete.fill = GridBagConstraints.HORIZONTAL;
		gbc_paquete.gridx = 2;
		gbc_paquete.gridy = 1;
		panel_3.add(paquete, gbc_paquete);

		JLabel lblArchivo = new JLabel("Archivo");
		GridBagConstraints gbc_lblArchivo = new GridBagConstraints();
		gbc_lblArchivo.insets = new Insets(0, 0, 5, 5);
		gbc_lblArchivo.gridx = 0;
		gbc_lblArchivo.gridy = 2;
		panel_3.add(lblArchivo, gbc_lblArchivo);

		JLabel lblClase = new JLabel("Clase");
		GridBagConstraints gbc_lblClase = new GridBagConstraints();
		gbc_lblClase.insets = new Insets(0, 0, 5, 5);
		gbc_lblClase.gridx = 1;
		gbc_lblClase.gridy = 2;
		panel_3.add(lblClase, gbc_lblClase);

		JLabel lblMetodo = new JLabel("Metodo");
		GridBagConstraints gbc_lblMetodo = new GridBagConstraints();
		gbc_lblMetodo.insets = new Insets(0, 0, 5, 0);
		gbc_lblMetodo.gridx = 2;
		gbc_lblMetodo.gridy = 2;
		panel_3.add(lblMetodo, gbc_lblMetodo);

		JComboBox<Archivo> archivos = new JComboBox<Archivo>();
		GridBagConstraints gbc_archivos = new GridBagConstraints();
		gbc_archivos.fill = GridBagConstraints.HORIZONTAL;
		gbc_archivos.insets = new Insets(0, 0, 0, 5);
		gbc_archivos.gridx = 0;
		gbc_archivos.gridy = 3;
		panel_3.add(archivos, gbc_archivos);

		JComboBox<Clase> clases = new JComboBox<>();
		GridBagConstraints gbc_clases = new GridBagConstraints();
		gbc_clases.fill = GridBagConstraints.HORIZONTAL;
		gbc_clases.insets = new Insets(0, 0, 0, 5);
		gbc_clases.gridx = 1;
		gbc_clases.gridy = 3;
		panel_3.add(clases, gbc_clases);

		JComboBox<Metodo> metodos = new JComboBox<>();
		GridBagConstraints gbc_metodos = new GridBagConstraints();
		gbc_metodos.fill = GridBagConstraints.HORIZONTAL;
		gbc_metodos.gridx = 2;
		gbc_metodos.gridy = 3;
		panel_3.add(metodos, gbc_metodos);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 1;
		panel.add(panel_2, gbc_panel_2);

		JTextPane lineasCod = new JTextPane();
		lineasCod.setEditable(false);
		lineasCod.setFont(new Font("Tahoma", Font.BOLD, 10));
		lineasCod.setBounds(106, 61, 51, 19);
		panel_2.add(lineasCod);

		JLabel lblCodigo = new JLabel("CC");
		lblCodigo.setBounds(10, 61, 86, 19);
		panel_2.add(lblCodigo);

		JTextPane fanOutC = new JTextPane();
		fanOutC.setEditable(false);
		fanOutC.setToolTipText("Numero de llamadas del metodo dentro de la clase propia del metodo");
		fanOutC.setFont(new Font("Tahoma", Font.BOLD, 10));
		fanOutC.setBounds(106, 111, 51, 19);
		panel_2.add(fanOutC);

		JLabel lblFanin = new JLabel("Fan Out");
		lblFanin.setBounds(10, 111, 86, 19);
		panel_2.add(lblFanin);

		JLabel lblComentarios = new JLabel("Comentarios");
		lblComentarios.setBounds(10, 86, 86, 19);
		panel_2.add(lblComentarios);

		JTextPane lineasComentarios = new JTextPane();
		lineasComentarios.setEditable(false);
		lineasComentarios.setFont(new Font("Tahoma", Font.BOLD, 10));
		lineasComentarios.setBounds(106, 86, 40, 19);
		panel_2.add(lineasComentarios);

		JLabel lblFanout = new JLabel("Fan In");
		lblFanout.setBounds(10, 136, 86, 19);
		panel_2.add(lblFanout);

		JTextPane fanIn = new JTextPane();
		fanIn.setEditable(false);
		fanIn.setFont(new Font("Tahoma", Font.BOLD, 10));
		fanIn.setBounds(106, 136, 51, 19);
		panel_2.add(fanIn);	
	}
}
