package DAL.entity;


public enum Role {
	STAROSTA(0), STUDENT(1);
	private final int roleId;
	Role(int roleId) {
		this.roleId = roleId;
	}
	public int getRoleId() {
		return roleId;
	}
}
