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

package com.conan.aopbaseconfig;

import com.conan.beans.L2Bean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author: zhangwenhao
 * @since: 2019/6/20
 */
@Configuration()
public class L3Config {

    @Bean(initMethod = "print")
    @Scope(scopeName = "prototype" )
    public L2Bean creatL2Bean(){
        return new L2Bean();
    }

}
