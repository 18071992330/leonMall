package org.leon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    /**
     * 交易编号
     */
    private Long id;

    private String serial;

}
