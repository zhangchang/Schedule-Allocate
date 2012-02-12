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

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public HashMap<WorkCategory, SkillLevelNew> getMemberSkill() {
		return memberSkill;
	}

	public void setMemberSkill(HashMap<WorkCategory, SkillLevelNew> memberSkill) {
		this.memberSkill = memberSkill;
	}

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
	private HashMap<WorkCategory, SkillLevelNew> memberSkill = null;
}
