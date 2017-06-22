package com.hwua.po;

import java.util.List;

/**
 * Created by Kevin on 2017/5/5.
 */

public class Weather {

    /**
     * aqi : {"city":{"aqi":"302","pm10":"421","pm25":"142","qlty":"严重污染"}}
     * basic : {"city":"济宁","cnty":"中国","id":"CN101120701","lat":"35.415393","lon":"116.587245","update":{"loc":"2017-05-05 12:53","utc":"2017-05-05 04:53"}}
     * daily_forecast : [{"astro":{"mr":"13:47","ms":"02:16","sr":"05:18","ss":"19:03"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-05-05","hum":"54","pcpn":"0.0","pop":"0","pres":"1016","tmp":{"max":"25","min":"12"},"uv":"9","vis":"20","wind":{"deg":"251","dir":"北风","sc":"3-4","spd":"12"}},{"astro":{"mr":"14:45","ms":"02:52","sr":"05:17","ss":"19:04"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-05-06","hum":"42","pcpn":"0.0","pop":"0","pres":"1019","tmp":{"max":"24","min":"12"},"uv":"9","vis":"20","wind":{"deg":"215","dir":"无持续风向","sc":"微风","spd":"8"}},{"astro":{"mr":"15:42","ms":"03:25","sr":"05:17","ss":"19:05"},"cond":{"code_d":"100","code_n":"101","txt_d":"晴","txt_n":"多云"},"date":"2017-05-07","hum":"52","pcpn":"0.0","pop":"0","pres":"1016","tmp":{"max":"27","min":"17"},"uv":"9","vis":"20","wind":{"deg":"197","dir":"无持续风向","sc":"微风","spd":"5"}},{"astro":{"mr":"16:38","ms":"03:57","sr":"05:16","ss":"19:06"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2017-05-08","hum":"64","pcpn":"0.1","pop":"10","pres":"1011","tmp":{"max":"27","min":"13"},"uv":"8","vis":"20","wind":{"deg":"184","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"mr":"17:34","ms":"04:28","sr":"05:15","ss":"19:06"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-05-09","hum":"56","pcpn":"0.0","pop":"0","pres":"1008","tmp":{"max":"30","min":"17"},"uv":"8","vis":"20","wind":{"deg":"181","dir":"无持续风向","sc":"微风","spd":"6"}},{"astro":{"mr":"18:28","ms":"05:01","sr":"05:14","ss":"19:07"},"cond":{"code_d":"101","code_n":"101","txt_d":"多云","txt_n":"多云"},"date":"2017-05-10","hum":"51","pcpn":"0.1","pop":"6","pres":"1008","tmp":{"max":"32","min":"18"},"uv":"6","vis":"20","wind":{"deg":"234","dir":"无持续风向","sc":"微风","spd":"7"}},{"astro":{"mr":"19:23","ms":"05:36","sr":"05:13","ss":"19:08"},"cond":{"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"},"date":"2017-05-11","hum":"45","pcpn":"0.0","pop":"1","pres":"1009","tmp":{"max":"31","min"
     :"19"},"uv":"5","vis":"20","wind":{"deg":"176","dir":"无持续风向","sc":"微风","spd":"5"}}]
     * hourly_forecast : [{"cond":{"code":"100","txt":"晴"},"date":"2017-05-05 13:00","hum":"31","pop":"0","pres":"1014","tmp":"25","wind":{"deg":"328","dir":"西北风","sc":"3-4","spd":"25"}},{"cond":{"code":"100","txt":"晴"},"date":"2017-05-05 16:00","hum":"26","pop":"0","pres":"1016","tmp":"21","wind":{"deg":"343","dir":"西北风","sc":"3-4","spd":"19"}},{"cond":{"code":"101","txt":"多云"},"date":"2017-05-05 19:00","hum":"19","pop":"0","pres":"1017","tmp":"19","wind":{"deg":"355","dir":"北风","sc":"微风","spd":"15"}},{"cond":{"code":"101","txt":"多云"},"date":"2017-05-05 22:00","hum":"38","pop":"0","pres":"1019","tmp":"16","wind":{"deg":"177","dir":"南风","sc":"微风","spd":"8"}}]
     * now : {"cond":{"code":"100","txt":"晴"},"fl":"20","hum":"49","pcpn":"0","pres":"1016","tmp":"24","vis":"1","wind":{"deg":"255","dir":"西北风","sc":"3-4","spd":"18"}}
     * status : ok
     * suggestion : {"air":{"brf":"中","txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"},"comf":{"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},"cw":{"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},"drsg":{"brf":"舒适","txt":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"},"flu":{"brf":"较易发","txt":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"},"sport":{"brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"},"trav":{"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},"uv":{"brf":"强","txt":"紫外线辐射强，建议涂擦SPF20左右、PA++的防晒护肤品。避免在10点至14点暴露于日光下。"}}
     */

