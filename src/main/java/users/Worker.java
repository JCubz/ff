package users;

import java.util.List;

public class Worker {
	String name, number, city;
	double rating, wage;
	long latitude, longitude;
	List<JobFunction> ability;
	private int id;
	
	// Constructor for a new worker
	Worker(String name, String number, String city) {
		
	}
	
	// Constructor for an existing worker
	
	enum JobFunction {
		Trimmer, Picker, Watcher;
	}
}
