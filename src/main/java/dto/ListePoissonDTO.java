package dto;

import java.util.List;

public class ListePoissonDTO {

private List<PoissonDTO> poissons;
	
	public ListePoissonDTO(List<PoissonDTO> poissons) {
		this.poissons = poissons;
	}

	public List<PoissonDTO> getPoissons() {
		return poissons;
	}

	public void setFishes(List<PoissonDTO> poissons) {
		this.poissons = poissons;
}
}
