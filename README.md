# Springboot-weather

SpringBoot+thymeleaf实现简单天气预报

## 目录结构

```text
|---java
|   |---com.hwua
|   |   |---collector
|   |   |   |---HelloCollector.java
|   |   |---po
|   |   |   |---Weather.java
|   |   |---util
|   |   |   |---HttpUtils.java
|   |   |-WeatherApplication.java
|---resource
|   |---static
|   |   |---css
|   |   |   |---iconfont.css
|   |   |---font
|   |   |   |---index.css
|   |---templates
|   |   |---index.html
|   |---application.properties
```

## 效果图

![IMG_2004.JPG](https://ooo.0o0.ooo/2017/06/22/594b8911e43e1.jpg)

## 使用方式

* 直接访问：localhost:8080/hello -->默认加载济宁的天气
* 指定城市：localhost:8080/hello?city=城市名