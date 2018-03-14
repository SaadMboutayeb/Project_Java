import java.awt.Color;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View2 extends JFrame  {
	private JLabel paiement,methodePaiement,nomBank,iconMethodePayement,numCarte,dateExperation,moisCarte,anneeCarte,codeVerification,explicationCodeVerification,Confidencialite,AccepterCondition;
	private JComboBox<String> choixTypeCarte,choixNomBank,choixAnneeCarte,choixMoisCarte;
	private JButton annulerPaiement,validerPaiement; 
	private JPasswordField textCodeVerification;
	private JTextField textNumeroCatre;
	private JCheckBox checkCondition;
	private JPanel pane;
	public View2(Model1 model) {
		
		@SuppressWarnings("unused")
		Controller controller = new Controller(this,model);
		
		Font  paiementFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 26);
		
		paiement = new JLabel("  Paiement");
		paiement.setOpaque(true);
		paiement.setForeground(Color.white);
		paiement.setBackground(Color.decode("#f48024"));
		paiement.setBounds(0,0,500,40);
		paiement.setFont(paiementFont);

		
		methodePaiement = new JLabel("Méthode de paiement :");
		methodePaiement.setBounds(5, 75, 130, 20);
		
		String [] tabChoixTypeCarte = {"Visa","Master Card","CMI","Maestro"};
		choixTypeCarte = new JComboBox<String>(tabChoixTypeCarte);
		choixTypeCarte.setBounds(150,75,100,20);
		
		Icon iconPayement = new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\IAM\\src\\image\\methodePayement.PNG");
		iconMethodePayement = new JLabel(iconPayement);
		iconMethodePayement.setBounds(210,70,450,30);
		
		nomBank = new JLabel("Nom de votre banque :");
		nomBank.setBounds(5,120,150,20);
		
		String [] tabChoixNomBank = {"--------------------------------------","ARAB BANK","ATTIJARI WAFA BANK","AL BARID BANK","BANQUES POPULAIRES","BMCE BANK","BMCI","CDG CAPITAL","CFG Bank","CETELEM","CIH BANK","CREDIT AGRICOLE","CREDIT DU MAROC","DAR AL AMANE","SGMA","UMNIA BANK","DAR AL AMANE","AKHDAR BANK","NAJMAH","AL YOUSR","SAFA BANK","ARREDA"};
		choixNomBank = new JComboBox<String>(tabChoixNomBank);
		choixNomBank.setBounds(150,120,185,20);
		
		numCarte = new JLabel("Numéro de carte de paiement : ");
		numCarte.setBounds(5,165,180,20);
		
		textNumeroCatre = new JTextField();
		textNumeroCatre.setBounds(185,165,150,20);
		
		dateExperation = new JLabel("Date d'expiration :");
		dateExperation.setBounds(5, 210, 110, 20);
		
		moisCarte = new JLabel("Mois");
		moisCarte.setBounds(120,210,30,20);
		
		String [] tabChoixMoisCarte = {"1","2","3","4","5","6","7","8","9","10","11","12"};
		choixMoisCarte = new JComboBox<String>(tabChoixMoisCarte);
		choixMoisCarte.setBounds(155, 210, 50, 20);
		
		anneeCarte = new JLabel("Année");
		anneeCarte.setBounds(215,210,40,20);
		
		String [] tabChoixAnneeCarte = {"18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37"};
		choixAnneeCarte = new JComboBox<String>(tabChoixAnneeCarte);
		choixAnneeCarte.setBounds(260, 210, 50, 20);
		
		codeVerification = new JLabel("Code de vérification de la carte : ");
		codeVerification.setBounds(5, 250, 190, 20);
		
		textCodeVerification = new JPasswordField();
		textCodeVerification.setBounds(200, 250, 50, 20);
		
		explicationCodeVerification = new JLabel("<html>(3 chiffres au dos de la carte,<a href=''>voir illustration</a> )</html>");
		explicationCodeVerification.setBounds(35, 270, 300, 30);
		
		Font  confidencialiteFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 15);
		Confidencialite = new JLabel("<html>(Les informations sur le paiement vous concernant resteront confidentielles.)</html>");
		Confidencialite.setBounds(5,330,480,40);
		Confidencialite.setFont(confidencialiteFont);
		
		checkCondition = new JCheckBox();
		checkCondition.setBounds(5,370,20,30);
		
		Font  accepterConditionFont  = new Font(Font.SANS_SERIF,  Font.BOLD, 13);
		AccepterCondition = new JLabel("<html> Confirmer l'acceptation des conditions générales d'utilisation du service </html>");	
		AccepterCondition.setBounds(25,370,465,30);
		AccepterCondition.setFont(accepterConditionFont);
		
		annulerPaiement = new JButton("Annuler");
		annulerPaiement.setBounds(250,420,100,20);
		annulerPaiement.addActionListener(controller);
		
		validerPaiement = new JButton("Valider pour payer"); 
		validerPaiement.setBounds(90,420,150,20);
		validerPaiement.addActionListener(controller);
		
		pane = new JPanel();		
		pane.add(paiement);
		pane.add(methodePaiement);
		pane.add(choixTypeCarte);
		pane.add(iconMethodePayement);
		pane.add(nomBank);
		pane.add(choixNomBank);		
		pane.add(numCarte);
		pane.add(textNumeroCatre);
		pane.add(dateExperation);
		pane.add(moisCarte);
		pane.add(choixMoisCarte);
		pane.add(anneeCarte);
		pane.add(choixAnneeCarte);
		pane.add(textCodeVerification);
		pane.add(codeVerification);
		pane.add(explicationCodeVerification);
		pane.add(Confidencialite);
		pane.add(checkCondition);
		pane.add(AccepterCondition);
		pane.add(annulerPaiement);
		pane.add(validerPaiement);
		pane.setLayout(null);
		
		ImageIcon logo = new ImageIcon("C:\\Users\\saadm\\eclipse-workspace\\iamversion2\\src\\image\\iamLogo.PNG");
		this.setIconImage(logo.getImage());
		this.setContentPane(pane);
		this.setSize(500, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setTitle("Paiement");
		
		
		
		
		
		
		
	}
	public JCheckBox getCheckCondition() {
		return checkCondition;
	}
	public JPasswordField getTextCodeVerification() {
		return textCodeVerification;
	}
	public JTextField getTextNumeroCatre() {
		return textNumeroCatre;
	}
	public JLabel getCodeVerification() {
		return codeVerification;
	}
	public JLabel getConfidencialite() {
		return Confidencialite;
	}
	public JComboBox<String> getChoixTypeCarte() {
		return choixTypeCarte;
	}
	public JComboBox<String> getChoixNomBank() {
		return choixNomBank;
	}
	public JComboBox<String> getChoixAnneeCarte() {
		return choixAnneeCarte;
	}
	public JComboBox<String> getChoixMoisCarte() {
		return choixMoisCarte;
	}
	public JButton getAnnulerPaiement() {
		return annulerPaiement;
	}
	public JButton getValiderPaiement() {
		return validerPaiement;
	}
}
