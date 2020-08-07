package com.open.fire.log.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author owen
 * log-spring-boot-starter 自动装配 
 */


public class LogImportSelector implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
//		importingClassMetadata.getAllAnnotationAttributes(EnableEcho.class.getName());

		return new String[] { 
				//"com.open.fire.log.aop.LogAnnotationAOP",
				//"com.open.fire.log.service.impl.LogServiceImpl",
				"com.open.fire.log.config.LogAutoConfig"
				
		};
	}

}