package scheduleAllocate;

import java.util.HashMap;

public class ScheduleAllocateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member zhangchang = new Member();
		zhangchang.setMemberId(1);
		zhangchang.setMemberName("’≈Í∆");
		HashMap<WorkCategory, SkillLevel> zhangchangSkill = new HashMap<WorkCategory, SkillLevel>();
		zhangchangSkill.put(WorkCategory.DESIGN, SkillLevel.NORMAL);
		zhangchangSkill.put(WorkCategory.DESIGN_REVIEW, SkillLevel.GOOD);
		zhangchangSkill.put(WorkCategory.TESTCASE_REVIEW, SkillLevel.BATTER);

		zhangchang.setMemberSkill(zhangchangSkill);

		System.out.print(zhangchang);
	}

}
