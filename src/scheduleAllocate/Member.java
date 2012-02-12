/**
 * 
 */
package scheduleAllocate;

import java.util.HashMap;

/**
 * @author zhangchang
 * 
 */
public class Member {

	/**
	 * ��Ա����
	 */
	private String memberName = null;

	/**
	 * ��ԱID
	 */
	private Integer memberId = null;

	/**
	 * ��Ա����ˮƽ
	 */
	private HashMap<WorkCategory, SkillLevel> memberSkill = null;

	public Integer getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public HashMap<WorkCategory, SkillLevel> getMemberSkill() {
		return memberSkill;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberSkill(HashMap<WorkCategory, SkillLevel> memberSkill) {
		this.memberSkill = memberSkill;
	}
}
