import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

@SuppressWarnings("serial")
public class View extends JFrame{
	
	private JPanel panel;
	private JScrollPane banner,left;
	private JLabel titre,introduction1,bannerImage,leftImage;
	private JButton buttonMobile,buttonFixe,buttonInternet;
	
	public View() {
		int x = Toolkit.getDefaultToolkit().getScreenSize().width;
		@SuppressWarnings("unused")
		int y = Toolkit.getDefaultToolkit().getScreenSize().height;
		panel = new JPanel();

		Controller controller = new Controller(this);
		
		bannerImage = new JLabel(new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\iamversion2\\src\\image\\banner.PNG")); 
		banner = new JScrollPane(bannerImage);
		panel.add(banner);
		banner.setBounds(0,0,x,160);;
		
		
		leftImage = new JLabel(new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\iamversion2\\src\\image\\left.PNG")); 
		left = new JScrollPane(leftImage);
		panel.add(left);
		left.setBounds(165,140,252,670);;
		
		
		
		
		
		
		titre = new JLabel("Paiement de facture en ligne");
		Font  fontTitre  = new Font(Font.SANS_SERIF,  Font.BOLD, 18);
		titre.setFont(fontTitre);
		titre.setBounds(-40+x/3,160,300,40);
		Color colorTitre = new Color(39,90,140); 
		titre.setForeground(colorTitre);
		
		introduction1 = new JLabel("<html>Maroc Télécom met à votre disposition le service de paiement en ligne qui vous permet de régler vos factures du Fixe, Mobile <br> et Internet en ligne par votre carte bancaire en toute sécurité .</html>");
		Font  fontIntroduction  = new Font(Font.SANS_SERIF,  Font.BOLD, 12);
		introduction1.setFont(fontIntroduction);
		introduction1.setBounds(x/3+10,210,850,30);
		
		
	    Icon IconMobile = new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\IAM\\src\\image\\IconMobile.PNG");
		buttonMobile = new JButton(IconMobile);
		buttonMobile.setBounds(40+x/3,300,190,237);
		buttonMobile.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonMobile.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonMobile.addActionListener(controller);
		
	    Icon IconFixe = new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\IAM\\src\\image\\IconFixe.PNG");
		buttonFixe = new JButton(IconFixe);
		buttonFixe.setBounds(250+x/3,300,190,237);
		buttonFixe.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonFixe.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	    Icon IconInternet = new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\IAM\\src\\image\\IconInternet.PNG");
		buttonInternet = new JButton(IconInternet);
		buttonInternet.setBounds(460+x/3,300,190,237);
		buttonInternet.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buttonInternet.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		panel.add(titre);panel.add(introduction1);
		panel.add(buttonMobile);panel.add(buttonFixe);panel.add(buttonInternet);
		
		this.setContentPane(panel);
		this.setLayout(null);
		this.setTitle("Acceuil");
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public JButton getButtonMobile() {
		return buttonMobile;
	}
	
	
}
