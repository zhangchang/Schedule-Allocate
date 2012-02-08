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

    public String getTaskName() {
	return taskName;
    }

    public void setTaskName(String taskName) {
	this.taskName = taskName;
    }

    public Integer getTaskNo() {
	return taskNo;
    }

    public void setTaskNo(Integer taskNo) {
	this.taskNo = taskNo;
    }

    public Date getTaskActualStartDay() {
	return taskActualStartDay;
    }

    public void setTaskActualStartDay(Date taskActualStartDay) {
	this.taskActualStartDay = taskActualStartDay;
    }

    public Date getTaskActualEndDay() {
	return taskActualEndDay;
    }

    public void setTaskActualEndDay(Date taskActualEndDay) {
	this.taskActualEndDay = taskActualEndDay;
    }

    public Date getTaskExpectStartDay() {
	return taskExpectStartDay;
    }

    public void setTaskExpectStartDay(Date taskExpectStartDay) {
	this.taskExpectStartDay = taskExpectStartDay;
    }

    public Date getTaskExpectEndDay() {
	return taskExpectEndDay;
    }

    public void setTaskExpectEndDay(Date taskExpectEndDay) {
	this.taskExpectEndDay = taskExpectEndDay;
    }

    public double getTaskActualCost() {
	return taskActualCost;
    }

    public void setTaskActualCost(double taskActualCost) {
	this.taskActualCost = taskActualCost;
    }

    public double getTaskExpectCost() {
	return taskExpectCost;
    }

    public void setTaskExpectCost(double taskExpectCost) {
	this.taskExpectCost = taskExpectCost;
    }

    public Task getPrevTask() {
	return prevTask;
    }

    public void setPrevTask(Task prevTask) {
	this.prevTask = prevTask;
    }

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
    private Task prevTask = null;

}
