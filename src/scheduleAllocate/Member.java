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
	 * 人员姓名
	 */
	private String memberName = null;

	/**
	 * 人员ID
	 */
	private Integer memberId = null;

	/**
	 * 人员技能水平
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
