package perimeteroptimization;

import java.util.ArrayList;
import java.util.List;

public class World {
	
	private List<Generation> generations = new ArrayList<Generation>();
	private int currentGeneration;
	private double goal = 0.1;
	
	public World(int populationSize, int perimeter){
		generations.add(new Generation(populationSize, perimeter));
	}
	
	public void evolve() {
		while(generations.get(currentGeneration).fitness() > goal) {
			generations.add(generations.get(currentGeneration).reBirth());
			currentGeneration++;
		}
	}
	
	public String toString() {
		return "Generation: " + currentGeneration + " Top Gene: " + generations.get(currentGeneration).getTopGene();
	}

}
