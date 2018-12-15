package com.flysnow.login.controller;

import com.flysnow.common.Constants;
import com.flysnow.common.base.BaseController;
import com.flysnow.login.model.LoginUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author huangyongsheng
 * @version 1.0.0
 * @description
 * @createtime 2018-12-01
 */
@Controller
public class FirstController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(FirstController.class);

    @RequestMapping(value = {"/", "/first", "/login"})
    public String first(Model model) throws Exception {
        logger.debug("跳转登录");
        return "login";
    }

    @RequestMapping("/home")
    public String home(HttpSession session, Model model) throws Exception {
        logger.debug("跳转首页");
        LoginUser loginUser = new LoginUser();
        /*Subject subject = SecurityUtils.getSubject();
        LoginUser activeUser = (LoginUser)subject.getPrincipal();
		
		List<SysPermission> permissionList = null;
		
		try {
			permissionList = sysService.findPermissionListByUserId(activeUser.getUserid());
		} catch (Exception e) {
			logger.error(Constants.ERROR_HAPPENS, e.getMessage());
		}
		*/
        /*List<String> sysPermissionList = CollectionsFactory.newArrayList();
		if(permissionList != null){
			for(int i=0;i<permissionList.size();i++){
				sysPermissionList.add(permissionList.get(i).getPercode());
			}
		}*/
        model.addAttribute(Constants.LOGIN_USER, loginUser);
        session.setAttribute("permissionList", loginUser.getPermissionList());
        return "home2";
    }
}	
