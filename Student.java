package task01112024;

public class Student {
 private int sid;
private String name;
private boolean MembershipStatus;

public Student(int sid, String name, boolean membershipStatus) {
	super();
	this.sid = sid;
	this.name = name;
	MembershipStatus = membershipStatus;
}

public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public boolean isMembershipStatus() {
	return MembershipStatus;
}

public void setMembershipStatus(boolean membershipStatus) {
	MembershipStatus = membershipStatus;
}

@Override
public String toString() {
	return "Student [sid=" + sid + ", name=" + name + ", MembershipStatus=" + MembershipStatus + "]";
}



}
