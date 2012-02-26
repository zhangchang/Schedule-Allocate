/**
 * 
 */
package scheduleAllocate;

/**
 * @author zhangchang
 * 
 */
public interface CommonConst {

	/**
	 * �������ࣺ���
	 */
	public static String WORK_CATEGORY_DESIGN = "Design";

	/**
	 * �������ࣺ����
	 */
	public static String WORK_CATEGORY_DEVELOP = "Develop";

	/**
	 * �������ࣺ����CASE����
	 */
	public static String WORK_CATEGORY_TESTCASE = "TestCase";

	/**
	 * �������ࣺ����CASEʵʩ
	 */
	public static String WORK_CATEGORY_TESTEXEC = "TestExec";

	/**
	 * �������ࣺ������
	 */
	public static String WORK_CATEGORY_DESIGN_REVIEW = "DesignReview";

	/**
	 * �������ࣺ�������
	 */
	public static String WORK_CATEGORY_DEVELOP_REVIEW = "DevelopReview";

	/**
	 * �������ࣺ����CASE���
	 */
	public static String WORK_CATEGORY_TESTCASE_REVIEW = "TestCaseReview";

	/**
	 * �������ࣺ����ʵʩ���
	 */
	public static String WORK_CATEGORY_TESTEXEC_REVIEW = "TestExecReview";

	/**
	 * ����ˮƽ���ܲ�
	 */
	public static double SKILL_LEVEL_WORSE = 0.5;

	/**
	 * ����ˮƽ����
	 */
	public static double SKILL_LEVEL_BAD = 0.8;

	/**
	 * ����ˮƽ��һ��
	 */
	public static double SKILL_LEVEL_NORMAL = 1.0;

	/**
	 * ����ˮƽ����
	 */
	public static double SKILL_LEVEL_GOOD = 1.2;

	/**
	 * ����ˮƽ���ܺ�
	 */
	public static double SKILL_LEVEL_BATTER = 1.5;
	
	public static Integer WORKDAY = Integer.valueOf(1);
	
	public static Integer HOLIDAY = Integer.valueOf(0);
	
	public static String DATE_FORMAT = "yyyyMMdd";
	
	public static String TIME_FORMAT = "HH:mm:ss";
	
	public static String DATETIME_FORMAT = "yyyyMMdd HH:mm:ss";
	
	public static String DEFAULT_CALENDAR_NAME = "DefaultCalendar";
	
}
