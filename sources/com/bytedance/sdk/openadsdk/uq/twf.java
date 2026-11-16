package com.bytedance.sdk.openadsdk.uq;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.model.ioy;
import com.bytedance.sdk.openadsdk.core.model.uf;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.t;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class twf {
    private static final int[] rz = {10, 30, 50, 75, 100};
    AtomicBoolean ahm;
    private boolean at;
    private long ay;
    private long bmz;
    private volatile long cc;
    private long ct;
    private com.bytedance.sdk.openadsdk.core.widget.kgy.noq dg;
    private final AtomicBoolean dpp;
    private final AtomicInteger dta;
    private final AtomicBoolean fi;
    private gf fpp;
    private final ioy fpz;
    private long ft;
    private boolean ftg;
    private volatile long gbb;
    private final AtomicBoolean gf;
    private int gg;
    private int gm;
    private boolean ikw;
    private long ioy;
    private volatile int jc;
    private String jpc;
    public com.bytedance.sdk.openadsdk.core.widget.kgy.noq.kgy kgy;
    private String kus;
    private final AtomicBoolean lb;
    private int lqi;
    private com.bytedance.sdk.openadsdk.uq.uq.ct mca;
    private final int[] muf;
    private boolean mw;
    private boolean naw;
    private int noq;
    private int nu;
    private String pft;
    private volatile long pxt;
    private final AtomicBoolean qdr;
    private final AtomicBoolean ra;
    private volatile long sm;
    private boolean sx;
    private final AtomicInteger tp;
    private String twf;
    private long uf;
    private volatile boolean uh;
    private com.bytedance.sdk.openadsdk.ay.fi um;
    private int uq;
    private final boolean uxe;
    private long vg;
    private WeakReference<WebView> vrj;
    private final Context vs;
    private at wl;
    private long wy;
    private boolean xh;
    private final AtomicBoolean xkh;
    private long xrn;
    private final AtomicBoolean xts;
    private final AtomicBoolean yo;
    private String zjw;
    private volatile boolean znm;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private final int[] kgy;

        @JavascriptInterface
        public void readPercent(String str) {
            int iIntValue;
            try {
                iIntValue = Float.valueOf(str).intValue();
                if (iIntValue > 100) {
                    iIntValue = 100;
                } else if (iIntValue < 0) {
                    iIntValue = 0;
                }
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkAkjHI4EGrm/Gg08=", "SesskTO5e8SFRMM=", 774);
            }
            int[] iArr = this.kgy;
            if (iArr == null || iArr.length <= 0) {
                return;
            }
            iArr[0] = iIntValue;
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }

        public kgy(int[] iArr) {
            this.kgy = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject gf(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                jSONObject.put("is_reused", this.naw ? 1 : 0);
            }
            if (this.gm == 1) {
                jSONObject.put("is_pre_render", 1);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "WfskmQeMaMCqWdhTqBC0KQ==", 1234);
            return null;
        }
    }

    private int nu() {
        WeakReference<WebView> weakReference = this.vrj;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
                return (webBackForwardListCopyBackForwardList == null || webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) ? 0 : 1;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "Uv0LnBGvffeBTdI=", 925);
            }
        }
        return 0;
    }

    private boolean ra() {
        ioy ioyVar;
        return this.ftg && (ioyVar = this.fpz) != null && ioyVar.vrj();
    }

    public void fi() {
        if (("landingpage".equals(this.jpc) || "landingpage_endcard".equals(this.jpc) || "landingpage_split_screen".equals(this.jpc) || "landingpage_direct".equals(this.jpc) || "aggregate_page".equals(this.jpc) || "landingpage_split_ceiling".equals(this.jpc)) && this.noq == 2) {
            if (this.wy > 0 || !rz()) {
                long jCurrentTimeMillis = System.currentTimeMillis() - Math.max(this.ft, this.wy);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.noq);
                    jSONObject.put("max_scroll_percent", this.muf[0]);
                    jSONObject.put("jump_times", this.dta.getAndSet(0));
                    jSONObject.put("click_times", this.tp.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAegQys", 618);
                }
                this.ra.set(true);
                if (!yo("stay_page")) {
                    kgy("stay_page", jSONObject, Math.min(jCurrentTimeMillis, 600000L));
                }
                com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy("landingPause", this.fpz, this.zjw);
            }
        }
    }

    public void kgy(WebView webView, String str, boolean z) {
        if (this.uh) {
            return;
        }
        kgy(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar != null && z) {
            noqVar.kgy();
        }
        com.bytedance.sdk.openadsdk.uq.uq.ct ctVar = this.mca;
        if (ctVar != null) {
            ctVar.ct();
        }
        gf gfVar = this.fpp;
        if (gfVar != null && z) {
            gfVar.kgy(str);
        }
        if (webView != null && !this.ikw && this.mw) {
            this.ikw = true;
            com.bytedance.sdk.component.utils.kus.kgy(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.fi.compareAndSet(false, true)) {
            if (this.noq != 3) {
                this.noq = 2;
            }
            this.ft = System.currentTimeMillis();
            boolean z2 = this.noq == 2;
            int iNu = nu();
            if (!z2) {
                kgy(z, "2");
                if (ra()) {
                    rz.kgy(this.fpz, this.pft, SystemClock.elapsedRealtime() - this.sm, this.nu, this.twf, this.kus);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(t.d, this.nu);
                    jSONObject.put("error_msg", this.twf);
                    jSONObject.put("error_url", this.kus);
                    jSONObject.put("first_page", iNu);
                    int i = this.gg;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.fpz.wn());
                    jSONObject.put("preload_h5_type", this.fpz.ftg());
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAakAGaYMmJWd9YiA==", 534);
                }
                kgy("load_fail", jSONObject);
                if (this.at) {
                    jSONObject.remove("render_type");
                    jSONObject.remove("render_type_2");
                    kgy("load_fail_main", jSONObject);
                    return;
                }
                return;
            }
            long j = this.vg - this.uf;
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put(t.d, this.nu);
                jSONObject2.put("error_msg", this.twf);
                jSONObject2.put("error_url", this.kus);
                int i2 = this.gg;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.put("first_page", iNu);
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.fpz.wn());
                jSONObject2.put("preload_h5_type", this.fpz.ftg());
            } catch (Exception e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAakAGaYMmJWd9YiA==", 494);
            }
            kgy(z, "0");
            long jMin = Math.min(j, 600000L);
            if (ra()) {
                this.pxt = SystemClock.elapsedRealtime();
                noq();
                rz.kgy(this.fpz, this.pft, this.pxt - this.sm);
            } else {
                if (!yo("load_finish") && !this.xkh.get()) {
                    kgy("load_finish", jSONObject2, jMin);
                }
                ahm(str, "load_finish", jMin);
            }
            at atVar = this.wl;
            if (atVar != null) {
                atVar.kgy(iNu);
            }
        }
    }

    public void rz(String str) {
        if (!this.mw || this.fpz == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.gg;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.fpz.wn();
            }
            jSONObject.put("url", str);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "SesekA24RciBTuRJjQO0", 1009);
        }
        kgy("load_start", jSONObject);
    }

    public void uq(boolean z) {
        WeakReference<WebView> weakReference = this.vrj;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAJkBCoe8iZ", 665);
                com.bytedance.sdk.component.utils.sx.kgy("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.fi.compareAndSet(false, true)) {
            kgy(z, "1");
            if (this.mw) {
                rz.kgy(this.fpz, this.jpc, System.currentTimeMillis() - this.bmz, this.gg, nu());
            }
        } else if (this.noq == 2 && !this.ra.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.noq);
                jSONObject.put("max_scroll_percent", this.muf[0]);
                jSONObject.put("jump_times", this.dta.getAndSet(0));
                jSONObject.put("click_times", this.tp.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException e2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAJkBCoe8iZ", 684);
            }
            if (!yo("stay_page")) {
                kgy("stay_page", jSONObject, 0L);
            }
        }
        if ("landingpage".equals(this.jpc) || "landingpage_endcard".equals(this.jpc) || "landingpage_split_screen".equals(this.jpc) || "landingpage_direct".equals(this.jpc) || "aggregate_page".equals(this.jpc) || "landingpage_split_ceiling".equals(this.jpc)) {
            com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy("landingFinish", this.fpz, this.zjw);
        }
    }

    public void yo() {
        if (this.bmz == 0) {
            this.bmz = System.currentTimeMillis();
        }
        this.ft = System.currentTimeMillis();
        if ("landingpage".equals(this.jpc) || "landingpage_endcard".equals(this.jpc) || "landingpage_split_screen".equals(this.jpc) || "landingpage_direct".equals(this.jpc) || "aggregate_page".equals(this.jpc)) {
            if (this.qdr.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy("landingStart", this.fpz, this.zjw);
            } else {
                com.bytedance.sdk.openadsdk.noq.ahm.kgy().kgy("landingContinue", this.fpz, this.zjw);
            }
        }
        if ("landingpage".equals(this.jpc) || "landingpage_endcard".equals(this.jpc) || "landingpage_split_screen".equals(this.jpc) || "landingpage_direct".equals(this.jpc) || "aggregate_page".equals(this.jpc) || "landingpage_split_ceiling".equals(this.jpc)) {
            kgy(true, SystemClock.elapsedRealtime());
        }
    }

    public twf(ioy ioyVar, WebView webView, boolean z) {
        this.uq = 0;
        this.ct = -1L;
        this.noq = 1;
        this.yo = new AtomicBoolean(false);
        this.fi = new AtomicBoolean(false);
        this.gf = new AtomicBoolean(false);
        this.ra = new AtomicBoolean(false);
        this.nu = -1;
        this.sx = false;
        this.gm = 0;
        this.ahm = new AtomicBoolean(false);
        this.jpc = "landingpage";
        this.ft = 0L;
        this.wy = 0L;
        this.uf = 0L;
        this.vg = 0L;
        this.bmz = 0L;
        this.ikw = false;
        this.uxe = false;
        int[] iArr = {0};
        this.muf = iArr;
        this.mw = false;
        this.ftg = false;
        this.gbb = 0L;
        this.dta = new AtomicInteger(0);
        this.tp = new AtomicInteger(0);
        this.lb = new AtomicBoolean(false);
        this.jc = 0;
        this.gg = -1;
        this.dpp = new AtomicBoolean(false);
        this.qdr = new AtomicBoolean(false);
        this.naw = false;
        this.znm = false;
        this.xkh = new AtomicBoolean(false);
        this.uh = false;
        this.xts = new AtomicBoolean(false);
        Context contextKgy = com.bytedance.sdk.openadsdk.core.xh.kgy();
        this.vs = contextKgy;
        this.fpz = ioyVar;
        if (webView != null) {
            this.sx = z;
            WeakReference<WebView> weakReference = new WeakReference<>(webView);
            this.vrj = weakReference;
            WebView webView2 = weakReference.get();
            if (webView2 == null) {
                return;
            }
            if (ioyVar != null && ioyVar.mv()) {
                com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = new com.bytedance.sdk.openadsdk.core.widget.kgy.noq(webView2, ioyVar, contextKgy, this.sx);
                this.dg = noqVar;
                this.kgy = noqVar.rz();
            }
            if (ioyVar != null && ioyVar.fv() && com.bytedance.sdk.openadsdk.core.settings.nu.ahm().ioy()) {
                this.fpp = new gf(ioyVar, webView, this.sx);
            }
            if (webView instanceof com.bytedance.sdk.component.ra.noq) {
                this.xrn = ((com.bytedance.sdk.component.ra.noq) webView2).ahm;
            } else {
                this.xrn = System.currentTimeMillis();
            }
            try {
                PangleNetworkBridge.webviewAddJavascriptInterface(webView2, new kgy(iArr), "JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "B+cjnBfi", Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
                com.bytedance.sdk.component.utils.sx.kgy("LandingPageLog", "addJavascriptInterface exception", e);
            }
            if (ioyVar != null && ioyVar.wk() != null) {
                this.ct = ioyVar.wk().optLong("page_id", -1L);
            }
            this.zjw = String.valueOf(SystemClock.elapsedRealtime());
        }
    }

    private void ahm(String str, String str2, long j) {
        if (!ra() && this.gf.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int iIndexOf = str.indexOf(38, 200);
                    int i = 300;
                    if (iIndexOf == -1 || iIndexOf > 300) {
                        iIndexOf = str.indexOf(63);
                    }
                    if (iIndexOf != -1 && iIndexOf <= 300) {
                        i = iIndexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "SOsjkS+zaMOwWNhanhSzO33nI5wQtA==", 376);
            }
            kgy("load_finish_progress", jSONObject, j);
        }
    }

    public void ct() {
        if (ra()) {
            this.cc = SystemClock.elapsedRealtime();
            noq();
        }
    }

    public void noq() {
        if (ra() && this.cc > 0 && this.pxt > 0 && !this.dpp.getAndSet(true)) {
            rz.ahm(this.pxt - this.cc, this.fpz, this.pft, (String) null);
        }
    }

    public void ct(boolean z) {
        this.naw = z;
    }

    public void ct(String str) {
        fi(str);
    }

    private String noq(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void noq(boolean z) {
        this.uh = z;
    }

    public void gf() {
        if (this.xts.getAndSet(true)) {
            return;
        }
        kgy("web_prerender_page_show", new JSONObject());
    }

    public void rz(boolean z) {
        this.ftg = z;
    }

    public boolean rz() {
        return this.ftg;
    }

    public twf ahm(boolean z) {
        this.mw = z;
        return this;
    }

    public void ahm(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.pft = str;
    }

    public com.bytedance.sdk.openadsdk.uq.uq.ct ahm() {
        return this.mca;
    }

    public void ahm(WebView webView, String str, boolean z) {
        gf gfVar = this.fpp;
        if (gfVar == null || !z) {
            return;
        }
        gfVar.kgy(webView, str);
    }

    public void ahm(int i) {
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar == null || !this.xh) {
            return;
        }
        noqVar.kgy(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject ahm(long j) {
        JSONObject jSONObject = new JSONObject();
        if (j > 0) {
            try {
                jSONObject.put("duration", j);
                return jSONObject;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "WfskmQeZcdOqWdhT", 1196);
            }
        }
        return jSONObject;
    }

    private boolean yo(String str) {
        if (this.znm) {
            return "load_finish".equals(str) || "stay_page".equals(str);
        }
        return false;
    }

    public void yo(boolean z) {
        this.znm = z;
    }

    private void fi(String str) {
        if (this.mw && this.fpz != null && this.xkh.compareAndSet(false, true)) {
            final JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(t.d, this.nu);
                jSONObject.put("error_msg", this.twf);
                jSONObject.put("error_url", this.kus);
                int i = this.gg;
                if (i >= 0) {
                    jSONObject.put("preload_status", i);
                }
                jSONObject.put("first_page", nu());
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                if (TextUtils.isEmpty(str)) {
                    str = this.fpz.wn();
                }
                jSONObject.put("url", str);
                jSONObject.put("preload_h5_type", this.fpz.ftg());
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "SOsjkTOubPWFRNNYnj2vKV/IJJsKr2Hilk/ZSQ==", 1136);
            }
            com.bytedance.sdk.openadsdk.ay.fi fiVar = this.um;
            final int iMw = fiVar != null ? fiVar.mw() : -1;
            rz.kgy(System.currentTimeMillis(), this.fpz, this.jpc, "load_finish", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.twf.6
                @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                public JSONObject kgy() {
                    try {
                        JSONObject jSONObjectGf = twf.this.gf("load_finish");
                        jSONObjectGf.put("is_retransmit", 1);
                        return jSONObjectGf;
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkfg==", "XOs5pQK7Q9SPRPNcmBA=", 1158);
                        return null;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
                public JSONObject rz() {
                    return twf.this.kgy(jSONObject, "load_finish", iMw);
                }
            });
            this.fi.set(true);
        }
    }

    public void uq() {
        if (ra()) {
            this.sm = SystemClock.elapsedRealtime();
            rz.kgy(this.fpz, this.pft);
        }
    }

    public void uq(String str) {
        if (!this.mw || this.fpz == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = rz;
            if (i >= iArr.length) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.gg;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
                jSONObject.put("url", TextUtils.isEmpty(str) ? this.fpz.wn() : str);
                jSONObject.put("pct", iArr[i]);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "SesekA24WdWPTcVYnwKMJ1rqC5wNtXrP", IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES);
            }
            kgy("progress_load_finish", jSONObject);
            i++;
        }
    }

    public twf(ioy ioyVar, WebView webView) {
        this(ioyVar, webView, false);
    }

    public twf(ioy ioyVar, WebView webView, at atVar, int i) {
        this(ioyVar, webView);
        this.wl = atVar;
        this.gg = i;
    }

    public ioy kgy() {
        return this.fpz;
    }

    public void kgy(boolean z) {
        if (z) {
            this.gm = 1;
        }
    }

    public void kgy(at atVar) {
        this.wl = atVar;
    }

    public void kgy(long j) {
        this.wy = j;
    }

    public void kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar != null) {
            noqVar.kgy(str);
        }
        gf gfVar = this.fpp;
        if (gfVar != null) {
            gfVar.rz(str);
        }
        this.jpc = str;
    }

    public void kgy(int i) {
        this.gg = i;
    }

    public void kgy(com.bytedance.sdk.openadsdk.uq.uq.ct ctVar) {
        this.mca = ctVar;
    }

    public void kgy(com.bytedance.sdk.openadsdk.ay.fi fiVar) {
        this.um = fiVar;
    }

    public void kgy(WebView webView, int i) {
        if (webView == null || this.uh) {
            return;
        }
        if (this.gbb == 0) {
            this.gbb = SystemClock.elapsedRealtime();
        }
        if (this.uf == 0 && i > 0) {
            this.uf = System.currentTimeMillis();
        } else if (this.vg == 0 && i == 100) {
            this.vg = System.currentTimeMillis();
        }
        if (this.uq != rz.length && ("landingpage".equals(this.jpc) || "landingpage_endcard".equals(this.jpc) || "landingpage_split_screen".equals(this.jpc) || "landingpage_direct".equals(this.jpc) || "aggregate_page".equals(this.jpc))) {
            int i2 = this.uq;
            while (true) {
                int[] iArr = rz;
                if (i2 >= iArr.length || i < iArr[this.uq]) {
                    break;
                }
                int i3 = i2 + 1;
                this.uq = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.ct;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAakAGMe8iHWNJOnw==", 346);
                }
                kgy("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            kgy(false, SystemClock.elapsedRealtime());
            ahm(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.vg - this.uf, 600000L));
        }
    }

    public void kgy(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        if (this.uh) {
            return;
        }
        this.xh = z;
        this.lqi++;
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar != null && z) {
            noqVar.ahm(str);
            this.dg.ahm();
        }
        gf gfVar = this.fpp;
        if (gfVar != null && z) {
            gfVar.kgy(str, i);
        }
        WeakReference<WebView> weakReference = this.vrj;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList webBackForwardListCopyBackForwardList = webView2.copyBackForwardList();
                if (webBackForwardListCopyBackForwardList != null && webBackForwardListCopyBackForwardList.getCurrentIndex() > this.jc) {
                    this.dta.incrementAndGet();
                }
                this.jc = webBackForwardListCopyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAakAGPfcaSXtJZ", 408);
                com.bytedance.sdk.component.utils.sx.kgy("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.gbb == 0) {
            this.gbb = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.uq.uq.ct ctVar = this.mca;
        if (ctVar != null) {
            ctVar.uq();
        }
        if (ra() || !this.yo.compareAndSet(false, true)) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i2 = this.gg;
            if (i2 >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i2));
            }
        } catch (Exception e2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAakAGPfcaSXtJZ", 426);
        }
        kgy("load_start", jSONObject);
    }

    public void kgy(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.uq.uq.ct ctVar = this.mca;
        if (ctVar != null) {
            ctVar.kgy((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.noq != 2) {
            this.noq = 3;
        }
        this.nu = i;
        this.twf = str;
        this.kus = str2;
        this.at = z;
    }

    public void kgy(com.bytedance.sdk.component.ra.fi fiVar) {
        int iXts;
        Bitmap bitmapKgy;
        ioy ioyVar;
        if ((!"landingpage".equals(this.jpc) && !"landingpage_endcard".equals(this.jpc) && !"landingpage_split_screen".equals(this.jpc) && !"landingpage_direct".equals(this.jpc) && !"aggregate_page".equals(this.jpc)) || (iXts = com.bytedance.sdk.openadsdk.core.xh.uq().xts()) == 0 || new Random().nextInt(100) + 1 > iXts || fiVar == null || fiVar.getWebView() == null || fiVar.getVisibility() != 0 || (bitmapKgy = gbb.kgy(fiVar)) == null || (ioyVar = this.fpz) == null) {
            return;
        }
        gbb.kgy(ioyVar, this.jpc, "landing_page_blank", bitmapKgy, fiVar.getUrl(), this.ct);
    }

    private void kgy(String str, JSONObject jSONObject) {
        kgy(str, jSONObject, -1L);
    }

    private void kgy(final String str, final JSONObject jSONObject, final long j) {
        if (!this.mw || this.fpz == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.ay.fi fiVar = this.um;
        final int iMw = fiVar != null ? fiVar.mw() : -1;
        rz.kgy(System.currentTimeMillis(), this.fpz, this.jpc, str, new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.twf.1
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject ahm() {
                return twf.this.ahm(j);
            }

            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject kgy() {
                return twf.this.gf(str);
            }

            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject rz() {
                return twf.this.kgy(jSONObject, str, iMw);
            }
        });
    }

    public void kgy(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar != null && this.xh) {
            noqVar.kgy(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.gbb != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.tp.incrementAndGet();
                this.tp.get();
                if (this.lb.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.fpz.wn());
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "VOAZmha/YQ==", EventTypeExtended.EVENT_TYPE_EXTENDED_NURL_VALUE);
                }
                kgy("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.gbb, 0L));
            }
        }
    }

    public void kgy(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.kgy.noq noqVar = this.dg;
        if (noqVar != null && z) {
            noqVar.rz(str);
        }
        gf gfVar = this.fpp;
        if (gfVar == null || !z) {
            return;
        }
        gfVar.ahm(str);
    }

    private void kgy(boolean z, final String str) {
        if (z) {
            final int iNu = nu();
            rz.kgy(new com.bytedance.sdk.component.gf.ahm.rz("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.uq.twf.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.noq noqVarIkw = com.bytedance.sdk.openadsdk.core.xh.uq().ikw();
                        boolean zKgy = twf.this.kgy(noqVarIkw, str);
                        if (zKgy) {
                            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.noq.ahm)) {
                                if (!TextUtils.isEmpty(noqVarIkw.rz) && zKgy) {
                                    String str2 = noqVarIkw.rz;
                                    com.bytedance.sdk.component.fi.ahm.ahm ahmVarRz = com.bytedance.sdk.openadsdk.sx.ahm.ahm().rz().rz();
                                    ahmVarRz.rz(str2);
                                    HashMap map = new HashMap();
                                    map.put("content-type", "application/json; charset=utf-8");
                                    ahmVarRz.uq(map);
                                    ahmVarRz.kgy(9);
                                    ahmVarRz.ahm("sendPrefLog");
                                    ahmVarRz.ahm(new com.bytedance.sdk.component.fi.kgy.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.twf.2.1
                                        @Override // com.bytedance.sdk.component.fi.kgy.kgy
                                        public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, com.bytedance.sdk.component.fi.ahm ahmVar) {
                                            try {
                                                com.bytedance.sdk.openadsdk.core.settings.noq.ahm = ahmVar.uq();
                                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                                twf.this.kgy(iNu, str);
                                            } catch (Exception e) {
                                                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkeh+/", "VOAfkBCsZsmTTw==", 857);
                                                com.bytedance.sdk.component.utils.sx.kgy("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                            }
                                        }

                                        @Override // com.bytedance.sdk.component.fi.kgy.kgy
                                        public void kgy(com.bytedance.sdk.component.fi.ahm.rz rzVar, IOException iOException) {
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            twf.this.kgy(iNu, str);
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkeg==", "Sfsj", 867);
                        com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.noq.ahm)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.noq.ahm);
            jSONObject.putOpt("cid", kgy().wzd());
            jSONObject.putOpt(CreativeInfo.c, kgy().wzd());
            jSONObject.put("log_extra", kgy().bcr());
            ftg.kgy(sb, "\"/** adInfo **/\"", jSONObject.toString());
            ftg.kgy(sb, "\"/** first_page **/\"", String.valueOf(i));
            ftg.kgy(sb, "\"/** ix_to_externalurl **/\"", this.ct != -1 ? "1" : "0");
            ftg.kgy(sb, "\"/** preload_status **/\"", this.gg == 2 ? "2" : "0");
            ftg.kgy(sb, "\"/** scene_state **/\"", str);
            ftg.kgy(sb, "\"/** web_init_time **/\"", String.valueOf(this.xrn));
            ftg.kgy(sb, "\"/** channel_name **/\"", "\"" + kgy().gj() + "\"");
            ftg.kgy(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            ftg.kgy(sb, "\"/** web_url **/\"", "\"" + kgy().wn() + "\"");
            String string = sb.toString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            final String strNoq = noq(string);
            WeakReference<WebView> weakReference = this.vrj;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(strNoq) || webView == null) {
                return;
            }
            mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.twf.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.kus.kgy(webView, strNoq);
                }
            });
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "X+EBmgK4SsiNR9hTpgI=", EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_PAID_VALUE);
            com.bytedance.sdk.component.utils.sx.rz(th.getMessage(), new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean kgy(com.bytedance.sdk.openadsdk.core.settings.noq noqVar, String str) {
        str.getClass();
        switch (str) {
            case "0":
                return noqVar.uq;
            case "1":
                return noqVar.ct;
            case "2":
                return noqVar.noq;
            default:
                return false;
        }
    }

    public void kgy(boolean z, long j) {
        if (z) {
            this.ay = j;
        } else {
            this.ioy = j;
        }
        if (this.ay <= 0 || this.ioy <= 0 || !this.xh || !this.ahm.compareAndSet(false, true)) {
            return;
        }
        kgy(this.fpz, this.jpc, this.ioy - this.ay, this.gm, this.naw);
    }

    public static void kgy(final ioy ioyVar, final String str, final long j, final int i, final boolean z) {
        rz.kgy(System.currentTimeMillis(), ioyVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.twf.4
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject ahm() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkfA==", "XOs5sBuoQ9SPRA==", 964);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject kgy() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("meta_pre_render", ioyVar.wt() ? 1 : 0);
                    jSONObject.put("is_pre_render", i);
                    com.bytedance.sdk.openadsdk.core.model.fpp fppVarFt = ioyVar.ft();
                    if (fppVarFt == null) {
                        fppVarFt = new com.bytedance.sdk.openadsdk.core.model.fpp();
                    }
                    jSONObject.put("pre_render_status", fppVarFt.rz());
                    jSONObject.put("pre_render_use_gecko", fppVarFt.ahm());
                    jSONObject.put("pre_render_add_type", fppVarFt.kgy());
                    jSONObject.put("is_reused", z ? 1 : 0);
                    return jSONObject;
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkfA==", "XOs5pQK7Q9SPRPNcmBA=", 986);
                    return jSONObject;
                }
            }
        });
    }

    public void kgy(String str, long j) {
        if (!this.mw || this.fpz == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(t.d, this.nu);
            jSONObject.put("error_msg", this.twf);
            jSONObject.put("error_url", this.kus);
            int i = this.gg;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", nu());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.fpz.wn();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.fpz.ftg());
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "SesekA24RciBTvFUghizIA==", 1065);
        }
        kgy("load_finish", jSONObject, Math.min(j, 600000L));
    }

    public void kgy(final String str, final String str2, final long j) {
        if (!this.mw || this.fpz == null) {
            return;
        }
        rz.kgy(System.currentTimeMillis(), this.fpz, this.jpc, "lp_redirect_duration", new com.bytedance.sdk.openadsdk.dg.ahm.kgy() { // from class: com.bytedance.sdk.openadsdk.uq.twf.5
            @Override // com.bytedance.sdk.openadsdk.dg.ahm.kgy, com.bytedance.sdk.openadsdk.dg.ahm.ahm
            public JSONObject kgy() {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = "";
                    jSONObject.put("first_url", TextUtils.isEmpty(str) ? "" : str);
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = str2;
                    }
                    jSONObject.put("current_url", str3);
                    jSONObject.put("time_since_last_touch", j);
                    return jSONObject;
                } catch (Exception e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxbkfQ==", "XOs5pQK7Q9SPRPNcmBA=", 1096);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject kgy(JSONObject jSONObject, String str, int i) {
        if (jSONObject != null) {
            try {
                boolean zAhm = uf.ahm(this.fpz);
                jSONObject.put("is_playable", zAhm ? 1 : 0);
                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.kus.rz.kgy.kgy().kgy(this.fpz) ? 1 : 0);
                if (zAhm && ("load_finish".equals(str) || "load_fail".equals(str))) {
                    jSONObject.put("playable_has_show", i);
                }
                if ("stay_page".equals(str)) {
                    jSONObject.put("first_page", this.lqi > 1 ? 0 : 1);
                    return jSONObject;
                }
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE4kHpSZP", "d+8jkQqybveBTdJxgxY=", "WfskmQedbeKYXsVcqBC0KQ==", 1216);
            }
        }
        return jSONObject;
    }
}