    private Aqi aqi; //AQI
    private Basic basic; //基本信息
    private Now now; //实况天气
    private String status;//状态码
    private Suggestion suggestion; //生活指数
    private List<DailyForecast> daily_forecast; //天气预报
    private List<HourlyForecast> hourly_forecast; //每小时预报

    public Aqi getAqi() {
        return aqi;
    }

    public void setAqi(Aqi aqi) {
        this.aqi = aqi;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Suggestion getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(Suggestion suggestion) {
        this.suggestion = suggestion;
    }

    public List<DailyForecast> getDaily_forecast() {
        return daily_forecast;
    }

    public void setDaily_forecast(List<DailyForecast> daily_forecast) {
        this.daily_forecast = daily_forecast;
    }

    public List<HourlyForecast> getHourly_forecast() {
        return hourly_forecast;
    }

    public void setHourly_forecast(List<HourlyForecast> hourly_forecast) {
        this.hourly_forecast = hourly_forecast;
    }

    /**
     *风力情况
     */
    public static class Wind {
        /**
         * deg : 251
         * dir : 北风
         * sc : 3-4
         * spd : 12
         */

        private String deg;//风向（360度）
        private String dir;//风向
        private String sc;//风力等级
        private String spd;//风速

        public String getDeg() {
            return deg;
        }

        public void setDeg(String deg) {
            this.deg = deg;
        }

        public String getDir() {
            return dir;
        }

        public void setDir(String dir) {
            this.dir = dir;
        }

        public String getSc() {
            return sc;
        }

        public void setSc(String sc) {
            this.sc = sc;
        }

        public String getSpd() {
            return spd;
        }

        public void setSpd(String spd) {
            this.spd = spd;
        }
    }

    /**
     * AQI
     */
    public static class Aqi {
        /**
         * city : {"aqi":"302","pm10":"421","pm25":"142","qlty":"严重污染"}
         */

        private City city; //城市名

        public City getCity() {
            return city;
        }

        public void setCity(City city) {
            this.city = city;
        }

        public static class City {
            /**
             * aqi : 302
             * pm10 : 421
             * pm25 : 142
             * qlty : 严重污染
             */

            private String aqi; //AQI
            private String pm10; //PM10
            private String pm25; //PM25
            private String qlty; //空气质量

            public String getAqi() {
                return aqi;
            }

            public void setAqi(String aqi) {
                this.aqi = aqi;
            }

            public String getPm10() {
                return pm10;
            }

            public void setPm10(String pm10) {
                this.pm10 = pm10;
            }

            public String getPm25() {
                return pm25;
            }

            public void setPm25(String pm25) {
                this.pm25 = pm25;
            }

            public String getQlty() {
                return qlty;
            }

            public void setQlty(String qlty) {
                this.qlty = qlty;
            }
        }
    }

    /**
     *基本信息
     */
    public static class Basic {
        /**
         * city : 济宁
         * cnty : 中国
         * id : CN101120701
         * lat : 35.415393
         * lon : 116.587245
         * update : {"loc":"2017-05-05 12:53","utc":"2017-05-05 04:53"}
         */

        private String city; //城市
        private String cnty;//国家
        private String id; //城市ID
        private String lat; //纬度
        private String lon; //经度
        private Update update; //更新时间

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCnty() {
            return cnty;
        }

        public void setCnty(String cnty) {
            this.cnty = cnty;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLon() {
            return lon;
        }

        public void setLon(String lon) {
            this.lon = lon;
        }

        public Update getUpdate() {
            return update;
        }

        public void setUpdate(Update update) {
            this.update = update;
        }

        public static class Update {
            /**
             * loc : 2017-05-05 12:53
             * utc : 2017-05-05 04:53
             */

            private String loc;//当地时间
            private String utc;//UTC时间

            public String getLoc() {
                return loc;
            }

            public void setLoc(String loc) {
                this.loc = loc;
            }

            public String getUtc() {
                return utc;
            }

            public void setUtc(String utc) {
                this.utc = utc;
            }
        }
    }

    /**
     *实况天气
     */
    public static class Now {
        /**
         * cond : {"code":"100","txt":"晴"}
         * fl : 20
         * hum : 49
         * pcpn : 0
         * pres : 1016
         * tmp : 24
         * vis : 1
         * wind : {"deg":"255","dir":"西北风","sc":"3-4","spd":"18"}
         */

        private Cond cond;//天气状况
        private String fl; //体感温度
        private String hum; //相对湿度
        private String pcpn; //降水量
        private String pres; //气压
        private String tmp; //温度
        private String vis; //能见度
        private Wind wind; //风力情况

        public Cond getCond() {
            return cond;
        }

        public void setCond(Cond cond) {
            this.cond = cond;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        /**
         * 天气状况
         */
        public static class Cond {
            /**
             * code : 100
             * txt : 晴
             */

            private String code; //天气状况代码
            private String txt; //数据详情

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 风力情况
         */
        public static class Wind {
            /**
             * deg : 255
             * dir : 西北风
             * sc : 3-4
             * spd : 18
             */

            private String deg; //风向（360度）
            private String dir; //风向
            private String sc; //	风力等级
            private String spd; //风速

            public String getDeg() {
                return deg;
            }

            public void setDeg(String deg) {
                this.deg = deg;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getSc() {
                return sc;
            }

            public void setSc(String sc) {
                this.sc = sc;
            }

            public String getSpd() {
                return spd;
            }

            public void setSpd(String spd) {
                this.spd = spd;
            }
        }
    }

    /**
     * 生活指数
     */
    public static class Suggestion {
        /**
         * air : {"brf":"中","txt":"气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。"}
         * comf : {"brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"}
         * cw : {"brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"}
         * drsg : {"brf":"舒适","txt":"建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。"}
         * flu : {"brf":"较易发","txt":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"}
         * sport : {"brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"}
         * trav : {"brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"}
         * uv : {"brf":"强","txt":"紫外线辐射强，建议涂擦SPF20左右、PA++的防晒护肤品。避免在10点至14点暴露于日光下。"}
         */

        private Air air; //空气指数
        private Comf comf;//舒适度指数
        private Cw cw; //洗车指数
        private Drsg drsg; //穿衣指数
        private Flu flu;//感冒指数
        private Sport sport; //运动指数
        private Trav trav;//旅游指数
        private Uv uv;//紫外线指数

        public Air getAir() {
            return air;
        }

        public void setAir(Air air) {
            this.air = air;
        }

        public Comf getComf() {
            return comf;
        }

        public void setComf(Comf comf) {
            this.comf = comf;
        }

        public Cw getCw() {
            return cw;
        }

        public void setCw(Cw cw) {
            this.cw = cw;
        }

        public Drsg getDrsg() {
            return drsg;
        }

        public void setDrsg(Drsg drsg) {
            this.drsg = drsg;
        }

        public Flu getFlu() {
            return flu;
        }

        public void setFlu(Flu flu) {
            this.flu = flu;
        }

        public Sport getSport() {
            return sport;
        }

        public void setSport(Sport sport) {
            this.sport = sport;
        }

        public Trav getTrav() {
            return trav;
        }

        public void setTrav(Trav trav) {
            this.trav = trav;
        }

        public Uv getUv() {
            return uv;
        }

        public void setUv(Uv uv) {
            this.uv = uv;
        }

        /**
         *空气指数
         */
        public static class Air {
            /**
             * brf : 中
             * txt : 气象条件对空气污染物稀释、扩散和清除无明显影响，易感人群应适当减少室外活动时间。
             */

            private String brf; //简介
            private String txt; //数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 舒适度指数
         */
        public static class Comf {
            /**
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private String brf;//简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 洗车指数
         */
        public static class Cw {
            /**
             * brf : 较适宜
             * txt : 较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。
             */

            private String brf; //简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 穿衣指数
         */
        public static class Drsg {
            /**
             * brf : 舒适
             * txt : 建议着长袖T恤、衬衫加单裤等服装。年老体弱者宜着针织长袖衬衫、马甲和长裤。
             */

            private String brf; //简介
            private String txt; //数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 感冒指数
         */
        public static class Flu {
            /**
             * brf : 较易发
             * txt : 昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。
             */

            private String brf;//简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 运动指数
         */
        public static class Sport {
            /**
             * brf : 较适宜
             * txt : 天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。
             */

            private String brf;//简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 旅游指数
         */
        public static class Trav {
            /**
             * brf : 适宜
             * txt : 天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。
             */

            private String brf;//简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }

        /**
         * 紫外线指数
         */
        public static class Uv {
            /**
             * brf : 强
             * txt : 紫外线辐射强，建议涂擦SPF20左右、PA++的防晒护肤品。避免在10点至14点暴露于日光下。
             */

            private String brf;//简介
            private String txt;//数据详情

            public String getBrf() {
                return brf;
            }

            public void setBrf(String brf) {
                this.brf = brf;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }

    /**
     * 天气预报
     */
    public static class DailyForecast {
        /**
         * astro : {"mr":"13:47","ms":"02:16","sr":"05:18","ss":"19:03"}
         * cond : {"code_d":"100","code_n":"100","txt_d":"晴","txt_n":"晴"}
         * date : 2017-05-05
         * hum : 54
         * pcpn : 0.0
         * pop : 0
         * pres : 1016
         * tmp : {"max":"25","min":"12"}
         * uv : 9
         * vis : 20
         * wind : {"deg":"251","dir":"北风","sc":"3-4","spd":"12"}
         */

        private Astro astro; //天文指数
        private Cond cond; //天气状况
        private String date; //日期
        private String hum; //相对湿度
        private String pcpn; //降水量
        private String pop; //降水概率
        private String pres; //气压
        private Tmp tmp; //温度
        private String uv; //紫外线指数
        private String vis; //能见度
        private Wind wind; //风力情况

        public Astro getAstro() {
            return astro;
        }

        public void setAstro(Astro astro) {
            this.astro = astro;
        }

        public Cond getCond() {
            return cond;
        }

        public void setCond(Cond cond) {
            this.cond = cond;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPcpn() {
            return pcpn;
        }

        public void setPcpn(String pcpn) {
            this.pcpn = pcpn;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public Tmp getTmp() {
            return tmp;
        }

        public void setTmp(Tmp tmp) {
            this.tmp = tmp;
        }

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public String getVis() {
            return vis;
        }

        public void setVis(String vis) {
            this.vis = vis;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        /**
         * 天文指数
         */
        public static class Astro {
            /**
             * mr : 13:47
             * ms : 02:16
             * sr : 05:18
             * ss : 19:03
             */

            private String mr; //月升时间
            private String ms; //月落时间
            private String sr; //日出时间
            private String ss; //日落时间

            public String getMr() {
                return mr;
            }

            public void setMr(String mr) {
                this.mr = mr;
            }

            public String getMs() {
                return ms;
            }

            public void setMs(String ms) {
                this.ms = ms;
            }

            public String getSr() {
                return sr;
            }

            public void setSr(String sr) {
                this.sr = sr;
            }

            public String getSs() {
                return ss;
            }

            public void setSs(String ss) {
                this.ss = ss;
            }
        }

        /**
         * 天气状况
         */
        public static class Cond {
            /**
             * code_d : 100
             * code_n : 100
             * txt_d : 晴
             * txt_n : 晴
             */

            private String code_d; //白天天气状况代码
            private String code_n; //夜间天气状况代码
            private String txt_d; //白天天气状况描述
            private String txt_n; //夜间天气状况描述

            public String getCode_d() {
                return code_d;
            }

            public void setCode_d(String code_d) {
                this.code_d = code_d;
            }

            public String getCode_n() {
                return code_n;
            }

            public void setCode_n(String code_n) {
                this.code_n = code_n;
            }

            public String getTxt_d() {
                return txt_d;
            }

            public void setTxt_d(String txt_d) {
                this.txt_d = txt_d;
            }

            public String getTxt_n() {
                return txt_n;
            }

            public void setTxt_n(String txt_n) {
                this.txt_n = txt_n;
            }
        }

        /**
         * 温度
         */
        public static class Tmp {
            /**
             * max : 25
             * min : 12
             */

            private String max; //最高温度
            private String min; //最低温度

            public String getMax() {
                return max;
            }

            public void setMax(String max) {
                this.max = max;
            }

            public String getMin() {
                return min;
            }

            public void setMin(String min) {
                this.min = min;
            }
        }


    }

    /**
     * 每小时预报
     */
    public static class HourlyForecast {
        /**
         * cond : {"code":"100","txt":"晴"}
         * date : 2017-05-05 13:00
         * hum : 31
         * pop : 0
         * pres : 1014
         * tmp : 25
         * wind : {"deg":"328","dir":"西北风","sc":"3-4","spd":"25"}
         */

        private CondX cond; //天气状况
        private String date; //日期
        private String hum; //相对湿度
        private String pop; //降水概率
        private String pres; //气压
        private String tmp; //温度
        private Wind wind; //风力情况

        public CondX getCond() {
            return cond;
        }

        public void setCond(CondX cond) {
            this.cond = cond;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHum() {
            return hum;
        }

        public void setHum(String hum) {
            this.hum = hum;
        }

        public String getPop() {
            return pop;
        }

        public void setPop(String pop) {
            this.pop = pop;
        }

        public String getPres() {
            return pres;
        }

        public void setPres(String pres) {
            this.pres = pres;
        }

        public String getTmp() {
            return tmp;
        }

        public void setTmp(String tmp) {
            this.tmp = tmp;
        }

        public Wind getWind() {
            return wind;
        }

        public void setWind(Wind wind) {
            this.wind = wind;
        }

        /**
         * 天气信息
         */
        public static class CondX {
            /**
             * code : 100
             * txt : 晴
             */

            private String code; //天气状况代码
            private String txt; //数据详情

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getTxt() {
                return txt;
            }

            public void setTxt(String txt) {
                this.txt = txt;
            }
        }
    }
}
