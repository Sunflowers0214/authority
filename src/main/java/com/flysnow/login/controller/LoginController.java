package com.flysnow.login.controller;

import com.flysnow.authority.model.User;
import com.flysnow.common.Constants;
import com.flysnow.common.base.BaseController;
import com.flysnow.common.base.Result;
import com.flysnow.common.status.LoginStatus;
import com.flysnow.common.util.JsonUtils;
import com.flysnow.common.util.TokenUtil;
import com.flysnow.login.model.LoginUser;
import com.flysnow.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

import java.util.Map;

import static com.flysnow.common.status.LoginStatus.LOGIN_ALREADY;
import static com.flysnow.common.status.LoginStatus.RAND_ERROR;

@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/weblogin")
    @ResponseBody
    public Result weblogin(String data, HttpSession session) throws Exception {
        User user = JsonUtils.jsonToPojo(data, User.class);
        logger.debug("开始登陆");
        logger.debug("登陆ip地址：" + user.getUserAccount());
        logger.debug("登陆ip地址：" + user.getPassword());
        //logger.debug("登陆ip地址：" + ipAddress);
        LoginUser currentUser = null;
        if (currentUser == null) {
            String token = TokenUtil.genToken(user.getUserAccount(), user.getPassword());
            currentUser = loginService.checkUserAuth(user.getUserAccount(), user.getPassword(), token);
            LoginStatus loginStatus = currentUser.getLoginStatus();
            if (loginStatus.equals(LoginStatus.LOGIN_SUCCESS)) {
                session.setAttribute(Constants.LOGIN_USER, currentUser);
                session.setAttribute("userAccount", currentUser.getUserAccount());
                session.getServletContext().setAttribute("session", session);
                loginService.insertLoginlog(currentUser, "web");
            } else {
                return new Result(loginStatus.getStatus(), loginStatus.getStatusName());
            }
        } else {
            logger.debug(LoginStatus.LOGIN_ALREADY.getStatusName());
        }
        //返回json数据
        logger.debug("用户登录成功！");
        return new Result(LoginStatus.LOGIN_SUCCESS.getStatus(), LoginStatus.LOGIN_ALREADY.getStatusName());
    }

    @RequestMapping("/getLoginFuntion")
    @ResponseBody
    public Result getLoginFuntion(HttpSession session) throws Exception {
        LoginUser loginUser = (LoginUser) session.getAttribute(Constants.LOGIN_USER);
        //LoginUser curr = loginService.getLoginUser(loginUser.getUserId());
        return new Result(loginUser);
    }
}
