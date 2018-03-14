import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Controller implements ActionListener{
	private View view;
	private View1 view1;
	private View2 view2;
	private Model1 model;
	public Controller(View v) {
		view = v;
	}
	public Controller(View1 v,Model1 m) {
		view1 = v;
		model = m;
	}
	public Controller(View2 v,Model1 m) {
		view2 = v;
		model = m;
	}
	@Override
	public void actionPerformed(ActionEvent evt) {
		
		if (view != null) {
			if(evt.getSource() == view.getButtonMobile()) {
				Model1 modelk = new Model1();
				View1 vk = new View1(modelk);
				new Controller(vk,modelk);
			}
		}
 
		if (view1 != null && model != null) {
			if (evt.getSource() == view1.getFideloNumero0() || evt.getSource() == view1.getFideloNumero1() || evt.getSource() == view1.getFideloNumero2()
					|| evt.getSource() == view1.getFideloNumero3() ||evt.getSource() == view1.getFideloNumero4() || evt.getSource() == view1.getFideloNumero5()
					|| evt.getSource() == view1.getFideloNumero6() || evt.getSource() == view1.getFideloNumero7() || evt.getSource() == view1.getFideloNumero8()
					|| evt.getSource() == view1.getFideloNumero9()) {
				model.setCodeFidelio(((JButton)evt.getSource()).getText());
				view1.action1(model.getCodeFidelio());
				}
			if (evt.getSource() == view1.getEffacerFidelo()) {
				model.setCodeFidelioEff("");
				view1.action1(model.getCodeFidelio());
			}
			if(evt.getSource() == view1.getAnnulerAchat()) {
			       view1.dispose();
			}
			if(evt.getSource() == view1.getPayerAchat()) {
				String Error = "";
				if(view1.getNumTelephone().getText().length() != 10) Error += "- inserer un valide numero de Telephone\n";
				if(view1.getCodeFidelo().getPassword().length != 8) Error += "- inserer un valide code Fidelio \n";
				if(view1.getEmailText().getText().indexOf('@') == -1 || view1.getEmailText().getText().indexOf('.') == -1 || !view1.getEmailText().getText().equals(view1.getConfirmerEmailText().getText())) {
					Error += "- inserer une valide Adresse Email \n";
				}
				if(!view1.getAccepterCondition().isSelected()) Error += "- Accepter Les conditions d'utilisation \n";
				if(!Error.equals("")) {
					JOptionPane.showMessageDialog(null, Error, "Error", JOptionPane.ERROR_MESSAGE);
				}
				if(Error.equals("")) {
					model.setNumeroTele(view1.getNumTelephone().getText());
					model.setCodeFidelioPass(view1.getCodeFidelo().getPassword());
					model.setEmail(view1.getEmailText().getText());
					try {
						if(model.verifierSurBaseDonne()>0) {		
							Model1 modelk = new Model1();
							View2 vk = new View2(modelk);
							new Controller(vk,modelk);
						}
						else JOptionPane.showMessageDialog(null, "Service non disponible pour les clients Jawal","Error",JOptionPane.ERROR_MESSAGE);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		if(view2 != null && model != null) {
			if(evt.getSource() == view2.getAnnulerPaiement()) {
				view2.dispose();
			}
			if(evt.getSource() == view2.getValiderPaiement()) {
				String error = "";
				if(view2.getChoixNomBank().getSelectedItem().equals("--------------------------------------")) {
					error += "- choisir un valide nom de Bank\n";
				}
				if(view2.getTextNumeroCatre().getText().length() != 16) {
					error += "- inserer un valide Numero Carte\n";
				}
				if(view2.getTextCodeVerification().getPassword().length != 3) {
					error += "- inserer un valide Code de Confidentialite\n";
				}
				
				if(!view2.getCheckCondition().isSelected()) {
					error += "- Accepter Les conditions d'utilisation \n";
				}
				if(!error.equals("")) {
					JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
				}
				if(error.equals("")) {
					model.setTypeCarte((String) view2.getChoixTypeCarte().getSelectedItem());
					model.setNomBank((String) view2.getChoixNomBank().getSelectedItem());
					model.setNumCarte(view2.getTextNumeroCatre().getText());
					model.setMoisExperie((String) view2.getChoixMoisCarte().getSelectedItem());
					model.setAnneeExperie((String) view2.getChoixAnneeCarte().getSelectedItem());
					model.setCodeCarte(view2.getTextCodeVerification().getPassword());
					
					try {
						if(model.verifierSurBaseDonne2()>0) {		
							JOptionPane.showMessageDialog(null, "Merci , de payer vos factures !! ","Successful",JOptionPane.INFORMATION_MESSAGE);
						}
						else JOptionPane.showMessageDialog(null, "Service non disponible verifier vos informations Bancaire","Error",JOptionPane.ERROR_MESSAGE);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}
	}
}
