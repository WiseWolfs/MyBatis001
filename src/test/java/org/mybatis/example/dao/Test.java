package org.mybatis.example.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by wuyong on 15/11/18.
 */
public class Test{
    final Logger logger = LoggerFactory.getLogger(Test.class);
    public void log(int index){
        logger.info("the input is {}",index);
    }
    public static void main(String args[]){
        Test t = new Test();
        t.log(4);
    }
}
