/**
 * 
 */
package scheduleAllocate;

import java.util.Date;

/**
 * @author zhangchang
 *
 */
public class Task {

	/**
	 * 任务名称
	 */
	private String taskName = null;
	
	/**
	 * 任务ID
	 */
	private Integer taskNo = null;
	
	/**
	 * 任务开始日
	 */
	private Date taskStart = null;
	
	/**
	 * 任务完成日
	 */
	private Date taskEnd = null;
	
	/**
	 * 任务工时（单位：人日）
	 */
	private double taskCost = 0.0;
	
	/**
	 * 前导任务
	 */
	private Task prevTask = null;
	
}
