package com.v.model.vo;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author QAQ
 */
public class ResultBean extends HashMap<String, Object> {

    /**
     * (域的意义、目的、功能)
     */
    private static final long serialVersionUID = 1L;
    private static final int SUCCESSCODE = 200;
    private static final int FAILERCODE = 500;


    private void setCode(int status) {
        if (SUCCESSCODE == status) {
            this.put("success", true);
        } else {
            this.put("success", false);
        }
        this.put("code", status);
    }

    public int getCode() {
        return (Integer) this.get("code");
    }

    public ResultBean setMsg(String msg) {
        this.put("msg", msg);
        return this;
    }

    public String getMsg() {
        return String.valueOf(get("msg") != null ? get("msg") : "");
    }

    public ResultBean setData(Object data) {
        this.put("data", data);
        return this;
    }

    public <T> T getDataToType() {
        Object object = this.get("data");
        return object != null ? (T) object : null;
    }

    public Object getData() {
        return this.get("data");
    }

    private void setDataAttr(String key, Object value) {
        Object object = this.get("data");
        if (object == null || !(object instanceof Map)) {
            object = new HashMap();
            this.setData(object);
        }
        ((Map) object).put(key, value);
    }

    public Object getDataAttr(String key) {
        Object object = this.get("data");
        if (object == null || !(object instanceof Map)) {
            object = new HashMap();
            this.setData(object);
        }
        return ((Map) object).get(key);
    }

    public boolean isSucess() {
        return (boolean) this.get("success");
    }

    public static ResultBean getSuccessBean() {
        ResultBean rb = new ResultBean();
        rb.setCode(SUCCESSCODE);
        return rb;
    }

    public static ResultBean getFailerBean() {
        ResultBean rb = new ResultBean();
        rb.setCode(FAILERCODE);
        return rb;
    }

    public ResultBean setURL(String url) {
        this.setDataAttr("url", url);
        return this;
    }

    public String toJsonString() {
        return JSONObject.toJSONString(this);
    }
}
