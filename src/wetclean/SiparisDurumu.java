package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLayeredPane;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class SiparisDurumu extends JFrame {

	private JPanel contentPane;
	private JTable table;

	DefaultTableModel modelim = new DefaultTableModel();
	Object[] kolonlar = {"Ad","Soyad","Sipariþ No","Sipariþ Tarihi","Teslim Tarihi","Sipariþ Tutarý","Teslim Durumu"};
	Object[] satirlar = new Object[7];
	private JTextField txt_ad;
	private JTextField txt_soyad;
	private JTextField txt_tutar;
	public String sipno;
	private JTextField sorgula;
	private int hafýza = 0;
	public String tarih;
	public String date = null;
	public void showDate() { 				//TARÝH FORMATI
		Date d = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("dd.MM.yyyy");
		tarih = sf.format(d);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SiparisDurumu frame = new SiparisDurumu();
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
	public SiparisDurumu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SiparisDurumu.class.getResource("/ikonlar/natura.png")));
		showDate();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(255, 255, 255));
		scrollPane.setBounds(46, 157, 677, 241);
		contentPane.add(scrollPane);
		

		JLabel lblTeslimDurumu = new JLabel("");
		lblTeslimDurumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeslimDurumu.setForeground(new Color(248, 248, 255));
		lblTeslimDurumu.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeslimDurumu.setBounds(519, 238, 149, 23);
		contentPane.add(lblTeslimDurumu);
		
		table = new JTable();
		table.setBorder(null);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				hafýza = 1;
				String ad,soyad,siparisno,siparistarihi,teslimtarihi,siparistutari,teslimdurumuu;	
				
				 ad=((String) modelim.getValueAt(table.getSelectedRow(), 0));
				 soyad=((String) modelim.getValueAt(table.getSelectedRow(), 1));
				 siparisno=((String) modelim.getValueAt(table.getSelectedRow(), 2));
				 siparistarihi=((String) modelim.getValueAt(table.getSelectedRow(), 3));
				 teslimtarihi=((String) modelim.getValueAt(table.getSelectedRow(), 4));
				 siparistutari=((String) modelim.getValueAt(table.getSelectedRow(), 5));
				 teslimdurumuu=((String) modelim.getValueAt(table.getSelectedRow(), 6));
				 
				 
				 txt_ad.setText(ad);
				 txt_soyad.setText(soyad);
				 txt_tutar.setText(siparistutari);
				 sipno = siparisno;
				 lblTeslimDurumu.setText(teslimdurumuu);
				 
				}
				
			
		});
		table.setGridColor(new Color(128, 0, 0));
		table.setForeground(new Color(0, 0, 0));
		table.setBackground(new Color(255, 255, 240));
		table.setFont(new Font("Tahoma", Font.BOLD, 12));
		modelim.setColumnIdentifiers(kolonlar);
		scrollPane.setViewportView(table);
		table.setBounds(138, 70, 257, 172);
		

		SqlSorgu.siparisdurumu();
		String sorgu = "select * from siparisdurumu";
		ResultSet myRs = SqlSorgu.sorgula(sorgu);
		try {
			while(myRs.next()) {
				satirlar[0] = myRs.getString("ad");
				satirlar[1] = myRs.getString("soyad");
				satirlar[2] = myRs.getString("siparisno");
				satirlar[3] = myRs.getString("siparistarihi");
				satirlar[4] = myRs.getString("teslimtarihi");
				satirlar[5] = myRs.getString("siparistutari");
				satirlar[6] = myRs.getString("teslimdurumu");
				
				
				
				if (myRs.getInt("teslimdurumu")==0) {
					satirlar[6]="Teslim Edilmedi";
				}
				else if (myRs.getInt("teslimdurumu")==1){
					satirlar[6]="Teslim Edildi";
				}
				modelim.addRow(satirlar);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		table.setModel(modelim);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 7, 774, 72);
		contentPane.add(panel);
		
		JLabel lblSipariDurumu = new JLabel("S\u0130PAR\u0130\u015E DURUMU");
		lblSipariDurumu.setHorizontalAlignment(SwingConstants.CENTER);
		lblSipariDurumu.setForeground(new Color(139, 69, 19));
		lblSipariDurumu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSipariDurumu.setBounds(290, 4, 188, 22);
		panel.add(lblSipariDurumu);
		
		JButton btnYpanelineDn = new JButton("Y.Paneline D\u00F6n");
		btnYpanelineDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiPaneli obj = new YoneticiPaneli();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		btnYpanelineDn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnYpanelineDn.setFocusable(false);
		btnYpanelineDn.setBorder(UIManager.getBorder("CheckBox.border"));
		btnYpanelineDn.setBounds(10, 31, 131, 36);
		panel.add(btnYpanelineDn);
		
		txt_ad = new JTextField();
		txt_ad.setVisible(false);
		txt_ad.setBackground(new Color(192, 192, 192));
		txt_ad.setForeground(new Color(0, 0, 128));
		txt_ad.setHorizontalAlignment(SwingConstants.CENTER);
		txt_ad.setEditable(false);
		txt_ad.setFocusable(false);
		txt_ad.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_ad.setBorder(null);
		txt_ad.setBounds(117, 232, 120, 35);
		contentPane.add(txt_ad);
		txt_ad.setColumns(10);
		
		txt_soyad = new JTextField();
		txt_soyad.setVisible(false);
		txt_soyad.setBackground(new Color(192, 192, 192));
		txt_soyad.setForeground(new Color(0, 0, 128));
		txt_soyad.setHorizontalAlignment(SwingConstants.CENTER);
		txt_soyad.setEditable(false);
		txt_soyad.setFocusable(false);
		txt_soyad.setFont(new Font("Tahoma", Font.BOLD, 17));
		txt_soyad.setBorder(null);
		txt_soyad.setBounds(244, 232, 110, 35);
		contentPane.add(txt_soyad);
		txt_soyad.setColumns(10);
		
		txt_tutar = new JTextField();
		txt_tutar.setVisible(false);
		txt_tutar.setBackground(new Color(192, 192, 192));
		txt_tutar.setHorizontalAlignment(SwingConstants.RIGHT);
		txt_tutar.setForeground(new Color(0, 0, 128));
		txt_tutar.setEditable(false);
		txt_tutar.setFocusable(false);
		txt_tutar.setFont(new Font("Tahoma", Font.BOLD, 15));
		txt_tutar.setBorder(null);
		txt_tutar.setBounds(406, 233, 70, 35);
		contentPane.add(txt_tutar);
		txt_tutar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("TL");
		lblNewLabel.setForeground(new Color(255, 250, 250));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(486, 238, 27, 25);
		contentPane.add(lblNewLabel);
		
		JButton teslimet = new JButton("Teslim Et");
		teslimet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblTeslimDurumu.getText()=="Teslim Edilmedi") {
				String geneltoplam = null;
				String sorgula= "select * from toplamkazanc";
				
				SqlSorgu.bakiye();
				
				ResultSet myRs = SqlSorgu.sorgula(sorgula);
				try {
					while(myRs.next()) {
					geneltoplam= myRs.getString("ToplamKazanç");
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				double gt = Double.valueOf(geneltoplam);
				double st = Double.valueOf(txt_tutar.getText());
				
				gt+=st;
				
				String geneltoplamm=String.valueOf(gt);
				
				String sql_sorgu = "UPDATE toplamkazanc SET ToplamKazanç ='"+geneltoplamm+"'";
				SqlSorgu.guncelle(sql_sorgu);
				
				// günlük kazanca yazma
				
				String sorgula2= "SELECT * FROM gunlukkazanc ORDER BY No DESC LIMIT 1 ";
				
				double kazanc = 0;
				String dateilk2=null;
				int dateilk2int = 0;
				String tarihilk2 = null;
				int tarihilk2int = 0;
				
				String dateay2 = null;
				int dateay2int = 0;
				String dateyil = null;
				int dateyilint = 0;
				
				String tarihay2 = tarih.substring(3, 5);					
				int tarihay2int = Integer.valueOf(tarihay2);
				String tarihyil = tarih.substring(6, 10);
				int tarihyilint = Integer.valueOf(tarihyil);
				
				SqlSorgu.bakiye();
				
				ResultSet myRs2 = SqlSorgu.sorgula(sorgula2);
				try {
					while(myRs2.next()) {
					date = myRs2.getString("Tarih");
					kazanc = myRs2.getDouble("Kazanç");
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if (date!=null) {
					dateilk2 = date.substring(0, 2);
					dateilk2int = Integer.valueOf(dateilk2);
					dateay2 = date.substring(3, 5);
					dateay2int = Integer.valueOf(dateay2);
					dateyil = date.substring(6, 10);
					dateyilint = Integer.valueOf(dateyil);
					
				}
					tarihilk2 = tarih.substring(0, 2);					
					tarihilk2int = Integer.valueOf(tarihilk2);	
							
										
				if(date!=null && dateilk2int==tarihilk2int && dateay2int==tarihay2int && dateyilint==tarihyilint) {
					String sql= "update gunlukkazanc set Kazanç = Kazanç+'"+st+"' where Tarih = '"+date+"' ";
					SqlSorgu.guncelle(sql);
				}
				else {
					String sql = "insert into gunlukkazanc(Tarih,Kazanç) values('"+tarih+"', '"+st+"')";
					SqlSorgu.guncelle(sql);
				}
				
				// aylýk kazanca yazma			
				
				String sorgula3= "SELECT Tarih, SUM(Kazanç) AS Kazanc FROM gunlukkazanc\r\n" + 
						"WHERE Tarih LIKE '%"+tarihay2+"."+tarihyil+"' ";
				
				double kazancc = 0;
				
				SqlSorgu.bakiye();
				
				ResultSet myRs3 = SqlSorgu.sorgula(sorgula3);
				try {
					while(myRs3.next()) {
					date = myRs3.getString("Tarih");
					kazanc = myRs3.getDouble("Kazanc");
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String sorgula4= "SELECT * FROM aylikkazanc ORDER BY No DESC LIMIT 1 ";
				
				ResultSet myRs4 = SqlSorgu.sorgula(sorgula4);				// aylýkkazançtan sorguluyoruz
				String datee = null;
				try {
					while(myRs4.next()) {
					datee = myRs4.getString("Tarih");				
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
						
				
				
				if (datee!=null) {
					dateay2 = datee.substring(0, 2);
					dateay2int = Integer.valueOf(dateay2);
					dateyil = datee.substring(3, 7);
					dateyilint = Integer.valueOf(dateyil);
				}
				
				
				
				if (datee != null && dateyilint == tarihyilint && dateay2int == tarihay2int) {
					String sql= "update aylikkazanc set AylýkKazanç = AylýkKazanç+'"+st+"' where Tarih = '"+dateay2+"."+dateyil+"' ";
					SqlSorgu.guncelle(sql);
				}
				else {
					String sql = "insert into aylikkazanc(Tarih,AylýkKazanç) values('"+tarih.substring(3,10)+"', '"+st+"')";
					SqlSorgu.guncelle(sql);
				}
										
				
				
				
				
				//
				
					
				String teslimet = "update siparisdurumu set teslimdurumu=1 where siparisno='"+sipno+"' ";
				SqlSorgu.guncelle(teslimet);
				JOptionPane uyarý = new JOptionPane();
				uyarý.showInternalMessageDialog(null, "Sipariþ Teslim Edildi.", "Sipariþ Durumu", 1);
				
				SiparisDurumu obj  =new SiparisDurumu();
				obj.setVisible(true);
				setVisible(false);
			}else {
				JOptionPane uyarý2 = new JOptionPane();
				uyarý2.showInternalMessageDialog(null, "Bu Sipariþ Zaten Teslim Edilmiþ.", "Sipariþ Durumu", 1);
				SiparisDurumu dön = new SiparisDurumu();
				dön.setVisible(true);
				setVisible(false);
				
			}
				}
		});
		teslimet.setVisible(false);
		teslimet.setBackground(new Color(0, 0, 0));
		teslimet.setForeground(new Color(0, 0, 255));
		teslimet.setFont(new Font("Tahoma", Font.BOLD, 12));
		teslimet.setFocusable(false);
		teslimet.setBounds(337, 409, 101, 25);
		contentPane.add(teslimet);
		
		JButton btnNewButton = new JButton("Se\u00E7");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(0, 0, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (hafýza!=0) {
				btnNewButton.setVisible(false);
				teslimet.setVisible(true);
				scrollPane.setVisible(false);
				
				 txt_ad.setVisible(true);
				 txt_soyad.setVisible(true);
				 txt_tutar.setVisible(true);
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Lütfen önce kiþi seçiniz.", "Uyarý", 1);
				}
				
			}
		});
		btnNewButton.setBounds(337, 445, 101, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblSipariTutar = new JLabel("Sipari\u015F Tutar\u0131 :");
		lblSipariTutar.setHorizontalAlignment(SwingConstants.CENTER);
		lblSipariTutar.setForeground(new Color(248, 248, 255));
		lblSipariTutar.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSipariTutar.setBounds(364, 199, 149, 23);
		contentPane.add(lblSipariTutar);
		
		JLabel label = new JLabel("____________");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(248, 248, 255));
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(374, 192, 137, 49);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("____________");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(248, 248, 255));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(526, 192, 137, 49);
		contentPane.add(label_1);
		
		JLabel lblTeslimDurumu_1 = new JLabel("Teslim Durumu :");
		lblTeslimDurumu_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblTeslimDurumu_1.setForeground(new Color(248, 248, 255));
		lblTeslimDurumu_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTeslimDurumu_1.setBounds(520, 199, 149, 23);
		contentPane.add(lblTeslimDurumu_1);
		
		JButton btnNewButton_1 = new JButton("Teslim Edilenler");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				//SqlSorgu.siparisdurumu();
				String sorgu = "select * from siparisdurumu where teslimdurumu=1";
				ResultSet myRs = SqlSorgu.sorgula(sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("siparisno");
						satirlar[3] = myRs.getString("siparistarihi");
						satirlar[4] = myRs.getString("teslimtarihi");
						satirlar[5] = myRs.getString("siparistutari");
						satirlar[6] = myRs.getString("teslimdurumu");
						if (myRs.getInt("teslimdurumu")==0) {
							satirlar[6]="Teslim Edilmedi";
						}
						else if (myRs.getInt("teslimdurumu")==1){
							satirlar[6]="Teslim Edildi";
						}
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(142, 123, 183, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Teslim Edilmeyenler");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelim.setRowCount(0);
				//SqlSorgu.siparisdurumu();
				String sorgu = "select * from siparisdurumu where teslimdurumu=0";
				ResultSet myRs = SqlSorgu.sorgula(sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("siparisno");
						satirlar[3] = myRs.getString("siparistarihi");
						satirlar[4] = myRs.getString("teslimtarihi");
						satirlar[5] = myRs.getString("siparistutari");
						satirlar[6] = myRs.getString("teslimdurumu");
						if (myRs.getInt("teslimdurumu")==0) {
							satirlar[6]="Teslim Edilmedi";
						}
						else if (myRs.getInt("teslimdurumu")==1){
							satirlar[6]="Teslim Edildi";
						}
						modelim.addRow(satirlar);
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(modelim);
			
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(443, 123, 183, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnBoralacak = new JButton("Bor\u00E7-Alacak");
		btnBoralacak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakiye ne = new Bakiye();
				ne.setVisible(true);
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
				SiparisDurumu ob = new SiparisDurumu();
				ob.setVisible(true);
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Ad", "Soyad", "Sipari\u015F No", "Sipari\u015F Tarihi", "Teslim Tarihi", "Sipari\u015F Tutar\u0131"}));
		comboBox.setBounds(548, 90, 101, 22);
		contentPane.add(comboBox);
		
		sorgula = new JTextField();
		sorgula.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				modelim.setRowCount(0);
				String sql_sorgu=null;
				
				String alan = sorgula.getText();
				
				ResultSet myRs = null;
				
				int secilen = comboBox.getSelectedIndex();
				
				if(secilen==0) {
					 sql_sorgu = "select * from siparisdurumu where ad like'"+ alan +"%'";
				}else if(secilen==1) {
					 sql_sorgu = "select * from siparisdurumu where soyad like'"+ alan +"%'";
				}else if(secilen==2) {
					 sql_sorgu = "select * from siparisdurumu where siparisno like'"+ alan +"%'";
				}else if(secilen==3) {
					 sql_sorgu = "select * from siparisdurumu where siparistarihi like'"+ alan +"%'";
				}else if(secilen==4) {
					 sql_sorgu = "select * from siparisdurumu where teslimtarihi like'"+ alan +"%'";
				}else if(secilen==5) {
					sql_sorgu = "select * from siparisdurumu where siparistutari like'"+ alan +"%'";
				}
					
				
				// sql_sorgu = "select * from musteriler where soyad like'"+ alan +"%'";
				SqlSorgu.siparisdurumu();
				myRs = SqlSorgu.sorgula(sql_sorgu);
				try {
					while(myRs.next()) {
						satirlar[0] = myRs.getString("ad");
						satirlar[1] = myRs.getString("soyad");
						satirlar[2] = myRs.getString("siparisno");
						satirlar[3] = myRs.getString("siparistarihi");
						satirlar[4] = myRs.getString("teslimtarihi");
						satirlar[5] = myRs.getString("siparistutari");
						satirlar[6] = myRs.getString("teslimdurumu");
						if (myRs.getInt("teslimdurumu")==0) {
							satirlar[6]="Teslim Edilmedi";
						}
						else if (myRs.getInt("teslimdurumu")==1){
							satirlar[6]="Teslim Edildi";
						}
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
		sorgula.setBorder(new SoftBevelBorder(BevelBorder.RAISED, new Color(0, 0, 128), null, null, null));
		sorgula.setBounds(659, 90, 125, 20);
		contentPane.add(sorgula);
		sorgula.setColumns(10);
		

		

	}
}
		
