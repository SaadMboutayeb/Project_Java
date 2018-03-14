import java.sql.SQLException;

public class Model1 {
	private String numeroTele,codeFidelio,email,typeCarte,nomBank,numCarte,moisExperie,AnneeExperie,codeCarte;
	public Model1() {
		numeroTele = codeFidelio = email = typeCarte = nomBank = numCarte = moisExperie = AnneeExperie = codeCarte = "";
	}
	
	public String getTypeCarte() {
		return typeCarte;
	}

	public void setTypeCarte(String typeCarte) {
		this.typeCarte = typeCarte;
	}

	public String getNomBank() {
		return nomBank;
	}

	public void setNomBank(String nomBank) {
		this.nomBank = nomBank;
	}

	public String getNumCarte() {
		return numCarte;
	}

	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}

	public String getMoisExperie() {
		return moisExperie;
	}

	public void setMoisExperie(String moisExperie) {
		this.moisExperie = moisExperie;
	}

	public String getAnneeExperie() {
		return AnneeExperie;
	}

	public void setAnneeExperie(String anneeExperie) {
		AnneeExperie = anneeExperie;
	}

	public String getCodeCarte() {
		return codeCarte;
	}

	public void setCodeCarte(char tab[]) {
		String codeCarte ="";
		for(int i=0;i<tab.length;i++) codeCarte += tab[i];
		this.codeCarte = codeCarte;
	}

	public void setNumeroTele(String numeroTele) {
		this.numeroTele = numeroTele;
	}

	public void setCodeFidelio(String codeFidelio) {
		this.codeFidelio += codeFidelio;
	}
	
	public void setCodeFidelioEff(String codeFidelio) {
		this.codeFidelio = codeFidelio;
	}
	public void setCodeFidelioPass(char tab []) {
		String sumTab="";
		for(int i=0;i<tab.length;i++) sumTab += tab[i];
		setCodeFidelioEff(sumTab);
	}
	public void setEmail(String email) {
			this.email = email;
		}
	public String getNumeroTele() {
		return numeroTele;
	}
	public String getCodeFidelio() {
		return codeFidelio;
	}
	public String getEmail() {
		return email;
	}
	public int verifierSurBaseDonne() throws SQLException {
		ConnectionBD cdb = new ConnectionBD();
		int checker = cdb.verifierDonner(numeroTele, codeFidelio);
		return checker;
	}
	public int verifierSurBaseDonne2() throws SQLException {
		ConnectionBD cdb = new ConnectionBD();
		int checker = cdb.verifierDonner2(typeCarte, nomBank,numCarte,moisExperie,AnneeExperie,codeCarte);
		return checker;
	}
}
