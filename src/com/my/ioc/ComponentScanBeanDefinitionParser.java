package com.my.ioc;

import org.dom4j.Element;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

/**
 * Created by tufei on 2017/12/14.
 */
public class ComponentScanBeanDefinitionParser implements BeanDefinitionParser {
    @Override
    public void parse(Element element, Map<String, BeanDefinition> beanDefinitionMap) throws IOException {
        String basePackage = element.attributeValue("base-package");
        if(null != basePackage && !"".equals(basePackage.trim())){
            basePackage = basePackage.replace(".","/");
            URL base = this.getClass().getResource("");
            String f = new File(base.getFile()).getCanonicalPath();
            String path = this.getClass().getResource("").toString();
            File file = new File(basePackage);
            if(file.exists()){
                File fa[] = file.listFiles();
            }
        }
    }
}
