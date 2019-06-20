/**
 * Copyright (C) 2011-2019 ShenZhen iBOXCHAIN Information Technology Co.,Ltd.
 * <p>
 * All right reserved.
 * <p>
 * This software is the confidential and proprietary
 * information of iBOXCHAIN Company of China.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with iBOXCHAIN inc.
 */

package com.conan.beans;

import org.springframework.stereotype.Component;

/**
 * @author: zhangwenhao
 * @since: 2019/6/20
 */
@Component
public class L2Bean {

    public void print() {
        System.out.println("autowired 成功");
    }
}
