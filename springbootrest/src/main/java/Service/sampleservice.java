package Service;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import test.sample;

@Service
public class sampleservice {
	ArrayList<sample> samples = new ArrayList<sample>();
	public sampleservice() {
		sample p = new sample();
		p.setId("1");
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		samples.add(p);

		p = new sample();
		p.setId("2");
		p.setAge(25);
		p.setFirstName("Tom");
		p.setLastName("Brown");
		samples.add(p);
	}
	public sample getPerson(String id) {
		for(sample sample:samples) {
			if(sample.getId().equalsIgnoreCase(id)) return sample;
		}
	    return null;
	}
	public ArrayList<sample> getAll() {
		return samples;
	}
}


