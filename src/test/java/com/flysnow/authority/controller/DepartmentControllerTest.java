package com.flysnow.authority.controller;

import com.flysnow.base.BaseTest;
import com.flysnow.common.util.JsonUtils;
import org.junit.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

/**
* @description 部门控制层测试
* @author huangyongsheng
* @createtime 2018-12-09
*/
public class DepartmentControllerTest extends BaseTest {

    @Test
    public void testGetListForPage() throws Exception {
        Map<String, Object> data = new HashMap<>();

        Map<String, String> map = new HashMap<>();
        map.put("data", JsonUtils.objectToJson(data));
        map.put("pageNo", "1");
        map.put("pageSize", "10");
        String result = performPost("/department/getListForPage", map);
        logger.debug("结果json:"+result);
    }

    @Test
    public void testGetList() throws Exception {
        Map<String, Object> dataMap = new HashMap<>();
        String data = JsonUtils.objectToJson(dataMap);
        String result = performPost("/department/getList", data);
        logger.info("返回结果：" + result);
    }

    @Test
    public void testInsert() throws Exception {
        Map<String, Object> dataMap = new HashMap<>();
        String data = JsonUtils.objectToJson(dataMap);
        String result = performPost("/department/insert", data);
        logger.info("返回结果：" + result);
    }

	@Test
	public void testGet() throws Exception {
        Map<String, Object> dataMap = new HashMap<>();
        String data = JsonUtils.objectToJson(dataMap);
        String result = performPost("/department/get", data);
        logger.info("返回结果：" + result);
	}

}