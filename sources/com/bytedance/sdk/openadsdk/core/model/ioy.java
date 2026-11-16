package com.bytedance.sdk.openadsdk.core.model;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinErrorCodes;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.mca;
import com.ironsource.C4664b4;
import com.ironsource.C4978se;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.unity3d.services.UnityAdsConstants;
import defpackage.bb3;
import defpackage.oe3;
import defpackage.u12;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class ioy {
    public static final String ahm;
    protected static int nu;
    public static final String rz;
    public static final String uq;
    private int ac;
    private bb3 af;
    private int aj;
    private JSONObject any;
    private boolean ax;
    private long ay;
    private int be;
    private JSONObject ca;
    private JSONObject ce;
    private wy doi;
    private um dpp;
    private long dr;
    private int eb;
    private String ecz;
    private vs eia;
    private JSONObject em;
    private String eq;
    private fpp fbw;
    private int fe;
    protected int fi;
    private boolean fij;
    private String fpp;
    private int fpz;
    private int ftg;
    protected long gf;
    private int gg;
    private String gjn;
    private int gwg;
    private boolean hdr;
    private int ib;
    private String idg;
    private gm ids;
    private String ife;
    private com.bytedance.sdk.openadsdk.core.model.kgy ikw;
    private long ioy;
    private int iwd;
    private int jc;
    private lqi jpc;
    private String jq;
    private Map<String, Object> jw;
    private int kd;
    private twf ko;
    private kgy kt;
    private String kw;
    private volatile boolean kwy;
    private int mca;
    private boolean mh;
    private String muf;
    private boolean mw;
    private PAGBannerSize na;
    private String naw;
    private fi nge;
    private String oja;
    private boolean ol;
    private jpc op;
    private boolean owk;
    private uf ox;
    private int oyj;
    private com.bytedance.sdk.openadsdk.core.at.fi.kgy oz;
    private String pft;
    private String pq;
    private String prk;
    private String pt;
    private um pxt;
    private boolean qbt;
    private String qi;
    private int qjb;
    private String rdw;
    private boolean rpo;
    private int rtt;
    private String rx;
    private boolean sa;
    private vg sdl;
    private int sf;
    private int sm;
    private int sx;
    private int tca;
    private int tpu;
    private xh tv;
    public long twf;
    private String uf;
    private String uh;
    private ct um;
    private String uny;
    private com.bytedance.sdk.openadsdk.core.at.fi.kgy uur;
    private String uxe;
    private String vf;
    private int vg;
    private int vom;
    private int vrj;
    private bb3 vz;
    private bb3 wbb;
    private String wh;
    private int wl;
    private AdSlot wn;
    private yo wo;
    private int wzd;
    private boolean xh;
    private String xkh;
    private String xrn;
    private String xts;
    private int xxq;
    private JSONObject yh;
    private noq yjf;
    private boolean yk;
    private ikw ym;
    private com.bytedance.sdk.openadsdk.core.twf.kgy yt;
    private kus yv;
    private String ywg;
    private int yx;
    private boolean zfi;
    private String znm;
    private long dg = 0;
    protected boolean kgy = false;
    protected boolean ct = com.bytedance.sdk.openadsdk.fpz.kgy.rz.kgy;
    protected int noq = com.bytedance.sdk.openadsdk.fpz.kgy.rz.ahm;
    protected String yo = com.bytedance.sdk.openadsdk.fpz.kgy.rz.rz;
    private int gm = 0;
    private boolean lqi = false;
    private List<String> ft = new ArrayList();
    private int wy = -1;
    private HashMap<String, String> bmz = new HashMap<>();
    protected int ra = 0;
    private final List<um> gbb = new ArrayList();
    private final List<String> dta = new ArrayList();
    private final List<FilterWord> tp = new ArrayList();
    private final mca lb = mca.rz();
    public boolean at = false;
    private int cc = 0;
    private List<String> qdr = new ArrayList();
    private List<String> zjw = new ArrayList();
    private String gc = "0";
    private String ebs = "";
    private int bgd = 0;
    private int xlt = 2;
    private int fxy = -1;
    private int jvt = 0;
    private int mv = 0;
    private int fv = 1;
    private nu vw = new nu();
    private int pm = AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES;
    private int rlc = 0;
    private int xhh = 1;
    private int aan = 0;
    private int yu = 0;
    private int ti = 0;
    private int al = 1;
    private int paj = 1;
    private float bcr = 100.0f;
    private int gj = -1;
    private int nmy = 2;
    private int pl = 1;
    private int hbl = 0;
    private int vai = 1;
    private int ug = -1;
    private long mx = -1;
    private int kp = 0;
    private int wk = Integer.MIN_VALUE;
    private boolean uju = false;
    private int ezq = 0;
    private int wd = -1;
    private int cly = -1;
    private long ws = -1;
    private int tml = 50;
    private int lz = -1;
    private final ahm epw = new ahm();
    private boolean ova = false;
    private int nz = 0;
    private com.bytedance.sdk.openadsdk.fpz.kgy.ahm vvg = null;
    protected int kus = -1;
    protected int vs = -1;
    private int wt = 0;
    private float mu = -1.0f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private String ahm;
        private String at;
        private String ct;
        private List<Integer> fi;
        private String gf;
        private String kgy;
        private String kus;
        private String noq;
        private String nu;
        private String ra;
        private String rz;
        private String twf;
        private String uq;
        private String yo;

        @NonNull
        public static com.bytedance.sdk.openadsdk.core.at.fi.kgy ahm(kgy kgyVar, String str) {
            return new com.bytedance.sdk.openadsdk.core.at.fi.kgy().kgy(kgyVar.uq()).ahm(kgyVar.kus()).rz(kgyVar.twf()).uq(kgyVar.vs()).ct(str);
        }

        public boolean at() {
            return !TextUtils.isEmpty(this.ra) && this.ra.equals("v3");
        }

        public String ct() {
            return this.ahm;
        }

        public String fi() {
            return this.ct;
        }

        public String gf() {
            return this.yo;
        }

        public String kus() {
            return this.twf;
        }

        public String noq() {
            return this.rz;
        }

        public String nu() {
            return this.ra;
        }

        public String ra() {
            return this.nu;
        }

        public String rz() {
            return this.noq;
        }

        public String twf() {
            return this.at;
        }

        public String uq() {
            return this.kgy;
        }

        public String vs() {
            return this.kus;
        }

        public String yo() {
            return this.uq;
        }

        @NonNull
        public static com.bytedance.sdk.component.adexpress.kgy.rz.uq kgy(kgy kgyVar, String str) {
            return com.bytedance.sdk.component.adexpress.kgy.rz.uq.kgy().kgy(kgyVar.uq()).ahm(kgyVar.ct()).rz(kgyVar.noq()).uq(kgyVar.yo()).ct(kgyVar.rz()).noq(str);
        }

        public void ct(String str) {
            this.rz = str;
        }

        public void fi(String str) {
            this.yo = str;
        }

        public void gf(String str) {
            this.nu = str;
        }

        public void noq(String str) {
            this.uq = str;
        }

        public void nu(String str) {
            this.at = str;
        }

        public void ra(String str) {
            this.ra = str;
        }

        public void rz(String str) {
            this.kgy = str;
        }

        public void twf(String str) {
            this.kus = str;
        }

        public void uq(String str) {
            this.ahm = str;
        }

        public void yo(String str) {
            this.ct = str;
        }

        public void at(String str) {
            this.twf = str;
        }

        public String ahm() {
            return this.gf;
        }

        public void ahm(String str) {
            this.noq = str;
        }

        public List<Integer> kgy() {
            return this.fi;
        }

        public void kgy(List<Integer> list) {
            this.fi = list;
        }

        public void kgy(String str) {
            this.gf = str;
        }
    }

    public static com.bytedance.sdk.openadsdk.core.kus.kgy.ahm noq(ioy ioyVar) {
        String strA;
        String strB;
        int i;
        boolean z = false;
        ioyVar.pxt(0);
        int iUju = ioyVar.uju();
        int i2 = 4;
        if (iUju != 3 && iUju != 4) {
            if (iUju == 7) {
                strB = ((oe3) CacheDirFactory.getICacheDir()).b();
                i = 1;
            } else if (iUju != 8) {
                strB = ((oe3) CacheDirFactory.getICacheDir()).e();
                i = 3;
            } else {
                strA = ((oe3) CacheDirFactory.getICacheDir()).b();
                i2 = 2;
            }
            com.bytedance.sdk.openadsdk.core.kus.kgy.ahm ahmVar = new com.bytedance.sdk.openadsdk.core.kus.kgy.ahm(strB, ioyVar.uur(), ioyVar.ym(), ioyVar.qbt(), ioyVar.rx(), i, ioyVar.uju());
            ahmVar.kgy(com.bytedance.sdk.openadsdk.lqi.ct.kgy("video_error_conf", 0));
            String strDg = ahmVar.dg();
            if (u12.m && strDg != null && strDg.endsWith(".mp4")) {
                z = true;
            }
            ahmVar.rz(z);
            return ahmVar;
        }
        strA = ((oe3) CacheDirFactory.getICacheDir()).a();
        strB = strA;
        i = i2;
        com.bytedance.sdk.openadsdk.core.kus.kgy.ahm ahmVar2 = new com.bytedance.sdk.openadsdk.core.kus.kgy.ahm(strB, ioyVar.uur(), ioyVar.ym(), ioyVar.qbt(), ioyVar.rx(), i, ioyVar.uju());
        ahmVar2.kgy(com.bytedance.sdk.openadsdk.lqi.ct.kgy("video_error_conf", 0));
        String strDg2 = ahmVar2.dg();
        if (u12.m) {
            z = true;
        }
        ahmVar2.rz(z);
        return ahmVar2;
    }

    public static boolean uq(ioy ioyVar) {
        return (ioyVar == null || ioyVar.jw() == null || ioyVar.jw().k != 1) ? false : true;
    }

    public static boolean yo(ioy ioyVar) {
        Object obj;
        if (ioyVar == null) {
            return false;
        }
        try {
            Map<String, Object> mapNmy = ioyVar.nmy();
            return (mapNmy == null || (obj = mapNmy.get(TTAdConstant.SDK_BIDDING_TYPE)) == null || 2 != Integer.parseInt(obj.toString())) ? false : true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "Uv0OmQq5Z9OiQ9NZhR+n", 462);
            th.getMessage();
            return false;
        }
    }

    public JSONObject ca() {
        JSONObject jSONObjectTwf = twf(false);
        JSONObject jSONObjectFpp = com.bytedance.sdk.openadsdk.core.settings.nu.ahm().fpp(String.valueOf(ws()));
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObjectTwf);
            jSONObject.put("creatives", jSONArray);
            jSONObject.put("did", 1);
            jSONObject.put("processing_time_ms", 100);
            jSONObject.put("request_id", "aaaaaaaa-aaaa-aaaa-aaaa-aaaaaaaaaaaa");
            jSONObject.put("s_receive_ts", 1);
            jSONObject.put("s_send_ts", 1);
            jSONObject.put("status_code", 20000);
            jSONObject.put("core_settings", jSONObjectFpp);
            return jSONObject;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5swa5bcWBSdx3nx6uB1nk", C4978se.d);
            com.bytedance.sdk.component.utils.sx.rz("MaterialMeta", "toJsonObjPlus", e.getMessage());
            return jSONObject;
        }
    }

    public int dta() {
        try {
            JSONObject jSONObjectWk = wk();
            if (jSONObjectWk != null) {
                return jSONObjectWk.optInt("rec_clk", 0);
            }
            return 0;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5pwa/SsuL", 979);
            return 0;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ioy.class == obj.getClass()) {
            ioy ioyVar = (ioy) obj;
            if (this.gc.equals(ioyVar.wzd()) && this.qi.equals(ioyVar.bcr())) {
                return true;
            }
        }
        return false;
    }

    public void ife() {
        this.kwy = true;
    }

    public void nu(int i) {
        kgy(i, -1);
    }

    public boolean sdl() {
        return true;
    }

    public JSONObject twf(boolean z) {
        try {
            String strFbw = fbw();
            if (TextUtils.isEmpty(strFbw)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("raw_response_info", strFbw);
            }
            JSONArray jSONArrayOptJSONArray = PangleNetworkBridge.jsonObjectInit(strFbw).optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null && rz() >= 0 && rz() < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(rz());
                if (jSONObjectOptJSONObject != null) {
                    Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObjectOptJSONObject.get(next));
                    }
                }
                AdSlot adSlotJvt = jvt();
                if (adSlotJvt != null) {
                    jSONObject.put("adslot", adSlotJvt.toJsonObj());
                }
                if (!TextUtils.isEmpty(this.pt)) {
                    jSONObject.put("gdid_encrypted", this.pt);
                }
                jSONObject.put("hasReportShow", this.zfi);
                jSONObject.put("isMrcReportFinish", this.kwy);
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5uAaoaO2TRdlyjhs=", 2046);
            com.bytedance.sdk.component.utils.sx.kgy("MaterialMeta", "toJsonObj error", e);
            return null;
        }
    }

    private static double gf(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optDouble("pack_time", 0.0d);
        }
        return 0.0d;
    }

    public static boolean oyj(int i) {
        return i == 44 || i == 43 || i == 30 || i == 40 || i == 41 || i == 39;
    }

    private boolean sx(boolean z) {
        int i = this.wt;
        if (z) {
            return i == 1 || i == 3;
        }
        return i == 2 || i == 3;
    }

    public List<String> aan() {
        return this.zjw;
    }

    public int abq() {
        return this.vs;
    }

    public String ac() {
        return this.ywg;
    }

    public int af() {
        return this.xxq;
    }

    public JSONObject aj() {
        return this.ca;
    }

    public String al() {
        return this.xkh;
    }

    public int any() {
        return this.jc;
    }

    public void at(String str) {
        if (TextUtils.isEmpty(str)) {
            bb3 bb3Var = this.wbb;
            str = (bb3Var == null || TextUtils.isEmpty(bb3Var.h)) ? null : this.wbb.h;
        }
        if (str != null) {
            try {
                if (str.contains("style_id")) {
                    this.qbt = true;
                    this.rx = str;
                    this.jq = Uri.parse(str).getQueryParameters("style_id").get(0);
                    return;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "Tv4plBe5WtOZRtJ0iA==", 1078);
                com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
                return;
            }
        }
        this.rx = null;
        this.qbt = false;
    }

    public String au() {
        return this.uf;
    }

    public int ax() {
        JSONObject jSONObject;
        int i = this.wk;
        return (Integer.MIN_VALUE != i || (jSONObject = this.yh) == null) ? i : jSONObject.optInt("click_trigger_type", 0);
    }

    public String ay() {
        return this.pq;
    }

    public String bcr() {
        return this.qi;
    }

    public List<um> be() {
        return this.gbb;
    }

    public int bgd() {
        return this.yu;
    }

    public float bp() {
        float f = this.mu;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return f;
        }
        ikw ikwVar = this.ym;
        if (ikwVar != null) {
            String strUq = ikwVar.uq();
            if (TextUtils.isEmpty(strUq)) {
                strUq = com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy("adv3", this.ym.kgy(), this.ym.ahm());
            }
            if (strUq != null) {
                try {
                    JSONObject jSONObjectOptJSONObject = PangleNetworkBridge.jsonObjectInit(strUq).optJSONObject("body");
                    if (jSONObjectOptJSONObject != null) {
                        float fOptDouble = (float) jSONObjectOptJSONObject.optDouble("ratio");
                        this.mu = fOptDouble;
                        return fOptDouble;
                    }
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5oROwX5SyS8NUgw==", 2789);
                }
            }
        }
        this.mu = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean bs() {
        int i = this.sm;
        return i == 44 || i == 43;
    }

    public int cc() {
        if (this.lz < 0) {
            try {
                JSONObject jSONObjectWk = wk();
                if (jSONObjectWk != null) {
                    this.lz = jSONObjectWk.optInt("is_drop_to_retargeting_sample", 0);
                } else {
                    this.lz = 0;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5sRGzefOPeNJJjQOnLU8=", IronSourceError.ERROR_IS_LOAD_DURING_SHOW);
                this.lz = 0;
            }
        }
        return this.lz;
    }

    public String ce() {
        return this.znm;
    }

    public void ct(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.jc = 4;
        this.gc = jSONObject.optString("id");
        this.vf = jSONObject.optString("source");
        noq noqVar = new noq();
        this.yjf = noqVar;
        noqVar.rz(jSONObject.optString("pkg_name"));
        this.yjf.ahm(jSONObject.optString("name"));
        this.yjf.kgy(jSONObject.optString(DownloadModel.DOWNLOAD_URL));
    }

    public com.bytedance.sdk.openadsdk.fpz.kgy.ahm db() {
        return this.vvg;
    }

    public String dg() {
        return this.rx;
    }

    public boolean doi() {
        return this.uju;
    }

    public yo dpp() {
        return this.wo;
    }

    public int dr() {
        return this.pm;
    }

    public mca eb() {
        return this.lb;
    }

    public String ebs() {
        return this.uny;
    }

    public String ecz() {
        return this.fpp;
    }

    public xh eia() {
        return this.tv;
    }

    public String em() {
        if (!TextUtils.isEmpty(this.xkh)) {
            return this.xkh;
        }
        Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
        int iAny = any();
        if (iAny == 2 || iAny == 3) {
            return contextKgy != null ? com.bytedance.sdk.component.utils.ay.kgy(contextKgy, "tt_video_mobile_go_detail") : this.xkh;
        }
        if (iAny != 4) {
            return this.xkh;
        }
        return contextKgy != null ? com.bytedance.sdk.component.utils.ay.kgy(contextKgy, "tt_video_download_apk") : this.xkh;
    }

    public boolean epw() {
        return this.kgy;
    }

    public List<String> eq() {
        return this.qdr;
    }

    public int ezq() {
        return this.ug;
    }

    public String fbw() {
        return this.kw;
    }

    public int fe() {
        JSONObject jSONObject = this.ca;
        if (jSONObject != null) {
            return jSONObject.optInt("easy_playable_skip_duration", 0);
        }
        return 0;
    }

    public int fpp() {
        return this.ra;
    }

    public gm fpz() {
        return this.ids;
    }

    public fpp ft() {
        return this.fbw;
    }

    public int ftg() {
        return this.ezq;
    }

    public boolean fv() {
        return this.eb == 1;
    }

    public nu fxy() {
        return this.vw;
    }

    public boolean gbb() {
        return this.fij;
    }

    public int gc() {
        return this.bgd;
    }

    public String gg() {
        JSONObject jSONObjectWk;
        if (this.wh == null && (jSONObjectWk = wk()) != null) {
            this.wh = jSONObjectWk.optString("cid", "");
        }
        return this.wh;
    }

    public String gj() {
        return this.ecz;
    }

    public com.bytedance.sdk.openadsdk.core.twf.kgy gjn() {
        return this.yt;
    }

    public boolean gm() {
        return this.ax;
    }

    public int go() {
        Map<String, Object> map = this.jw;
        if (map == null) {
            return 0;
        }
        try {
            Object obj = map.get(TTAdConstant.SDK_BIDDING_TYPE);
            if (obj != null) {
                return Integer.parseInt(obj.toString());
            }
            return 0;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5pge3S86ETt5TiyW5OF4=", 2648);
            return 0;
        }
    }

    public HashMap<String, String> gq() {
        return this.bmz;
    }

    public boolean gwg() {
        return this.lb.kgy > 0;
    }

    public JSONObject hbl() {
        return this.em;
    }

    public ikw ib() {
        return this.ym;
    }

    public int idg() {
        return this.mv;
    }

    public boolean ids() {
        if (this.gbb.isEmpty()) {
            return false;
        }
        if (this.oyj == 4 && this.gbb.size() < 3) {
            return false;
        }
        Iterator<um> it = this.gbb.iterator();
        while (it.hasNext()) {
            if (!it.next().ct()) {
                return false;
            }
        }
        return true;
    }

    public String ioy() {
        return this.ife;
    }

    public vg iql() {
        return this.sdl;
    }

    public int iru() {
        return this.fi;
    }

    public String is() {
        return this.yo;
    }

    public boolean iwd() {
        return this.sa;
    }

    public int jc() {
        return this.tml;
    }

    public fi jpc() {
        return this.nge;
    }

    public com.bytedance.sdk.component.ra.ahm.kgy jq() {
        com.bytedance.sdk.component.ra.ahm.kgy kgyVar = new com.bytedance.sdk.component.ra.ahm.kgy();
        kgyVar.ahm(this.xxq);
        kgyVar.ahm(this.gc);
        kgyVar.rz(this.idg);
        kgyVar.kgy(bcr());
        kgyVar.kgy(this.mv);
        return kgyVar;
    }

    public int jtj() {
        return this.wd;
    }

    public AdSlot jvt() {
        return this.wn;
    }

    public bb3 jw() {
        return this.wbb;
    }

    public long jwo() {
        return this.ay;
    }

    public boolean jzz() {
        jpc jpcVar = this.op;
        if (jpcVar == null || jpcVar.ahm() != 1) {
            return false;
        }
        lqi lqiVar = this.jpc;
        return lqiVar == null || lqiVar.kgy() <= 0;
    }

    public int ka() {
        return this.gm;
    }

    public void kgy(int i, int i2) {
        this.sm = i;
        this.gg = i;
        if (this.wn == null) {
            this.gg = 0;
            return;
        }
        if (i2 <= 0) {
            i2 = uju();
        }
        if (this.wn.getDurationSlotType() == 3 || i2 == 3) {
            this.gg = 14;
            return;
        }
        if (this.wn.getDurationSlotType() == 7 || this.wn.getDurationSlotType() == 8 || i2 == 7 || i2 == 8) {
            if (!this.yk) {
                if (uf.rz(this)) {
                    this.gg = 12;
                    return;
                } else if (uf.ahm(this)) {
                    this.gg = 9;
                    return;
                }
            }
            if (this.sm == 5 && !sx.uq(this)) {
                this.gg = 7;
            }
            if (this.sm == 6 && !sx.ahm(this)) {
                this.gg = 7;
            }
            if (this.sm == 8 && qjb() != 100) {
                this.gg = 7;
            }
            if (this.sm == 38 && !sx.rz(this)) {
                this.gg = 7;
            }
            if (i < 5) {
                this.gg = 7;
                return;
            }
            return;
        }
        if (!this.yk && uf.ahm(this)) {
            this.gg = 4;
            return;
        }
        if (this.sm == 4 && !uf.ahm(this)) {
            this.gg = 0;
        }
        int i3 = this.sm;
        if (i3 == 41) {
            this.gg = 41;
            return;
        }
        if (i >= 5) {
            this.gg = 0;
            return;
        }
        if (i3 == 2 && any() != 3) {
            this.gg = 0;
        } else if (i == 0 || (i == 1 && any() != 3)) {
            this.gg = 0;
        }
    }

    public boolean kii() {
        return this.ct;
    }

    public int ko() {
        return this.fxy;
    }

    public vs kp() {
        return this.eia;
    }

    public String kt() {
        return this.vf;
    }

    public boolean kus() {
        return this.xh;
    }

    public int kvd() {
        int i = this.kus;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.xh.uq().sx(String.valueOf(ws()));
    }

    public int kw() {
        return this.nz;
    }

    public int kwy() {
        return this.iwd;
    }

    public boolean lb() {
        return this.yk;
    }

    public boolean lj() {
        return this.ftg == 1;
    }

    public boolean lz() {
        int i = this.gg;
        return (i == 2 || i == 1) && 3 == this.jc;
    }

    public boolean mbc() {
        return this.lqi;
    }

    public boolean mh() {
        kgy kgyVar = this.kt;
        if (kgyVar != null) {
            return !TextUtils.isEmpty(kgyVar.nu());
        }
        int i = this.mv;
        return i == 9 || i == 10 || i == 11;
    }

    public boolean mu() {
        AdSlot adSlot = this.wn;
        if (adSlot == null) {
            return false;
        }
        return sx(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    public boolean mv() {
        return this.gwg == 1;
    }

    public com.bytedance.sdk.openadsdk.core.at.fi.kgy mw() {
        return this.oz;
    }

    public boolean na() {
        return this.at;
    }

    public int naw() {
        return this.gg;
    }

    public long nge() {
        return this.twf;
    }

    public Map<String, Object> nmy() {
        return this.jw;
    }

    public long nqx() {
        return this.ioy;
    }

    public ahm nz() {
        return this.epw;
    }

    public int oja() {
        return this.ib;
    }

    public long ol() {
        if (this.mx < 0) {
            JSONObject jSONObjectWk = wk();
            if (jSONObjectWk != null) {
                this.mx = jSONObjectWk.optLong(CreativeInfo.c, 0L);
            } else {
                this.mx = 0L;
            }
        }
        return this.mx;
    }

    public wy op() {
        return this.doi;
    }

    public PAGBannerSize ova() {
        return this.na;
    }

    public JSONObject owk() {
        return this.yh;
    }

    public int oz() {
        return this.vai;
    }

    public twf paj() {
        return this.ko;
    }

    public int pft() {
        yo yoVar = this.wo;
        if (yoVar == null) {
            return 2;
        }
        return yoVar.ahm();
    }

    public JSONObject pl() {
        return this.ce;
    }

    public um pm() {
        return this.pxt;
    }

    public boolean pq() {
        return this.sf == 1;
    }

    public int prk() {
        return this.kp;
    }

    public int pt() {
        return this.aj;
    }

    public boolean pxt() {
        if (this.ug <= 0) {
            this.ug = uju();
        }
        int i = this.ug;
        return (i == 7 || i == 8) && !ct(this) && znm() != 21 && this.kd == 1;
    }

    public int qbt() {
        return this.hbl;
    }

    public long qdr() {
        yo yoVar = this.wo;
        if (yoVar == null) {
            return 0L;
        }
        return yoVar.rz();
    }

    public int qi() {
        return this.fv;
    }

    public int qjb() {
        return this.ac;
    }

    public List<String> qz() {
        return this.ft;
    }

    public int ra() {
        return this.sx;
    }

    public int rdw() {
        return this.oyj;
    }

    public um rlc() {
        return this.dpp;
    }

    public int rpo() {
        return this.fe;
    }

    public int rqk() {
        int i = this.wy;
        if (i >= 0) {
            return i;
        }
        return hdr() ? 30 : 5;
    }

    public long rtt() {
        return this.dr;
    }

    public int rx() {
        return this.tpu;
    }

    public int sf() {
        return this.rtt;
    }

    public String sm() {
        return this.prk;
    }

    public jpc st() {
        return this.op;
    }

    public void tca() {
        this.lb.ct();
        yo(false);
    }

    public int thv() {
        return this.noq;
    }

    public String ti() {
        return this.naw;
    }

    public boolean tp() {
        return this.zfi;
    }

    public int tpu() {
        if (this.paj != 2) {
            this.paj = 1;
        }
        return this.paj;
    }

    public int tv() {
        int i = this.gj;
        if (i >= 0) {
            return i;
        }
        return 30;
    }

    public long ud() {
        return this.gf;
    }

    public String uf() {
        return this.pt;
    }

    public boolean ug() {
        int i = this.kp;
        return (i == 1 || i == 3) && gjn() != null;
    }

    public int uh() {
        return this.pl;
    }

    public int uju() {
        if (this.ug < 0) {
            JSONObject jSONObjectWk = wk();
            if (jSONObjectWk != null) {
                this.ug = jSONObjectWk.optInt("ad_slot_type", 0);
            } else {
                this.ug = 0;
            }
        }
        return this.ug;
    }

    public long um() {
        return this.ws;
    }

    public String uny() {
        return this.idg;
    }

    public bb3 uur() {
        return this.vz;
    }

    public float vai() {
        if (this.bcr <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.bcr = 100.0f;
        }
        return (this.bcr * 1000.0f) / 1000.0f;
    }

    public int vf() {
        return this.ti;
    }

    public String vg() {
        return this.oja;
    }

    public List<FilterWord> vom() {
        return this.tp;
    }

    public boolean vs() {
        return this.mw;
    }

    public boolean vvg() {
        return this.ova;
    }

    public int vw() {
        return this.tca;
    }

    public kgy vz() {
        return this.kt;
    }

    public boolean war() {
        lqi lqiVar = this.jpc;
        return lqiVar != null && lqiVar.kgy() > 0;
    }

    public String wh() {
        JSONObject jSONObjectWk;
        String strOptString = this.gjn;
        if (TextUtils.isEmpty(strOptString) && (jSONObjectWk = wk()) != null) {
            strOptString = jSONObjectWk.optString("req_id", "");
            ikw(strOptString);
        }
        return strOptString == null ? "" : strOptString;
    }

    public JSONObject wk() {
        if (this.any == null) {
            try {
                if (!TextUtils.isEmpty(this.qi)) {
                    this.any = PangleNetworkBridge.jsonObjectInit(this.qi);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5sBuoQMmGRf1Ogx8=", 2357);
                com.bytedance.sdk.component.utils.sx.rz("MaterialMeta", e.getMessage());
            }
        }
        return this.any;
    }

    public boolean wl() {
        return this.ol;
    }

    public String wn() {
        return this.pft;
    }

    public boolean wo() {
        return this.kwy;
    }

    public boolean wt() {
        fpp fppVar;
        AdSlot adSlot = this.wn;
        if (adSlot == null || (fppVar = this.fbw) == null) {
            return false;
        }
        return fppVar.kgy(!TextUtils.isEmpty(adSlot.getBidAdm()));
    }

    @Nullable
    public uq wuj() {
        uq uqVarTwf;
        ct ctVar = this.um;
        if (ctVar != null) {
            uqVarTwf = ctVar.ahm();
        } else {
            com.bytedance.sdk.openadsdk.core.twf.kgy kgyVar = this.yt;
            uqVarTwf = kgyVar != null ? kgyVar.twf() : null;
        }
        if (uqVarTwf != null) {
            uqVarTwf.kgy(this);
        }
        return uqVarTwf;
    }

    public boolean wy() {
        return this.rpo;
    }

    public String wzd() {
        return this.gc;
    }

    public boolean xh() {
        return this.hdr;
    }

    public String xhh() {
        return this.xrn;
    }

    @Nullable
    public ct xid() {
        return this.um;
    }

    public void xkh(int i) {
        if (i < 0 || i > 30) {
            i = 6;
        }
        this.noq = i;
    }

    public int xts() {
        return this.nmy;
    }

    public int xxq() {
        kus kusVar = this.yv;
        if (kusVar == null) {
            return 0;
        }
        return kusVar.kgy();
    }

    public int xz() {
        return this.fpz;
    }

    public int ydm() {
        int i = this.vs;
        return i >= 0 ? i : com.bytedance.sdk.openadsdk.core.xh.uq().nu(String.valueOf(ws()));
    }

    @NonNull
    public List<ioy> ygf() {
        return this.ikw.ct();
    }

    public boolean yh() {
        bb3 bb3Var = this.wbb;
        return bb3Var == null || bb3Var.m != 1;
    }

    public int yjf() {
        int i;
        if (this.mv == 11 && (i = this.xlt) == 2) {
            return i;
        }
        int i2 = this.gg;
        if (i2 == 5 || i2 == 6) {
            return 1;
        }
        return this.xlt;
    }

    public bb3 ym() {
        return this.af;
    }

    public int yt() {
        return this.jvt;
    }

    public List<String> yu() {
        return this.dta;
    }

    public noq yv() {
        return this.yjf;
    }

    public String ywg() {
        return this.xts;
    }

    public String yx() {
        return this.ebs;
    }

    public uf zjw() {
        return this.ox;
    }

    public int znm() {
        return this.sm;
    }

    static {
        CharSequence[] charSequenceArr = {"is", ftg.vg()};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        sb.append((CharSequence) "_");
        sb.append(charSequenceArr[1]);
        ahm = sb.toString();
        CharSequence[] charSequenceArr2 = {"is", ftg.vg(), "sample"};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequenceArr2[0]);
        for (int i = 1; i < 3; i++) {
            sb2.append((CharSequence) "_");
            sb2.append(charSequenceArr2[i]);
        }
        rz = sb2.toString();
        CharSequence[] charSequenceArr3 = {ftg.vg(), C4664b4.f.e};
        StringBuilder sb3 = new StringBuilder();
        sb3.append(charSequenceArr3[0]);
        sb3.append((CharSequence) "_");
        sb3.append(charSequenceArr3[1]);
        uq = sb3.toString();
        nu = 330;
    }

    public ioy() {
        com.bytedance.sdk.openadsdk.core.model.kgy kgyVar = new com.bytedance.sdk.openadsdk.core.model.kgy();
        this.ikw = kgyVar;
        kgyVar.kgy(this);
    }

    public static void ahm(ioy ioyVar, JSONObject jSONObject) throws JSONException {
        noq noqVarYv = ioyVar.yv();
        if (noqVarYv != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("app_name", noqVarYv.ahm());
            jSONObject2.put("package_name", noqVarYv.rz());
            jSONObject2.put(DownloadModel.DOWNLOAD_URL, noqVarYv.kgy());
            jSONObject2.put("score", noqVarYv.uq());
            jSONObject2.put("comment_num", noqVarYv.ct());
            jSONObject2.put(CampaignEx.JSON_KEY_APP_SIZE, noqVarYv.noq());
            jSONObject2.put("app_category", noqVarYv.yo());
            jSONObject.put("app", jSONObject2);
        }
    }

    private com.bytedance.sdk.openadsdk.core.at.fi.kgy gx() {
        kgy kgyVarVz = vz();
        if (kgyVarVz == null) {
            return null;
        }
        return kgy.ahm(kgyVarVz, String.valueOf(ws()));
    }

    private String mca(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return com.bytedance.sdk.component.utils.dg.kgy(str);
            }
            return null;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOsjkBG9fcKpSdhTpxS5", 1619);
            com.bytedance.sdk.component.utils.sx.rz("MaterialMeta", "generate icon key error", th.getMessage());
            return null;
        }
    }

    private com.bytedance.sdk.openadsdk.core.at.fi.kgy xzg() {
        ikw ikwVarIb = ib();
        if (ikwVarIb == null) {
            return null;
        }
        return new com.bytedance.sdk.openadsdk.core.at.fi.kgy().kgy(ikwVarIb.kgy()).ahm(ikwVarIb.ahm()).rz(ikwVarIb.rz()).uq(ikwVarIb.uq()).ct(ws() + "_v3");
    }

    public boolean bmz() {
        JSONArray jSONArrayOptJSONArray;
        List<Integer> listKgy;
        if (vz() != null && (listKgy = vz().kgy()) != null && listKgy.contains(57)) {
            return true;
        }
        JSONObject jSONObjectOwk = owk();
        if (jSONObjectOwk != null && (jSONArrayOptJSONArray = jSONObjectOwk.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (jSONArrayOptJSONArray.optInt(i) == 57) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean cly() {
        if (uju() == 5) {
            return true;
        }
        return false;
    }

    public int dn() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.kgy kgyVarUq = uq();
        if (kgyVarUq != null && kgyVarUq.nu() != null) {
            return kgyVarUq.nu().gf();
        }
        if (jvt() != null) {
            strValueOf = jvt().getCodeId();
        } else {
            int iWs = ws();
            if (iWs != 0) {
                strValueOf = String.valueOf(iWs);
            } else {
                strValueOf = null;
            }
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.xh.uq().at(strValueOf);
        }
        return 30;
    }

    public String fi() {
        fpz fpzVarNu;
        com.bytedance.sdk.openadsdk.core.model.kgy kgyVarUq = uq();
        if (kgyVarUq == null || (fpzVarNu = kgyVarUq.nu()) == null) {
            return null;
        }
        return fpzVarNu.yo();
    }

    public boolean fij() {
        if (uju() != 3 && uju() != 4) {
            return false;
        }
        return true;
    }

    public boolean hdr() {
        if (uju() == 7) {
            return true;
        }
        return false;
    }

    public boolean ikw() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOwk = owk();
        if (jSONObjectOwk != null && (jSONArrayOptJSONArray = jSONObjectOwk.optJSONArray("tag_ids")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                if (jSONArrayOptJSONArray.optInt(i) == 174) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean kd() {
        vs vsVar;
        if (!ug() || gwg() || (vsVar = this.eia) == null || vsVar.kgy() != 1) {
            return false;
        }
        return true;
    }

    public boolean lqi() {
        if (!TextUtils.isEmpty(ay()) && !TextUtils.isEmpty(ioy())) {
            return true;
        }
        return false;
    }

    public void muf(String str) {
        if (TextUtils.isEmpty(str)) {
            this.yo = com.bytedance.sdk.openadsdk.fpz.kgy.rz.rz;
        } else {
            this.yo = str;
        }
    }

    public boolean mx() {
        if (!ug() && this.um == null) {
            return false;
        }
        return true;
    }

    public boolean ox() {
        if (ug() || yt() != 1) {
            return false;
        }
        return true;
    }

    public void rz(um umVar) {
        PAGBannerSize pAGBannerSizeOva = ova();
        if (pAGBannerSizeOva != null && pAGBannerSizeOva.getWidth() > 0 && pAGBannerSizeOva.getHeight() > 0) {
            kgy(umVar, gbb.ahm(com.bytedance.sdk.openadsdk.core.xh.kgy(), pAGBannerSizeOva.getWidth()), gbb.ahm(com.bytedance.sdk.openadsdk.core.xh.kgy(), pAGBannerSizeOva.getHeight()));
        }
        this.gbb.add(umVar);
    }

    public com.bytedance.sdk.component.adexpress.kgy.rz.uq sa() {
        kgy kgyVarVz = vz();
        if (kgyVarVz == null) {
            return null;
        }
        return kgy.kgy(kgyVarVz, String.valueOf(ws()));
    }

    @Nullable
    public String tml() {
        noq noqVarYv = yv();
        if (noqVarYv != null && !TextUtils.isEmpty(noqVarYv.kgy())) {
            return noqVarYv.kgy();
        }
        return null;
    }

    public boolean uxe() {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOwk = owk();
        if (jSONObjectOwk == null || (jSONArrayOptJSONArray = jSONObjectOwk.optJSONArray("tag_ids")) == null) {
            return false;
        }
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            if (jSONArrayOptJSONArray.optInt(i) == 186) {
                return true;
            }
        }
        return false;
    }

    public int vr() {
        String strValueOf;
        com.bytedance.sdk.openadsdk.core.model.kgy kgyVarUq = uq();
        if (kgyVarUq != null && kgyVarUq.nu() != null) {
            return kgyVarUq.nu().gf();
        }
        if (jvt() != null) {
            strValueOf = jvt().getCodeId();
        } else {
            int iWs = ws();
            if (iWs != 0) {
                strValueOf = String.valueOf(iWs);
            } else {
                strValueOf = null;
            }
        }
        if (strValueOf != null) {
            return com.bytedance.sdk.openadsdk.core.xh.uq().sx(strValueOf);
        }
        return 5;
    }

    public void vrj(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.ft.add(str);
        }
    }

    public boolean wbb() {
        if (qjb() == 100) {
            return true;
        }
        return false;
    }

    public boolean wd() {
        if (uju() == 1) {
            return true;
        }
        return false;
    }

    public int ws() {
        JSONObject jSONObjectWk = wk();
        if (jSONObjectWk == null) {
            return 0;
        }
        return jSONObjectWk.optInt("rit", 0);
    }

    public void xiy() {
        if (!TextUtils.isEmpty(ebs())) {
            vs("0");
        }
        Map<String, Object> mapNmy = nmy();
        if (mapNmy != null && mapNmy.containsKey("price")) {
            mapNmy.put("price", "0");
        }
    }

    public int xlt() {
        if (ug()) {
            return 5;
        }
        if (vai() == 100.0f && yjf() != 2) {
            return this.rlc;
        }
        return 0;
    }

    public int xrn() {
        if (bmz()) {
            return 5;
        }
        return 1;
    }

    public long yg() {
        Map<String, Object> mapNmy = nmy();
        if (mapNmy == null) {
            return 0L;
        }
        try {
            Object obj = mapNmy.get("media_share_price");
            if (obj == null) {
                return 0L;
            }
            return Long.parseLong(obj.toString());
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "XOs5uAa4YMazQtZPiSGyIVjr", 2829);
            return 0L;
        }
    }

    public double yk() {
        return gf(wk());
    }

    public boolean zfi() {
        if (uju() == 8) {
            return true;
        }
        return false;
    }

    public void ay(int i) {
        this.yu = i;
    }

    public void dg(int i) {
        this.fxy = i;
    }

    public void dpp(int i) {
        this.tpu = i;
    }

    public void fpp(int i) {
        this.ti = i;
    }

    public void fpz(int i) {
        this.be = i;
    }

    public void ft(int i) {
        this.al = i;
    }

    public void ftg(int i) {
        this.jvt = i;
    }

    public void gbb(int i) {
        this.gj = i;
    }

    public void gc(int i) {
        this.wd = i;
    }

    public void gm(int i) {
        this.fv = i;
    }

    public void ioy(int i) {
        this.xhh = i;
    }

    public void jc(int i) {
        this.sf = i;
    }

    public void jpc(int i) {
        this.pm = i;
    }

    public void ko(int i) {
        this.ftg = i;
    }

    public void kus(int i) {
        this.sm = i;
    }

    public void lb(int i) {
        this.iwd = i;
    }

    public void mw(int i) {
        this.qjb = i;
    }

    public void naw(int i) {
        this.wt = i;
    }

    public void ra(String str) {
        this.oja = str;
    }

    public void sm(int i) {
        this.aj = i;
    }

    public void tp(int i) {
        this.rtt = i;
    }

    public void uf(int i) {
        this.ac = i;
    }

    public void uh(int i) {
        this.kus = i;
    }

    public void um(int i) {
        this.aan = i;
    }

    public void vg(int i) {
        this.xxq = i;
    }

    public void vs(int i) {
        this.bgd = i;
    }

    public void wl(int i) {
        this.vom = i;
    }

    public void wy(int i) {
        this.wzd = i;
    }

    public void xh(int i) {
        this.xlt = i;
    }

    public void xts(int i) {
        this.vs = i;
    }

    public void yx(int i) {
        this.gm = i;
    }

    public void zjw(int i) {
        this.nz = i;
    }

    public void znm(int i) {
        this.fi = i;
    }

    public void ay(String str) {
        this.znm = str;
    }

    public void dg(String str) {
        this.ywg = str;
    }

    public void fpp(String str) {
        this.pft = str;
    }

    public void fpz(String str) {
        this.idg = str;
    }

    public void ft(String str) {
        this.qi = str;
    }

    public void gm(String str) {
        this.naw = str;
    }

    public void ioy(String str) {
        this.xkh = str;
    }

    public void jpc(String str) {
        this.fpp = str;
    }

    public void kus(String str) {
        this.rdw = str;
    }

    public void mw(String str) {
        this.uf = str;
    }

    public void ra(boolean z) {
        this.zfi = z;
    }

    public void uf(String str) {
        this.eq = str;
    }

    public void um(String str) {
        this.xts = str;
    }

    public void vg(String str) {
        this.uh = str;
    }

    public void vs(String str) {
        this.uny = str;
    }

    public void wy(String str) {
        this.ecz = str;
    }

    public void xh(String str) {
        this.vf = str;
    }

    public void dg(boolean z) {
        this.kgy = z;
    }

    public void fpp(boolean z) {
        this.lqi = z;
    }

    public void kus(boolean z) {
        this.at = z;
    }

    public void nu(boolean z) {
        this.yk = z;
    }

    public void ra(int i) {
        this.kd = i;
    }

    public void um(boolean z) {
        this.ct = z;
    }

    public void vs(boolean z) {
        this.uju = z;
    }

    public void xh(boolean z) {
        this.ova = z;
    }

    public void nu(String str) {
        this.prk = str;
    }

    public String nu() {
        return this.uxe;
    }

    public int xkh() {
        return this.cc;
    }

    public void xrn(int i) {
        this.yx = i;
    }

    public long gf() {
        return this.dg;
    }

    public void pft(int i) {
        this.vai = i;
    }

    public void gf(String str) {
        this.pt = str;
    }

    public void qdr(int i) {
        this.kp = i;
    }

    public void vrj(int i) {
        this.oyj = i;
    }

    public void gf(boolean z) {
        this.fij = z;
    }

    public boolean vrj() {
        return this.qbt;
    }

    public void gf(int i) {
        this.tml = i;
    }

    public void muf(int i) {
        this.tca = i;
    }

    public String muf() {
        return this.jq;
    }

    private static long fi(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optLong("uid", 0L);
        }
        return 0L;
    }

    public void fi(String str) {
        this.ife = str;
    }

    public void uq(int i) {
        this.sx = i;
    }

    public void fi(int i) {
        this.ezq = i;
    }

    public void sx(int i) {
        this.mv = i;
    }

    public com.bytedance.sdk.openadsdk.core.model.kgy uq() {
        return this.ikw;
    }

    public static int uq(String str) {
        return kgy(rz(str));
    }

    public void fi(boolean z) {
        this.ol = z;
    }

    public void gg(int i) {
        this.fe = Math.max(0, i);
    }

    public void sx(String str) {
        this.xrn = str;
    }

    public void lqi(int i) {
        this.rlc = i;
    }

    public boolean sx() {
        return this.mh;
    }

    public void uq(boolean z) {
        this.mh = z;
    }

    public void lqi(String str) {
        this.gc = str;
    }

    public void uq(JSONObject jSONObject) {
        this.em = jSONObject;
    }

    public void uq(long j) {
        this.twf = j;
    }

    public void yjf(int i) {
        this.fpz = i;
    }

    public void dta(int i) {
        this.wy = i;
    }

    public boolean oyj() {
        return this.aan == 1;
    }

    public void ikw(int i) {
        this.jc = i;
    }

    public void ikw(String str) {
        this.gjn = str;
    }

    public void uxe(int i) {
        this.eb = i;
    }

    public void uxe(String str) {
        this.kw = str;
    }

    public com.bytedance.sdk.openadsdk.core.at.fi.kgy mca() {
        return this.uur;
    }

    public void cc(int i) {
        this.ib = i;
    }

    public void mca(int i) {
        this.paj = i;
    }

    public void pxt(int i) {
        this.hbl = i;
    }

    public int yo() {
        return this.wl;
    }

    public void yo(int i) {
        this.ra = i;
    }

    public void yo(String str) {
        this.pq = str;
    }

    public void rz(int i) {
        this.vg = i;
    }

    public void yo(boolean z) {
        this.rpo = z;
    }

    public static boolean rz(ioy ioyVar) {
        return (ioyVar == null || ioyVar.jw() == null || ioyVar.jw().l != 7 || uf.ahm(ioyVar)) ? false : true;
    }

    public void yo(JSONObject jSONObject) {
        this.epw.kgy(jSONObject);
    }

    public void yo(long j) {
        this.ioy = j;
    }

    public static JSONObject rz(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return PangleNetworkBridge.jsonObjectInit(str);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "WPwolBe5TN+UWNZ0ghevAmjBA7oBtmzElA==", 430);
            com.bytedance.sdk.component.utils.sx.rz("MaterialMeta", e.getMessage());
            return null;
        }
    }

    public static boolean ct(ioy ioyVar) {
        if (ioyVar == null) {
            return false;
        }
        int iRdw = ioyVar.rdw();
        return ioyVar.ug() || iRdw == 5 || iRdw == 15 || iRdw == 50;
    }

    public void rz(boolean z) {
        this.hdr = z;
    }

    public int rz() {
        return this.mca;
    }

    public void bmz(int i) {
        this.gwg = i;
    }

    public void ct(String str) {
        this.uxe = str;
    }

    public void rz(long j) {
        this.dr = j;
    }

    public String bmz(String str) {
        JSONObject jSONObjectWk = wk();
        return jSONObjectWk != null ? jSONObjectWk.optString("rit", str) : str;
    }

    public void ct(int i) {
        this.vrj = i;
    }

    public void rz(JSONObject jSONObject) {
        this.ce = jSONObject;
    }

    public void ct(boolean z) {
        this.ax = z;
    }

    public void rz(bb3 bb3Var) {
        this.af = bb3Var;
    }

    public String ct() {
        int iEzq = ezq();
        if (iEzq == 1) {
            return "banner_ad";
        }
        if (iEzq == 3) {
            return "open_ad";
        }
        if (iEzq == 5) {
            return "embeded_ad";
        }
        if (iEzq == 7) {
            return "rewarded_video";
        }
        if (iEzq != 8) {
            return "unknown";
        }
        return "fullscreen_interstitial_ad";
    }

    public void ct(long j) {
        this.gf = j;
    }

    public void ahm(int i) {
        this.wl = i;
    }

    public static boolean ahm(ioy ioyVar) {
        return (kgy(ioyVar) || rz(ioyVar)) ? false : true;
    }

    public static double ahm(String str) {
        return gf(rz(str));
    }

    public void ahm(boolean z) {
        this.mw = z;
    }

    public void ahm(long j) {
        this.ws = j;
    }

    public void ahm(com.bytedance.sdk.openadsdk.core.at.fi.kgy kgyVar) {
        this.uur = kgyVar;
        com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy(kgyVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public String at() {
        return this.muf;
    }

    public void at(int i) {
        this.cc = i;
    }

    public void ahm(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.nmy = 2;
        } else {
            this.nmy = (int) d;
        }
    }

    public void at(boolean z) {
        this.sa = z;
    }

    public void ahm(JSONObject jSONObject) {
        this.yh = jSONObject;
    }

    public void ahm(um umVar) {
        this.dpp = umVar;
    }

    public void ahm(bb3 bb3Var) {
        this.vz = bb3Var;
    }

    public int ahm() {
        yo yoVarDpp = dpp();
        if (yoVarDpp != null) {
            return yoVarDpp.kgy();
        }
        return -1;
    }

    public boolean noq() {
        jpc jpcVar;
        int iNaw = naw();
        if (lb() && uf.rz(this) && iNaw != 43 && iNaw != 44) {
            return false;
        }
        if (!lb() && oyj(iNaw) && (jpcVar = this.op) != null && jpcVar.kgy() == 1) {
            return false;
        }
        boolean z = (iNaw == 5 || iNaw == 6 || iNaw == 12) ? false : true;
        if (ug() || yjf() == 2 || !z || !com.bytedance.sdk.openadsdk.core.at.noq.kgy.noq.kgy(ftg.rz(this.ug))) {
            return yjf() == 2 && z;
        }
        return true;
    }

    public void noq(String str) {
        this.muf = str;
    }

    public void noq(int i) {
        this.cly = i;
    }

    public void noq(boolean z) {
        this.owk = z;
    }

    public void noq(JSONObject jSONObject) {
        this.ca = jSONObject;
    }

    public void noq(long j) {
        this.ay = j;
    }

    public void twf(int i) {
        this.gg = i;
    }

    public void twf(String str) {
        this.ebs = str;
    }

    public int twf() {
        return this.vrj;
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.model.kgy kgyVar) {
        if (kgyVar != null) {
            this.ikw = kgyVar;
        }
    }

    public void kgy(int i) {
        this.mca = i;
    }

    public void kgy(long j) {
        this.dg = j;
    }

    public static boolean kgy(ioy ioyVar, boolean z, boolean z2, boolean z3, boolean z4) {
        if (kgy(ioyVar) || z4 || ioyVar == null || ioyVar.jw() == null || TextUtils.isEmpty(ioyVar.jw().h)) {
            return false;
        }
        if (rz(ioyVar)) {
            return z3;
        }
        return (ioyVar.jw() == null || ioyVar.jw().k != 1) ? z : z2;
    }

    public static boolean kgy(ioy ioyVar) {
        return (ioyVar == null || ioyVar.jw() == null || ioyVar.jw().l != 1) ? false : true;
    }

    public static long kgy(String str) {
        return fi(rz(str));
    }

    public static int kgy(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optInt("ut", 0);
        }
        return 0;
    }

    public void kgy(boolean z) {
        this.xh = z;
    }

    public void kgy(fi fiVar) {
        this.nge = fiVar;
    }

    public void kgy(gm gmVar) {
        this.ids = gmVar;
    }

    public void kgy(fpp fppVar) {
        this.fbw = fppVar;
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.at.fi.kgy kgyVar) {
        this.oz = kgyVar;
        com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy(kgyVar, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
    }

    public void kgy(yo yoVar) {
        this.wo = yoVar;
    }

    public void kgy(uf ufVar) {
        this.ox = ufVar;
    }

    public lqi kgy() {
        return this.jpc;
    }

    public void kgy(double d) {
        if (d != 2.0d && d != 1.0d) {
            this.pl = 1;
        } else {
            this.pl = (int) d;
        }
    }

    public void kgy(nu nuVar) {
        this.vw = nuVar;
    }

    public void kgy(AdSlot adSlot) {
        this.wn = adSlot;
    }

    public void kgy(kgy kgyVar) {
        this.kt = kgyVar;
        com.bytedance.sdk.component.adexpress.kgy.rz.uq uqVarSa = sa();
        if (uqVarSa != null && !mh()) {
            com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.kgy(uqVarSa);
        }
        if (kgyVar == null || TextUtils.isEmpty(kgyVar.twf())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy(gx(), "ad");
    }

    public void kgy(ikw ikwVar) {
        this.ym = ikwVar;
        if (ikwVar == null || TextUtils.isEmpty(ikwVar.rz())) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.at.kgy.ahm.kgy().kgy(xzg(), "adv3");
    }

    public void kgy(bb3 bb3Var) {
        this.wbb = bb3Var;
    }

    public void kgy(kus kusVar) {
        this.yv = kusVar;
    }

    public void kgy(um umVar) {
        kgy(umVar, nu);
        String strMca = mca(umVar.kgy());
        if (!TextUtils.isEmpty(strMca)) {
            umVar.ahm(strMca);
        }
        this.pxt = umVar;
    }

    private void kgy(um umVar, int i) {
        if (umVar != null) {
            try {
                if (TextUtils.isEmpty(umVar.kgy())) {
                    return;
                }
                if (umVar.ahm() == 0 && umVar.rz() == 0) {
                    umVar.kgy(i);
                    umVar.ahm(i);
                    return;
                }
                if (umVar.ahm() == 0) {
                    if (umVar.rz() > i) {
                        umVar.ahm(i);
                        umVar.kgy(i);
                        return;
                    } else {
                        umVar.kgy(umVar.rz());
                        return;
                    }
                }
                if (umVar.rz() == 0) {
                    if (umVar.ahm() > i) {
                        umVar.ahm(i);
                        umVar.kgy(i);
                        return;
                    } else {
                        umVar.ahm(umVar.ahm());
                        return;
                    }
                }
                if (umVar.ahm() > umVar.rz()) {
                    if (umVar.ahm() > i) {
                        umVar.ahm((int) (i / (umVar.ahm() / umVar.rz())));
                        umVar.kgy(i);
                        return;
                    }
                    return;
                }
                if (umVar.rz() > i) {
                    umVar.kgy((int) (i * (umVar.ahm() / umVar.rz())));
                    umVar.ahm(i);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "WOYsmwS5QMSPRORUlhQ=", 1668);
            }
        }
    }

    private void kgy(um umVar, int i, int i2) {
        try {
            if (umVar.rz() >= i2) {
                umVar.kgy((int) ((umVar.ahm() / umVar.rz()) * i2));
                umVar.ahm(i2);
            } else if (umVar.ahm() >= i) {
                umVar.kgy((int) ((i / i2) * umVar.rz()));
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4yKRBrA=", "du85kBG1aMutT8Nc", "WOYsmwS5QMqBTdJuhQul", 1685);
        }
    }

    public void kgy(noq noqVar) {
        this.yjf = noqVar;
    }

    public void kgy(twf twfVar) {
        this.ko = twfVar;
    }

    public void kgy(FilterWord filterWord) {
        this.tp.add(filterWord);
    }

    public void kgy(Map<String, Object> map) {
        this.jw = map;
    }

    public void kgy(float f) {
        this.bcr = f;
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.twf.kgy kgyVar) {
        this.yt = kgyVar;
    }

    public void kgy(xh xhVar) {
        this.tv = xhVar;
    }

    public void kgy(vs vsVar) {
        this.eia = vsVar;
    }

    public void kgy(wy wyVar) {
        this.doi = wyVar;
    }

    public void kgy(PAGBannerSize pAGBannerSize) {
        this.na = pAGBannerSize;
    }

    public void kgy(jpc jpcVar) {
        this.op = jpcVar;
    }

    public void kgy(com.bytedance.sdk.openadsdk.fpz.kgy.ahm ahmVar) {
        this.vvg = ahmVar;
    }

    public void kgy(vg vgVar) {
        this.sdl = vgVar;
    }

    public void kgy(ct ctVar) {
        this.um = ctVar;
    }

    public void kgy(lqi lqiVar) {
        this.jpc = lqiVar;
    }

    public void kgy(HashMap<String, String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        this.bmz = map;
    }

    public static void kgy(ioy ioyVar, JSONObject jSONObject) throws JSONException {
        List<um> listBe = ioyVar.be();
        if (listBe != null) {
            JSONArray jSONArray = new JSONArray();
            for (um umVar : listBe) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", umVar.kgy());
                jSONObject2.put("height", umVar.rz());
                jSONObject2.put("width", umVar.ahm());
                jSONObject2.put("image_preview", umVar.noq());
                jSONObject2.put("image_key", umVar.yo());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("image", jSONArray);
        }
    }
}
