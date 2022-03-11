package Prototype;

public class Main {

	public static void main(String[] args) {

		Project project = new Project(1, " OurNameProject " , " Some code ");
		
				System.out.println(project);
				
		Project otherproject = (Project)project.copy();
		
				System.out.println(otherproject);
		
		Prototype prototype = new Prototype(project);
				
		Project copyProject = (Project)prototype.copyProject();
				
				System.out.println(copyProject);
	}

}
