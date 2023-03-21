package com.miniSpring.yzy.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author YanZhiyu
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BeanDefinition {

    private String id;

    private String className;

}
