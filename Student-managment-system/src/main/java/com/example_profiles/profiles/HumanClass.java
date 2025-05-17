package com.example_profiles.profiles;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class HumanClass {
	
	
	private final List<String>names;
	
	public HumanClass(@Value("#{'${app.names}'.split('-')}") List<String> names) {
		this.names = names;
	}
	public List<String> names(){
		return names;
	}
}
