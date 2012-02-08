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
    private Task prevTask = null;

}
