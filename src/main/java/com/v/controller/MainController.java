package com.v.controller;

import com.v.model.Money;
import com.v.model.vo.ResultBean;
import com.v.service.MoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author QAQ
 */
@Controller
@RequestMapping("/QR")
public class MainController {


    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/main")
    public String main() {
        System.out.println("============main==========");
        return "qr/main";
    }

    @RequestMapping("/addOrder")
    @ResponseBody
    public ResultBean addOrder(String data, Money money) {
        //  Money money = JSONObject.parseObject(data, Money.class);
        System.out.println("============addOrder==========" + money);
        if (money == null
                || StringUtils.isEmpty(money.getUserCode())
                || StringUtils.isEmpty(money.getName())
                || StringUtils.isEmpty(money.getMoney())) {
            return ResultBean.getFailerBean().setMsg("信息为空，服务异常，请联系客服！！");
        }
        int i = 0;
        try {
            i = moneyService.addMoney(money);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i == 1) {
            return ResultBean.getSuccessBean().setURL("QRCode.jpg").setMsg("请扫描右侧二维码完成付款。付款完成后关闭页面即可。");
        } else {
            return ResultBean.getFailerBean().setMsg("信息提交失败，请联系客服！！");
        }
    }

}
