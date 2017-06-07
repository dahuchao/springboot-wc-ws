package fr.dahuchao;

public class MethodeMessage {
	String nom;
	String libelle;
	String urlService;
	String urlIcone;
	public MethodeMessage(String nom, String libelle, String urlService,
			String urlIcone) {
		super();
		this.nom = nom;
		this.libelle = libelle;
		this.urlService = urlService;
		this.urlIcone = urlIcone;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getUrlService() {
		return urlService;
	}

	public void setUrlService(String urlService) {
		this.urlService = urlService;
	}

	public String getUrlIcone() {
		return urlIcone;
	}

	public void setUrlIcone(String urlIcone) {
		this.urlIcone = urlIcone;
	}
}
