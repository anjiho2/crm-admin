package com.crm.admin.controller.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by jihoan on 2017. 4. 20..
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/login"}, method = RequestMethod.GET)
    public ModelAndView loginLayout() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/user/login");
        return mvc;
    }

    @RequestMapping(value = {"/mypage"}, method = RequestMethod.GET)
    public ModelAndView getManagementPage() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/user/mypage");
        return mvc;
    }

    @RequestMapping(value = {"/change_password"}, method = RequestMethod.GET)
    public ModelAndView updatePassword() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/user/change_password");
        return mvc;
    }

    @RequestMapping(value = {"/payment_info"}, method = RequestMethod.GET)
    public ModelAndView getPaymentPage() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/payment/payment_info");
        return mvc;
    }

    @RequestMapping(value = {"/address/layout"}, method = RequestMethod.GET)
    public ModelAndView addressLayout() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/address/layout");

        return mvc;
    }

    @RequestMapping(value = {"/table/layout"}, method = RequestMethod.GET)
    public ModelAndView tableLayout() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/table/layout");

        return mvc;
    }

    @RequestMapping(value = {"tabs/layout"}, method = RequestMethod.GET)
    public ModelAndView tabsLayout() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/tabs/layout");

        return mvc;
    }

    @RequestMapping(value = {"/userList/layout"}, method = RequestMethod.GET)
    public ModelAndView userListLayout() {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/userList/layout");

        return mvc;
    }

    @RequestMapping(value = {"/userDetail/{userId}"}, method = RequestMethod.GET)
    public ModelAndView userDetailLayout(@PathVariable Long userId) {
        ModelAndView mvc = new ModelAndView();
        mvc.setViewName("/userList/detailLayout");
        return mvc;
    }

    @RequestMapping(value = {"/item/{layout}"}, method = RequestMethod.GET)
    public ModelAndView itemLayout(@PathVariable String layout) {
        ModelAndView mvc = new ModelAndView();

        if ("product".equals(layout)) {
            mvc.setViewName("/item/productLayout");
        }
        return mvc;
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView testPage() {
        ModelAndView mvc = new ModelAndView();

        mvc.setViewName("test");

        return mvc;
    }
}
