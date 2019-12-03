package cn.xgblack.controlleradvice_demo;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xg BLACK
 * @date 2019/12/2 22:14
 * description:
 */
@ControllerAdvice
public class GlobalData {
    @ModelAttribute(value = "info")
    public Map<String,Object> myData(){
        Map<String, Object> map = new HashMap<>();
        map.put("name", "xgBLACK");
        map.put("address", "blog.xgblack.cn");
        return map;
    }

    @InitBinder("a")
    public void initA(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }

    @InitBinder("b")
    public void initB(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }
}
