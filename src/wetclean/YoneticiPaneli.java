package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Frame;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class YoneticiPaneli extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YoneticiPaneli frame = new YoneticiPaneli();
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
	public YoneticiPaneli() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(YoneticiPaneli.class.getResource("/ikonlar/natura.png")));
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(205, 100, 794, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(139, 69, 19), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBounds(10, 7, 774, 72);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel arkaplan = new JLabel("");
		arkaplan.setIcon(new ImageIcon(Dashboard.class.getResource("/arkaplan.png")));
		arkaplan.setBounds(10, 100, 774, 350);
		contentPane.add(arkaplan);
		
		JLabel lblYneticiPaneli = new JLabel("Y\u00D6NET\u0130C\u0130 PANEL\u0130");
		lblYneticiPaneli.setHorizontalAlignment(SwingConstants.CENTER);
		lblYneticiPaneli.setForeground(new Color(139, 69, 19));
		lblYneticiPaneli.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblYneticiPaneli.setBounds(290, 4, 188, 22);
		panel.add(lblYneticiPaneli);
		
		JButton btnMteriSil = new JButton("M\u00FC\u015Fteri D\u00FCzenle");
		btnMteriSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MusteriDuzenle yeni = new MusteriDuzenle();
				yeni.setVisible(true);
				setVisible(false);
			}
		});
		btnMteriSil.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMteriSil.setFocusable(false);
		btnMteriSil.setBorder(UIManager.getBorder("CheckBox.border"));
		btnMteriSil.setBounds(10, 31, 131, 36);
		panel.add(btnMteriSil);
		
		JButton btnBoralacak = new JButton("Bor\u00E7-Alacak ");
		btnBoralacak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bakiye form = new Bakiye();
				form.setVisible(true);
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
		
		JButton btnNewButton = new JButton("Ana Sayfa'ya d\u00F6n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard frm = new Dashboard();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFocusable(false);
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(582, 461, 172, 24);
		contentPane.add(btnNewButton);
		
		JLabel icon = new JLabel("");
		icon.setIcon(new ImageIcon(Dashboard.class.getResource("/geridon.png")));
		icon.setBounds(755, 461, 29, 24);
		contentPane.add(icon);
		
	}
}
