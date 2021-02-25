package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> lista;
	private ZooKeeper keeper;
	
	public Zoo() {
		super();
		lista=new ArrayList<Animal>();
		keeper=new ZooKeeper();
	}
	
	public Zoo(List<Animal> lista, ZooKeeper keeper) {
		super();
		this.lista = lista;
		this.keeper = keeper;
	}
	public List<Animal> getLista() {
		return lista;
	}
	public void setLista(List<Animal> lista) {
		this.lista = lista;
	}
	public ZooKeeper getKeeper() {
		return keeper;
	}
	public void setKeeper(ZooKeeper keeper) {
		this.keeper = keeper;
	}
	
	public void addAnimal(Animal animal) {
		lista.add(animal);
	}
	
	public void feedAll() {
		for(Animal animal : lista) {
			keeper.feed(animal);
		}
	}
	
	

}
