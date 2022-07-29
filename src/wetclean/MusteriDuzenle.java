package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.xdevapi.Statement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.ComponentOrientation;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class MusteriDuzenle extends JFrame {

	public JPanel contentPane;
	public JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	Object[] kolonlar = {"ad","soyad","telefon","adres","tarih","no"};
	Object[] satirlar = new Object[6];
	public JTextField txt_ad;
	public JTextField txt_soyad;
	public JTextField txt_telefon;
	public JTextField txt_no;
	public JTextField txt_musterisoyad;
	private JTextField txt_guncellendi;
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MusteriDuzenle() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MusteriDuzenle.class.getResource("/ikonlar/natura.png")));
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new LineBorder(new Color(139, 69, 19), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane();
		
		scrollPane.setBounds(355, 111, 429, 276);
		contentPane.add(scrollPane);
		
		table = new JTable();
		modelim.setColumnIdentifiers(kolonlar);
		table.setBounds(407, 245, 247, 148);
		scrollPane.setViewportView(table);
		

		
		modelim.setRowCount(0);
		
		ResultSet myRs = SqlSorgu.yap();
		
		try {
			while(myRs.next()) {
				satirlar[0] = myRs.getString("ad");
				satirlar[1] = myRs.getString("soyad");
				satirlar[2] = myRs.getString("telefon");
				satirlar[3] = myRs.getString("adres");
				satirlar[4] = myRs.getString("tarih");
				satirlar[5] = myRs.getString("no");
				modelim.addRow(satirlar);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		table.setModel(modelim);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(224, 255, 255), null, null, null));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 7, 774, 72);
		contentPane.add(panel);
		
		JLabel lblYeniSipari = new JLabel("M\u00DC\u015ETER\u0130 D\u00DCZENLE");
		lblYeniSipari.setHorizontalAlignment(SwingConstants.CENTER);
		lblYeniSipari.setForeground(new Color(139, 69, 19));
		lblYeniSipari.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYeniSipari.setBounds(284, 4, 183, 22);
		panel.add(lblYeniSipari);
		
		JButton button_4 = new JButton("Ana Sayfa");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiPaneli ana = new YoneticiPaneli();
				ana.setVisible(true);
				setVisible(false);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setFocusable(false);
		button_4.setBorder(UIManager.getBorder("CheckBox.border"));
		button_4.setBounds(10, 31, 131, 36);
		panel.add(button_4);
		
		JButton btnBoralacak = new JButton("Bor\u00E7-Alacak");
		btnBoralacak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakiye obj = new Bakiye();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnBoralacak.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBoralacak.setFocusable(false);
		btnBoralacak.setBorder(UIManager.getBorder("CheckBox.border"));
		btnBoralacak.setBounds(151, 31, 131, 36);
		panel.add(btnBoralacak);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFocusable(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ad", "Soyad", "Telefon", "Tarih", "No"}));
		comboBox.setBounds(455, 415, 121, 23);
		contentPane.add(comboBox);
		
		JButton sorgula = new JButton("Sorgula");
		sorgula.setBackground(new Color(0, 0, 0));
		sorgula.setForeground(SystemColor.textHighlight);
		sorgula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan = txt_musterisoyad.getText();
				
				ResultSet myRs = null;
				
				int secilen = comboBox.getSelectedIndex();
				
				if(secilen==0) {
					 sql_sorgu = "select * from musteriler where ad like'"+ alan +"%'";
				}else if(secilen==1) {
					 sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				}else if(secilen==2) {
					 sql_sorgu = "select * from musteriler where telefon like'"+ alan +"%'";
				}else if(secilen==3) {
					 sql_sorgu = "select * from musteriler where tarih like'"+ alan +"%'";
				}else if(secilen==4) {
					 sql_sorgu = "select * from musteriler where no like'"+ alan +"%'";
				}
					
				
				// sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				SqlSorgu.yap();
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("telefon");
						satirlar[3] = myRs.getString("adres");
						satirlar[4] = myRs.getString("tarih");
						satirlar[5] = myRs.getString("no");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			
			}
		});
		sorgula.setFocusable(false);
		sorgula.setFont(new Font("Tahoma", Font.BOLD, 12));
		sorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan = txt_musterisoyad.getText();
				
				ResultSet myRs = null;
				
				int secilen = comboBox.getSelectedIndex();
				
				if(secilen==0) {
					 sql_sorgu = "select * from musteriler where ad like'"+ alan +"%'";
				}else if(secilen==1) {
					 sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				}else if(secilen==2) {
					 sql_sorgu = "select * from musteriler where telefon like'"+ alan +"%'";
				}else if(secilen==3) {
					 sql_sorgu = "select * from musteriler where tarih like'"+ alan +"%'";
				}else if(secilen==4) {
					 sql_sorgu = "select * from musteriler where no like'"+ alan +"%'";
				}
					
				
				// sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				SqlSorgu.yap();
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("telefon");
						satirlar[3] = myRs.getString("adres");
						satirlar[4] = myRs.getString("tarih");
						satirlar[5] = myRs.getString("no");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			}
		});
		sorgula.setBounds(527, 464, 114, 23);
		contentPane.add(sorgula);
		
		txt_ad = new JTextField();
		txt_ad.setColumns(10);
		txt_ad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_ad.setBackground(new Color(230, 230, 250));
		txt_ad.setBounds(117, 148, 190, 20);
		contentPane.add(txt_ad);
		
		
		
		JLabel label = new JLabel("ADI");
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(63, 142, 23, 31);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("SOYADI");
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setBounds(39, 186, 47, 23);
		contentPane.add(label_1);
		
		txt_soyad = new JTextField();
		txt_soyad.setColumns(10);
		txt_soyad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_soyad.setBackground(new Color(230, 230, 250));
		txt_soyad.setBounds(117, 188, 190, 20);
		contentPane.add(txt_soyad);
		
		JLabel label_2 = new JLabel("TELEFONU");
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_2.setBounds(27, 226, 59, 31);
		contentPane.add(label_2);
		
		txt_telefon = new JTextField();
		txt_telefon.setColumns(10);
		txt_telefon.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_telefon.setBackground(new Color(230, 230, 250));
		txt_telefon.setBounds(117, 232, 127, 20);
		contentPane.add(txt_telefon);
		
		JLabel label_3 = new JLabel("ADRES\u0130");
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setBounds(39, 285, 47, 23);
		contentPane.add(label_3);
		
		JTextArea txt_adres = new JTextArea();
		txt_adres.setWrapStyleWord(true);
		txt_adres.setLineWrap(true);
		txt_adres.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_adres.setBackground(new Color(230, 230, 250));
		txt_adres.setBounds(117, 290, 190, 72);
		contentPane.add(txt_adres);
		
		
		
		
		txt_no = new JTextField();
		txt_no.setHorizontalAlignment(SwingConstants.CENTER);
		txt_no.setEditable(false);
		txt_no.setFocusable(false);
		txt_no.setBackground(new Color(230, 230, 250));
		txt_no.setBounds(117, 109, 53, 20);
		contentPane.add(txt_no);
		txt_no.setColumns(10);
		
		JLabel lblMteriNo = new JLabel("M\u00DC\u015ETER\u0130 NO");
		lblMteriNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMteriNo.setForeground(Color.WHITE);
		lblMteriNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMteriNo.setBounds(10, 103, 76, 31);
		contentPane.add(lblMteriNo);
		
		txt_musterisoyad = new JTextField();
		txt_musterisoyad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				modelim.setRowCount(0);
				
				String sql_sorgu=null;
				
				String alan = txt_musterisoyad.getText();
				
				ResultSet myRs = null;
				
				int secilen = comboBox.getSelectedIndex();
				
				if(secilen==0) {
					 sql_sorgu = "select * from musteriler where ad like'"+ alan +"%'";
				}else if(secilen==1) {
					 sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				}else if(secilen==2) {
					 sql_sorgu = "select * from musteriler where telefon like'"+ alan +"%'";
				}else if(secilen==3) {
					 sql_sorgu = "select * from musteriler where tarih like'"+ alan +"%'";
				}else if(secilen==4) {
					 sql_sorgu = "select * from musteriler where no like'"+ alan +"%'";
				}
					
				
				// sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				SqlSorgu.yap();
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("telefon");
						satirlar[3] = myRs.getString("adres");
						satirlar[4] = myRs.getString("tarih");
						satirlar[5] = myRs.getString("no");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
			
			}
		});
		txt_musterisoyad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txt_musterisoyad.setText(null);
			}
		});
		txt_musterisoyad.setText("Sorgu giriniz...");
		txt_musterisoyad.setBounds(601, 416, 114, 20);
		contentPane.add(txt_musterisoyad);
		txt_musterisoyad.setColumns(10);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txt_ad.setText((String) modelim.getValueAt(table.getSelectedRow(), 0));
				txt_soyad.setText((String) modelim.getValueAt(table.getSelectedRow(), 1));
				txt_telefon.setText((String) modelim.getValueAt(table.getSelectedRow(), 2));
				txt_adres.setText((String) modelim.getValueAt(table.getSelectedRow(), 3));
				txt_no.setText((String) modelim.getValueAt(table.getSelectedRow(), 5));
			}
		});
		
		JButton guncelle = new JButton("G\u00FCncelle");
		guncelle.setBackground(new Color(0, 0, 0));
		guncelle.setForeground(SystemColor.textHighlight);
		guncelle.setFocusable(false);
		guncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_guncellendi.setText(null);
				// UPDATE musteriler Set ad='', soyad='', 
				
				String ad,soyad,telefon,adres,sql_sorgu2,no;
				
				ad=txt_ad.getText();
				soyad=txt_soyad.getText();
				telefon=txt_telefon.getText();
				adres=txt_adres.getText();
				no = txt_no.getText();
				
				sql_sorgu2 = "UPDATE musteriler SET ad='"+ad+"',soyad='"+soyad+"',telefon='"+telefon+"',adres='"+adres+"',no='"+no+"' WHERE no='"+no+"'";
				//System.out.println(sql_sorgu2);
				Baglanti.yap();
				Baglanti.guncelle(sql_sorgu2);
				txt_guncellendi.setText("Müþteri güncellemesi baþarýlý.");
				
				String bakiye = "UPDATE bakiye SET ad='"+ad+"',soyad='"+soyad+"' WHERE idbakiye='"+no+"'";
				Baglanti.guncelle(bakiye);
				
				String mustericari = "UPDATE mustericari SET ad='"+ad+"',soyad='"+soyad+"' WHERE idmustericari='"+no+"'";
				Baglanti.guncelle(mustericari);
				
				String sipariskayit = "UPDATE sipariskayit SET ad='"+ad+"',soyad='"+soyad+"' WHERE idsipariskayit='"+no+"'";
				Baglanti.guncelle(sipariskayit);
				
				txt_ad.setText(null);
				txt_soyad.setText(null);
				txt_telefon.setText(null);
				txt_adres.setText(null);
				txt_no.setText(null);
				
				modelim.setRowCount(0);
				
				ResultSet myRs = SqlSorgu.yap();
				
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("telefon");
						satirlar[3] = myRs.getString("adres");
						satirlar[4] = myRs.getString("tarih");
						satirlar[5] = myRs.getString("no");
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(modelim);
				
				
			}
		});
		guncelle.setFont(new Font("Tahoma", Font.BOLD, 12));
		guncelle.setBounds(117, 389, 127, 23);
		contentPane.add(guncelle);
		
		txt_guncellendi = new JTextField();
		txt_guncellendi.setEditable(false);
		txt_guncellendi.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_guncellendi.setHorizontalAlignment(SwingConstants.CENTER);
		txt_guncellendi.setFocusable(false);
		txt_guncellendi.setBounds(68, 426, 227, 20);
		contentPane.add(txt_guncellendi);
		txt_guncellendi.setColumns(10);
		
	/*	JButton sil = new JButton("Sil");
		sil.setFont(new Font("Tahoma", Font.BOLD, 12));
		sil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String soyadd,sql_sorgu;
				
				soyadd = txt_musterisoyad.getText();
				
				//DELETE FROM musteriler WHERE soyad'"+soyad+"'";
				sql_sorgu = "DELETE FROM musteriler WHERE soyad='"+soyadd+"'";
				Baglanti.sil(sql_sorgu);
			}
		});
		sil.setBounds(659, 428, 114, 23);
		contentPane.add(sil);
		*/
		
		
		
		
		
		
		
		//contentPane.add(table);
	}
}
