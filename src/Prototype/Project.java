package Prototype;

public class Project implements Copyable{
	@Override
	public String toString() {
		return "Project [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	@Override
	public Object copy() {
		Project copy = new Project(id, name, code);
		return copy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	private int id;
	private String name;
	private String code;
	public Project(int id, String name, String code) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
	}
	
	
	
}
