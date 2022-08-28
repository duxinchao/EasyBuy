package cn.easybuy.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

	private Integer id;//ID
	private String serialNumber;//������
	private Integer userId;//�û�id
	private String userAddress;//�ջ���ַ
	private Date createTime;//����ʱ��
	private Float cost;//�����ܼƼ۸�

	private String loginName;//��¼����
	private List<OrderDetail> orderDetailList;//������ϸ�б�

	public List<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(List<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Order){
			if(((Order)obj).id==id){
				return true;
			}
		}
		return false;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}