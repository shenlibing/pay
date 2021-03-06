package wusc.edu.pay.facade.user.entity;

import wusc.edu.pay.common.entity.BaseEntity;

/**
 * 商户权限管理-角色权限关联表
 * 
 * @author xiehui
 * 
 */
public class MerchantRoleAction extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Long roleId;// 角色ID
	private Long actionId;// 权限ID

	/**
	 * 角色ID
	 * 
	 * @return
	 */
	public Long getRoleId() {
		return roleId;
	}

	/**
	 * 角色ID
	 * 
	 * @return
	 */
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	/**
	 * 权限ID
	 * 
	 * @return
	 */
	public Long getActionId() {
		return actionId;
	}

	/**
	 * 权限ID
	 * 
	 * @return
	 */
	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}

	public MerchantRoleAction() {

	}

}
