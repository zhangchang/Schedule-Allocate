/**
 * 
 */
package scheduleAllocate;

import java.util.Date;
import java.util.List;

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
	 * 任务实际开始日
	 */
	private Date taskActualStartDay = null;

	/**
	 * 任务实际完成日
	 */
	private Date taskActualEndDay = null;

	/**
	 * 任务预计开始日
	 */
	private Date taskExpectStartDay = null;

	/**
	 * 任务预计完成日
	 */
	private Date taskExpectEndDay = null;

	/**
	 * 任务实际工时（单位：人日）
	 */
	private double taskActualCost = 0.0;

	/**
	 * 任务预计工时（单位：人日）
	 */
	private double taskExpectCost = 0.0;

	/**
	 * 前导任务
	 */
	private List<Task> prevTasks = null;

	public List<Task> getPrevTasks() {
		return prevTasks;
	}

	public double getTaskActualCost() {
		return taskActualCost;
	}

	public Date getTaskActualEndDay() {
		return taskActualEndDay;
	}

	public Date getTaskActualStartDay() {
		return taskActualStartDay;
	}

	public double getTaskExpectCost() {
		return taskExpectCost;
	}

	public Date getTaskExpectEndDay() {
		return taskExpectEndDay;
	}

	public Date getTaskExpectStartDay() {
		return taskExpectStartDay;
	}

	public String getTaskName() {
		return taskName;
	}

	public Integer getTaskNo() {
		return taskNo;
	}

	public void setPrevTasks(List<Task> prevTasks) {
		this.prevTasks = prevTasks;
	}

	public void setTaskActualCost(double taskActualCost) {
		this.taskActualCost = taskActualCost;
	}

	public void setTaskActualEndDay(Date taskActualEndDay) {
		this.taskActualEndDay = taskActualEndDay;
	}

	public void setTaskActualStartDay(Date taskActualStartDay) {
		this.taskActualStartDay = taskActualStartDay;
	}

	public void setTaskExpectCost(double taskExpectCost) {
		this.taskExpectCost = taskExpectCost;
	}

	public void setTaskExpectEndDay(Date taskExpectEndDay) {
		this.taskExpectEndDay = taskExpectEndDay;
	}

	public void setTaskExpectStartDay(Date taskExpectStartDay) {
		this.taskExpectStartDay = taskExpectStartDay;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public void setTaskNo(Integer taskNo) {
		this.taskNo = taskNo;
	}

}
