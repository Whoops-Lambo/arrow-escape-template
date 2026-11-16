package com.bytedance.sdk.component.adexpress.ct;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.ahm.nu;
import com.bytedance.sdk.component.adexpress.ahm.twf;
import com.bytedance.sdk.component.adexpress.ahm.yo;
import com.bytedance.sdk.component.ra.fi;
import com.bytedance.sdk.component.ra.noq;
import com.bytedance.sdk.component.utils.kus;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class kgy implements nu, com.bytedance.sdk.component.adexpress.ahm.uq<fi>, com.bytedance.sdk.component.adexpress.kgy {
    protected volatile yo ahm;
    private twf at;
    protected fi ct;
    private Context fi;
    private String gf;
    protected JSONObject kgy;
    private int kus;
    private com.bytedance.sdk.component.adexpress.ahm.fi nu;
    private String ra;
    private boolean twf;
    protected boolean uq;
    protected boolean rz = false;
    protected int noq = 8;
    protected AtomicBoolean yo = new AtomicBoolean(false);
    private AtomicBoolean vs = new AtomicBoolean(false);

    public void at() {
    }

    public abstract void kgy(int i);

    public void noq() {
    }

    public abstract void ra();

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    public int rz() {
        return 0;
    }

    public void twf() {
    }

    private void vs() {
        if (this.fi == null && com.bytedance.sdk.component.adexpress.uq.kgy() != null) {
            this.fi = com.bytedance.sdk.component.adexpress.uq.kgy();
        }
        Context context = this.fi;
        if (context != null) {
            fi fiVarKgy = kgy(context, this.gf);
            this.ct = fiVarKgy;
            if (fiVarKgy == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.ct = new fi(new MutableContextWrapper(this.fi.getApplicationContext()), kgy());
            } else {
                this.rz = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    public void ahm() {
        if (this.at.ioy()) {
            ct.kgy().uq(this.ct);
        } else {
            ct.kgy().ct(this.ct);
        }
    }

    public void fi() {
        if (this.yo.get()) {
            return;
        }
        this.yo.set(true);
        ra();
        if (this.ct.getParent() != null) {
            ((ViewGroup) this.ct.getParent()).removeView(this.ct);
        }
        Log.d("WebViewRender", "release: webview success = " + this.uq + "; is click backup close button = " + this.vs.get());
        if (!this.uq || this.vs.get()) {
            Log.d("WebViewRender", "release: direct destroy webview");
            ct.kgy().noq(this.ct);
        } else {
            Log.d("WebViewRender", "release: recycle webview for pool");
            ahm();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    public void kgy(yo yoVar) {
        String str;
        this.ahm = yoVar;
        if (uq() == null || uq().getWebView() == null) {
            yo yoVar2 = this.ahm;
            StringBuilder sb = new StringBuilder("SSWebview null is ");
            sb.append(uq() == null);
            sb.append(" or Webview is null");
            yoVar2.kgy(102, sb.toString());
            return;
        }
        if (TextUtils.isEmpty(this.ra)) {
            this.ahm.kgy(102, "url is empty");
            return;
        }
        if (!this.at.uf()) {
            if (this.at.ioy()) {
                if (rz() == 9 && !com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.ahm(this.kgy)) {
                    yo yoVar3 = this.ahm;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.kgy == null);
                    yoVar3.kgy(103, sb2.toString());
                    return;
                }
            } else if (!com.bytedance.sdk.component.adexpress.kgy.ahm.ahm.kgy(this.kgy)) {
                yo yoVar4 = this.ahm;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.kgy == null);
                yoVar4.kgy(103, sb3.toString());
                return;
            }
        }
        WebView webView = this.ct.getWebView();
        this.at.ct().kgy(this.rz, webView instanceof noq ? ((noq) webView).getReuseCount() : 0);
        if (!this.rz) {
            this.ct.xh();
            this.at.ct();
            this.ct.kgy(this.ra);
            return;
        }
        try {
            int iFpz = this.at.fpz();
            if (this.at.ioy() && iFpz == 1) {
                this.at.rz();
                str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.at.rz() + ";") + "window.SDK_TRIGGER_RENDER();";
            } else {
                str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
            }
            noq();
            this.ct.xh();
            this.at.ct();
            kus.kgy(this.ct.getWebView(), str);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "ee8+kDS5a/GJT8BviR+kLUk=", "SesjkQau", 193);
            ct.kgy().noq(this.ct);
            this.ahm.kgy(102, "load exception is " + e.getMessage());
        }
    }

    public twf kus() {
        return this.at;
    }

    public fi uq() {
        return this.ct;
    }

    public kgy(Context context, twf twfVar) {
        this.fi = context;
        this.at = twfVar;
        this.gf = twfVar.uq();
        vs();
    }

    public void gf() {
        if (uq() == null) {
            return;
        }
        try {
            uq().getWebView().resumeTimers();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "ee8+kDS5a/GJT8BviR+kLUk=", "VOAfkBCpZMI=", 249);
        }
    }

    public void nu() {
        at();
        Activity activityKgy = com.bytedance.sdk.component.utils.ahm.kgy(this.ct);
        if (activityKgy != null) {
            this.kus = ahm(activityKgy);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.uq
    /* JADX INFO: renamed from: yo, reason: merged with bridge method [inline-methods] */
    public fi ct() {
        return uq();
    }

    public boolean ahm(com.bytedance.sdk.component.adexpress.ahm.kus kusVar) {
        return kusVar.uq();
    }

    private int ahm(Activity activity) {
        return activity.hashCode();
    }

    public void ahm(boolean z) {
        this.vs.set(z);
    }

    public fi.rz kgy() {
        return this.at.ioy() ? fi.rz.ADS_V3 : fi.rz.ADS;
    }

    public fi kgy(Context context, String str) {
        if (this.at.ioy()) {
            return ct.kgy().ahm(context, str);
        }
        return ct.kgy().rz(context, str);
    }

    public void kgy(String str) {
        this.ra = str;
    }

    public void kgy(com.bytedance.sdk.component.adexpress.ahm.fi fiVar) {
        this.nu = fiVar;
    }

    public void kgy(boolean z) {
        this.twf = z;
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.nu
    public void kgy(final com.bytedance.sdk.component.adexpress.ahm.kus kusVar) {
        if (kusVar == null) {
            if (this.ahm != null) {
                this.ahm.kgy(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zAhm = ahm(kusVar);
        final float fCt = (float) kusVar.ct();
        final float fNoq = (float) kusVar.noq();
        if (rz() == 0 && (fCt <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fNoq <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            if (this.ahm != null) {
                this.ahm.kgy(105, "width is " + fCt + "height is " + fNoq);
                return;
            }
            return;
        }
        this.uq = zAhm;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            kgy(kusVar, fCt, fNoq);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.ct.kgy.1
                @Override // java.lang.Runnable
                public void run() {
                    kgy.this.kgy(kusVar, fCt, fNoq);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kgy(com.bytedance.sdk.component.adexpress.ahm.kus kusVar, float f, float f2) {
        kusVar.at();
        boolean z = this.uq;
        if (z && !this.twf) {
            kgy(f, f2);
            kgy(this.noq);
            if (this.ahm != null) {
                this.ahm.kgy(uq(), kusVar);
                return;
            }
            return;
        }
        if (!z) {
            ct.kgy().noq(this.ct);
        }
        kgy(kusVar.at(), kusVar.nu());
    }

    @Override // com.bytedance.sdk.component.adexpress.ahm.nu
    public void kgy(View view, int i, com.bytedance.sdk.component.adexpress.rz rzVar) {
        com.bytedance.sdk.component.adexpress.ahm.fi fiVar = this.nu;
        if (fiVar != null) {
            fiVar.kgy(view, i, rzVar);
        }
    }

    @UiThread
    private void kgy(float f, float f2) {
        this.at.ct().ct();
        if (rz() != 9 && rz() != 11) {
            int iKgy = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.fi, f);
            int iKgy2 = (int) com.bytedance.sdk.component.adexpress.uq.yo.kgy(this.fi, f2);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) uq().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(iKgy, iKgy2);
            }
            layoutParams.width = iKgy;
            layoutParams.height = iKgy2;
            uq().setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) uq().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        uq().setLayoutParams(layoutParams2);
    }

    private void kgy(int i, String str) {
        if (this.ahm != null) {
            this.ahm.kgy(i, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.kgy
    public void kgy(Activity activity) {
        if (this.kus == 0 || activity == null || activity.hashCode() != this.kus) {
            return;
        }
        fi();
        twf();
    }

    public void kgy(JSONObject jSONObject) {
        this.kgy = jSONObject;
    }
}
