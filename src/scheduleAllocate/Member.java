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
	private HashMap<WorkCategory, SkillLevelNew> memberSkill = null;
}
