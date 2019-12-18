package tp_note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Route extends CompagnieAutoroute{
	private List<Porte> portes;
	public Route() {
		this.portes = new ArrayList<Porte>();
		// TODO Auto-generated constructor stub
	}

	
	
	public void addPorte(Porte p){
		this.portes.add(p);
		OrdrePorteComparator PorteComp = new OrdrePorteComparator();
		Collections.sort(this.portes, PorteComp);
	}
	
	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}

	public List<Porte> getPortes() {
		return portes;
	}

	public void setPortes(ArrayList<Porte> portes) {
		this.portes = portes;
	}
}
