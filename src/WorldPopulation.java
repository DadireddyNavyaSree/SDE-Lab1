import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.StringTokenizer;

public class WorldPopulation {

	sortStrategy sortstrategy;
	long[] population = new long[13484]; // Cheating because we know number of records!!
		
	// Lab Exercise:  After creating some strategy classes -- set the default strategy here.
	public WorldPopulation(){
		sortstrategy = new InsertionSort(); // Set the default strategy here.	
	}
	
	public void readInputFile(){
		population = readPopulationFile("src\\WorldPopulation.csv");
	}
	
	public void setStrategy(sortStrategy strategy){
		sortstrategy = strategy;
	}
	
	// Lab Exercise:  Read in the WorldPopulation.csv
	// Extract ONLY the numbers and store them into population[]
	public long[] readPopulationFile(String fileName){
			   int counter = 0;
			   try {
				  FileReader inputFile = new FileReader(fileName);
				  BufferedReader reader = new BufferedReader(inputFile);
		          String line;
				  // read each line
				  while((line = reader.readLine()) != null) {
				     StringTokenizer tokenizer = new StringTokenizer(line, ",");
				     String countryName = tokenizer.nextToken(); 
				     String year = tokenizer.nextToken();
				     String pop = tokenizer.nextToken();
				     long popCount = Long.parseLong(pop);
				     population[counter++]=popCount;
				  }
				  reader.close();
			    } catch (Exception e) {
				  e.printStackTrace();   
				}   	  
		return population;
	}
	
	// Lab Exercise.  Complete this method.
	// Delegate sorting to the strategy object
	public void sortPopulation(){		
		sortstrategy.sort(population);
		System.out.println(sortstrategy.setStrategy() + " takes " + sortstrategy.getTime() + " msecs to sort");
	}
	
	public void computeTotalPopulation(){
		System.out.println("dd");
	}
	
	// Experiment with various strategies.
	// Create 3 strategies -- Bubble, insertion, and selection sort.
	public static void main(String[] args) {
		WorldPopulation worldPopulation = new WorldPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new InsertionSort()); //  Currently no strategies.
		worldPopulation.sortPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new SelectionSort());
		worldPopulation.sortPopulation();
		worldPopulation.readInputFile();
		worldPopulation.setStrategy(new BubbleSort());
		worldPopulation.sortPopulation();
	}

}
