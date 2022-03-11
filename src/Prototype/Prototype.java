package Prototype;

public class Prototype {

	Project project;

	public void setProject(Project project) {
		this.project = project;
	}


	public Prototype(Project project) {
		this.project = project;
	}
	
	Project copyProject() {
		return (Project) project.copy();
	
	}
	
}
