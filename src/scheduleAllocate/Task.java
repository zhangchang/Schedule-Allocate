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
	 * ��������
	 */
	private String taskName = null;
	
	/**
	 * ����ID
	 */
	private Integer taskNo = null;
	
	/**
	 * ����ʼ��
	 */
	private Date taskStart = null;
	
	/**
	 * ���������
	 */
	private Date taskEnd = null;
	
	/**
	 * ����ʱ����λ�����գ�
	 */
	private double taskCost = 0.0;
	
	/**
	 * ǰ������
	 */
	private Task prevTask = null;
	
}
