package qf.work.partner.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * di_info
 * @author 
 */
@Data
public class DiInfo implements Serializable {
    /**
     * 工地ID
     */
    private Integer diId;

    /**
     * 工地名称
     */
    private String diName;

    /**
     * 工地设备
     */
    private String diEquip;

    /**
     * 工地创建时间
     */
    private Date diDate;

    /**
     * 所属工地员工
     */
    private byte[] userId;

    private static final long serialVersionUID = 1L;
}