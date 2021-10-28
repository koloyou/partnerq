package qf.work.partner.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * equip_info
 * @author 
 */
@Data
public class EquipInfo implements Serializable {
    /**
     * 设备id
     */
    private Integer equipId;

    /**
     * 设备名称
     */
    private String equipName;

    /**
     * 设备创建时间
     */
    private Date equipDate;

    /**
     * 设备价格
     */
    private Integer equipPrice;

    /**
     * 使用年限
     */
    private Integer equipUse;

    /**
     * 使用状态1:已上线2:待使用
     */
    private String equipStatus;

    /**
     * 使用人数
     */
    private Integer equipNum;

    /**
     * 设备是否损坏1:正常2:待维修
     */
    private Boolean equipOff;

    /**
     * 所属工厂
     */
    private Integer diId;

    private static final long serialVersionUID = 1L;
}