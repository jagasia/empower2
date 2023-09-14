package com.empower.spring;

import org.springframework.stereotype.Component;

@Component
public class Author {
	private Integer id;
	private String name;
	public Author() {
		id=1;
		name="Shiv Khera";
	}
	public Author(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + "]";
	}
	
}
