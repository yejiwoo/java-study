package sec03.p460;

public class Member {

	private String id;
	private String memberPw;
	//Getter, Setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	
	//생성자 (모든 필드 초기화 생성자)
	public Member(String id, String memberPw) {
		super();
		this.id = id;
		this.memberPw = memberPw;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((memberPw == null) ? 0 : memberPw.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (memberPw == null) {
			if (other.memberPw != null)
				return false;
		} else if (!memberPw.equals(other.memberPw))
			return false;
		return true;
	}
	
	
	
	
}
