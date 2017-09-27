package com.kx.kxunfeidemo;

import java.util.List;

/*
 *  创建者:   KX
 *  创建时间:  2017/9/26 20:59
 *  描述：    TODO
 */
public class ResultBean {


    /**
     * sn : 1
     * ls : true
     * bg : 0
     * ed : 0
     * ws : [{"bg":0,"cw":[{"w":" 今天","sc":0}]},{"bg":0,"cw":[{"w":" 的","sc":0}]},{"bg":0,"cw":[{"w":" 天气","sc":0}]},{"bg":0,"cw":[{"w":" 怎么样","sc":0}]},{"bg":0,"cw":[{"w":"。","sc":0}]}]
     */

    private int sn;
    private boolean ls;
    private int bg;
    private int ed;
    private List<WsBean> ws;

    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public boolean isLs() {
        return ls;
    }

    public void setLs(boolean ls) {
        this.ls = ls;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public int getEd() {
        return ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public List<WsBean> getWs() {
        return ws;
    }

    public void setWs(List<WsBean> ws) {
        this.ws = ws;
    }

    public static class WsBean {
        /**
         * bg : 0
         * cw : [{"w":" 今天","sc":0}]
         */

        private int bg;
        private List<CwBean> cw;

        public int getBg() {
            return bg;
        }

        public void setBg(int bg) {
            this.bg = bg;
        }

        public List<CwBean> getCw() {
            return cw;
        }

        public void setCw(List<CwBean> cw) {
            this.cw = cw;
        }

        public static class CwBean {
            /**
             * w :  今天
             * sc : 0
             */

            private String w;
            private int sc;

            public String getW() {
                return w;
            }

            public void setW(String w) {
                this.w = w;
            }

            public int getSc() {
                return sc;
            }

            public void setSc(int sc) {
                this.sc = sc;
            }
        }
    }
}
