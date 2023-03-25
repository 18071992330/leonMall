package org.leon.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回结果封装类
 *
 * @param <T>
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Accessors(chain = true)
public class CommonResult<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 返回提示信息
     */
    private String message;
    /**
     * 返回数据
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
