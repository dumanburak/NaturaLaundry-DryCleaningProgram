package wetclean;

import java.sql.*;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;
import java.awt.Toolkit;

public class Dashboard extends JFrame {

	private JPanel frmClass;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
		public Dashboard() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/ikonlar/natura.png")));
		setUndecorated(true);
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
		panemenu.setBounds(10, 7, 774, 72);
		panemenu.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(224, 255, 255), null, null, null));
		panemenu.setBackground(new Color(0, 128, 128));
		frmClass.add(panemenu);
		panemenu.setLayout(null);
		
		JButton MusKayit = new JButton("M\u00FC\u015Fteri Kay\u0131t");
		MusKayit.setFocusable(false);
		MusKayit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				
			  // Muskay nw = new Muskay ();
			//   nw.NewScreen();

			   Muskay frm3 = null;
			try {
				frm3 = new Muskay();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				frm3.setVisible(true);
				setVisible(false);
			   
	}});
	
		MusKayit.setAutoscrolls(true);
		MusKayit.setBorder(UIManager.getBorder("CheckBox.border"));
		MusKayit.setFont(new Font("Tahoma", Font.BOLD, 12));
		MusKayit.setBounds(120, 31, 123, 36);
		panemenu.add(MusKayit);
		
		JButton YeniSip = new JButton("Yeni Sipari\u015F");
		YeniSip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YeniSiparis yeni = new YeniSiparis();
				yeni.setVisible(true);
				setVisible(false);
				
				
				
			}
		});
		YeniSip.setFocusable(false);
		YeniSip.setBorder(UIManager.getBorder("CheckBox.border"));
		YeniSip.setFont(new Font("Tahoma", Font.BOLD, 12));
		YeniSip.setBounds(253, 31, 123, 35);
		panemenu.add(YeniSip);
		
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
		AnaSayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AnaSayfa.setFocusable(false);
		AnaSayfa.setBounds(10, 31, 100, 36);
		panemenu.add(AnaSayfa);
		AnaSayfa.setFont(new Font("Tahoma", Font.BOLD, 12));
		AnaSayfa.setBorder(UIManager.getBorder("CheckBox.border"));
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setBounds(35, 100, 722, 350);
		arkaplan.setIcon(new ImageIcon(Dashboard.class.getResource("/arkaplan.png")));
		frmClass.add(arkaplan);
		
		JButton btnNewButton = new JButton("\u00C7\u0131k\u0131\u015F");
		btnNewButton.setBounds(660, 464, 89, 23);
		btnNewButton.setFocusable(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(0, 204, 0));
		frmClass.add(btnNewButton);
		
		JButton yoneticipaneli = new JButton("Y\u00F6netici Paneli");
		yoneticipaneli.setBounds(35, 461, 128, 23);
		yoneticipaneli.setFocusable(false);
		yoneticipaneli.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				YoneticiPaneli frm2 = new YoneticiPaneli();
				frm2.setVisible(true);
				setVisible(false);
				
			}
		});
		yoneticipaneli.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmClass.add(yoneticipaneli);
				
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
