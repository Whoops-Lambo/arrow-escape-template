package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.explorestack.protobuf.openrtb.LossReason;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class wy {
    private static boolean ahm;
    private static final ConcurrentHashMap<String, kgy> kgy = new ConcurrentHashMap<>();
    private static boolean rz;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        public final int ahm;
        private int ct;
        public final HashSet<String> kgy = new HashSet<>();
        private final ArrayList<WebView> rz = new ArrayList<>();
        private final String uq;

        public boolean kgy(WebView webView) {
            if (webView != null && this.rz.size() < this.ahm && !this.rz.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.ra.noq) {
                        if (wy.kgy()) {
                            com.bytedance.sdk.component.ra.noq noqVar = (com.bytedance.sdk.component.ra.noq) webView;
                            if (noqVar.kgy() || noqVar.uq() || (this.ct > 0 && noqVar.getReuseCount() >= this.ct)) {
                                return false;
                            }
                        }
                        ((com.bytedance.sdk.component.ra.noq) webView).setRecycled(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.rz.add(webView);
                    sx.kgy("WebViewObjectAllocators", "put: poolType=" + this.uq + ", added " + webView + ", pool size is " + this.rz.size());
                    return true;
                }
            }
            return false;
        }

        public WebView ahm() {
            if (this.rz.isEmpty()) {
                return null;
            }
            return this.rz.remove(0);
        }

        public int rz() {
            return this.rz.size();
        }

        public kgy(String str, JSONObject jSONObject) {
            this.uq = str;
            this.ahm = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.kgy.add(strOptString);
                    }
                }
            }
            this.ct = jSONObject.optInt("reuse_max_count", this.ct);
        }

        public String toString() {
            return super.toString();
        }

        public HashSet<String> kgy() {
            return this.kgy;
        }
    }

    public static void ahm(com.bytedance.sdk.component.ra.fi fiVar) {
        WebView webView;
        if (fiVar == null || (webView = fiVar.getWebView()) == null) {
            return;
        }
        kgy kgyVar = kgy.get(fiVar.getScene().vs);
        if (kgyVar == null || !kgyVar.kgy(webView)) {
            kgy(webView);
        } else {
            uq(fiVar);
        }
    }

    private static WebView kgy(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.ra.fi.rz rzVar, boolean z) {
        WebView webViewAhm;
        kgy kgyVar;
        if (rzVar == null || attributeSet != null || i != 0 || (kgyVar = kgy.get(rzVar.vs)) == null) {
            webViewAhm = null;
        } else {
            webViewAhm = kgyVar.ahm();
            if (webViewAhm != null) {
                if (webViewAhm instanceof com.bytedance.sdk.component.ra.noq) {
                    ((com.bytedance.sdk.component.ra.noq) webViewAhm).setRecycled(false);
                    if (kgy()) {
                        Context context2 = webViewAhm.getContext();
                        if (context2 instanceof MutableContextWrapper) {
                            ((MutableContextWrapper) context2).setBaseContext(context);
                        }
                    }
                }
                sx.kgy("WebViewObjectAllocators", "obtain: reuse old webview, scene=" + rzVar.vs + ", " + webViewAhm);
                kgy(rzVar, false);
            }
        }
        if (webViewAhm != null || !z) {
            return webViewAhm;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        kgy(rzVar, true);
        return i != 0 ? new com.bytedance.sdk.component.ra.noq(context, attributeSet, i) : new com.bytedance.sdk.component.ra.noq(context, attributeSet);
    }

    public static void rz(com.bytedance.sdk.component.ra.fi fiVar) {
        if (fiVar == null) {
            return;
        }
        try {
            fiVar.removeAllViews();
            fiVar.fi();
            fiVar.setWebChromeClient(null);
            fiVar.setWebViewClient(null);
            fiVar.setDownloadListener(null);
            fiVar.setJavaScriptEnabled(true);
            fiVar.setCacheMode(-1);
            fiVar.setSupportZoom(false);
            fiVar.setUseWideViewPort(true);
            fiVar.setJavaScriptCanOpenWindowsAutomatically(true);
            fiVar.setDomStorageEnabled(true);
            fiVar.setBuiltInZoomControls(false);
            fiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            fiVar.setLoadWithOverviewMode(false);
            fiVar.setDefaultTextEncodingName("UTF-8");
            fiVar.setDefaultFontSize(16);
            fiVar.kus();
            WebView webView = fiVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.ra.noq) {
                ((com.bytedance.sdk.component.ra.noq) webView).ahm();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "bOsvowq5fuiCQNJemDCsJFTtLIEMrno=", "Ses+kBeLbMW2Q9JK", 288);
        }
    }

    public static void uq(com.bytedance.sdk.component.ra.fi fiVar) {
        if (fiVar == null) {
            return;
        }
        try {
            fiVar.removeAllViews();
            fiVar.fi();
            fiVar.setWebChromeClient(null);
            fiVar.setWebViewClient(null);
            fiVar.setDownloadListener(null);
            fiVar.setJavaScriptEnabled(true);
            fiVar.setCacheMode(-1);
            fiVar.setSupportZoom(false);
            fiVar.setUseWideViewPort(true);
            fiVar.setJavaScriptCanOpenWindowsAutomatically(true);
            fiVar.setDomStorageEnabled(true);
            fiVar.setBuiltInZoomControls(false);
            fiVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            fiVar.setLoadWithOverviewMode(false);
            fiVar.setDefaultTextEncodingName("UTF-8");
            fiVar.setDefaultFontSize(16);
            WebView webView = fiVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.ra.noq) {
                ((com.bytedance.sdk.component.ra.noq) webView).rz();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "bOsvowq5fuiCQNJemDCsJFTtLIEMrno=", "Ses+kBeLbMW2Q9JKuxi0IHXhH5AOs3/Cqnn1", 325);
        }
    }

    public static WebView ahm(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.ra.fi.rz rzVar) {
        return kgy(context, attributeSet, i, rzVar, true);
    }

    public static boolean ahm(com.bytedance.sdk.component.ra.fi.rz rzVar) {
        return (rzVar == null || kgy.get(rzVar.vs) == null) ? false : true;
    }

    public static boolean ahm() {
        return ahm;
    }

    public static com.bytedance.sdk.component.ra.fi kgy(Context context, AttributeSet attributeSet, int i, com.bytedance.sdk.component.ra.fi.rz rzVar) {
        WebView webViewKgy = kgy(context, attributeSet, i, rzVar, false);
        if (webViewKgy == null) {
            return null;
        }
        com.bytedance.sdk.component.ra.fi fiVar = new com.bytedance.sdk.component.ra.fi(context, true, rzVar);
        fiVar.setWebView(webViewKgy);
        fiVar.noq();
        return fiVar;
    }

    private static void kgy(final com.bytedance.sdk.component.ra.fi.rz rzVar, final boolean z) {
        ioy.kgy("webview_allocate", new ioy.kgy() { // from class: com.bytedance.sdk.component.utils.wy.1
            @Override // com.bytedance.sdk.component.utils.ioy.kgy
            public JSONObject kgy() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("scene", rzVar.vs);
                    return jSONObject;
                } catch (JSONException e) {
                    com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "bOsvowq5fuiCQNJemDCsJFTtLIEMrnqD0Q==", "XOsjkBG9fcKqefhzoxOqLVj6HZQRvWTU", 140);
                    return jSONObject;
                }
            }
        });
    }

    public static void kgy(com.bytedance.sdk.component.ra.fi fiVar) {
        WebView webView;
        if (fiVar == null || (webView = fiVar.getWebView()) == null) {
            return;
        }
        kgy kgyVar = kgy.get(fiVar.getScene().vs);
        if (kgyVar != null && kgyVar.kgy(webView)) {
            rz(fiVar);
        } else {
            kgy(webView);
        }
    }

    private static void kgy(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "bOsvowq5fuiCQNJemDCsJFTtLIEMrno=", "SeshkAKvbPCFSOFUiQY=", LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE);
        }
    }

    public static void kgy(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleNetworkBridge.jsonObjectInit(str);
            ahm = jSONObjectJsonObjectInit.optBoolean("settings_unify", ahm);
            rz = jSONObjectJsonObjectInit.optBoolean("reuse_opti", rz);
            JSONObject jSONObjectOptJSONObject = jSONObjectJsonObjectInit.optJSONObject("pool_config");
            if (jSONObjectOptJSONObject != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next)) {
                        kgy kgyVar = new kgy(next, jSONObjectOptJSONObject.getJSONObject(next));
                        Iterator<String> it = kgyVar.kgy().iterator();
                        while (it.hasNext()) {
                            kgy.put(it.next(), kgyVar);
                        }
                    }
                }
            }
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5kFqSRI", "bOsvowq5fuiCQNJemDCsJFTtLIEMrno=", "Tv4plBe5SsiOTN5a", 244);
        }
    }

    public static int kgy(com.bytedance.sdk.component.ra.fi.rz rzVar) {
        kgy kgyVar;
        if (rzVar == null || (kgyVar = kgy.get(rzVar.vs)) == null) {
            return 0;
        }
        return kgyVar.rz();
    }

    public static boolean kgy() {
        return rz;
    }
}
