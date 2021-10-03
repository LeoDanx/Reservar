package presentacion;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JProgressBar;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;

public class principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtOpcion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
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
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("--Reservaciones-- ");

		JLabel lblSeleccioneUnaOpcion = new JLabel("Seleccione una opcion");

		JLabel lblListarClientes = new JLabel("1) Listar Clientes ");

		JLabel lblRegistrarCliente = new JLabel("2) Registrar Cliente");

		JLabel lblListarClientes_1 = new JLabel("3) Buscar Cliente");

		JLabel lblDesocuparHabitacion = new JLabel("4) Desocupar Habitacion");

		JLabel lblHabitacionesDisponibles = new JLabel("5) Habitaciones disponibles");

		JLabel lblListarClientes_2 = new JLabel("");

		JButton btnAceptar = new JButton("Aceptar");

		final JLabel lbl1 = new JLabel("");
		final JLabel lbl2 = new JLabel("");

		btnAceptar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

			}
		});
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int contenido = 0;

				if (!txtOpcion.getText().toString().isBlank()) {

					contenido = Integer.parseInt(txtOpcion.getText());

				} else {

					lbl2.setText("Seleccione una opcion valida");

				}
				
				
				switch(contenido) {
				
					
				
				
				}

			}
		});

		JButton btnCancelar = new JButton("Salir");

		JSeparator separator = new JSeparator();

		txtOpcion = new JTextField();
		txtOpcion.setColumns(10);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(215).addComponent(lblListarClientes_2,
								GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(173).addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(21)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblHabitacionesDisponibles, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblDesocuparHabitacion, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblListarClientes_1, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblRegistrarCliente, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblListarClientes, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(separator, GroupLayout.PREFERRED_SIZE, 368,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSeleccioneUnaOpcion, GroupLayout.PREFERRED_SIZE, 199,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(127)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lbl2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtOpcion, Alignment.LEADING).addGroup(Alignment.LEADING,
														gl_contentPane.createSequentialGroup().addComponent(btnAceptar)
																.addGap(18).addComponent(btnCancelar)))))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(166).addComponent(lbl1,
								GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(12, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addComponent(lblNewLabel).addGap(18).addComponent(lblSeleccioneUnaOpcion)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(separator, GroupLayout.PREFERRED_SIZE, 2, GroupLayout.PREFERRED_SIZE).addGap(21)
				.addComponent(lblListarClientes).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblRegistrarCliente).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblListarClientes_1).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblDesocuparHabitacion).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblHabitacionesDisponibles).addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(lblListarClientes_2).addGap(44)
				.addComponent(
						txtOpcion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(btnAceptar)
						.addComponent(btnCancelar))
				.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE).addComponent(lbl2)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(lbl1).addGap(21)));
		contentPane.setLayout(gl_contentPane);
	}
}
