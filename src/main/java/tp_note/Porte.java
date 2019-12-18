package tp_note;

public class Porte{
	private int numeroDePorte;
	
	public Porte(int num) {
		this.numeroDePorte = num;
	}


	@Override
	public String toString() {
		return "Porte [numeroDePorte=" + numeroDePorte + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numeroDePorte;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Porte other = (Porte) obj;
		if (numeroDePorte != other.numeroDePorte)
			return false;
		return true;
	}

	public int getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(int numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}
	
}
