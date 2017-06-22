package com.hwua.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Kevin on 2017/6/21.
 */
public class HttpUtils {
    public static String doGet(String url, String params) {
        try {
            //1.实例化URL
            if (params != null && !params.equals("")) {
                url = url + "?" + params;
            }
            URL u = new URL(url);
            //2.开启连接
            HttpURLConnection conn = (HttpURLConnection) u.openConnection();
            //3.设置请求方式
            conn.setRequestMethod("GET");
            //4.设置请求超时时间
            conn.setConnectTimeout(5000);
            //5.判断响应码是否是200
            if (conn.getResponseCode() == 200) {
                //6.获取字节输入流
                InputStream is = conn.getInputStream();
                //7.将字节输入流转换为字符输入流
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                //8.读取数据
                String str = null;
                StringBuilder sb = new StringBuilder();
                while ((str = br.readLine()) != null) {
                    sb.append(str);
                }
                return sb.toString();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
