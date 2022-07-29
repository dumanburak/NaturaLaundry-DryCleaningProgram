package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
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
import java.text.ParseException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;

public class YeniSiparis extends JFrame {

	public JPanel contentPane;
	public JTable table;
	
	DefaultTableModel modelim = new DefaultTableModel();
	
	public Object[] kolonlar = {"ad","soyad","telefon","adres","tarih","no"};
	protected Object[] satirlar = new Object[6];
	protected JTextField txt_musterisoyad;
	
	
	
	public String ad;
	public String soyad;
	public String telefon;
	public String adres;
	public String no;

	public int hafýza;
	public int engelle=0;
	private JTextField secildi;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YeniSiparis frame = new YeniSiparis();
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
	public YeniSiparis() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(YeniSiparis.class.getResource("/ikonlar/natura.png")));
		
		
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(47, 79, 79));
		contentPane.setBorder(new LineBorder(new Color(139, 69, 19), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(386, 125, 361, 178);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 
				 
				 
				 
			}
		});
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
		
		JButton button = new JButton("Yeni Sipari\u015F");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YeniSiparis yeni = new YeniSiparis();
				yeni.setVisible(true);
				setVisible(false);
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setFocusable(false);
		button.setBorder(UIManager.getBorder("CheckBox.border"));
		button.setBounds(253, 31, 123, 35);
		panel.add(button);
		
		JLabel lblYeniSipari = new JLabel("YEN\u0130 S\u0130PAR\u0130\u015E");
		lblYeniSipari.setHorizontalAlignment(SwingConstants.CENTER);
		lblYeniSipari.setForeground(new Color(139, 69, 19));
		lblYeniSipari.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYeniSipari.setBounds(305, 4, 157, 22);
		panel.add(lblYeniSipari);
		
		JButton button_1 = new JButton("M\u00FC\u015Fteri Ekstre");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakiye obj = new Bakiye();
				obj.setVisible(true);
				setVisible(false);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setFocusable(false);
		button_1.setBorder(UIManager.getBorder("CheckBox.border"));
		button_1.setBounds(386, 31, 123, 35);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Fiyat Listesi");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			         
			        Desktop.getDesktop().browse(new java.net.URI("https://www.naturalaundry.com/kopyasi-kuru-temizleme-1"));
			         
			    } catch (IOException | URISyntaxException e1) {
			        e1.printStackTrace();
			    }
			
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setFocusable(false);
		button_2.setBorder(UIManager.getBorder("CheckBox.border"));
		button_2.setBounds(519, 31, 123, 35);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Raporlar");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_3.setFocusable(false);
		button_3.setBorder(UIManager.getBorder("CheckBox.border"));
		button_3.setBounds(652, 31, 112, 35);
		panel.add(button_3);
		
		JButton button_4 = new JButton("Ana Sayfa");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard ana = new Dashboard();
				ana.setVisible(true);
				setVisible(false);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_4.setFocusable(false);
		button_4.setBorder(UIManager.getBorder("CheckBox.border"));
		button_4.setBounds(10, 31, 100, 36);
		panel.add(button_4);
		
		JButton button_5 = new JButton("M\u00FC\u015Fteri Kay\u0131t");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Muskay mus = null;
				try {
					mus = new Muskay();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				mus.setVisible(true);
				setVisible(false);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_5.setFocusable(false);
		button_5.setBorder(UIManager.getBorder("CheckBox.border"));
		button_5.setAutoscrolls(true);
		button_5.setBounds(120, 31, 123, 36);
		panel.add(button_5);
		
		JLabel lblMteriSoyad = new JLabel("M\u00FC\u015Fteri Soyad\u0131");
		lblMteriSoyad.setHorizontalAlignment(SwingConstants.LEFT);
		lblMteriSoyad.setForeground(Color.WHITE);
		lblMteriSoyad.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMteriSoyad.setBounds(27, 123, 109, 25);
		contentPane.add(lblMteriSoyad);
		
		
		
		txt_musterisoyad = new JTextField();
		txt_musterisoyad.setBorder(null);
		txt_musterisoyad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				SqlSorgu.yap();
				modelim.setRowCount(0);
				String soyad = txt_musterisoyad.getText();
				
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from musteriler where soyad like'"+ soyad +"%'";
				
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
		txt_musterisoyad.setBackground(new Color(230, 230, 250));
		txt_musterisoyad.setBounds(134, 123, 154, 25);
		contentPane.add(txt_musterisoyad);
		txt_musterisoyad.setColumns(10);
		
		JButton sorgula = new JButton("Sorgula");
		sorgula.setBackground(new Color(102, 205, 170));
		sorgula.setFocusable(false);
		sorgula.setFont(new Font("Tahoma", Font.BOLD, 12));
		sorgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlSorgu.yap();
				modelim.setRowCount(0);
				String soyad = txt_musterisoyad.getText();
				
				ResultSet myRs = null;
				
				String sql_sorgu = "select * from musteriler where soyad like'"+ soyad +"%'";
				
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
		sorgula.setBounds(508, 314, 114, 23);
		contentPane.add(sorgula);
		
		JButton btnKuruTemizleme = new JButton("Sipari\u015F Olu\u015Ftur");
		btnKuruTemizleme.setBackground(new Color(224, 255, 255));
		btnKuruTemizleme.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (engelle==1) {
				String ad=null;
				String soyad=null;
				String tarih=null;
				String borc=null;
				String alacak=null;
				int numara=0 ;
				
				String sql_sorgu = "select * from musteriler where no='"+hafýza+"'";
				String sql_sorgu2 ="select * from bakiye where idbakiye='"+hafýza+"'";
				ResultSet myRs = SqlSorgu.isimcagir(sql_sorgu);
				ResultSet myRs2 = SqlSorgu.bakiyesorgula(sql_sorgu2);
				//SqlSorgu.isimcagir(sql_sorgu);
				
				try {
					while(myRs.next()) {
					ad= myRs.getString("ad");
					soyad =myRs.getString("soyad");
					tarih =myRs.getString("tarih");
					numara=myRs.getInt("no");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				try {
					while(myRs2.next()) {
					borc= myRs2.getString("borcumuz");
					alacak =myRs2.getString("alacagimiz");
					
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				KuruTemizleme yeni;
				try {
					yeni = new KuruTemizleme();
					yeni.gelenlerVeriler(ad, soyad,tarih,borc,alacak,numara);
					yeni.setVisible(true);
					setVisible(false);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				

				/*FiyatListesi obj = new FiyatListesi();
				KuruTemizleme y1 = new KuruTemizleme();
				String a = obj.ceket_kt.getText();
				double aa = Double.valueOf(a);
				//String b = obj.ceket_ütü.getText();
				//double bb = Double.valueOf(b);

			//	y1.fiyatlistesi(aa, bb);
				y1.setVisible(true);
				setVisible(false);
			*/
				
				
				
				
				
				}
				else {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null, "Kiþi seçmediniz", "Uyarý", 2);
					
					
				}
					
					
				
				
			}
		});
		btnKuruTemizleme.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnKuruTemizleme.setFocusable(false);
		btnKuruTemizleme.setBounds(320, 434, 140, 40);
		contentPane.add(btnKuruTemizleme);
		
		JButton btnNewButton_1 = new JButton("Se\u00E7");
		btnNewButton_1.setBackground(new Color(102, 205, 170));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				ad=((String) modelim.getValueAt(table.getSelectedRow(), 0));
				 soyad=((String) modelim.getValueAt(table.getSelectedRow(), 1));
				 telefon=((String) modelim.getValueAt(table.getSelectedRow(), 2));
				 adres=((String) modelim.getValueAt(table.getSelectedRow(), 3));
				 no=((String) modelim.getValueAt(table.getSelectedRow(), 5));
				 
				 
				 int b = Integer.valueOf(no);
				 hafýza = b;
				 engelle=1;
				 secildi.setText(ad+" "+soyad+" isimli kiþi seçildi.");
				}
				catch (Exception e1) {
					JOptionPane uyarý = new JOptionPane();
					uyarý.showMessageDialog(null,"Kiþi seçmediniz", "Uyarý", 2);
				}
				}
		});
		btnNewButton_1.setBounds(522, 363, 89, 23);
		contentPane.add(btnNewButton_1);
		
		secildi = new JTextField();
		secildi.setBackground(new Color(230, 230, 250));
		secildi.setHorizontalAlignment(SwingConstants.CENTER);
		secildi.setFont(new Font("Tahoma", Font.BOLD, 12));
		secildi.setFocusable(false);
		secildi.setEditable(false);
		secildi.setBounds(443, 397, 241, 16);
		contentPane.add(secildi);
		secildi.setColumns(10);
		
		
		
		
		
		//contentPane.add(table);
	}
}
