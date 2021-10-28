package qf.work.partner.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * g_employees
 * @author 
 */
@Data
public class GEmployees implements Serializable {
    /**
     * 员工ID
     */
    private Integer userId;

    /**
     * 员工姓名
     */
    private String userName;

    /**
     * 员工年龄
     */
    private Integer userAge;

    /**
     * 员工电话
     */
    private String userPhone;

    /**
     * 所属部门
     */
    private Integer diId;

    /**
     * 入职时间
     */
    private Date userDate;

    /**
     * 员工地址
     */
    private String userAddr;

    /**
     * 1:普通用户2:管理员3:超级管理员
     */
    private Integer userPowr;

    /**
     * 0:离岗1:在岗
     */
    private Integer userDel;

    /**
     * 员工工资
     */
    private Integer userSalary;

    /**
     * 员工邮箱
     */
    private String userEmail;

    private static final long serialVersionUID = 1L;
}