package com.hwua.collector;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hwua.po.Weather;
import com.hwua.util.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Kevin on 2017/6/21.
 */
@Controller
public class HelloCollector {
    @GetMapping("/hello")
    public String hello(Model model, String city){
        if (city == null || "".equals(city)){
            try {
                city = URLEncoder.encode("济宁","UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        String s = HttpUtils.doGet("https://free-api.heweather.com/v5/weather?city="+city+"&key=92dab76901534ea4b70d605a77835d37", null);
        Weather weather = null;
        if (s != null){
            JSONObject jsonObject = JSON.parseObject(s);
            String status = jsonObject.getJSONArray("HeWeather5").getJSONObject(0).getString("status");
            if ("ok".equals(status)){
                String heWeather5 = jsonObject.getJSONArray("HeWeather5").getString(0);
                weather = JSON.parseObject(heWeather5, Weather.class);
                Weather.Now.Cond cond = weather.getNow().getCond();
                cond.setCode(parseCode(cond.getCode()));
            }
        }
        model.addAttribute("weather",weather);
        return "index";
    }

    /**
     * 将天气Code转换为字体图标的class
     * @param code
     * @return
     */
    private String parseCode(String code){
        int i = Integer.parseInt(code);
        switch (i){
            case 100://晴
//                code = "&#xe603;";
                code = "icon-sun";
                break;
            case 104://阴
//                code = "&#xe604;";
                code = "icon-icon-test";
                break;
            case 101://多云
            case 102://少云
            case 103://晴间多云
//                code = "&#xe604;";
                code = "icon-icon-test1";
                break;
            case 305://小雨
            case 309://毛毛雨
//                code = "&#xe607;";
                code = "icon-icon-test3";
                break;
            case 306://中雨
//                code = "&#xe606;";
                code = "icon-icon-test2";
                break;
            case 307://大雨
//                code = "&#xe608;";
                code = "icon-icon-test4";
                break;
            case 300://阵雨
            case 301://强阵雨
            case 302://雷阵雨
            case 303://强雷阵雨
                code = "icon-icon-test5";
                break;
            case 304://雷阵雨伴有冰雹
            case 313://冻雨
                code = "icon-icon-test6";
                break;
            case 308://极端降雨
            case 311://大暴雨
            case 312://特大暴雨
                code = "icon-icon-test7";
                break;
            case 310://暴雨
                code = "icon-icon-test8";
                break;
            case 400://小雪
            case 407://阵雪
                code = "icon-icon-test9";
                break;
            case 401://中雪
                code = "icon-icon-test10";
                break;
            case 402://大雪
                code = "icon-icon-test12";
                break;
            case 404://雨夹雪
            case 405://雨夹雪
            case 406://雨夹雪
                code = "icon-icon-test11";
                break;
            case 503://扬沙
            case 504://浮沉
                code = "icon-icon-test13";
                break;
            case 507://沙尘暴
            case 508://强沙尘暴
                code = "icon-icon-test14";
                break;
            case 403://暴雪
                code = "icon-icon-test15";
                break;
            case 500://薄雾
            case 501://雾
                code = "icon-icon-test16";
                break;
            case 502://霾
                code = "icon-icon-test17";
                break;
            case 208://烈风
            case 209://风暴
            case 210://狂爆风
            case 211://飓风
                code = "icon-icon-test18";
                break;
            case 205://强风/劲风
            case 206://疾风
            case 207://大风
                code = "icon-icon-test19";
                break;
            case 212://龙卷风
            case 213://热带风暴
                code = "icon-icon-test20";
                break;
            case 200://有风
            case 201://平静
            case 202://微风
            case 203://和风
            case 204://清风
                code = "icon-icon-test21";
                break;
            default:
//                code = "&#xe61a;";
                code = "icon-icon-test22";
                break;
        }
        return code;
    }
}
