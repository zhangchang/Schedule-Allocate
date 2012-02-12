package scheduleAllocate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ScheduleAllocateTest {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Member zhangchang = new Member();
		zhangchang.setMemberId(1);
		zhangchang.setMemberName("’≈Í∆");
		HashMap<WorkCategory, SkillLevel> zhangchangSkill = new HashMap<WorkCategory, SkillLevel>();
		zhangchangSkill.put(WorkCategory.DESIGN, SkillLevel.NORMAL);
		zhangchangSkill.put(WorkCategory.DESIGN_REVIEW, SkillLevel.GOOD);
		zhangchangSkill.put(WorkCategory.TESTCASE_REVIEW, SkillLevel.BATTER);

		zhangchang.setMemberSkill(zhangchangSkill);

		WorkCalendar cal = new WorkCalendar();

		// System.out.print(zhangchang);
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		for (Date dd : cal.getCalendarHolidays()) {
			System.out.println(df.format(dd));
		}
	}

}
