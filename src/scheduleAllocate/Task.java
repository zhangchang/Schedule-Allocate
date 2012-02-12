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
	 * ��������
	 */
	private String taskName = null;

	/**
	 * ����ID
	 */
	private Integer taskNo = null;

	/**
	 * ����ʵ�ʿ�ʼ��
	 */
	private Date taskActualStartDay = null;

	/**
	 * ����ʵ�������
	 */
	private Date taskActualEndDay = null;

	/**
	 * ����Ԥ�ƿ�ʼ��
	 */
	private Date taskExpectStartDay = null;

	/**
	 * ����Ԥ�������
	 */
	private Date taskExpectEndDay = null;

	/**
	 * ����ʵ�ʹ�ʱ����λ�����գ�
	 */
	private double taskActualCost = 0.0;

	/**
	 * ����Ԥ�ƹ�ʱ����λ�����գ�
	 */
	private double taskExpectCost = 0.0;

	/**
	 * ǰ������
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
