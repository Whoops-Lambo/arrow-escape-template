package com.bytedance.sdk.component.adexpress.dynamic.uq;

import com.ironsource.C4664b4;
import com.safedk.android.analytics.brandsafety.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class noq {
    private int aan;
    private boolean ac;
    private int af;
    private float ahm;
    private String al;
    private int any;
    private double at;
    private JSONObject ax;
    private String ay;
    private boolean be;
    private List<kgy> bgd;
    private String bmz;
    private String cc;
    private long ce = -1;
    private boolean ct;
    private String dg;
    private boolean dpp;
    private int dr;
    private double dta;
    private int ebs;
    private String em;
    private int eq;
    private float fi;
    private String fpp;
    private boolean fpz;
    private int ft;
    private int ftg;
    private int fv;
    private int fxy;
    private int gbb;
    private int gc;
    private float gf;
    private boolean gg;
    private String gm;
    private int ib;
    private int idg;
    private String ikw;
    private String ioy;
    private int jc;
    private int jpc;
    private int jvt;
    private JSONObject jw;
    private float kgy;
    private String ko;
    private int kt;
    private String kus;
    private boolean lb;
    private String lqi;
    private int mca;
    private double mh;
    private String muf;
    private int mv;
    private int mw;
    private int naw;
    private float noq;
    private double nu;
    private JSONObject owk;
    private String oyj;
    private boolean pft;
    private int pm;
    private boolean pxt;
    private String qdr;
    private int qi;
    private boolean qjb;
    private float ra;
    private boolean rlc;
    private float rz;
    private String sa;
    private int sm;
    private String sx;
    private String ti;
    private int tp;
    private String twf;
    private double uf;
    private int uh;
    private String um;
    private float uq;
    private String uxe;
    private boolean vf;
    private String vg;
    private boolean vrj;
    private String vs;
    private String vw;
    private boolean vz;
    private boolean wbb;
    private int wl;
    private String wn;
    private double wy;
    private String xh;
    private int xhh;
    private int xkh;
    private int xlt;
    private boolean xrn;
    private int xts;
    private boolean xxq;
    private int yjf;
    private float yo;
    private String yu;
    private int ywg;
    private int yx;
    private JSONObject zjw;
    private boolean znm;

    private void ft(String str) {
        this.em = str;
    }

    private void kgy(noq noqVar, JSONObject jSONObject) {
        if (noqVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            switch (next) {
                case "isShowBgControl":
                    noqVar.rz(jSONObject.optBoolean(next, false));
                    break;
                case "clickArea":
                    noqVar.vs(jSONObject.optString(next));
                    break;
                case "triggerSlideDirection":
                    noqVar.jpc(jSONObject.optString(next));
                    break;
                case "bgImgUrl":
                    noqVar.yo(jSONObject.optString(next));
                    break;
                case "lineCount":
                    noqVar.gf(jSONObject.optInt(next));
                    break;
                case "openPlayableLandingPage":
                    noqVar.um(jSONObject.optBoolean(next));
                    break;
                case "lineLimit":
                    noqVar.noq(jSONObject.optBoolean(next));
                    break;
                case "interactBgColor":
                    noqVar.twf(jSONObject.optString(next));
                    break;
                case "paddingLeft":
                    noqVar.noq((float) jSONObject.optDouble(next));
                    break;
                case "adType":
                    noqVar.ahm(jSONObject.optString(next));
                    break;
                case "bottom":
                    noqVar.ioy(jSONObject.optInt(next));
                    break;
                case "fontFamily":
                    noqVar.rz(jSONObject.optString(next));
                    break;
                case "height":
                    noqVar.rz((float) jSONObject.optDouble(next));
                    break;
                case "textAlign":
                    noqVar.uq(jSONObject.optString(next));
                    break;
                case "alignItems":
                    noqVar.gm(jSONObject.optString(next));
                    break;
                case "interactValidate":
                    noqVar.ahm(jSONObject.optBoolean(next));
                    break;
                case "marginTop":
                    noqVar.ra(jSONObject.optInt(next));
                    break;
                case "useBottom":
                    noqVar.ra(jSONObject.optBoolean(next));
                    break;
                case "triggerSlideMinDistance":
                    noqVar.kgy(jSONObject.optLong(next));
                    break;
                case "direction":
                    noqVar.ay(jSONObject.optString(next));
                    break;
                case "tagMaxCount":
                    noqVar.xh(jSONObject.optInt(next));
                    break;
                case "interactHiddenTime":
                    noqVar.fpz(jSONObject.optInt(next));
                    break;
                case "useTop":
                    noqVar.gf(jSONObject.optBoolean(next));
                    break;
                case "fontWeight":
                    noqVar.vs(jSONObject.optInt(next));
                    break;
                case "zIndex":
                    noqVar.lqi(jSONObject.optInt(next));
                    break;
                case "timingStart":
                    noqVar.ahm(jSONObject.optDouble(next));
                    break;
                case "lineHeight":
                    noqVar.noq(jSONObject.optDouble(next));
                    break;
                case "textFlowDuration":
                    noqVar.fpp(jSONObject.optInt(next));
                    break;
                case "useRight":
                    noqVar.fi(jSONObject.optBoolean(next));
                    break;
                case "marginBottom":
                    noqVar.nu(jSONObject.optInt(next));
                    break;
                case "bgColor":
                    noqVar.noq(jSONObject.optString(next));
                    break;
                case "useLeft":
                    noqVar.yo(jSONObject.optBoolean(next));
                    break;
                case "widthMode":
                    noqVar.nu(jSONObject.optString(next));
                    break;
                case "top":
                    noqVar.ay(jSONObject.optInt(next));
                    break;
                case "data":
                    noqVar.sx(jSONObject.optString(next));
                    break;
                case "left":
                    noqVar.sx(jSONObject.optInt(next));
                    break;
                case "loop":
                    noqVar.kgy(jSONObject.optBoolean(next));
                    break;
                case "paddingTop":
                    noqVar.fi((float) jSONObject.optDouble(next));
                    break;
                case "align":
                    noqVar.fpp(jSONObject.optString(next));
                    break;
                case "color":
                    noqVar.ct(jSONObject.optString(next));
                    break;
                case "right":
                    noqVar.gm(jSONObject.optInt(next));
                    break;
                case "width":
                    noqVar.uq((float) jSONObject.optDouble(next));
                    break;
                case "timingEnd":
                    noqVar.rz(jSONObject.optDouble(next));
                    break;
                case "paddingBottom":
                    noqVar.ct((float) jSONObject.optDouble(next));
                    break;
                case "allowTextFlow":
                    noqVar.nu(jSONObject.optBoolean(next));
                    break;
                case "interactWontHide":
                    noqVar.kus(jSONObject.optBoolean(next));
                    break;
                case "fontSize":
                    noqVar.gf((float) jSONObject.optDouble(next));
                    break;
                case "justifyVertical":
                    noqVar.um(jSONObject.optString(next));
                    break;
                case "interactVisibleTime":
                    noqVar.uf(jSONObject.optInt(next));
                    break;
                case "paddingRight":
                    noqVar.yo((float) jSONObject.optDouble(next));
                    break;
                case "borderColor":
                    noqVar.fi(jSONObject.optString(next));
                    break;
                case "borderStyle":
                    noqVar.gf(jSONObject.optString(next));
                    break;
                case "position":
                    noqVar.dg(jSONObject.optInt(next));
                    break;
                case "isDataFixed":
                    noqVar.ct(jSONObject.optBoolean(next));
                    break;
                case "marginRight":
                    noqVar.twf(jSONObject.optInt(next));
                    break;
                case "justifyHorizontal":
                    noqVar.xh(jSONObject.optString(next));
                    break;
                case "interactPosition":
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                    if (jSONObjectOptJSONObject == null) {
                        break;
                    } else {
                        noqVar.yo(jSONObjectOptJSONObject.optInt("translateY", 0));
                        noqVar.fi(jSONObjectOptJSONObject.optInt("translateX", 0));
                        noqVar.uq(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
                        noqVar.ct(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                    break;
                case "lineFeed":
                    noqVar.uq(jSONObject.optBoolean(next));
                    break;
                case "interactText":
                    noqVar.at(jSONObject.optString(next));
                    break;
                case "interactType":
                    noqVar.kus(jSONObject.optString(next));
                    break;
                case "borderRadius":
                    noqVar.kgy((float) jSONObject.optDouble(next));
                    break;
                case "clickTigger":
                    noqVar.dg(jSONObject.optString(next));
                    break;
                case "heightMode":
                    noqVar.ra(jSONObject.optString(next));
                    break;
                case "textFlowType":
                    noqVar.um(jSONObject.optInt(next));
                    break;
                case "borderSize":
                    noqVar.ahm((float) jSONObject.optDouble(next));
                    break;
                case "marginLeft":
                    noqVar.at(jSONObject.optInt(next));
                    break;
                case "letterSpacing":
                    noqVar.kus(jSONObject.optInt(next));
                    break;
            }
        }
    }

    public void aan() {
        kgy(this, this.owk);
    }

    public int ac() {
        return this.xhh;
    }

    public int af() {
        return this.aan;
    }

    public int ahm() {
        return this.ywg;
    }

    public boolean any() {
        return this.qjb;
    }

    public float at() {
        return this.ahm;
    }

    public boolean ax() {
        return this.xxq;
    }

    public String ay() {
        return this.dg;
    }

    public JSONObject be() {
        return this.owk;
    }

    public String bgd() {
        return this.ko;
    }

    public boolean bmz() {
        return this.fpz;
    }

    public double cc() {
        return this.dta;
    }

    public int ct() {
        return this.fv;
    }

    public float dg() {
        return this.fi;
    }

    public boolean dpp() {
        return this.lb;
    }

    public String dr() {
        return this.wn;
    }

    public boolean dta() {
        return this.vrj;
    }

    public int ebs() {
        return this.yjf;
    }

    public void eq() {
        kgy(this, this.ax);
    }

    public double fi() {
        return this.mh;
    }

    public double fpp() {
        return this.nu;
    }

    public String fpz() {
        return this.em;
    }

    public String ftg() {
        return this.ikw;
    }

    public boolean fv() {
        return this.ac;
    }

    public int fxy() {
        return this.idg;
    }

    public String gbb() {
        return this.muf;
    }

    public int gc() {
        return this.naw;
    }

    public int gf() {
        return this.kt;
    }

    public int gg() {
        return this.wl;
    }

    public String gm() {
        return this.vs;
    }

    public int ib() {
        return this.pm;
    }

    public int idg() {
        return this.yx;
    }

    public int ikw() {
        return this.jpc;
    }

    public String ioy() {
        return this.xh;
    }

    public int jc() {
        return this.ftg;
    }

    public String jpc() {
        return this.fpp;
    }

    public int jvt() {
        return this.qi;
    }

    public int jw() {
        return this.xlt;
    }

    public int ko() {
        return this.xkh;
    }

    public int kt() {
        return this.fxy;
    }

    public float kus() {
        return this.noq;
    }

    public int lb() {
        return this.mca;
    }

    public String lqi() {
        return this.um;
    }

    public String mca() {
        return this.bmz;
    }

    public int mh() {
        return this.ebs;
    }

    public double muf() {
        return this.wy;
    }

    public int mv() {
        return this.dr;
    }

    public String mw() {
        return this.vg;
    }

    public boolean naw() {
        return this.pxt;
    }

    public JSONObject noq() {
        return this.jw;
    }

    public float nu() {
        return this.kgy;
    }

    public String owk() {
        return this.vw;
    }

    public int oyj() {
        return this.uh;
    }

    public int pft() {
        return this.jc;
    }

    public int pm() {
        return this.af;
    }

    public int pxt() {
        return this.tp;
    }

    public int qdr() {
        return this.sm;
    }

    public int qi() {
        return this.gc;
    }

    public boolean qjb() {
        return this.be;
    }

    public String ra() {
        return this.al;
    }

    public String rlc() {
        return this.sa;
    }

    public int rz() {
        return this.any;
    }

    public List<kgy> sa() {
        return this.bgd;
    }

    public int sm() {
        return this.gbb;
    }

    public double sx() {
        return this.at;
    }

    public long ti() {
        return this.ce;
    }

    public int tp() {
        return this.mw;
    }

    public boolean twf() {
        return this.ct;
    }

    public String uf() {
        return this.ioy;
    }

    public boolean uh() {
        return this.xrn;
    }

    public float um() {
        return this.ra;
    }

    public int uq() {
        return this.mv;
    }

    public int uxe() {
        return this.ft;
    }

    public int vf() {
        return this.xts;
    }

    public String vg() {
        return this.lqi;
    }

    public double vrj() {
        return this.uf;
    }

    public float vs() {
        return this.yo;
    }

    public boolean vw() {
        return this.wbb;
    }

    public boolean vz() {
        return this.rlc;
    }

    public int wbb() {
        return this.eq;
    }

    public String wl() {
        return this.uxe;
    }

    public boolean wn() {
        return this.vz;
    }

    public String wy() {
        return this.ay;
    }

    public float xh() {
        return this.gf;
    }

    public String xhh() {
        return this.yu;
    }

    public boolean xkh() {
        return this.pft;
    }

    public String xlt() {
        return this.oyj;
    }

    public boolean xrn() {
        return this.gg;
    }

    public String xts() {
        return this.qdr;
    }

    public int xxq() {
        List<kgy> list = this.bgd;
        if (list == null) {
            return 0;
        }
        for (kgy kgyVar : list) {
            if ("translate".equals(kgyVar.gf()) && kgyVar.yo() < 0) {
                return -kgyVar.yo();
            }
        }
        return 0;
    }

    public boolean yjf() {
        return this.znm;
    }

    public int yo() {
        return this.ib;
    }

    public String yu() {
        return this.ti;
    }

    public int ywg() {
        return this.jvt;
    }

    public JSONObject yx() {
        return this.zjw;
    }

    public String zjw() {
        return this.cc;
    }

    public boolean znm() {
        return this.dpp;
    }

    public void ahm(int i) {
        this.any = i;
    }

    public void at(String str) {
        this.ioy = str;
    }

    public void ay(int i) {
        this.gc = i;
    }

    public void bmz(int i) {
        this.xlt = i;
    }

    public void ct(int i) {
        this.ib = i;
    }

    public void dg(String str) {
        this.ikw = str;
    }

    public void fi(float f) {
        this.gf = f;
    }

    public void fpp(String str) {
        this.cc = str;
    }

    public void fpz(int i) {
        this.qi = i;
    }

    public String ft() {
        return this.gm;
    }

    public void gf(float f) {
        this.ra = f;
    }

    public void gm(int i) {
        this.yx = i;
    }

    public void ikw(int i) {
        this.fxy = i;
    }

    public void ioy(int i) {
        this.yjf = i;
    }

    public void jpc(int i) {
        this.xhh = i;
    }

    public void kus(String str) {
        this.vg = str;
    }

    public void lqi(int i) {
        this.idg = i;
    }

    public void muf(int i) {
        this.dr = i;
    }

    public void noq(int i) {
        this.kt = i;
    }

    public void nu(String str) {
        this.ay = str;
    }

    public void ra(String str) {
        this.gm = str;
    }

    public void rz(int i) {
        this.mv = i;
    }

    public void sx(String str) {
        this.qdr = str;
    }

    public void twf(String str) {
        this.lqi = str;
    }

    public void uf(int i) {
        this.ebs = i;
    }

    public void um(String str) {
        this.muf = str;
    }

    public void uq(int i) {
        this.fv = i;
    }

    public void uxe(int i) {
        this.jvt = i;
    }

    public void vg(int i) {
        this.pm = i;
    }

    public void vrj(int i) {
        this.af = i;
    }

    public void vs(String str) {
        this.bmz = str;
    }

    public void wy(int i) {
        this.aan = i;
    }

    public void xh(String str) {
        this.uxe = str;
    }

    public void yo(float f) {
        this.fi = f;
    }

    public void ahm(float f) {
        this.ahm = f;
    }

    public void at(int i) {
        this.wl = i;
    }

    public void ay(String str) {
        this.oyj = str;
    }

    public void ct(float f) {
        this.noq = f;
    }

    public void dg(int i) {
        this.sm = i;
    }

    public void fi(String str) {
        this.fpp = str;
    }

    public void fpp(int i) {
        this.uh = i;
    }

    public void fpz(String str) {
        this.yu = str;
    }

    public void ft(int i) {
        this.eq = i;
    }

    public void gf(String str) {
        this.sx = str;
    }

    public void gm(String str) {
        this.ko = str;
    }

    public void ioy(String str) {
        this.wn = str;
    }

    public void jpc(String str) {
        this.ti = str;
    }

    public void kus(int i) {
        this.tp = i;
    }

    public void lqi(String str) {
        this.vw = str;
    }

    public void noq(float f) {
        this.yo = f;
    }

    public void nu(int i) {
        this.ftg = i;
    }

    public void ra(int i) {
        this.mca = i;
    }

    public void rz(float f) {
        this.rz = f;
    }

    public void sx(int i) {
        this.xts = i;
    }

    public void twf(int i) {
        this.gbb = i;
    }

    public void um(int i) {
        this.xkh = i;
    }

    public void uq(float f) {
        this.uq = f;
    }

    public void vs(int i) {
        this.jc = i;
    }

    public void xh(int i) {
        this.naw = i;
    }

    public void yo(String str) {
        this.um = str;
    }

    public void ahm(boolean z) {
        this.ct = z;
    }

    public void at(boolean z) {
        this.be = z;
    }

    public void ct(String str) {
        this.dg = str;
    }

    public void dg(boolean z) {
        this.ac = z;
    }

    public void fi(int i) {
        this.ft = i;
    }

    public void gf(int i) {
        this.mw = i;
    }

    public void kus(boolean z) {
        this.xxq = z;
    }

    public void noq(String str) {
        this.xh = str;
    }

    public void nu(boolean z) {
        this.znm = z;
    }

    public void ra(boolean z) {
        this.xrn = z;
    }

    public void rz(double d) {
        this.at = d;
    }

    public void twf(boolean z) {
        this.rlc = z;
    }

    public void um(boolean z) {
        this.vz = z;
    }

    public void uq(String str) {
        this.vs = str;
    }

    public void vs(boolean z) {
        this.qjb = z;
    }

    public void xh(boolean z) {
        this.wbb = z;
    }

    public void yo(int i) {
        this.jpc = i;
    }

    public void ahm(double d) {
        this.nu = d;
    }

    public void ct(double d) {
        this.uf = d;
    }

    public void fi(boolean z) {
        this.dpp = z;
    }

    public void gf(boolean z) {
        this.pft = z;
    }

    public void noq(double d) {
        this.dta = d;
    }

    public void rz(String str) {
        this.kus = str;
    }

    public void uq(double d) {
        this.wy = d;
    }

    public void yo(boolean z) {
        this.pxt = z;
    }

    public void ahm(String str) {
        this.twf = str;
    }

    public void ct(boolean z) {
        this.lb = z;
    }

    public void noq(boolean z) {
        this.gg = z;
    }

    public void rz(boolean z) {
        this.fpz = z;
    }

    public void uq(boolean z) {
        this.vrj = z;
    }

    public void ahm(JSONObject jSONObject) {
        this.zjw = jSONObject;
    }

    public void ct(JSONObject jSONObject) {
        this.jw = jSONObject;
    }

    public void rz(JSONObject jSONObject) {
        this.ax = jSONObject;
    }

    public void uq(JSONObject jSONObject) {
        this.owk = jSONObject;
    }

    public boolean kgy() {
        return this.vf;
    }

    public void kgy(boolean z) {
        this.vf = z;
    }

    public void kgy(int i) {
        this.ywg = i;
    }

    public void kgy(double d) {
        this.mh = d;
    }

    public void kgy(String str) {
        this.al = str;
    }

    public void kgy(float f) {
        this.kgy = f;
    }

    public void kgy(List<kgy> list) {
        this.bgd = list;
    }

    public void kgy(long j) {
        this.ce = j;
    }

    public static noq kgy(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        noq noqVar = new noq();
        noqVar.ahm(jSONObject.optString("adType", "embeded"));
        noqVar.vs(jSONObject.optString("clickArea", "creative"));
        noqVar.dg(jSONObject.optString("clickTigger", "click"));
        noqVar.rz(jSONObject.optString("fontFamily", "PingFangSC"));
        noqVar.uq(jSONObject.optString("textAlign", "left"));
        noqVar.ct(jSONObject.optString("color", "#999999"));
        noqVar.noq(jSONObject.optString("bgColor", C4664b4.i.T));
        noqVar.yo(jSONObject.optString("bgImgUrl", ""));
        noqVar.ft(jSONObject.optString("bgImgData", ""));
        noqVar.fi(jSONObject.optString("borderColor", "#000000"));
        noqVar.gf(jSONObject.optString("borderStyle", "solid"));
        noqVar.ra(jSONObject.optString("heightMode", "auto"));
        noqVar.nu(jSONObject.optString("widthMode", "fixed"));
        noqVar.at(jSONObject.optString("interactText", ""));
        noqVar.rz(jSONObject.optBoolean("isShowBgControl", false));
        noqVar.twf(jSONObject.optString("interactBgColor", ""));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("interactPosition");
        if (jSONObjectOptJSONObject != null) {
            noqVar.yo(jSONObjectOptJSONObject.optInt("translateY", 0));
            noqVar.fi(jSONObjectOptJSONObject.optInt("translateX", 0));
            noqVar.uq(jSONObjectOptJSONObject.optDouble("scaleX", 0.0d));
            noqVar.ct(jSONObjectOptJSONObject.optDouble("scaleY", 0.0d));
        }
        noqVar.kus(jSONObject.optString("interactType", ""));
        noqVar.ct(jSONObject.optInt("interactSlideDirection", -1));
        noqVar.xh(jSONObject.optString("justifyHorizontal", "space-around"));
        noqVar.um(jSONObject.optString("justifyVertical", "flex-start"));
        noqVar.ahm(jSONObject.optDouble("timingStart"));
        noqVar.rz(jSONObject.optDouble("timingEnd"));
        noqVar.uq((float) jSONObject.optDouble("width", 0.0d));
        noqVar.rz((float) jSONObject.optDouble("height", 0.0d));
        noqVar.kgy((float) jSONObject.optDouble("borderRadius", 0.0d));
        noqVar.ahm((float) jSONObject.optDouble("borderSize", 0.0d));
        noqVar.ahm(jSONObject.optBoolean("interactValidate", false));
        noqVar.gf((float) jSONObject.optDouble("fontSize", 0.0d));
        noqVar.ct((float) jSONObject.optDouble("paddingBottom", 0.0d));
        noqVar.noq((float) jSONObject.optDouble("paddingLeft", 0.0d));
        noqVar.yo((float) jSONObject.optDouble("paddingRight", 0.0d));
        noqVar.fi((float) jSONObject.optDouble("paddingTop", 0.0d));
        noqVar.uq(jSONObject.optBoolean("lineFeed", false));
        noqVar.gf(jSONObject.optInt("lineCount", 0));
        noqVar.noq(jSONObject.optDouble("lineHeight", 1.2d));
        noqVar.kus(jSONObject.optInt("letterSpacing", 0));
        noqVar.ct(jSONObject.optBoolean("isDataFixed", false));
        noqVar.vs(jSONObject.optInt("fontWeight"));
        noqVar.noq(jSONObject.optBoolean("lineLimit"));
        noqVar.dg(jSONObject.optInt(C4664b4.i.L));
        noqVar.fpp(jSONObject.optString("align"));
        noqVar.yo(jSONObject.optBoolean("useLeft"));
        noqVar.fi(jSONObject.optBoolean("useRight"));
        noqVar.gf(jSONObject.optBoolean("useTop"));
        noqVar.ra(jSONObject.optBoolean("useBottom"));
        noqVar.sx(jSONObject.optString("data"));
        noqVar.ahm(jSONObject.optJSONObject("i18n"));
        noqVar.at(jSONObject.optInt("marginLeft"));
        noqVar.twf(jSONObject.optInt("marginRight"));
        noqVar.ra(jSONObject.optInt("marginTop"));
        noqVar.nu(jSONObject.optInt("marginBottom"));
        noqVar.xh(jSONObject.optInt("tagMaxCount"));
        noqVar.nu(jSONObject.optBoolean("allowTextFlow"));
        noqVar.um(jSONObject.optInt("textFlowType"));
        noqVar.fpp(jSONObject.optInt("textFlowDuration"));
        noqVar.sx(jSONObject.optInt("left"));
        noqVar.gm(jSONObject.optInt("right"));
        noqVar.ay(jSONObject.optInt("top"));
        noqVar.ioy(jSONObject.optInt("bottom"));
        noqVar.gm(jSONObject.optString("alignItems", "flex-start"));
        noqVar.ay(jSONObject.optString("direction", ""));
        noqVar.kgy(jSONObject.optBoolean("loop", false));
        noqVar.lqi(jSONObject.optInt("zIndex"));
        noqVar.uf(jSONObject.optInt("interactVisibleTime"));
        noqVar.fpz(jSONObject.optInt("interactHiddenTime"));
        noqVar.twf(jSONObject.optBoolean("interactEnableMask"));
        noqVar.kus(jSONObject.optBoolean("interactWontHide"));
        noqVar.kgy(jSONObject.optString("bgGradient"));
        noqVar.bmz(jSONObject.optInt("areaType"));
        noqVar.ikw(jSONObject.optInt("interactSlideThreshold", 0));
        noqVar.vrj(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.uq.ahm() ? 0 : b.v));
        noqVar.um(jSONObject.optBoolean("openPlayableLandingPage", false));
        noqVar.rz(jSONObject.optJSONObject("video"));
        noqVar.uq(jSONObject.optJSONObject("image"));
        noqVar.uxe(jSONObject.optInt("borderShadowExtent"));
        noqVar.vs(jSONObject.optBoolean("bgGauseBlur"));
        noqVar.muf(jSONObject.optInt("bgGauseBlurRadius"));
        noqVar.dg(jSONObject.optBoolean("showTimeProgress", false));
        noqVar.xh(jSONObject.optBoolean("showPlayButton", false));
        noqVar.kgy(jSONObject.optDouble("bgColorCg", 0.0d));
        noqVar.noq(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        noqVar.ahm(jSONObject.optInt("borderTopLeftRadius", 0));
        noqVar.kgy(jSONObject.optInt("borderTopRightRadius", 0));
        noqVar.uq(jSONObject.optInt("borderBottomLeftRadius", 0));
        noqVar.rz(jSONObject.optInt("borderBottomRightRadius", 0));
        noqVar.ct(jSONObject.optJSONObject("interactI18n"));
        noqVar.lqi(jSONObject.optString("imageObjectFit"));
        noqVar.fpz(jSONObject.optString("interactTitle"));
        noqVar.vg(jSONObject.optInt("interactTextPositionTop"));
        noqVar.ioy(jSONObject.optString("imageLottieTosPath"));
        noqVar.at(jSONObject.optBoolean("animationsLoop"));
        noqVar.jpc(jSONObject.optInt("lottieAppNameMaxLength"));
        noqVar.wy(jSONObject.optInt("lottieAdDescMaxLength"));
        noqVar.ft(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("animations");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                    kgy kgyVar = new kgy();
                    kgyVar.rz(jSONObject2.optString("animationType"));
                    kgyVar.kgy(jSONObject2.optDouble("animationDuration"));
                    kgyVar.ahm(jSONObject2.optDouble("animationScaleX"));
                    kgyVar.rz(jSONObject2.optDouble("animationScaleY"));
                    kgyVar.uq(jSONObject2.optString("animationTimeFunction"));
                    kgyVar.uq(jSONObject2.optDouble("animationDelay"));
                    kgyVar.noq(jSONObject2.optInt("animationIterationCount"));
                    kgyVar.ct(jSONObject2.optString("animationDirection"));
                    kgyVar.ct(jSONObject2.optDouble("animationInterval"));
                    kgyVar.kgy(jSONObject2.optInt("animationBorderWidth"));
                    kgyVar.kgy(jSONObject2.optLong(C4664b4.i.W));
                    kgyVar.ahm(jSONObject2.optInt("animationEffectWidth"));
                    kgyVar.rz(jSONObject2.optInt("animationSwing", 1));
                    kgyVar.uq(jSONObject2.optInt("animationTranslateX"));
                    kgyVar.ct(jSONObject2.optInt("animationTranslateY"));
                    kgyVar.ahm(jSONObject2.optString("animationRippleBackgroundColor"));
                    kgyVar.kgy(jSONObject2.optString("animationScaleDirection"));
                    kgyVar.yo(jSONObject2.optInt("animationFadeStart"));
                    kgyVar.fi(jSONObject2.optInt("animationFadeEnd"));
                    kgyVar.noq(jSONObject2.optString("animationFillMode"));
                    kgyVar.gf(jSONObject2.optInt("animationBounceHeight"));
                    if (noqVar.fpp() > 0.0d) {
                        kgyVar.uq(kgyVar.kus() + noqVar.fpp());
                    }
                    arrayList.add(kgyVar);
                }
                noqVar.kgy(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                noqVar.jpc(jSONObject.optString("triggerSlideDirection", "0"));
                noqVar.kgy(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
            return noqVar;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJt3o5L2lSPX60nX+sh", "f/cjlA61auuBU9hImDOyIVjlG5QPqWw=", "XvY5hwK/feuBU9hImDOyIVjlG5QPqWw=", 344);
            return noqVar;
        }
    }
}
