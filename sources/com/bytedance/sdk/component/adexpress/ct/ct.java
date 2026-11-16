package com.bytedance.sdk.component.adexpress.ct;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.ra.fi;
import com.bytedance.sdk.component.utils.sx;
import com.bytedance.sdk.component.utils.wy;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class ct {
    private static final byte[] ct = new byte[0];
    private static int fi = 10;
    private static volatile ct gf = null;
    private static int noq = 10;
    private final AtomicBoolean yo = new AtomicBoolean(false);
    private List<fi> kgy = new ArrayList();
    private List<fi> ahm = new ArrayList();
    private Map<Integer, rz> rz = new HashMap();
    private Map<Integer, uq> uq = new HashMap();

    private void gf(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        if (wy.ahm(fiVar.getScene())) {
            wy.kgy(fiVar);
            return;
        }
        if (this.kgy.size() >= noq) {
            try {
                Context context = fiVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                fiVar.dg();
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "S/s5", 285);
                th.getMessage();
                return;
            }
        }
        if (this.kgy.contains(fiVar)) {
            return;
        }
        try {
            Context context2 = fiVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                fiVar.setRecycler(true);
                this.kgy.add(fiVar);
                rz();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "S/s5", 298);
            rz();
            th2.getMessage();
        }
    }

    public void ahm() {
        for (fi fiVar : this.kgy) {
            if (fiVar != null) {
                try {
                    Context context = fiVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    fiVar.dg();
                } catch (Throwable th) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "WOIolBE=", 332);
                    th.getMessage();
                }
            }
        }
        this.kgy.clear();
        for (fi fiVar2 : this.ahm) {
            if (fiVar2 != null) {
                try {
                    Context context2 = fiVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    fiVar2.dg();
                } catch (Throwable th2) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "WOIolBE=", 347);
                    th2.getMessage();
                }
            }
        }
        this.ahm.clear();
    }

    @UiThread
    public void ct(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        wy.rz(fiVar);
        fiVar.ahm("SDK_INJECT_GLOBAL");
        yo(fiVar);
        gf(fiVar);
    }

    public void fi(fi fiVar) {
        WebView webView;
        rz rzVar;
        sx.kgy("WebViewPool", "updateTTAndroidObject: express jsb recycle webview will not remove javascript interfaceSDK_INJECT_GLOBAL");
        if (fiVar == null || (webView = fiVar.getWebView()) == null || (rzVar = this.rz.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        rzVar.kgy(null);
    }

    @SuppressLint({"JavascriptInterface"})
    public void kgy(WebView webView, com.bytedance.sdk.component.kgy.sx sxVar, String str) {
        if (webView == null || sxVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        uq uqVar = this.uq.get(Integer.valueOf(webView.hashCode()));
        if (uqVar != null) {
            uqVar.kgy(sxVar);
        } else {
            uqVar = new uq(sxVar);
            this.uq.put(Integer.valueOf(webView.hashCode()), uqVar);
        }
        sx.kgy("WebViewPool", "registerJavascriptInterfaceForJsB2: jsb 3.0 register javascript interface every time".concat(String.valueOf(str)));
        PangleNetworkBridge.webviewAddJavascriptInterface(webView, uqVar, str);
    }

    public boolean noq(fi fiVar) {
        if (fiVar == null) {
            return false;
        }
        try {
            yo(fiVar);
            Context context = fiVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            fiVar.dg();
            return true;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "WuwsmwezZw==", Sdk.SDKError.Reason.AD_CLOSED_TEMPLATE_ERROR_VALUE);
            th.getMessage();
            return true;
        }
    }

    public void rz(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        if (wy.ahm(fiVar.getScene())) {
            wy.kgy(fiVar);
            return;
        }
        if (this.ahm.size() >= fi) {
            try {
                Context context = fiVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                fiVar.dg();
                return;
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "S/s5swyuR8KXb9lahR+l", 191);
                th.getMessage();
                return;
            }
        }
        if (this.ahm.contains(fiVar)) {
            return;
        }
        try {
            Context context2 = fiVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                fiVar.setRecycler(true);
                this.ahm.add(fiVar);
                uq();
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "S/s5swyuR8KXb9lahR+l", 204);
            uq();
            th2.getMessage();
        }
    }

    @UiThread
    public void uq(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        wy.rz(fiVar);
        fiVar.ahm("SDK_INJECT_GLOBAL");
        yo(fiVar);
        rz(fiVar);
    }

    public void yo(fi fiVar) {
        WebView webView;
        if (fiVar == null || (webView = fiVar.getWebView()) == null) {
            return;
        }
        rz rzVar = this.rz.get(Integer.valueOf(webView.hashCode()));
        if (rzVar != null) {
            rzVar.kgy(null);
        }
        sx.kgy("WebViewPool", "unRegisterJavascriptInterface: express jsb recycle webview will remove javascript interfaceSDK_INJECT_GLOBAL");
        fiVar.ahm("SDK_INJECT_GLOBAL");
    }

    private ct() {
        com.bytedance.sdk.component.adexpress.kgy.kgy.rz rzVarRz = com.bytedance.sdk.component.adexpress.kgy.kgy.kgy.kgy().rz();
        if (rzVarRz != null) {
            noq = rzVarRz.ra();
            fi = rzVarRz.nu();
        }
    }

    public int uq() {
        return this.ahm.size();
    }

    public fi kgy(Context context, String str) {
        fi.rz rzVar = fi.rz.ADS_V4;
        if (!wy.ahm(rzVar)) {
            return null;
        }
        if (!com.bytedance.sdk.component.adexpress.uq.ct.kgy(str) || wy.kgy(rzVar) > 1) {
            return wy.kgy(context, null, 0, rzVar);
        }
        return null;
    }

    public void kgy(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        wy.rz(fiVar);
        fiVar.ahm("SDK_INJECT_GLOBAL");
        yo(fiVar);
        if (wy.ahm(fiVar.getScene())) {
            wy.kgy(fiVar);
            return;
        }
        try {
            Context context = fiVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            fiVar.dg();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "SesujACwbOGPWOJThRe5", 111);
            th.getMessage();
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void kgy(fi fiVar, ahm ahmVar) {
        WebView webView;
        if (fiVar == null || ahmVar == null || (webView = fiVar.getWebView()) == null) {
            return;
        }
        rz rzVar = this.rz.get(Integer.valueOf(webView.hashCode()));
        if (rzVar != null) {
            rzVar.kgy(ahmVar);
        } else {
            rzVar = new rz(ahmVar);
            this.rz.put(Integer.valueOf(webView.hashCode()), rzVar);
        }
        sx.kgy("WebViewPool", "registerJavascriptInterface: express jsb recycle webview will register javascript interface every timeSDK_INJECT_GLOBAL");
        fiVar.kgy(rzVar, "SDK_INJECT_GLOBAL");
    }

    public static ct kgy() {
        if (gf == null) {
            synchronized (ct.class) {
                try {
                    if (gf == null) {
                        gf = new ct();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return gf;
    }

    public void kgy(WebView webView, String str) {
        sx.kgy("WebViewPool", "unRegisterJavascriptInterfaceForJsB2: jsb 3.0 recycle webview will remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        uq uqVar = this.uq.get(Integer.valueOf(webView.hashCode()));
        if (uqVar != null) {
            uqVar.kgy(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void kgy(int i) {
        synchronized (ct) {
            noq = i;
        }
    }

    @Nullable
    public fi rz(Context context, String str) {
        fi.rz rzVar = fi.rz.ADS;
        if (wy.ahm(rzVar)) {
            if (!com.bytedance.sdk.component.adexpress.uq.ct.kgy(str) || wy.kgy(rzVar) > 1) {
                return wy.kgy(context, null, 0, rzVar);
            }
            return null;
        }
        if (rz() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.uq.ct.kgy(str) && rz() <= 1) {
            rz();
            return null;
        }
        fi fiVarRemove = this.kgy.remove(0);
        if (fiVarRemove == null) {
            return null;
        }
        try {
            Context context2 = fiVarRemove.getContext();
            if (!(context2 instanceof MutableContextWrapper)) {
                return fiVarRemove;
            }
            ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
            fiVarRemove.setRecycler(false);
            rz();
            return fiVarRemove;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "Wu08gAqubA==", 250);
            rz();
            return null;
        }
    }

    @Nullable
    public fi ahm(Context context, String str) {
        fi.rz rzVar = fi.rz.ADS_V3;
        if (wy.ahm(rzVar)) {
            if (!com.bytedance.sdk.component.adexpress.uq.ct.kgy(str) || wy.kgy(rzVar) > 1) {
                return wy.kgy(context, null, 0, rzVar);
            }
            return null;
        }
        if (uq() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.uq.ct.kgy(str) && uq() <= 1) {
            uq();
            return null;
        }
        fi fiVarRemove = this.ahm.remove(0);
        if (fiVarRemove == null) {
            return null;
        }
        try {
            Context context2 = fiVarRemove.getContext();
            if (!(context2 instanceof MutableContextWrapper)) {
                return fiVarRemove;
            }
            ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
            fiVarRemove.setRecycler(false);
            uq();
            return fiVarRemove;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "Wu08gAqubOGPWPlYmzSuL1LgKA==", 168);
            uq();
            return null;
        }
    }

    public int rz() {
        return this.kgy.size();
    }

    public void ahm(fi fiVar) {
        if (fiVar == null) {
            return;
        }
        wy.uq(fiVar);
        fi(fiVar);
        if (wy.ahm(fiVar.getScene())) {
            wy.ahm(fiVar);
            return;
        }
        try {
            Context context = fiVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            fiVar.dg();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE40VpTBL/CiGEPJ+woJc3lib", "bOsvowq5fvePRds=", "SesujACwbOGPWOJThRe5H1L6JbsMjmzKj1zSd78z", 135);
            th.getMessage();
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void ahm(fi fiVar, ahm ahmVar) {
        WebView webView;
        if (fiVar == null || ahmVar == null || (webView = fiVar.getWebView()) == null) {
            return;
        }
        rz rzVar = this.rz.get(Integer.valueOf(webView.hashCode()));
        if (rzVar != null) {
            sx.kgy("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will not register javascript interface in reuse webviewSDK_INJECT_GLOBAL");
            rzVar.kgy(ahmVar);
        } else {
            rz rzVar2 = new rz(ahmVar);
            this.rz.put(Integer.valueOf(webView.hashCode()), rzVar2);
            sx.kgy("WebViewPool", "registerOnceJavascriptInterface: express jsb recycle webview will register once javascript interfaceSDK_INJECT_GLOBAL");
            fiVar.kgy(rzVar2, "SDK_INJECT_GLOBAL");
        }
    }

    public void ahm(WebView webView, com.bytedance.sdk.component.kgy.sx sxVar, String str) {
        if (webView == null || sxVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        uq uqVar = this.uq.get(Integer.valueOf(webView.hashCode()));
        if (uqVar != null) {
            sx.kgy("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 will not register javascript interface in reuse webview".concat(String.valueOf(str)));
            uqVar.kgy(sxVar);
        } else {
            sx.kgy("WebViewPool", "registerOnceJavascriptInterfaceForJsB2: jsb 3.0 register once javascript interface in created webview".concat(String.valueOf(str)));
            uq uqVar2 = new uq(sxVar);
            this.uq.put(Integer.valueOf(webView.hashCode()), uqVar2);
            PangleNetworkBridge.webviewAddJavascriptInterface(webView, uqVar2, str);
        }
    }

    public void ahm(WebView webView, String str) {
        uq uqVar;
        sx.kgy("WebViewPool", "updateWebViewBridge: jsb 3.0 recycle webview will not remove javascript interface".concat(String.valueOf(str)));
        if (webView == null || TextUtils.isEmpty(str) || (uqVar = this.uq.get(Integer.valueOf(webView.hashCode()))) == null) {
            return;
        }
        uqVar.kgy(null);
    }

    public void ahm(int i) {
        synchronized (ct) {
            fi = i;
        }
    }
}
