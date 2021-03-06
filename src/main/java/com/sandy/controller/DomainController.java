package com.sandy.controller;

import com.sandy.domain.App;
import com.sandy.domain.Testcase;
import com.sandy.domain.User;
import com.sandy.service.AppService;
import com.sandy.service.CaseService;
import com.sandy.service.MethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.sandy.domain.Method;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.*;

/**
 * @ClassName: ResourceController
 * @Author sandy.n.hao
 * @Date: 2018/10/30
 * @Version v1.0.0
 * @Description: //TODO
 */


@Controller
@SessionAttributes("user")
@RequestMapping("/domain")
public class DomainController {

    @Autowired
    private MethodService methodService;

    @Autowired
    private CaseService caseService;

    @Autowired
    private AppService appService;


    @RequestMapping(value="/get_methods_bydomainid",method = RequestMethod.GET)
    public String getMethodByResourceId(User user,
                                        @RequestParam(value = "domainId")Long domainId, ModelMap modelMap){

        List<Method> methodList = methodService.getMethodsByDomainId(domainId);

        Map<Long, List<Testcase>> caseList = caseService.getCaseByMethodIdAndUserId(methodList,user.getSysno());

        List<App> appList = appService.getAppByUserId(user.getSysno());

        modelMap.addAttribute("methods",methodList);
        modelMap.addAttribute("testcases",caseList);
        modelMap.addAttribute("apps",appList);

        return "methodlist";
    }

}