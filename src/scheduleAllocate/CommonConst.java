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
	 * 工作种类：设计
	 */
	public static String WORK_CATEGORY_DESIGN = "Design";

	/**
	 * 工作种类：开发
	 */
	public static String WORK_CATEGORY_DEVELOP = "Develop";

	/**
	 * 工作种类：测试CASE作成
	 */
	public static String WORK_CATEGORY_TESTCASE = "TestCase";

	/**
	 * 工作种类：测试CASE实施
	 */
	public static String WORK_CATEGORY_TESTEXEC = "TestExec";

	/**
	 * 工作种类：设计审核
	 */
	public static String WORK_CATEGORY_DESIGN_REVIEW = "DesignReview";

	/**
	 * 工作种类：开发审核
	 */
	public static String WORK_CATEGORY_DEVELOP_REVIEW = "DevelopReview";

	/**
	 * 工作种类：测试CASE审核
	 */
	public static String WORK_CATEGORY_TESTCASE_REVIEW = "TestCaseReview";

	/**
	 * 工作种类：测试实施审核
	 */
	public static String WORK_CATEGORY_TESTEXEC_REVIEW = "TestExecReview";

	/**
	 * 技能水平：很差
	 */
	public static double SKILL_LEVEL_WORSE = 0.5;

	/**
	 * 技能水平：差
	 */
	public static double SKILL_LEVEL_BAD = 0.8;

	/**
	 * 技能水平：一般
	 */
	public static double SKILL_LEVEL_NORMAL = 1.0;

	/**
	 * 技能水平：好
	 */
	public static double SKILL_LEVEL_GOOD = 1.2;

	/**
	 * 技能水平：很好
	 */
	public static double SKILL_LEVEL_BATTER = 1.5;
	
	public static Integer WORKDAY = Integer.valueOf(1);
	
	public static Integer HOLIDAY = Integer.valueOf(0);
	
	public static String DATE_FORMAT = "yyyyMMdd";
	
	public static String TIME_FORMAT = "HH:mm:ss";
	
	public static String DATETIME_FORMAT = "yyyyMMdd HH:mm:ss";
	
	public static String DEFAULT_CALENDAR_NAME = "DefaultCalendar";
	
}
