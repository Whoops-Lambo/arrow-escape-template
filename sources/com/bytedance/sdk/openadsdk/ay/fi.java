package com.bytedance.sdk.openadsdk.ay;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.C4664b4;
import com.ironsource.C4978se;
import com.ironsource.M9;
import com.safedk.android.analytics.brandsafety.creatives.g;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.h50;
import defpackage.jc1;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class fi {
    private boolean aan;
    private Map<String, String> ac;
    private String af;
    public final String ahm;
    private String al;
    private int any;
    private final Handler at;
    private String ax;
    private boolean ay;
    private volatile boolean bcr;
    private String be;
    private int bgd;
    private long bmz;
    private int cc;
    private boolean ce;
    public final String ct;
    private boolean dg;
    private int dpp;
    private String dr;
    private String dta;
    private rz ebs;
    private boolean ecz;
    private String em;
    private boolean eq;
    private final Handler fi;
    private Set<String> fpp;
    private String fpz;
    private long ft;
    private String ftg;
    private int fv;
    private JSONObject fxy;
    private String gbb;
    private int gc;
    private Runnable gf;
    private int gg;
    private int gj;
    private String gm;
    private float ib;
    private noq idg;
    private long ikw;
    private boolean ioy;
    private boolean iwd;
    private boolean jc;
    private long jpc;
    private String jvt;
    private int jw;
    public final String kgy;
    private Context ko;
    private int kt;
    private Runnable kus;
    private int lb;
    private boolean lqi;
    private long mca;
    private String mh;
    private long muf;
    private int mv;
    private long mw;
    private int naw;
    private final String noq;
    private Runnable nu;
    private JSONObject owk;

    @Nullable
    private WebView oyj;
    private boolean paj;
    private String pft;
    private int pm;
    private int pxt;
    private int qdr;
    private com.bytedance.sdk.openadsdk.ay.kgy qi;
    private String qjb;
    private Runnable ra;
    private volatile boolean rdw;
    private int rlc;
    private boolean rtt;
    public final String rz;
    private float sa;
    private int sm;
    private String sx;
    private boolean ti;
    private int tp;
    private Runnable twf;
    private long uf;
    private long uh;
    private boolean um;
    private String uny;
    public final String uq;
    private long uxe;
    private WeakReference<View> vf;
    private long vg;
    private ViewTreeObserver.OnGlobalLayoutListener vom;
    private long vrj;
    private ahm vs;
    private int vw;
    private String vz;
    private JSONObject wbb;
    private String wl;
    private int wn;
    private int wy;
    private String wzd;
    private boolean xh;
    private boolean xhh;
    private long xkh;
    private int xlt;
    private boolean xrn;
    private JSONObject xts;
    private float xxq;
    private kgy yjf;
    private final String yo;
    private boolean yu;
    private List<JSONObject> yv;
    private int ywg;
    private int yx;
    private int zjw;
    private int znm;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public void bmz() {
        this.rdw = false;
        this.fi.removeCallbacks(this.ra);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.uxe > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.uxe);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            rz("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Uf0BmgK4T86OQ8RV", 2163);
        }
    }

    public void fpz() {
        this.xrn = true;
    }

    public void lqi() {
        this.sm = 2;
    }

    public void muf() {
        this.bgd = 0;
        this.xlt = 0;
        this.xxq = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.jw = 0;
        this.kt = 0;
        this.ywg = 0;
        this.any = 0;
        this.mv = 0;
        this.fv = 0;
        this.vw = 0;
        this.pm = 0;
        this.rlc = 0;
        this.wn = 0;
    }

    private void ct(String str, JSONObject jSONObject) {
        try {
            int i = this.yx;
            if (i == 0) {
                if (this.yjf != kgy.LAND_PAGE && !at(this.af)) {
                    gbb();
                }
                jSONObject.put("playable_url", this.af);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", uq(this.wzd, this.uny));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", rz(this.em, this.al));
            }
            jSONObject.put("playable_render_type", this.yx);
            if (this.qi != null) {
                if (this.yx == 0 && (this.yjf != kgy.LAND_PAGE || at(this.af))) {
                    this.qi.kgy(jSONObject);
                } else if (this.yx != 0) {
                    this.qi.kgy(jSONObject);
                }
            }
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoQ/Szbvx4mhSuPA==", 2328);
        }
    }

    private void dta() {
        Runnable runnable;
        Runnable runnable2;
        this.vs.kgy(System.currentTimeMillis());
        Handler handler = this.at;
        if (handler != null) {
            int i = this.yx;
            if (i == 0 && (runnable2 = this.twf) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.kus) != null) {
                handler.post(runnable);
            }
            this.vs.kgy(500);
        }
    }

    private void gbb() {
        String str;
        if (this.wbb == null || (str = this.af) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.wbb.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.af).getHost();
        if (TextUtils.isEmpty(host)) {
            this.af = jc1.o(this.af, "/cid_", new StringBuilder(), strOptString);
        } else {
            this.af = this.af.replace(host, h50.i(host, "/cid_", strOptString));
        }
    }

    private void wl() {
        this.vs = new ahm(this, this.wy);
        this.gf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.5
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.ay) {
                    fi.this.ay = false;
                    fi.this.fi.removeCallbacks(fi.this.ra);
                    fi.this.kgy(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.ra = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.6
            @Override // java.lang.Runnable
            public void run() {
                if (fi.this.ay) {
                    fi.this.ay = false;
                    fi.this.bcr = false;
                    fi.this.fi.removeCallbacks(fi.this.gf);
                    fi.this.kgy(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.twf = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (fi.this.oyj != null) {
                    fi.this.oyj.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ay.fi.7.1
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (fi.this.vs != null) {
                                fi.this.vs.kgy(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (fi.this.at != null) {
                    fi.this.at.postDelayed(this, 500L);
                }
            }
        };
        this.kus = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                fi.this.kgy("playable_stuck_check_ping", new JSONObject());
                if (fi.this.at != null) {
                    fi.this.at.postDelayed(this, 500L);
                }
            }
        };
        this.nu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.9
            @Override // java.lang.Runnable
            public void run() {
                long j = fi.this.uh;
                fi fiVar = fi.this;
                if (j <= 0) {
                    fiVar.ahm(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                long j2 = fiVar.uh - fi.this.xkh;
                long j3 = fi.this.wy;
                fi fiVar2 = fi.this;
                if (j2 > j3) {
                    fiVar2.ahm(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                fiVar2.ikw();
                fi.this.xkh = 0L;
                fi.this.uh = 0L;
            }
        };
    }

    public void ahm(int i, String str) {
        this.sm = i;
        if (this.xts == null) {
            this.xts = new JSONObject();
        }
        try {
            this.xts.put("playable_stuck_type", i);
            this.xts.put("playable_stuck_reason", str);
            if (this.mw > 0) {
                this.xts.put("playable_stuck_duration", System.currentTimeMillis() - this.mw);
            } else {
                this.xts.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoWcaHT+RJmRKr", 2233);
        }
        rz("PL_sdk_page_stuck", this.xts);
        uxe();
        if (this.qi == null || i != 2) {
            return;
        }
        this.xts = new JSONObject();
    }

    public JSONObject at() {
        try {
            boolean zKgy = ct.kgy(this.ko, "android.permission.RECORD_AUDIO");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zKgy);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "XOs5pwa/ZtWEa8JZhR6QLUnjJIYQtWbJ", 936);
            yo.kgy("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void ay() {
        com.bytedance.sdk.openadsdk.ay.kgy kgyVar = this.qi;
        if (kgyVar != null) {
            kgyVar.rz();
        }
    }

    public String dg() {
        com.bytedance.sdk.openadsdk.ay.kgy kgyVar;
        if (TextUtils.isEmpty(this.gbb) && (kgyVar = this.qi) != null) {
            this.gbb = kgyVar.kgy().toString();
        }
        return this.gbb;
    }

    public void fi(String str) {
        this.gc = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.uxe = jCurrentTimeMillis;
            long j = this.ikw;
            jSONObject.put("playable_page_show_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoXNWMZthciCK0KUn6", 1948);
            yo.kgy("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        rz("PL_sdk_html_load_start", jSONObject);
        this.bcr = true;
        this.rdw = true;
        if (this.paj) {
            vg();
            this.bcr = false;
            this.rdw = false;
        }
        if (this.xh) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (ct.kgy(this.ko, ct.at)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (ct.ahm(this.ko, "android.permission.RECORD_AUDIO")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (ct.kgy(this.ko, ct.nu)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (ct.kgy(this.ko, ct.ra)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (ct.kgy(this.ko, ct.gf)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (ct.kgy(this.ko, ct.fi)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (ct.ahm(this.ko, "android.permission.CAMERA")) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (ct.kgy(this.ko, ct.yo)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (ct.kgy(this.ko)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                rz("PL_sdk_hardware_detect", jSONObject2);
                this.xh = false;
            } catch (Throwable th2) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoXNWMZthciCK0KUn6", 2033);
                yo.kgy("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public JSONObject fpp() {
        return this.wbb;
    }

    public void ft() {
        if (this.qi != null) {
            kgy kgyVar = kgy.LAND_PAGE;
        }
    }

    public int ftg() {
        return this.gj;
    }

    public void gf(String str) {
        WebView webView;
        boolean z = this.gc == -1;
        this.gc = 2;
        if (!z) {
            this.vz = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.muf = jCurrentTimeMillis;
                long j = this.uxe;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? jCurrentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", mw());
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoXNWMZthciDepJlL9JQ==", C4978se.d);
                yo.kgy("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            rz("PL_sdk_html_load_finish", jSONObject);
        }
        this.bcr = false;
        this.fi.removeCallbacks(this.gf);
        try {
            if (this.yx == 0) {
                if (this.dg && (webView = this.oyj) != null) {
                    this.dg = false;
                    webView.evaluateJavascript(mca(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ay.fi.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                ikw();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoXNWMZthciDepJlL9JQ==", 2091);
            yo.kgy("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.ay.kgy kgyVar = this.qi;
        if (kgyVar != null) {
            kgyVar.ahm();
        }
    }

    public void ikw() {
        if (this.ioy) {
            this.mw = System.currentTimeMillis();
            kgy kgyVar = this.yjf;
            kgy kgyVar2 = kgy.FEED_AWEME;
            boolean z = this.eq;
            if (kgyVar == kgyVar2) {
                if (z && this.gc == 3) {
                    ahm ahmVar = this.vs;
                    if (ahmVar != null && ahmVar.ahm()) {
                        dta();
                        return;
                    } else {
                        if (this.vs == null) {
                            this.vs = new ahm(this, this.wy);
                            dta();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (z && this.gc == 2) {
                ahm ahmVar2 = this.vs;
                if (ahmVar2 != null && ahmVar2.ahm()) {
                    dta();
                } else if (this.vs == null) {
                    this.vs = new ahm(this, this.wy);
                    dta();
                }
            }
        }
    }

    public void ioy() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.vrj > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.vrj);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.uxe > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.uxe;
                this.mca = jCurrentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", jCurrentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            rz("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "V+EskS69YMmzSdJTiQ==", 1623);
        }
    }

    public void jpc() {
        if (this.qi != null) {
            kgy kgyVar = kgy.LAND_PAGE;
        }
    }

    public void kgy(boolean z, String str, int i) {
        if (z) {
            this.gc = -1;
            this.vz = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", mw());
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "VOAakAGObMSFQ8FYiDm0PEvLP4cMrg==", 2781);
                yo.kgy("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            rz("PL_sdk_html_load_error", jSONObject);
            if (this.ay) {
                this.ay = false;
                this.bcr = false;
                this.rdw = false;
                this.fi.removeCallbacks(this.gf);
                this.fi.removeCallbacks(this.ra);
                kgy(1, "ContainerLoadFail");
            }
        }
    }

    public JSONObject kus() {
        boolean zKgy;
        boolean zKgy2;
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.ko;
            boolean z = true;
            if (i >= 33) {
                zKgy2 = ct.kgy(context, "android.permission.READ_MEDIA_IMAGES");
                zKgy = true;
            } else {
                boolean zKgy3 = ct.kgy(context, "android.permission.READ_EXTERNAL_STORAGE");
                zKgy = ct.kgy(this.ko, "android.permission.WRITE_EXTERNAL_STORAGE");
                zKgy2 = zKgy3;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", zKgy2);
            jSONObject.put("isHasWrite", zKgy);
            if (!zKgy2 || !zKgy) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "XOs5sBuobNWOS9tumB6yKVzr", 971);
            yo.kgy("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public String mca() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public int mw() {
        return (this.ikw == -1 || !this.eq) ? 1 : 2;
    }

    public void noq(JSONObject jSONObject) {
        ahm(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void nu(String str) {
        this.fi.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.3
            @Override // java.lang.Runnable
            public void run() {
                fi.twf(fi.this);
            }
        });
    }

    public JSONObject ra() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.yu);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "XOs5pQ+9cMaCRtJ+gBijI2j6LIEWrw==", EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_FINISHED_VALUE);
            yo.kgy("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void rz(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.jc && this.lb > 0) {
                this.jc = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.rtt ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.eq);
            jSONObject.put("playable_session_id", this.sx);
            int i = this.yx;
            if (i == 0) {
                if (this.yjf != kgy.LAND_PAGE && !at(this.af)) {
                    gbb();
                }
                jSONObject.put("playable_url", this.af);
            } else if (i == 3 || i == 4) {
                jSONObject.put("playable_url", uq(this.wzd, this.uny));
            } else if (i == 1 || i == 2) {
                jSONObject.put("playable_url", rz(this.em, this.al));
            }
            jSONObject.put("playable_full_url", this.ax);
            jSONObject.put("playable_replay_count", this.gg);
            jSONObject.put("playable_is_prerender", this.ti);
            jSONObject.put("playable_is_preload", this.jc);
            jSONObject.put("playable_render_type", this.yx);
            jSONObject.put("playable_scenes_type", this.yjf.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.em) ? "" : this.em);
            if (!TextUtils.isEmpty(this.al)) {
                str2 = this.al;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.wzd);
            jSONObject.put("playable_minigamelite_schema", this.uny);
            jSONObject.put("playable_is_debug", this.ce);
            jSONObject.put("playable_retry_count", this.cc);
            jSONObject.put("playable_enter_from", this.pxt);
            jSONObject.put("playable_sequence", this.dpp);
            jSONObject.put("playable_current_section", this.pft);
            jSONObject.put("is_playable_finish", this.xrn);
            jSONObject.put("playable_card_session", this.ftg);
            jSONObject.put("playable_video_session", this.wl);
            jSONObject.put("playable_network_type", dg());
            jSONObject.put("playable_lynx_version", this.fpz);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.gm);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_REFER, "playable");
            jSONObject2.put("value", this.wbb.opt("cid"));
            jSONObject2.put("log_extra", this.wbb.opt("log_extra"));
            int i2 = this.yx;
            if (i2 != -1 && i2 != -2) {
                if (this.qi != null) {
                    List<JSONObject> list = this.yv;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.yv.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.yx);
                                jSONObjectOptJSONObject.put("playable_url", this.af);
                            }
                            this.qi.kgy(jSONObjectOptJSONObject);
                        }
                        this.yv.clear();
                    }
                    if (this.yx == 0 && (this.yjf != kgy.LAND_PAGE || at(this.af))) {
                        this.qi.kgy(jSONObject);
                        return;
                    } else {
                        if (this.yx != 0) {
                            this.qi.kgy(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.yv == null) {
                this.yv = new ArrayList();
            }
            this.yv.add(jSONObject2);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoTNGFRMM=", 2441);
            yo.kgy("PlayablePlugin", "reportEvent error", th);
        }
    }

    public JSONObject sx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.xxq);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.jw);
            jSONObject2.put("height", this.kt);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.any);
            jSONObject3.put("y", this.ywg);
            jSONObject3.put("width", this.mv);
            jSONObject3.put("height", this.fv);
            jSONObject.put(C4664b4.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.pm);
            jSONObject4.put("y", this.vw);
            jSONObject4.put("width", this.rlc);
            jSONObject4.put("height", this.wn);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "XOs5owq5ftePWMM=", 1571);
            yo.kgy("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public JSONObject twf() {
        try {
            boolean zKgy = ct.kgy(this.ko, "android.permission.CAMERA");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", zKgy);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "XOs5tgKxbNWBetJPgRizO1LhIw==", 949);
            yo.kgy("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject um() {
        if (this.fxy.isNull("width")) {
            View view = this.vf.get();
            if (view == null) {
                return this.fxy;
            }
            ahm(view);
        }
        return this.fxy;
    }

    public fi uq(boolean z) {
        this.yu = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.yu);
            kgy("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5pQ+9cMaCRtJ+gBijIw==", 892);
            yo.kgy("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public void uxe() {
        try {
            ahm ahmVar = this.vs;
            if (ahmVar != null) {
                ahmVar.kgy();
            }
            Handler handler = this.at;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SPoihSCuaNSIad9Yjxo=", 2525);
            th.toString();
        }
    }

    public void vg() {
        int i;
        int i2 = this.yx;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.bcr) {
                this.fi.postDelayed(this.gf, this.jpc * 1000);
            }
            if ((this.rdw && at(this.af)) || (i = this.yx) == 1 || i == 2) {
                this.fi.postDelayed(this.ra, this.ft * 1000);
            }
        }
    }

    public void vrj() {
        if (this.ecz) {
            return;
        }
        this.ecz = true;
        this.vg = 0L;
        this.xh = true;
        muf();
        try {
            View view = this.vf.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.vom);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "WOIolBE=", 2637);
        }
        try {
            this.idg.ahm();
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "WOIolBE=", 2642);
        }
        try {
            ahm ahmVar = this.vs;
            if (ahmVar != null) {
                ahmVar.kgy();
                this.vs = null;
            }
            Handler handler = this.at;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th3) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th3, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "WOIolBE=", 2652);
            th3.toString();
        }
        try {
            if (!TextUtils.isEmpty(this.af)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.tp);
                jSONObject.put("playable_hit_times", this.lb);
                int i = this.tp;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.lb) / (((double) i) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                rz("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable th4) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th4, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "WOIolBE=", 2669);
        }
        try {
            if (!TextUtils.isEmpty(this.af)) {
                if (this.bmz != -1) {
                    this.uf += System.currentTimeMillis() - this.bmz;
                    this.bmz = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.uf);
                rz("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable th5) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th5, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "WOIolBE=", 2686);
        }
        this.bcr = false;
        this.rdw = false;
        this.fi.removeCallbacks(this.gf);
        this.fi.removeCallbacks(this.ra);
        this.fi.removeCallbacksAndMessages(null);
    }

    public JSONObject vs() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.yjf.ordinal());
            jSONObject.put("safe_area_top_height", this.ib);
            jSONObject.put("safe_area_bottom_height", this.sa);
            jSONObject.put("playable_enter_from", this.pxt);
            jSONObject.put("playable_retry_count", this.cc);
            jSONObject.put("playable_card_session", this.ftg);
            jSONObject.put("playable_video_session", this.wl);
            jSONObject.put("playable_network_type", dg());
            jSONObject.put("aweme_id", this.dta);
            return jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "S+IsjAK+ZcKpRNFS", 1027);
            yo.kgy("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void wy() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.vrj > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.vrj);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.uxe > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.uxe);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            rz("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Xec/hheae8aNT+RVgwY=", 1755);
        }
    }

    public com.bytedance.sdk.openadsdk.ay.kgy xh() {
        return this.qi;
    }

    public fi yo(String str) {
        int iIndexOf;
        String strDecode;
        this.ax = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (g.e.equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                ahm(0);
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            } else {
                String host = uri.getHost();
                if (C4664b4.i.K.equalsIgnoreCase(host) || (host != null && host.contains(C4664b4.i.K))) {
                    ahm(0);
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                } else if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.yx == -1) {
                        ahm(2);
                    } else {
                        ahm(1);
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5oBGw", 1320);
        }
        this.af = str;
        return this;
    }

    private fi(Context context, WebView webView, rz rzVar, com.bytedance.sdk.openadsdk.ay.kgy kgyVar, kgy kgyVar2) {
        this.noq = "playable_stuck_check_ping";
        this.yo = "playable_apply_media_permission_callback";
        this.fi = new Handler(Looper.getMainLooper());
        this.at = new Handler(Looper.getMainLooper());
        this.dg = true;
        this.xh = true;
        this.um = true;
        this.kgy = "PL_sdk_playable_global_viewable";
        this.ahm = "PL_sdk_page_screen_blank";
        this.rz = "PL_sdk_playable_destroy_analyze_summary";
        this.uq = "PL_sdk_playable_hardware_dialog_cancel";
        this.ct = "PL_sdk_playable_hardware_dialog_setting";
        this.fpp = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.sx = null;
        this.gm = "embeded_ad";
        this.ay = true;
        this.ioy = true;
        this.lqi = false;
        this.fpz = "";
        this.jpc = 10L;
        this.ft = 10L;
        this.wy = 700;
        this.uf = 0L;
        this.vg = 0L;
        this.bmz = -1L;
        this.ikw = -1L;
        this.uxe = -1L;
        this.muf = -1L;
        this.vrj = -1L;
        this.mw = -1L;
        this.mca = -1L;
        this.ftg = "";
        this.wl = "";
        this.gbb = "";
        this.dta = "";
        this.tp = 0;
        this.lb = 0;
        this.jc = false;
        this.gg = 0;
        this.sm = -1;
        this.cc = 0;
        this.pxt = 0;
        this.dpp = 0;
        this.pft = null;
        this.xrn = false;
        this.qdr = 0;
        this.zjw = 0;
        this.naw = 0;
        this.znm = 0;
        this.xkh = 0L;
        this.uh = 0L;
        this.yx = -2;
        this.gc = 0;
        this.bgd = 0;
        this.xlt = 0;
        this.fxy = new JSONObject();
        this.ac = new HashMap();
        this.wbb = new JSONObject();
        this.ax = "";
        this.ib = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.sa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.aan = false;
        this.ce = false;
        this.ecz = false;
        this.yv = new ArrayList();
        this.paj = true;
        this.bcr = true;
        this.rdw = true;
        this.vom = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.ay.fi.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) fi.this.vf.get();
                    if (view == null) {
                        return;
                    }
                    fi.this.ahm(view);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR/keQ==", "VOAKmQy+aMusS85SmQU=", 280);
                    yo.kgy("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.gj = -1;
        this.yx = 0;
        this.yjf = kgyVar2;
        this.oyj = webView;
        gf.kgy(webView);
        kgy(webView);
        kgy(context, rzVar, kgyVar);
    }

    public void uf() {
        ahm ahmVar;
        this.uh = System.currentTimeMillis();
        int i = this.yx;
        if ((i == 1 || i == 2) && (ahmVar = this.vs) != null) {
            ahmVar.kgy(System.currentTimeMillis());
        }
    }

    public Set<String> nu() {
        return this.idg.kgy();
    }

    public String noq() {
        return this.qjb;
    }

    public fi noq(String str) {
        this.gm = str;
        return this;
    }

    public void noq(boolean z) {
        this.rtt = z;
    }

    public void ra(String str) {
        this.fi.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.2
            @Override // java.lang.Runnable
            public void run() {
                fi.at(fi.this);
            }
        });
    }

    public String uq() {
        return this.dr;
    }

    public fi uq(String str) {
        this.qjb = str;
        return this;
    }

    public void uq(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.pft = jSONObject.optString("section");
        }
    }

    private boolean at(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public static /* synthetic */ int twf(fi fiVar) {
        int i = fiVar.lb;
        fiVar.lb = i + 1;
        return i;
    }

    private String uq(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.af = str3;
        return str3;
    }

    public static /* synthetic */ int at(fi fiVar) {
        int i = fiVar.tp;
        fiVar.tp = i + 1;
        return i;
    }

    public JSONObject uq(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (yo.kgy() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject jSONObjectKgy = this.idg.kgy(str, jSONObject);
        if (yo.kgy()) {
            System.currentTimeMillis();
            if (jSONObjectKgy != null) {
                jSONObjectKgy.toString();
            }
        }
        return jSONObjectKgy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ahm(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.bgd == view.getWidth() && this.xlt == view.getHeight()) {
                return;
            }
            this.bgd = view.getWidth();
            this.xlt = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.bgd);
            jSONObject.put("height", this.xlt);
            kgy("resize", jSONObject);
            this.fxy = jSONObject;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses+kBeKYMKXbtZJjTuzJ1XMNKMKuX4=", 596);
            yo.kgy("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    private void kgy(Context context, rz rzVar, com.bytedance.sdk.openadsdk.ay.kgy kgyVar) {
        this.sx = UUID.randomUUID().toString();
        this.ko = context;
        this.qi = kgyVar;
        this.ebs = rzVar;
        ra.kgy(kgyVar);
        this.idg = new noq(this);
        wl();
        if (this.oyj == null) {
            this.gj = 4;
            this.fi.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ay.fi.4
                @Override // java.lang.Runnable
                public void run() {
                    fi.this.kgy(5, "webview is null");
                }
            });
        }
    }

    public Map<String, String> ahm() {
        return this.ac;
    }

    public fi ahm(String str) {
        this.dr = str;
        return this;
    }

    public fi ahm(boolean z) {
        this.ti = z;
        return this;
    }

    public void kgy(View view) {
        if (view == null) {
            return;
        }
        try {
            this.vf = new WeakReference<>(view);
            ahm(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.vom);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5owq5fuGPWORenhSlJmjnN5A=", 576);
            yo.kgy("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    public fi ahm(long j) {
        if (j <= 0) {
            this.ft = 10L;
            return this;
        }
        this.ft = j;
        return this;
    }

    public void ahm(JSONObject jSONObject) {
        if (this.qi != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "S/wogwayffOPX9RVqQelJk8=", 1007);
            }
        }
    }

    public Context kgy() {
        return this.ko;
    }

    public void ahm(String str, String str2) {
        Bitmap bitmapKgy;
        if (TextUtils.isEmpty(str2) || (bitmapKgy = ct.kgy(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.ko.getContentResolver(), bitmapKgy, str, "");
    }

    public fi kgy(String str, String str2) {
        this.ac.put(str, str2);
        return this;
    }

    public fi kgy(String str) {
        this.jvt = str;
        return this;
    }

    public fi kgy(boolean z) {
        this.xhh = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.xhh);
            kgy("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5vBCRfNOF", 672);
            yo.kgy("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public fi ahm(int i) {
        this.yx = i;
        return this;
    }

    public void ahm(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ct(str, jSONObject);
    }

    public fi kgy(long j) {
        if (j <= 0) {
            this.jpc = 10L;
            return this;
        }
        this.jpc = j;
        return this;
    }

    public String ct() {
        return this.jvt;
    }

    public fi ct(String str) {
        this.be = str;
        return this;
    }

    public void kgy(int i) {
        this.gj = i;
    }

    public void ct(JSONObject jSONObject) {
        this.xts = jSONObject;
        this.dpp++;
        uxe();
        this.fi.removeCallbacks(this.nu);
        if (this.ioy) {
            this.mw = System.currentTimeMillis();
            this.xkh = System.currentTimeMillis();
            this.uh = 0L;
            int i = this.yx;
            if (i == 0) {
                WebView webView = this.oyj;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.ay.fi.10
                        @Override // android.webkit.ValueCallback
                        /* JADX INFO: renamed from: kgy, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            fi.this.uh = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                kgy("playable_stuck_check_ping", new JSONObject());
            }
            this.fi.postDelayed(this.nu, this.wy);
        }
    }

    public void kgy(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.ay.kgy kgyVar = this.qi;
        if (kgyVar == null || kgyVar.ahm(jSONObject) || jSONObject == null) {
            return;
        }
        String strOptString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        int iOptInt = jSONObject.optInt("resource_type", -1);
        String strOptString2 = jSONObject.optString("resource_name", "playable_media");
        if (iOptInt == 1) {
            ahm(strOptString2, strOptString);
        }
    }

    public boolean gf() {
        return this.eq;
    }

    public void kgy(String str, JSONObject jSONObject) {
        if (this.iwd) {
            if (!yo.kgy() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (yo.kgy() && jSONObject != null) {
            jSONObject.toString();
        }
        rz rzVar = this.ebs;
        if (rzVar != null) {
            rzVar.kgy(str, jSONObject);
        }
    }

    public void gf(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.gc = 3;
                ikw();
            } else {
                this.gc = -2;
            }
            if (zOptBoolean || !this.ay) {
                return;
            }
            this.ay = false;
            this.bcr = false;
            this.rdw = false;
            this.fi.removeCallbacks(this.gf);
            this.fi.removeCallbacks(this.ra);
            kgy(4, "CaseRenderFail");
        }
    }

    public fi ct(boolean z) {
        this.paj = z;
        return this;
    }

    public fi kgy(float f) {
        this.xxq = f;
        return this;
    }

    public void kgy(int i, String str) {
        uxe();
        rz(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "Ses9mhGoTsuPSNZRqhCpJF8=", M9.a.i);
            yo.kgy("PlayablePlugin", "reportRenderFatal error", th);
        }
        rz("PL_sdk_global_faild", jSONObject);
    }

    public void kgy(int i, String str, String str2) {
        this.gc = -1;
        this.vz = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", mw());
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "VOAakAGObMSFQ8FYiDSyOlT8", 2706);
            yo.kgy("PlayablePlugin", "onWebReceivedError error", th);
        }
        rz("PL_sdk_html_load_error", jSONObject);
        if (this.ay) {
            this.ay = false;
            this.bcr = false;
            this.rdw = false;
            this.fi.removeCallbacks(this.gf);
            this.fi.removeCallbacks(this.ra);
            kgy(1, "ContainerLoadFail");
        }
    }

    public String yo() {
        return this.be;
    }

    public JSONObject yo(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (iOptInt == 1) {
            return at();
        }
        if (iOptInt != 2) {
            return iOptInt != 3 ? jSONObject2 : kus();
        }
        return twf();
    }

    public void yo(boolean z) {
        this.iwd = z;
    }

    public static fi kgy(Context context, @Nullable WebView webView, rz rzVar, com.bytedance.sdk.openadsdk.ay.kgy kgyVar) {
        if (rzVar == null || kgyVar == null) {
            return null;
        }
        if (webView == null) {
            return new fi(context, 0, rzVar, kgyVar);
        }
        return new fi(context, webView, rzVar, kgyVar, kgy.LAND_PAGE);
    }

    private fi(Context context, int i, rz rzVar, com.bytedance.sdk.openadsdk.ay.kgy kgyVar) {
        this.noq = "playable_stuck_check_ping";
        this.yo = "playable_apply_media_permission_callback";
        this.fi = new Handler(Looper.getMainLooper());
        this.at = new Handler(Looper.getMainLooper());
        this.dg = true;
        this.xh = true;
        this.um = true;
        this.kgy = "PL_sdk_playable_global_viewable";
        this.ahm = "PL_sdk_page_screen_blank";
        this.rz = "PL_sdk_playable_destroy_analyze_summary";
        this.uq = "PL_sdk_playable_hardware_dialog_cancel";
        this.ct = "PL_sdk_playable_hardware_dialog_setting";
        this.fpp = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.sx = null;
        this.gm = "embeded_ad";
        this.ay = true;
        this.ioy = true;
        this.lqi = false;
        this.fpz = "";
        this.jpc = 10L;
        this.ft = 10L;
        this.wy = 700;
        this.uf = 0L;
        this.vg = 0L;
        this.bmz = -1L;
        this.ikw = -1L;
        this.uxe = -1L;
        this.muf = -1L;
        this.vrj = -1L;
        this.mw = -1L;
        this.mca = -1L;
        this.ftg = "";
        this.wl = "";
        this.gbb = "";
        this.dta = "";
        this.tp = 0;
        this.lb = 0;
        this.jc = false;
        this.gg = 0;
        this.sm = -1;
        this.cc = 0;
        this.pxt = 0;
        this.dpp = 0;
        this.pft = null;
        this.xrn = false;
        this.qdr = 0;
        this.zjw = 0;
        this.naw = 0;
        this.znm = 0;
        this.xkh = 0L;
        this.uh = 0L;
        this.yx = -2;
        this.gc = 0;
        this.bgd = 0;
        this.xlt = 0;
        this.fxy = new JSONObject();
        this.ac = new HashMap();
        this.wbb = new JSONObject();
        this.ax = "";
        this.ib = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.sa = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.aan = false;
        this.ce = false;
        this.ecz = false;
        this.yv = new ArrayList();
        this.paj = true;
        this.bcr = true;
        this.rdw = true;
        this.vom = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.ay.fi.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) fi.this.vf.get();
                    if (view == null) {
                        return;
                    }
                    fi.this.ahm(view);
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR/keQ==", "VOAKmQy+aMusS85SmQU=", 280);
                    yo.kgy("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.gj = -1;
        this.yx = i;
        this.yjf = kgy.LAND_PAGE;
        kgy(context, rzVar, kgyVar);
    }

    public boolean fi() {
        return this.xhh;
    }

    public JSONObject fi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", ct.ahm(this.ko, "android.permission.RECORD_AUDIO"));
                return jSONObject2;
            }
            if (iOptInt == 2) {
                jSONObject2.put("result", ct.ahm(this.ko, "android.permission.CAMERA"));
                return jSONObject2;
            }
            if (iOptInt != 3) {
                return jSONObject2;
            }
            jSONObject2.put("result", ct.kgy(this.ko));
            return jSONObject2;
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "S+IsjAK+ZcKwT8VQhQKzIVTgCJsCvmXC", 1859);
            return jSONObject2;
        }
    }

    public JSONObject rz() {
        return this.owk;
    }

    public fi rz(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.owk = jSONObject;
            return this;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5pQ+9cMaCRtJumAisLQ==", 634);
            yo.kgy("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public fi rz(boolean z) {
        if (this.gj != -1 && this.eq != z) {
            this.eq = z;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.eq) {
                    jSONObject.put("playable_background_show_type", this.zjw);
                }
            } catch (JSONException e) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5owq5fsaCRtI=", 818);
            }
            rz(this.eq ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.ikw == -1 && this.eq) {
                this.ikw = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("render_type", this.gj == 1 ? 1 : 2);
                    int i = this.gj;
                    if (i != -1) {
                        jSONObject2.put("webview_state", i);
                    }
                } catch (JSONException e2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e2, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5owq5fsaCRtI=", 835);
                }
                rz("PL_sdk_page_show", jSONObject2);
            }
            if (this.ikw != -1 && !this.eq && !this.aan) {
                this.aan = true;
            }
            if (this.eq) {
                this.bmz = System.currentTimeMillis();
            } else if (this.bmz != -1) {
                this.uf += System.currentTimeMillis() - this.bmz;
                this.bmz = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.eq);
                kgy(C4664b4.h.V, jSONObject3);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE5wdoTFa7CGQ", "a+IsjAK+ZcKwRsJahR8=", "SOs5owq5fsaCRtI=", 871);
                yo.kgy("PlayablePlugin", "setViewable error", th);
            }
            if (this.eq) {
                ikw();
            } else {
                uxe();
            }
        }
        return this;
    }

    public fi rz(JSONObject jSONObject) {
        this.wbb = jSONObject;
        return this;
    }

    private void rz(int i, String str) {
        com.bytedance.sdk.openadsdk.ay.kgy kgyVar = this.qi;
        if (kgyVar != null) {
            kgyVar.kgy(i, str);
        }
    }

    private String rz(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.mh) && !TextUtils.isEmpty(this.ax)) {
            Uri uri = Uri.parse(this.ax);
            String host = uri.getHost();
            if (!"lynxview".equalsIgnoreCase(host) && (host == null || !host.contains("lynxview"))) {
                queryParameter = "";
                queryParameter2 = "";
            } else {
                queryParameter = uri.getQueryParameter("surl");
                queryParameter2 = uri.getQueryParameter("playable_hash");
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.mh = builderAppendQueryParameter.toString();
        }
        return this.mh;
    }
}
