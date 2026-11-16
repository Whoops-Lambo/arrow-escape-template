package com.bytedance.sdk.openadsdk.core.gf;

import android.R;
import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.wy;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.uxe;
import com.bytedance.sdk.openadsdk.utils.ftg;
import com.bytedance.sdk.openadsdk.utils.mw;
import com.bytedance.sdk.openadsdk.utils.vrj;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.n30;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class ioy extends com.bytedance.sdk.component.adexpress.ct.kgy implements uxe.kgy {
    private static Integer jpc;
    protected com.bytedance.sdk.openadsdk.core.model.ioy at;
    private com.bytedance.sdk.openadsdk.core.model.ioy.kgy ay;
    protected fi dg;
    private String fi;
    private com.bytedance.sdk.openadsdk.uq.twf fpp;
    private final Runnable fpz;
    private uxe.kgy ft;
    private final AtomicBoolean gf;
    private com.bytedance.sdk.component.adexpress.ahm.yo gm;
    private volatile int ioy;
    protected com.bytedance.sdk.openadsdk.uq.uq.ct kus;
    private final com.bytedance.sdk.component.gf.ahm.rz lqi;
    protected String nu;
    protected Context ra;
    private final Map<String, com.bytedance.sdk.openadsdk.gm.kgy.kgy.rz> sx;
    protected JSONObject twf;
    com.bytedance.sdk.openadsdk.utils.kgy um;
    protected uxe vs;
    protected com.bytedance.sdk.openadsdk.core.kus.uq.ahm xh;

    public void sx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg() {
        if (this.ct.getWebView() != null && mw.noq()) {
            gm();
        } else {
            this.ioy = 1;
            mw.kgy(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gf.ioy.3
                @Override // java.lang.Runnable
                public void run() {
                    ioy.this.gm();
                }
            });
        }
    }

    public static int ft() {
        if (jpc == null) {
            int i = 2;
            int iKgy = com.bytedance.sdk.openadsdk.lqi.ct.kgy("webview_ads_refresh", 2);
            if (iKgy >= 0 && iKgy <= 2) {
                i = iKgy;
            }
            jpc = Integer.valueOf(i);
        }
        return jpc.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        com.bytedance.sdk.component.ra.fi fiVar = this.ct;
        if (fiVar == null || fiVar.getWebView() == null || this.ioy == 2) {
            return;
        }
        this.fi = kgy(this.at);
        Log.d("TTAD.WebViewRender", "initWebViewRender: url = " + this.fi);
        kgy(vrj.kgy(this.fi));
        lqi();
        uxe uxeVar = new uxe(this.ra);
        this.vs = uxeVar;
        uxeVar.yo(true);
        vs();
        this.ioy = 2;
    }

    private void kgy(com.bytedance.sdk.component.ra.fi fiVar) {
        if (fiVar == null) {
            return;
        }
        try {
            if (!wy.ahm()) {
                fiVar.setDisplayZoomControls(false);
                com.bytedance.sdk.component.ra.yo.kgy(this.ra).kgy(false).kgy(fiVar.getWebView());
                fiVar.setVerticalScrollBarEnabled(false);
                fiVar.setHorizontalScrollBarEnabled(false);
                fiVar.kus();
                fiVar.setMixedContentMode(0);
                fiVar.setJavaScriptEnabled(true);
                fiVar.setJavaScriptCanOpenWindowsAutomatically(true);
                fiVar.setDomStorageEnabled(true);
                fiVar.setDatabaseEnabled(true);
                fiVar.setAllowFileAccess(false);
                fiVar.setSupportZoom(true);
                fiVar.setBuiltInZoomControls(true);
                fiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                fiVar.setUseWideViewPort(true);
                fiVar.setCacheMode(-1);
            }
            fiVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.sx.kgy(fiVar.getWebView(), BuildConfig.VERSION_CODE));
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "bOsvowq5fvWFRNNYng==", "UuAkgTS5a/GJT8BuiQW0IVXp", Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.WebViewRender", e.toString());
        }
    }

    private void rz(boolean z) {
        if (this.vs == null || this.ct == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.vs.kgy("expressAdShow", jSONObject);
            this.vs.ahm(z);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "bOsvowq5fvWFRNNYng==", "SOsjkSakedWFWcR8iCKoJ0w=", 452);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xh() {
        if (this.gf.get() || this.twf == null || !at.kgy(this.at) || this.rz || !this.gf.compareAndSet(false, true)) {
            return;
        }
        at.kgy(this.at, this.twf);
    }

    public void ahm(int i) {
        if (this.vs == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.vs.kgy("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "bOsvowq5fvWFRNNYng==", "VeE5nAWlXs6MRu1Sgxw=", 409);
            com.bytedance.sdk.component.utils.sx.rz("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void fi() {
        if (this.yo.get()) {
            return;
        }
        super.fi();
        uxe uxeVar = this.vs;
        if (uxeVar != null) {
            uxeVar.uq();
            this.vs.kus();
            this.vs = null;
        }
        com.bytedance.sdk.openadsdk.uq.twf twfVar = this.fpp;
        if (twfVar != null) {
            twfVar.uq(false);
        }
        com.bytedance.sdk.openadsdk.core.kus.rz().removeCallbacks(this.fpz);
        this.sx.clear();
    }

    public void fpp() {
        uxe uxeVar;
        com.bytedance.sdk.component.ra.fi fiVar = this.ct;
        if (fiVar == null || fiVar.getWebView() == null || (uxeVar = this.vs) == null) {
            return;
        }
        uxeVar.ahm(this.ct).gf(this.ct.getScene() == com.bytedance.sdk.component.ra.fi.rz.ADS_V3).kgy(this.at).rz(this.at.wzd()).uq(this.at.bcr()).ahm(ftg.kgy(this.nu)).ct(this.at.tml()).kgy((com.bytedance.sdk.component.adexpress.ahm.nu) this).ahm(this.twf).kgy(this.ct).kgy((uxe.kgy) this).kgy(this.kus);
    }

    public fi fpz() {
        return this.dg;
    }

    public uxe jpc() {
        return this.vs;
    }

    public void lqi() {
        com.bytedance.sdk.openadsdk.core.model.ioy ioyVar = this.at;
        if (ioyVar == null || ioyVar.vz() == null) {
            return;
        }
        this.ay = this.at.vz();
    }

    @Override // com.bytedance.sdk.openadsdk.core.uxe.kgy
    public void m_() {
        uxe.kgy kgyVar = this.ft;
        if (kgyVar != null) {
            kgyVar.m_();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.uxe.kgy
    public void n_() {
        uxe.kgy kgyVar = this.ft;
        if (kgyVar != null) {
            kgyVar.n_();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void noq() {
        com.bytedance.sdk.component.ra.fi fiVar = this.ct;
        if (fiVar != null && fiVar.getScene() == com.bytedance.sdk.component.ra.fi.rz.ADS_V3 && uf()) {
            com.bytedance.sdk.component.utils.sx.kgy("TTAD.WebViewRender", "refreshWebView: refresh webview by console log ");
            this.ct.kgy("javascript:console.log('init engine');");
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void nu() {
        super.nu();
        if (this.vs == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.vs.kgy("expressShow", jSONObject);
            this.vs.rz(true);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "bOsvowq5fvWFRNNYng==", "VeE5nAWlSMOzQthK", 389);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.uxe.kgy
    public void o_() {
        uxe.kgy kgyVar = this.ft;
        if (kgyVar != null) {
            kgyVar.o_();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void ra() {
        uxe uxeVar = this.vs;
        if (uxeVar == null) {
            return;
        }
        uxeVar.kgy("expressWebviewRecycle", (JSONObject) null);
    }

    public void um() {
        com.bytedance.sdk.component.adexpress.ahm.yo yoVar = this.gm;
        if (yoVar != null) {
            super.kgy(yoVar);
        }
    }

    public void vs() {
        com.bytedance.sdk.component.ra.fi fiVar = this.ct;
        if (fiVar == null || fiVar.getWebView() == null) {
            return;
        }
        this.ct.setBackgroundColor(0);
        this.ct.setBackgroundResource(R.color.transparent);
        kgy(this.ct);
        if (uq() != null) {
            this.fpp = new com.bytedance.sdk.openadsdk.uq.twf(this.at, uq().getWebView()).ahm(false);
        }
        this.fpp.kgy(this.kus);
        fi fiVar2 = new fi(this.ra, this.vs, this.at, this.fpp, kus());
        this.dg = fiVar2;
        JSONObject jSONObject = this.twf;
        if (jSONObject != null) {
            fiVar2.kgy(jSONObject);
        }
        this.ct.setWebViewClient(this.dg);
        this.ct.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.kgy.uq(this.vs, this.fpp));
        ioy();
    }

    public ioy(Context context, com.bytedance.sdk.component.adexpress.ahm.twf twfVar, com.bytedance.sdk.openadsdk.uq.uq.ct ctVar, com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        super(context, twfVar);
        this.gf = new AtomicBoolean(false);
        this.sx = n30.r();
        this.ioy = 0;
        this.lqi = new com.bytedance.sdk.component.gf.ahm.rz("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.gf.ioy.1
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.ct.kgy) ioy.this).yo.get()) {
                    return;
                }
                ioy ioyVar2 = ioy.this;
                ioyVar2.twf = ioyVar2.kus().rz();
                ioy ioyVar3 = ioy.this;
                ioyVar3.kgy(ioyVar3.twf);
                ioy ioyVar4 = ioy.this;
                fi fiVar = ioyVar4.dg;
                if (fiVar != null) {
                    fiVar.kgy(ioyVar4.twf);
                }
                ioy.this.xh();
                if (ioy.this.ioy == 0) {
                    ioy.this.dg();
                }
                com.bytedance.sdk.openadsdk.core.kus.rz().post(ioy.this.fpz);
            }
        };
        this.fpz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gf.ioy.2
            @Override // java.lang.Runnable
            public void run() {
                if (((com.bytedance.sdk.component.adexpress.ct.kgy) ioy.this).yo.get() || ioy.this.gm == null) {
                    return;
                }
                ioy.this.fpp();
                ioy.this.um();
            }
        };
        if (this.ct == null) {
            return;
        }
        this.ra = context;
        this.nu = twfVar.uq();
        this.at = ioyVar;
        this.kus = ctVar;
        dg();
    }

    public static boolean uf() {
        if (ft() == 1) {
            return true;
        }
        return false;
    }

    public static boolean wy() {
        if (ft() == 2) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void at() {
        super.at();
        com.bytedance.sdk.openadsdk.utils.kgy kgyVarCt = com.bytedance.sdk.openadsdk.core.vs.kgy().ct();
        this.um = kgyVarCt;
        kgyVarCt.kgy(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void gf() {
        if (uq() == null) {
            return;
        }
        try {
            uq().getWebView().resumeTimers();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgIoUGsmjDk07cE48esi0V4CyBCqpswphaxVifAg==", "bOsvowq5fvWFRNNYng==", "VOAfkBCpZMI=", 372);
        }
    }

    public void ioy() {
        com.bytedance.sdk.component.adexpress.ct.ct.kgy().kgy(this.ct, this.vs);
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void twf() {
        super.twf();
        com.bytedance.sdk.openadsdk.utils.kgy kgyVar = this.um;
        if (kgyVar != null) {
            kgyVar.ahm(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public com.bytedance.sdk.component.ra.fi uq() {
        return this.ct;
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy, com.bytedance.sdk.component.adexpress.ahm.uq
    public int rz() {
        return this.at.idg();
    }

    public static boolean ahm(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    public static String kgy(com.bytedance.sdk.openadsdk.core.model.ioy ioyVar) {
        return com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.uq((ioyVar == null || !ioyVar.mh()) ? null : "v3");
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy, com.bytedance.sdk.component.adexpress.ahm.uq
    public void kgy(com.bytedance.sdk.component.adexpress.ahm.yo yoVar) {
        this.gm = yoVar;
        mw.rz((Runnable) this.lqi);
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy
    public void kgy(int i) {
        if (i == this.noq) {
            return;
        }
        this.noq = i;
        rz(i == 0);
    }

    @Override // com.bytedance.sdk.component.adexpress.ct.kgy, com.bytedance.sdk.component.adexpress.ahm.nu
    public void kgy(com.bytedance.sdk.component.adexpress.ahm.kus kusVar) {
        super.kgy(kusVar);
        if (this.uq) {
            com.bytedance.sdk.component.utils.gf.ahm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.gf.ioy.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = ((com.bytedance.sdk.component.adexpress.ct.kgy) ioy.this).ct.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void kgy(com.bytedance.sdk.openadsdk.core.kus.uq.ahm ahmVar) {
        this.xh = ahmVar;
        uxe uxeVar = this.vs;
        if (uxeVar != null) {
            uxeVar.kgy(ahmVar);
        }
    }

    public void kgy(uxe.kgy kgyVar) {
        this.ft = kgyVar;
    }
}
