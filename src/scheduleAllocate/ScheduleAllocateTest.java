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

		Member Zhangsan = new Member();
		Zhangsan.setMemberId(1);
		Zhangsan.setMemberName("张三");
		HashMap<WorkCategory, SkillLevel> zhangsanSkill = new HashMap<WorkCategory, SkillLevel>();
		zhangsanSkill.put(WorkCategory.DESIGN, SkillLevel.NORMAL);
		zhangsanSkill.put(WorkCategory.DESIGN_REVIEW, SkillLevel.GOOD);
		zhangsanSkill.put(WorkCategory.TESTCASE_REVIEW, SkillLevel.BATTER);

		Zhangsan.setMemberSkill(zhangsanSkill);
		
		Member Lisi = new Member();
		Lisi.setMemberId(1);
		Lisi.setMemberName("李四");
		HashMap<WorkCategory, SkillLevel> LisiSkill = new HashMap<WorkCategory, SkillLevel>();
		LisiSkill.put(WorkCategory.DESIGN, SkillLevel.NORMAL);
		LisiSkill.put(WorkCategory.DESIGN_REVIEW, SkillLevel.GOOD);
		LisiSkill.put(WorkCategory.TESTCASE_REVIEW, SkillLevel.BATTER);

		Lisi.setMemberSkill(LisiSkill);

		WorkCalendar cal = new WorkCalendar();

		// System.out.print(zhangchang);
		SimpleDateFormat df = new SimpleDateFormat(CommonConst.DATE_FORMAT);
		for (Date dd : cal.getCalendarHolidays()) {
			System.out.println(df.format(dd));
		}
	}

}
