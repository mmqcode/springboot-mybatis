package com.test.test;

import com.test.entity.BlzImgEntity;
import com.test.mapper.BlzImgMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by Administrator on 2017/8/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {

    @Autowired
    private BlzImgMapper blzImgMapper;


    @Test
    public void testQuery() throws Exception{
        List<BlzImgEntity> imgs = blzImgMapper.getAll();
        System.out.println(imgs.size());

    }

}
