package Controller;

import java.util.ArrayList;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.sample;
import Service.sampleservice;

@CrossOrigin
@RestController
@RequestMapping("/persons")
public class samplecontroller {

	@Autowired
	sampleservice ps;

	@RequestMapping("/all")
	public ArrayList<sample> getAll() {
		return ps.getAll();
	}

	@RequestMapping("{id}")
	public sample getPerson(@PathVariable("id") String id) {
		return ps.getPerson(id);
	}
}

