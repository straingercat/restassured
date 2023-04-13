package sdet21.POJO.Class;

public class ProjectLibrary {
	//create global variables(keys)
	
	String createBy;
	String projectName;
	String status;
	int teamSize;
	
	//Initialize all the variables using a constructor
	public  ProjectLibrary(String createdBy,String projectName,String status, int teamSize)
	{
		createdBy=createdBy;
		this.projectName=projectName;
		this.status=status;
		this.teamSize=teamSize;
	}
	//use getter and setter to access the variables

	public String getCreateBy() {
		return createBy;
	}

	public String getProjectName() {
		return projectName;
	}

	public String getStatus() {
		return status;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	
	
	
	
	
	
	

}
