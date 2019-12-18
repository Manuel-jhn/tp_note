package tp_note;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompagnieAutoroute extends Voyage{
	
	private ArrayList<Route> routes;
	private ArrayList<Tarif> tarifs;
	
	public CompagnieAutoroute() {
		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarif>();
	}


	public BigDecimal obtenirTarif(Porte e, Porte s) {
		BigDecimal tarif = null;
		if(getTarifExact(e, s) != null)
		{
			tarif = getTarifExact(e, s).getPrix();
		}
		else tarif = getTarifCalcule(e, s).getPrix();
		return tarif;
	}
	
	private Tarif getTarifExact(Porte e, Porte s) {
		Tarif tarif = null;
		for(Tarif t : tarifs) {
			if((t.getEntree().equals(e))&&(t.getSortie().equals(s))) {
				return t;
			}
		}
		return tarif;
	}
	
	private Tarif getTarifCalcule(Porte e, Porte s) {
		int portemin = e.getNumeroDePorte();
		int portemax = s.getNumeroDePorte();
		BigDecimal prix = new BigDecimal(0);
		
		for(Tarif t: tarifs) {
			if((t.getEntree().getNumeroDePorte() >= portemin) && (t.getSortie().getNumeroDePorte()<=portemax)) {
				prix = prix.add(t.getPrix());
			}
		}
		Tarif tarif = new Tarif(e, s, prix);
		
		return tarif;
	}
	public void ajouterTarif(Tarif t) {
		tarifs.add(t);
	}
	
	public void ajouterRoute(Route r) {
		routes.add(r);
	}
	
	public ArrayList<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(ArrayList<Route> routes) {
		this.routes = routes;
	}

	public ArrayList<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(ArrayList<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
