package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import menjacnica.Country;
import menjacnica.gui.kontroler.GUIKontroler;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblIzValuteZemlje;
	public JComboBox domacaZ;
	private JLabel lblUValutuZemlje;
	public JComboBox stranaZ;
	private JLabel lblIznos;
	public JTextField domacaIz;
	public JTextField stranaIz;
	private JLabel label;
	private JButton btnKonvertuj;

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblIzValuteZemlje());
		contentPane.add(getDomacaZ());
		contentPane.add(getLblUValutuZemlje());
		contentPane.add(getStranaZ());
		contentPane.add(getLblIznos());
		contentPane.add(getDomacaIz());
		contentPane.add(getStranaIz());
		contentPane.add(getLabel());
		contentPane.add(getBtnKonvertuj());
	}

	private JLabel getLblIzValuteZemlje() {
		if (lblIzValuteZemlje == null) {
			lblIzValuteZemlje = new JLabel("Iz valute zemlje");
			lblIzValuteZemlje.setBounds(70, 68, 106, 16);
		}
		return lblIzValuteZemlje;
	}

	private JComboBox getDomacaZ() {
		if (domacaZ == null) {
			domacaZ = new JComboBox();
			domacaZ.setBounds(70, 97, 122, 22);

		}
		return domacaZ;
	}

	private JLabel getLblUValutuZemlje() {
		if (lblUValutuZemlje == null) {
			lblUValutuZemlje = new JLabel("U valutu zemlje");
			lblUValutuZemlje.setBounds(300, 68, 122, 16);
		}
		return lblUValutuZemlje;
	}

	private JComboBox getStranaZ() {
		if (stranaZ == null) {
			stranaZ = new JComboBox();
			stranaZ.setBounds(300, 97, 122, 22);

		}
		return stranaZ;
	}

	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos:");
			lblIznos.setBounds(70, 175, 56, 16);
		}
		return lblIznos;
	}

	private JTextField getDomacaIz() {
		if (domacaIz == null) {
			domacaIz = new JTextField();
			domacaIz.setText("");
			domacaIz.setBounds(70, 204, 122, 22);
			domacaIz.setColumns(10);
		}
		return domacaIz;
	}

	private JTextField getStranaIz() {
		if (stranaIz == null) {
			stranaIz = new JTextField();
			stranaIz.setText("");
			stranaIz.setBounds(300, 204, 122, 22);
			stranaIz.setColumns(10);
		}
		return stranaIz;
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Iznos:");
			label.setBounds(300, 175, 56, 16);
		}
		return label;
	}

	private JButton getBtnKonvertuj() {
		if (btnKonvertuj == null) {
			btnKonvertuj = new JButton("Konvertuj");
			btnKonvertuj.setBounds(192, 292, 97, 25);
		}
		return btnKonvertuj;
	}

	public void dodajCB(JComboBox domacaZ, LinkedList<Country> countries) {
		for (int i = 0; i < countries.size(); i++)
			domacaZ.addItem(countries.get(i).getName());
	}
}
