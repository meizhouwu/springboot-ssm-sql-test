package com.jxh.until;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author meizh
 */
@Data
@NoArgsConstructor  //无参
@AllArgsConstructor //全参
public class AjaxResult {
    private Boolean success = true;
    private String message = "操作成功";
}
