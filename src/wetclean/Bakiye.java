package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class Bakiye extends JFrame {

	private JPanel contentPane;
	private JTable table;
	public int hafýza;
	public int sayaç;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"No","Ad","Soyad","Borcumuz","Alacaðýmýz"};
	Object[] satirlar = new Object[5];
	private JTextField miktar;
	private JTextField secildi;
	private JTextField eklendi;
	private JTextField txt_sorgula;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bakiye frame = new Bakiye();
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
	public Bakiye() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Bakiye.class.getResource("/ikonlar/natura.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 7, 774, 72);
		contentPane.add(panel);
		
		JButton button = new JButton("M\u00FC\u015Fteri D\u00FCzenle");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusteriDuzenle frm = new MusteriDuzenle();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusable(false);
		button.setBorder(UIManager.getBorder("CheckBox.border"));
		button.setBounds(151, 31, 131, 36);
		panel.add(button);
		
		JButton listele = new JButton("Listele");
		listele.setBackground(new Color(0, 0, 0));
		listele.setForeground(SystemColor.textHighlight);
		listele.setFont(new Font("Tahoma", Font.BOLD, 12));
		listele.setFocusable(false);
		listele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {}
		});
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setForeground(Color.WHITE);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 90, 404, 321);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setLocation(new Point(5, 0));
		table.setName("");
		table.setGridColor(new Color(165, 42, 42));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		table.setRequestFocusEnabled(false);
		table.setVerifyInputWhenFocusTarget(false);
		table.setFocusable(false);
		table.setBounds(371, 165, 368, 268);
		//contentPane.add(table);
		scrollPane.setViewportView(table);
		listele.setBounds(10, 435, 89, 23);
		contentPane.add(listele);
		
		JButton button_2 = new JButton("Ana Sayfa");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiPaneli frm = new YoneticiPaneli();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusable(false);
		button_2.setBorder(UIManager.getBorder("CheckBox.border"));
		button_2.setBounds(10, 31, 131, 36);
		panel.add(button_2);
		
		JLabel lblBorAlacak = new JLabel("BOR\u00C7 - ALACAK");
		lblBorAlacak.setHorizontalAlignment(SwingConstants.CENTER);
		lblBorAlacak.setForeground(new Color(139, 69, 19));
		lblBorAlacak.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBorAlacak.setBounds(284, 4, 183, 22);
		panel.add(lblBorAlacak);
		
		JButton btnSipariDurumu = new JButton("Sipari\u015F Durumu");
		btnSipariDurumu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiparisDurumu obj = new SiparisDurumu();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnSipariDurumu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSipariDurumu.setFocusable(false);
		btnSipariDurumu.setBorder(UIManager.getBorder("CheckBox.border"));
		btnSipariDurumu.setBounds(292, 31, 131, 36);
		panel.add(btnSipariDurumu);
		modelim.setColumnIdentifiers(kolonlar);
		
		miktar = new JTextField();
		miktar.setFont(new Font("Tahoma", Font.BOLD, 15));
		miktar.setHorizontalAlignment(SwingConstants.LEFT);
		miktar.setColumns(10);
		miktar.setBackground(new Color(230, 230, 250));
		miktar.setBounds(557, 109, 86, 25);
		contentPane.add(miktar);
		
		JButton btnBorEkle = new JButton("Bor\u00E7 Ekle");
		btnBorEkle.setBackground(new Color(0, 0, 0));
		btnBorEkle.setForeground(SystemColor.textHighlight);
		btnBorEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sayaç==1) {
				
				String miktarr,sql_sorgu;
				
				miktarr = miktar.getText();
				
				sql_sorgu = "UPDATE bakiye SET borcumuz='"+miktarr+"' where idbakiye='"+hafýza+"'";
				SqlSorgu.bakiye();
				SqlSorgu.guncelle(sql_sorgu);
				eklendi.setText(miktarr+ " TL Borç-Alacak eklendi.");
				
				miktar.setText(null);
				
				secildi.setVisible(true);
				scrollPane.setVisible(true);
				


				
				modelim.setRowCount(0);
				
				ResultSet myRs = SqlSorgu.bakiye();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
				
				
			
			
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Önce kiþi seçiniz.", "Uyarý", 2);
				}
					
			}
		});
		btnBorEkle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorEkle.setFocusable(false);
		btnBorEkle.setBounds(474, 154, 102, 23);
		contentPane.add(btnBorEkle);
		
		JButton btnBorcualacaSil = new JButton("Borcu Sil");
		btnBorcualacaSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sayaç==1) {

				String miktarr,sql_sorgu;
				
				miktarr = miktar.getText();
				
				sql_sorgu = "UPDATE bakiye SET borcumuz='0' where idbakiye='"+hafýza+"'";
				SqlSorgu.bakiye();
				SqlSorgu.guncelle(sql_sorgu);
				eklendi.setText("Borç sýfýrlandý.");
				
				miktar.setText(null);
				
				secildi.setVisible(true);
				scrollPane.setVisible(true);
				


				
				modelim.setRowCount(0);
				
				ResultSet myRs = SqlSorgu.bakiye();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
				
				
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Önce kiþi seçiniz.", "Uyarý", 2);
				}
				
			
			}
		});
		btnBorcualacaSil.setBackground(new Color(0, 0, 0));
		btnBorcualacaSil.setForeground(SystemColor.textHighlight);
		btnBorcualacaSil.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBorcualacaSil.setFocusable(false);
		btnBorcualacaSil.setBounds(474, 279, 102, 23);
		contentPane.add(btnBorcualacaSil);
		


		
		modelim.setRowCount(0);
		
		ResultSet myRs = SqlSorgu.bakiye();
		
		try {
			while(myRs.next()) {
				satirlar[0] = myRs.getString("idbakiye");
				satirlar[1] = myRs.getString("ad");
				satirlar[2] = myRs.getString("soyad");
				satirlar[3] = myRs.getString("borcumuz");
				satirlar[4] = myRs.getString("alacagimiz");
				
				modelim.addRow(satirlar);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		table.setModel(modelim);
		
		
	
	
		
		JButton btnAlacakEkle = new JButton("Alacak Ekle");
		btnAlacakEkle.setBackground(new Color(0, 0, 0));
		btnAlacakEkle.setForeground(SystemColor.textHighlight);
		btnAlacakEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sayaç==1) {

				
				String miktarr,sql_sorgu;
				
				miktarr = miktar.getText();
				
				sql_sorgu = "UPDATE bakiye SET alacagimiz='"+miktarr+"' where idbakiye='"+hafýza+"'";
				SqlSorgu.bakiye();
				SqlSorgu.guncelle(sql_sorgu);
				eklendi.setText(miktarr+ " TL Borç-Alacak eklendi.");
				
				miktar.setText(null);
				
				secildi.setVisible(true);
				scrollPane.setVisible(true);
				


				
				modelim.setRowCount(0);
				
				ResultSet myRs = SqlSorgu.bakiye();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
				
				
			
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Önce kiþi seçiniz.", "Uyarý", 2);
				}
				
			
			}
		});
		btnAlacakEkle.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlacakEkle.setFocusable(false);
		btnAlacakEkle.setBounds(625, 154, 102, 23);
		contentPane.add(btnAlacakEkle);
		
		JButton btnAlacakSil = new JButton("Alacak Sil");
		btnAlacakSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sayaç==1) {

				
				String miktarr,sql_sorgu;
				
				miktarr = miktar.getText();
				
				sql_sorgu = "UPDATE bakiye SET alacagimiz='0' where idbakiye='"+hafýza+"'";
				SqlSorgu.bakiye();
				SqlSorgu.guncelle(sql_sorgu);
				eklendi.setText("Alacak sýfýrlandý.");
				
				miktar.setText(null);
				
				secildi.setVisible(true);
				scrollPane.setVisible(true);
				


				
				modelim.setRowCount(0);
				
				ResultSet myRs = SqlSorgu.bakiye();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
				
				
			
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Önce kiþi seçiniz.", "Uyarý", 2);
				}
				
			
			}
		});
		btnAlacakSil.setBackground(new Color(0, 0, 0));
		btnAlacakSil.setForeground(SystemColor.textHighlight);
		btnAlacakSil.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAlacakSil.setFocusable(false);
		btnAlacakSil.setBounds(625, 279, 102, 23);
		contentPane.add(btnAlacakSil);
		
		JButton sec = new JButton("Se\u00E7");
		sec.setBackground(new Color(0, 0, 0));
		sec.setForeground(SystemColor.textHighlight);
		sec.setFocusable(false);
		sec.setFont(new Font("Tahoma", Font.BOLD, 12));
		sec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String idbakiye,ad,soyad,borcumuz,alacagimiz;
				
				idbakiye=((String) modelim.getValueAt(table.getSelectedRow(), 0));
				 ad=((String) modelim.getValueAt(table.getSelectedRow(), 1));
				 soyad=((String) modelim.getValueAt(table.getSelectedRow(), 2));
				 borcumuz=((String) modelim.getValueAt(table.getSelectedRow(), 3));
				 alacagimiz=((String) modelim.getValueAt(table.getSelectedRow(), 4));
				 
				 
				 int b = Integer.valueOf(idbakiye);
				 hafýza = b;
				 
				 
				 
				 scrollPane.setVisible(false);
				 
				 	secildi = new JTextField();
				 	secildi.setFont(new Font("Tahoma", Font.BOLD, 20));
					secildi.setFocusable(false);
					secildi.setEditable(false);
					secildi.setHorizontalAlignment(SwingConstants.CENTER);
					secildi.setColumns(10);
					secildi.setBackground(SystemColor.inactiveCaptionBorder);
					secildi.setBounds(46, 126, 320, 63);
					secildi.setText(ad+" "+soyad);
					contentPane.add(secildi);
				 	
					sayaç=1;
			}
		});
		sec.setBounds(325, 435, 89, 23);
		contentPane.add(sec);
		
		eklendi = new JTextField();
		eklendi.setFocusable(false);
		eklendi.setEditable(false);
		eklendi.setHorizontalAlignment(SwingConstants.CENTER);
		eklendi.setColumns(10);
		eklendi.setBackground(new Color(230, 230, 250));
		eklendi.setBounds(498, 195, 197, 23);
		contentPane.add(eklendi);
		
		JLabel lblNewLabel = new JLabel("TL");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(648, 112, 35, 18);
		contentPane.add(lblNewLabel);
		
		txt_sorgula = new JTextField();
		txt_sorgula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {


				SqlSorgu.bakiye();
				modelim.setRowCount(0);
				String soyad = txt_sorgula.getText();
				
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from bakiye where soyad like'"+ soyad +"%'";
				
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			
			
			}
		});
		txt_sorgula.setHorizontalAlignment(SwingConstants.LEFT);
		txt_sorgula.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_sorgula.setColumns(10);
		txt_sorgula.setBackground(new Color(230, 230, 250));
		txt_sorgula.setBounds(592, 386, 114, 25);
		contentPane.add(txt_sorgula);
		
		JButton sorgula = new JButton("Sorgula");
		sorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				SqlSorgu.bakiye();
				modelim.setRowCount(0);
				String soyad = txt_sorgula.getText();
				
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from bakiye where soyad like'"+ soyad +"%'";
				
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("idbakiye");
						satirlar[1] = myRs.getString("ad");
						satirlar[2] = myRs.getString("soyad");
						satirlar[3] = myRs.getString("borcumuz");
						satirlar[4] = myRs.getString("alacagimiz");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			
			}
		});
		sorgula.setFont(new Font("Tahoma", Font.BOLD, 12));
		sorgula.setFocusable(false);
		sorgula.setBackground(Color.BLACK);
		sorgula.setForeground(SystemColor.textHighlight);
		sorgula.setBounds(557, 435, 86, 23);
		contentPane.add(sorgula);
		
		JLabel lblNewLabel_1 = new JLabel("M\u00FC\u015Fteri Soyad\u0131");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(474, 382, 121, 32);
		contentPane.add(lblNewLabel_1);
		
		
		
		
		
		
		
		
	}
}
