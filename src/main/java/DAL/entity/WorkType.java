package DAL.entity;

public enum WorkType {
	MODUL(0), LAB(1), PRACTICE(2), EXTRA(3);
	private final int workTypeId;
	WorkType(int worktypeId){
		this.workTypeId = worktypeId;
	}
	public int getWorkTypeId() {
		return workTypeId;
	}
}
