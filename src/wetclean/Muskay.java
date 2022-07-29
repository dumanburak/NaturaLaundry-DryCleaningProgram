package wetclean;

import java.sql.*;
import javax.swing.text.MaskFormatter;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.x.protobuf.MysqlxCursor.Open;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Desktop;

import javax.swing.DropMode;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.awt.SystemColor;
import java.awt.Label;
import java.awt.Toolkit;

public class Muskay extends JFrame {
	
	private JFrame frame;
	private JTable table;

	private JLabel kayit_tarihi;
	private JPanel frmClass;
	private JTextField txt_ad;
	private JTextField txt_soyad;
	private JTextField txt_telefon;
	private JTextField kayityazi;
	private JTextField txt_tarih;
	private JTextField txt_no;
	public int sayaç = 0;
	private JTextField textField;

	public void number() {
		
	}
	
	public void showDate() { 				//TARÝH FORMATI
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");
		txt_tarih.setText(sf.format(d));
	}
	
	public static void NewScreen () {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Muskay frame = new Muskay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 * @throws Exception 
	 */


		public Muskay() throws Exception {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Muskay.class.getResource("/ikonlar/natura.png")));
	
		setBackground(new Color(47, 79, 79));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 498);
		frmClass = new JPanel();
		frmClass.setBackground(new Color(47, 79, 79));
		frmClass.setForeground(new Color(255, 255, 255));
		frmClass.setBorder(new LineBorder(new Color(139, 69, 19), 3));
		setContentPane(frmClass);
		frmClass.setLayout(null);
			
			
		JPanel panemenu = new JPanel();
		panemenu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(224, 255, 255), null, null, null));
		panemenu.setBackground(SystemColor.activeCaption);
		panemenu.setBounds(10, 7, 774, 72);		
		frmClass.add(panemenu);
		panemenu.setLayout(null);
		
		JButton YeniSip = new JButton("Yeni Sipari\u015F");
		YeniSip.setFocusable(false);
		YeniSip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YeniSiparis yeni = new YeniSiparis();
				yeni.setVisible(true);
				setVisible(false);
			}
		});
		YeniSip.setBorder(UIManager.getBorder("CheckBox.border"));
		YeniSip.setFont(new Font("Tahoma", Font.BOLD, 12));
		YeniSip.setBounds(253, 31, 123, 35);
		panemenu.add(YeniSip);
		
		JLabel label = new JLabel("M\u00DC\u015ETER\u0130 KAYDI");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(139, 69, 19));
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(305, 4, 157, 22);
		panemenu.add(label);
		
		JButton MusEks = new JButton("M\u00FC\u015Fteri Ekstre");
		MusEks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakiye obj = new Bakiye();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		MusEks.setFocusable(false);
		MusEks.setBorder(UIManager.getBorder("CheckBox.border"));
		MusEks.setFont(new Font("Tahoma", Font.BOLD, 12));
		MusEks.setBounds(386, 31, 123, 35);
		panemenu.add(MusEks);
		
		JButton FiyatLis = new JButton("Fiyat Listesi");
		FiyatLis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			         
			        Desktop.getDesktop().browse(new java.net.URI("https://www.naturalaundry.com/kopyasi-kuru-temizleme-1"));
			         
			    } catch (IOException | URISyntaxException e1) {
			        e1.printStackTrace();
			    }
			
			}
		});
		FiyatLis.setFocusable(false);
		FiyatLis.setBorder(UIManager.getBorder("CheckBox.border"));
		FiyatLis.setFont(new Font("Tahoma", Font.BOLD, 12));
		FiyatLis.setBounds(519, 31, 123, 35);
		panemenu.add(FiyatLis);
		
		JButton Rapor = new JButton("Raporlar");
		Rapor.setFocusable(false);
		Rapor.setBorder(UIManager.getBorder("CheckBox.border"));
		Rapor.setFont(new Font("Tahoma", Font.BOLD, 12));
		Rapor.setBounds(652, 31, 112, 35);
		panemenu.add(Rapor);
		
		JButton AnaSayfa = new JButton("Ana Sayfa");
		AnaSayfa.setFocusable(false);
		AnaSayfa.setBounds(10, 31, 100, 36);
		panemenu.add(AnaSayfa);
		AnaSayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard frm2 = new Dashboard();
				frm2.setVisible(true);
				setVisible(false);
			}
		});
		AnaSayfa.setFont(new Font("Tahoma", Font.BOLD, 12));
		AnaSayfa.setBorder(UIManager.getBorder("CheckBox.border"));
		
		JButton MusKayit = new JButton("M\u00FC\u015Fteri Kay\u0131t");
		MusKayit.setFocusable(false);
		MusKayit.setBounds(120, 31, 123, 36);
		panemenu.add(MusKayit);
		MusKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Muskay yenii = null;
				try {
					yenii = new Muskay();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				yenii.setVisible(true);
				setVisible(false);
				
			  
			   
			   
	}});
		
			MusKayit.setAutoscrolls(true);
			MusKayit.setBorder(UIManager.getBorder("CheckBox.border"));
			MusKayit.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lbl_adi = new JLabel("ADI");
		lbl_adi.setForeground(new Color(255, 255, 255));
		lbl_adi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_adi.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_adi.setBounds(85, 161, 23, 31);
		frmClass.add(lbl_adi);
		
		JLabel lbl_soyadi = new JLabel("SOYADI");
		lbl_soyadi.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_soyadi.setForeground(Color.WHITE);
		lbl_soyadi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_soyadi.setBounds(61, 205, 47, 23);
		frmClass.add(lbl_soyadi);
		
		JLabel lbl_adresi = new JLabel("ADRES\u0130");
		lbl_adresi.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_adresi.setForeground(Color.WHITE);
		lbl_adresi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_adresi.setBounds(61, 304, 47, 23);
		frmClass.add(lbl_adresi);
		
		JLabel lbl_telefonu = new JLabel("TELEFONU");
		lbl_telefonu.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_telefonu.setForeground(Color.WHITE);
		lbl_telefonu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_telefonu.setBounds(49, 245, 59, 31);
		frmClass.add(lbl_telefonu);
		
		JLabel lbl_kayittarihi = new JLabel("KAYIT TARÝHÝ");
		lbl_kayittarihi.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_kayittarihi.setForeground(Color.WHITE);
		lbl_kayittarihi.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_kayittarihi.setBounds(561, 128, 89, 23);
		frmClass.add(lbl_kayittarihi);
		txt_ad = new JTextField();
		txt_ad.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_ad.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txt_ad.addKeyListener(new KeyAdapter() {
			
			
			  //BÝR ALT SATIRA ENTER'LE GEÇÝÞ
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					txt_soyad.requestFocus();
							}
		});
		txt_ad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_ad.setBackground(new Color(230, 230, 250));
		txt_ad.setBounds(139, 167, 190, 20);
		frmClass.add(txt_ad);
		txt_ad.setColumns(10);
		txt_soyad = new JTextField();
		txt_soyad.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_soyad.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
			if(e.getKeyCode()==KeyEvent.VK_ENTER)
					txt_telefon.requestFocus();
				}
			
		});
		txt_soyad.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_soyad.setBackground(new Color(230, 230, 250));
		txt_soyad.setBounds(139, 207, 190, 20);
		frmClass.add(txt_soyad);
		txt_soyad.setColumns(10);
			
		JTextArea txt_adres = new JTextArea();
		txt_adres.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_adres.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){

					
					
					String ad, soyad,adres,telefon,tarih,sql_sorgu,no;
					
					ad = txt_ad.getText();
					soyad = txt_soyad.getText();
					telefon = txt_telefon.getText();
					adres = txt_adres.getText();
					tarih = txt_tarih.getText();
					no=txt_no.getText();
					

					sql_sorgu ="INSERT INTO musteriler (ad, soyad, telefon, adres, tarih, no)  "
							+ "VALUES ('" + ad + "'," + "'" + soyad + "'," + "'" + telefon + "'," + "'" + adres + "'," + "'" + tarih + "'," + "'" + no + "')";
					
					
					
					
					txt_ad.setText(null);
					txt_soyad.setText(null);
					txt_telefon.setText(null);
					txt_adres.setText(null);
					String a=txt_no.getText();
					int ifade = Integer.valueOf(a);
					ifade+=1;
					String b = String.valueOf(ifade);
					txt_no.setText(b);
					
				//System.out.println(sql_sorgu);
			
			Baglanti.yap();
			Baglanti.ekle(sql_sorgu);
			kayityazi.setText(null);
			kayityazi.setText(ad +" "+ soyad+ " isimli kayýt baþarýyla eklendi. ");
											
			txt_ad.requestFocus();
		        }
			}
		});
		txt_adres.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		txt_adres.setBackground(new Color(230, 230, 250));
		txt_adres.setWrapStyleWord(true);
		txt_adres.setLineWrap(true);
		txt_adres.setBounds(139, 309, 190, 97);
		frmClass.add(txt_adres);
		
		
		
		
		JFormattedTextField txt_telefon = new JFormattedTextField(new MaskFormatter("(###) ### ## ##"));
		txt_telefon.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_telefon.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					txt_adres.requestFocus();
			}
			
	});
		
		txt_telefon.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_telefon.setBackground(new Color(230, 230, 250));
		txt_telefon.setBounds(139, 251, 127, 20);
		frmClass.add(txt_telefon);
		txt_telefon.setColumns(10);
		setUndecorated(true);
		
		JButton btn_kaydet = new JButton("KAYDET");
		btn_kaydet.setBackground(SystemColor.desktop);
		btn_kaydet.setForeground(SystemColor.textHighlight);
		btn_kaydet.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_kaydet.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		btn_kaydet.setFocusable(false);
		btn_kaydet.setBounds(585, 406, 89, 23);
		frmClass.add(btn_kaydet);
		
		kayityazi = new JTextField();
		kayityazi.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		kayityazi.setBackground(new Color(230, 230, 250));
		kayityazi.setHorizontalAlignment(SwingConstants.CENTER);
		kayityazi.setEditable(false);
		kayityazi.setFont(new Font("Calibri", Font.BOLD, 11));
		kayityazi.setBounds(500, 440, 258, 23);
		frmClass.add(kayityazi);
		kayityazi.setColumns(10);
		
		
		
		
		
		txt_tarih = new JTextField();
		txt_tarih.setFocusable(false);
		txt_tarih.setVerifyInputWhenFocusTarget(false);
		txt_tarih.setFont(new Font("Tahoma", Font.BOLD, 11));
		txt_tarih.setHorizontalAlignment(SwingConstants.CENTER);
		txt_tarih.setEditable(false);
		txt_tarih.setBounds(660, 130, 98, 20);
		frmClass.add(txt_tarih);
		txt_tarih.setColumns(10);
		
		JLabel lblMteriNo = new JLabel("M\u00DC\u015ETER\u0130 NO");
		lblMteriNo.setHorizontalAlignment(SwingConstants.LEFT);
		lblMteriNo.setForeground(Color.WHITE);
		lblMteriNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMteriNo.setBounds(32, 127, 76, 23);
		frmClass.add(lblMteriNo);
		String s =String.valueOf(nosayici.musterino());
		
		txt_no = new JTextField();
		txt_no.setFocusable(false);
		txt_no.setFont(new Font("Tahoma", Font.BOLD, 12));
		txt_no.setEditable(false);
		txt_no.setHorizontalAlignment(SwingConstants.CENTER);
		s =String.valueOf(nosayici.musterino());
		txt_no.setText(s);
		txt_no.setColumns(10);
		txt_no.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
		txt_no.setBackground(new Color(230, 230, 250));
		txt_no.setBounds(139, 130, 53, 20);
		frmClass.add(txt_no);
		
		
		/*new JFormattedTextField(new MaskFormatter("(###) ###-####"));
		textField.setBounds(517, 207, 86, 20);
		frmClass.add(textField);
		textField.setColumns(10);
				*/
		//txt_soyad.requestFocus();
			
	
		btn_kaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String ad, soyad,adres,telefon,tarih,sql_sorgu,no,bakiye_sorgu;
				
				ad = txt_ad.getText();
				soyad = txt_soyad.getText();
				if(ad.isEmpty()||soyad.isEmpty()) {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Ad-Soyad kýsmý boþ býrakýlamaz.", "Uyarý", 2);
				}
				else {
				
				telefon = txt_telefon.getText();
				adres = txt_adres.getText();
				tarih = txt_tarih.getText();
				no=txt_no.getText();
				

				sql_sorgu ="INSERT INTO musteriler (ad, soyad, telefon, adres, tarih, no)  "
						+ "VALUES ('" + ad + "'," + "'" + soyad + "'," + "'" + telefon + "'," + "'" + adres + "'," + "'" + tarih + "'," + "'" + no + "')";
				
				/*bakiye_sorgu ="INSERT INTO bakiye (idbakiye,ad,soyad,borcumuz,alacagimiz)  "
						+ "VALUES ('" + no + "'," + "'" + ad + "'," + "'" + soyad +"')";*/
				
				bakiye_sorgu ="INSERT INTO bakiye (idbakiye,ad,soyad,borcumuz,alacagimiz)  "
						+ "VALUES ('" + no + "'," + "'" + ad + "'," + "'" + soyad +"','0','0')";
				
				String sipariskayit="INSERT INTO sipariskayit (idsipariskayit,ad,soyad)  "
						+ "VALUES ('" + no + "'," + "'" + ad + "'," + "'" + soyad +"')";
				
				String mustericari = "INSERT INTO mustericari (idmustericari,ad,soyad)  "
						+ "VALUES ('" + no + "'," + "'" + ad + "'," + "'" + soyad +"')";
				
				
				txt_ad.setText(null);
				txt_soyad.setText(null);
				txt_telefon.setText(null);
				txt_adres.setText(null);
				String a=txt_no.getText();
				int ifade = Integer.valueOf(a);
				ifade+=1;
				String b = String.valueOf(ifade);
				txt_no.setText(b);
				
			//System.out.println(sql_sorgu);
		
		Baglanti.yap();
		Baglanti.ekle(sql_sorgu);
		Baglanti.ekle(bakiye_sorgu);
		Baglanti.ekle(sipariskayit);
		Baglanti.ekle(mustericari);
		kayityazi.setText(null);
		kayityazi.setText(ad +" "+ soyad+ " isimli kayýt baþarýyla eklendi. ");
				}
			}
					
			
		});
		
		// SELECT COUNT(no) FROM musteriler 
		showDate();
		
		
		}	
}