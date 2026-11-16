package com.bytedance.sdk.component.ra;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import com.bytedance.sdk.component.utils.ioy;
import com.bytedance.sdk.component.utils.lqi;
import com.bytedance.sdk.component.utils.wy;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.R6;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.PangleNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import com.safedk.android.utils.n;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import io.p071bidmachine.protobuf.EventTypeExtended;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class fi extends FrameLayout {
    public int ahm;
    private long at;
    private boolean ay;
    private int bmz;
    private String ct;
    private com.bytedance.sdk.component.ra.kgy.InterfaceC0217kgy dg;
    private long dta;
    private float fi;
    private com.bytedance.sdk.component.ra.uq fpp;
    private WebViewClient fpz;
    private ct ft;
    private AtomicBoolean ftg;
    private long gbb;
    private float gf;
    private boolean gm;
    private ahm ikw;
    private boolean ioy;
    private rz jpc;
    public int kgy;
    private volatile WebView kus;
    private boolean lqi;
    private AtomicBoolean mca;
    private AttributeSet muf;
    private AtomicBoolean mw;
    private JSONObject noq;
    private long nu;
    private long ra;
    public int rz;
    private boolean sx;
    private boolean twf;
    private float uf;
    private List<String> um;
    private com.bytedance.sdk.component.ra.ahm.kgy uq;
    private lqi uxe;
    private float vg;
    private Context vrj;
    private View vs;
    private uq wl;
    private float wy;
    private com.bytedance.sdk.component.ra.kgy xh;
    private boolean yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(h.u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BrandSafetyUtils.onWebViewPageStarted(h.u, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BrandSafetyUtils.onWebViewReceivedError(h.u, view, errorCode, description, failingUrl);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(h.u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            boolean zShouldOverrideUrlLoading = super.shouldOverrideUrlLoading(view, url);
            BrandSafetyUtils.onShouldOverrideUrlLoading(h.u, view, url, zShouldOverrideUrlLoading);
            return zShouldOverrideUrlLoading;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            kgy kgyVar;
            final WebView webView2;
            final RenderProcessGoneDetail renderProcessGoneDetail2;
            if ((webView instanceof noq) && wy.kgy()) {
                final String originalUrl = webView.getOriginalUrl();
                final String url = webView.getUrl();
                kgyVar = this;
                webView2 = webView;
                renderProcessGoneDetail2 = renderProcessGoneDetail;
                ioy.kgy("webview_render_exception", new ioy.kgy() { // from class: com.bytedance.sdk.component.ra.fi.kgy.1
                    @Override // com.bytedance.sdk.component.utils.ioy.kgy
                    public JSONObject kgy() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            ViewParent parent = webView2.getParent();
                            if (parent instanceof fi) {
                                jSONObject.put("source", ((fi) parent).getScene());
                            }
                            if (Build.VERSION.SDK_INT >= 26) {
                                jSONObject.put("did_crash", renderProcessGoneDetail2.didCrash());
                                jSONObject.put("render_priority", renderProcessGoneDetail2.rendererPriorityAtExit());
                            }
                            jSONObject.put(FileUploadManager.a, originalUrl);
                            jSONObject.put("url", url);
                            return jSONObject;
                        } catch (Throwable th) {
                            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKXDvNYihC1JE/ZKJc1tWzQo0beWIIF5Hk=", "XOsjkBG9fcKqefhzoxOqLVj6HZQRvWTU", 1284);
                            return jSONObject;
                        }
                    }
                });
            } else {
                kgyVar = this;
                webView2 = webView;
                renderProcessGoneDetail2 = renderProcessGoneDetail;
            }
            if (Build.VERSION.SDK_INT < 26) {
                return super.onRenderProcessGone(webView2, renderProcessGoneDetail2);
            }
            if (webView2 == null) {
                return true;
            }
            webView2.post(new Runnable() { // from class: com.bytedance.sdk.component.ra.fi.kgy.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ViewGroup viewGroup = (ViewGroup) webView2.getParent();
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                        webView2.destroy();
                    } catch (Exception e) {
                        com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKXDvNYihC1JE/ZKJc1tWzQo0beWIIF5Ho=", "Sfsj", 1339);
                    }
                }
            });
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface uq {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/component/ra/fi;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(h.u, this, motionEvent);
        return safedk_fi_dispatchTouchEvent_dfa1a8f65fcd29158267372a849de609(motionEvent);
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            CreativeInfoManager.viewOnMeasure(h.u, this, widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum rz {
        ADS("ads"),
        ADS_V3("ads_v3"),
        ADS_V4("ads_v4"),
        ENDCARD(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD),
        USER_AGENT(R6.d0),
        PLAYABLE("playable"),
        PRIVACY("privacy"),
        VAST_ENDCARD("vast_endcard"),
        EASY_PLAYABLE("easy_playable"),
        LANDING_PAGE("landing_page"),
        LANDING_PAGE_CEILING("landing_page_ceiling"),
        LANDING_PAGE_WITH_VIDEO("landing_page_with_video"),
        LANDING_PAGE_DIRECT("landing_page_direct"),
        LANDING_PAGE_PRE_RENDER("landing_page_pre_render");

        public final String vs;

        rz(String str) {
            this.vs = str;
        }
    }

    private static boolean ahm(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ViewPager");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "Uv0bnAarWcaHT8U=", 687);
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.viewpager.widget.ViewPager");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "Uv0bnAarWcaHT8U=", 695);
            return false;
        }
    }

    private void fpp() {
        if (this.kus == null) {
            return;
        }
        try {
            this.kus.removeJavascriptInterface("searchBoxJavaBridge_");
            this.kus.removeJavascriptInterface("accessibility");
            this.kus.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SesgmhW5Q8aWS8RenhiwPHLgOZARumjEhVnkXIoU", 773);
        }
    }

    private void kgy(MotionEvent motionEvent) {
        if (!this.yo || this.uq == null) {
            return;
        }
        if ((this.ct == null && this.noq == null) || motionEvent == null) {
            return;
        }
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.fi = motionEvent.getRawX();
                this.gf = motionEvent.getRawY();
                this.ra = System.currentTimeMillis();
                this.noq = new JSONObject();
                if (this.kus != null) {
                    this.gbb = this.ra;
                    return;
                }
                return;
            }
            if (action == 1 || action == 3) {
                this.noq.put("start_x", String.valueOf(this.fi));
                this.noq.put("start_y", String.valueOf(this.gf));
                this.noq.put("offset_x", String.valueOf(motionEvent.getRawX() - this.fi));
                this.noq.put("offset_y", String.valueOf(motionEvent.getRawY() - this.gf));
                this.noq.put("url", String.valueOf(getUrl()));
                this.noq.put("tag", "");
                this.nu = System.currentTimeMillis();
                if (this.kus != null) {
                    this.dta = this.nu;
                }
                this.noq.put("down_time", this.ra);
                this.noq.put("up_time", this.nu);
                if (com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm() != null) {
                    long j = this.at;
                    long j2 = this.ra;
                    if (j != j2) {
                        this.at = j2;
                        com.bytedance.sdk.component.ra.kgy.kgy.kgy().ahm().kgy(this.uq, this.ct, "in_web_click", this.noq, this.nu - this.ra);
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOsjkS+9Z8OJRNBtjRalDU3rI4E=", 1229);
        }
    }

    private static boolean rz(View view) {
        try {
            Class<?> clsLoadClass = view.getClass().getClassLoader().loadClass("android.support.v4.view.ScrollingView");
            if (clsLoadClass != null && clsLoadClass.isInstance(view)) {
                return true;
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "Uv0elhGzZcuJRNBrhRS3", IronSourceError.ERROR_NT_INSTANCE_INIT_TIMEOUT);
        }
        try {
            Class<?> clsLoadClass2 = view.getClass().getClassLoader().loadClass("androidx.core.view.ScrollingView");
            return clsLoadClass2 != null && clsLoadClass2.isInstance(view);
        } catch (Throwable th2) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th2, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "Uv0elhGzZcuJRNBrhRS3", IronSourceError.ERROR_NT_LOAD_NO_CONFIG);
            return false;
        }
    }

    public static void setDataDirectorySuffix(String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            WebView.setDataDirectorySuffix(str);
        }
    }

    private void sx() {
        if (this.uxe == null) {
            this.ftg.set(false);
            this.uxe = new lqi(getContext());
        }
        new Object() { // from class: com.bytedance.sdk.component.ra.fi.1
        };
        this.ftg.set(true);
    }

    public void at() {
        try {
            this.kus.goForward();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOELmhGraNWE", 464);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.kus == null) {
            return;
        }
        try {
            this.kus.computeScroll();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WOEghRaobPSDWNhRgA==", IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
        }
    }

    public boolean ct() {
        return this.lqi;
    }

    public void dg() {
        if (this.kus == null) {
            return;
        }
        rz rzVar = this.jpc;
        if (rzVar != rz.ADS && rzVar != rz.ADS_V3 && rzVar != rz.ADS_V4) {
            wy.kgy(this);
            return;
        }
        try {
            this.kus.destroy();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "X+s+gRGzcA==", EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_FINISHED_VALUE);
        }
    }

    public void fi() {
        try {
            this.kus.stopLoading();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SPoihS+zaMOJRNA=", 421);
        }
    }

    public View getArbitrageLoadingView() {
        return this.vs;
    }

    public int getContentHeight() {
        if (this.kus == null) {
            return 0;
        }
        try {
            return this.kus.getContentHeight();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOs5tgyyfcKOXv9YhRaoPA==", 539);
            return 1;
        }
    }

    public long getLandingPageClickBegin() {
        return this.gbb;
    }

    public long getLandingPageClickEnd() {
        return this.dta;
    }

    public com.bytedance.sdk.component.ra.ahm.kgy getMaterialMeta() {
        return this.uq;
    }

    public String getOriginalUrl() {
        String url;
        if (this.kus == null) {
            return null;
        }
        try {
            String originalUrl = this.kus.getOriginalUrl();
            return (originalUrl == null || !originalUrl.startsWith(n.b) || (url = this.kus.getUrl()) == null || !url.startsWith("file://")) ? originalUrl : url;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOs5uhG1bs6OS9tonh0=", 517);
            return null;
        }
    }

    public int getProgress() {
        if (this.kus == null) {
            return 0;
        }
        try {
            return this.kus.getProgress();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOs5pRGzbtWFWcQ=", 528);
            return 100;
        }
    }

    public rz getScene() {
        return this.jpc;
    }

    public String getUrl() {
        if (this.kus == null) {
            return null;
        }
        try {
            return this.kus.getUrl();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOs5oBGw", 498);
            return null;
        }
    }

    public String getUserAgentString() {
        if (this.kus == null) {
            return "";
        }
        try {
            return this.kus.getSettings().getUserAgentString();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOs5oBC5e+aHT9lJvwWyIVXp", 874);
            return "";
        }
    }

    public WebView getWebView() {
        return this.kus;
    }

    public WebViewClient getWebViewClient() {
        return this.fpz;
    }

    public boolean gf() {
        if (this.kus == null) {
            return false;
        }
        try {
            return this.kus.canGoBack();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WO8jsgyeaMSL", 438);
            return false;
        }
    }

    public void kus() {
        try {
            this.kus.clearHistory();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WOIolBGUYNSURcVE", 561);
        }
    }

    public void noq() {
        try {
            if (this.kus == null) {
                this.kus = kgy(this.muf, 0);
            }
            yo();
            ahm(kgy(this.vrj));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "UuAkgTS5a9GJT8A=", 262);
            th.getMessage();
        }
    }

    public boolean nu() {
        if (this.kus == null) {
            return false;
        }
        try {
            return this.kus.canGoForward();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WO8jsgyaZtWXS8VZ", 456);
            return false;
        }
    }

    public void ra() {
        try {
            this.kus.goBack();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "XOEPlAC3", 446);
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        try {
            this.kus.removeAllViews();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SesgmhW5SMuMfN5YmwI=", 1088);
        }
    }

    public void setAllowFileAccess(boolean z) {
        try {
            this.kus.getSettings().setAllowFileAccess(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5tA+wZtCmQ9tYrRKjLUj9", IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        try {
            this.kus.setBackgroundColor(i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5twK/YsCSRcJTiDKvJFT8", 611);
        }
    }

    public void setBuiltInZoomControls(boolean z) {
        try {
            this.kus.getSettings().setBuiltInZoomControls(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5txa1ZdOpRO1SgxyDJ1X6P5oPrw==", 950);
        }
    }

    public void setCacheMode(int i) {
        try {
            this.kus.getSettings().setCacheMode(i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5tgK/YcKtRdNY", EventTypeExtended.EVENT_TYPE_EXTENDED_CUSTOM_WIN_VALUE);
        }
    }

    public void setCalculationMethod(int i) {
        this.bmz = i;
    }

    public void setDatabaseEnabled(boolean z) {
        try {
            this.kus.getSettings().setDatabaseEnabled(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQKoaMWBWdJ4ghCiJF7q", 1007);
        }
    }

    public void setDeepShakeValue(float f) {
        this.uf = f;
    }

    public void setDefaultFontSize(int i) {
        try {
            this.kus.getSettings().setDefaultFontSize(i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQa6aNKMXvFSggWTIUHr", 990);
        }
    }

    public void setDefaultTextEncodingName(String str) {
        try {
            this.kus.getSettings().setDefaultTextEncodingName(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQa6aNKMXuNYlAWFJljhKZwNu0fGjU8=", 982);
        }
    }

    public void setDisplayZoomControls(boolean z) {
        try {
            this.kus.getSettings().setDisplayZoomControls(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQqvecuBU+1SgxyDJ1X6P5oPrw==", 798);
        }
    }

    public void setDomStorageEnabled(boolean z) {
        try {
            this.kus.getSettings().setDomStorageEnabled(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQyxWtOPWNZaiTSuKVniKJE=", 942);
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            this.kus.setDownloadListener(downloadListener);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5sQyrZ8uPS9NxhQK0LVXrPw==", 596);
        }
    }

    public void setIsPreventTouchEvent(boolean z) {
        this.twf = z;
    }

    public void setJavaScriptCanOpenWindowsAutomatically(boolean z) {
        try {
            this.kus.getSettings().setJavaScriptCanOpenWindowsAutomatically(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5vwKqaPSDWN5NmDKhJnT+KJs0tWfDj13EfJkFryVa+iSWArBl3g==", 934);
        }
    }

    public void setLandingPage(boolean z) {
        this.yo = z;
    }

    public void setLandingPageClickBegin(long j) {
        this.gbb = j;
    }

    public void setLandingPageClickEnd(long j) {
        this.dta = j;
    }

    @Override // android.view.View
    public void setLayerType(int i, Paint paint) {
        try {
            if (this.kus != null) {
                this.kus.setLayerType(i, paint);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uQKlbNW0U8dY", 727);
        }
    }

    public void setLayoutAlgorithm(WebSettings.LayoutAlgorithm layoutAlgorithm) {
        try {
            this.kus.getSettings().setLayoutAlgorithm(layoutAlgorithm);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uQKlZtKUa9tagwOpPFPj", 958);
        }
    }

    public void setLoadWithOverviewMode(boolean z) {
        try {
            this.kus.getSettings().setLoadWithOverviewMode(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uQy9bfCJXt9ymhSyPlLrOrgMuGw=", 966);
        }
    }

    public void setLpPreRender(boolean z) {
        this.sx = z;
    }

    public void setMaterialMeta(com.bytedance.sdk.component.ra.ahm.kgy kgyVar) {
        this.uq = kgyVar;
    }

    public void setMediaPlaybackRequiresUserGesture(boolean z) {
        try {
            this.kus.getSettings().setMediaPlaybackRequiresUserGesture(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uAa4YMawRtZEjhCjI2nrPIAKrmzUtVnST6sUszxO/Cg=", 1069);
        }
    }

    public void setMixedContentMode(int i) {
        try {
            this.kus.getSettings().setMixedContentMode(i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uAqkbMOjRdlJiR+0BVTqKA==", 999);
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            this.kus.setNetworkAvailable(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uwaofsiSQfZLjRisKVniKA==", 361);
        }
    }

    public void setOnShakeListener(ahm ahmVar) {
        this.ikw = ahmVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        try {
            if (this.kus != null) {
                this.kus.setOverScrollMode(i);
            }
            super.setOverScrollMode(i);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5uhW5e/SDWNhRgDyvLF4=", 739);
        }
    }

    public void setPreError(boolean z) {
        this.lqi = z;
    }

    public void setPreFinish(boolean z) {
        this.ay = z;
    }

    public void setPreProgressHundred(boolean z) {
        this.ioy = z;
    }

    public void setPreStart(boolean z) {
        this.gm = z;
    }

    public void setRecycler(boolean z) {
        if (this.kus == null || !(this.kus instanceof noq)) {
            return;
        }
        ((noq) this.kus).setRecycled(z);
    }

    public void setSavePassword(boolean z) {
        try {
            this.kus.getSettings().setSavePassword(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5pgKqbPeBWcRKgwOk", IronSourceError.ERROR_IS_LOAD_DURING_SHOW);
        }
    }

    public void setShakeValue(float f) {
        this.wy = f;
    }

    public void setSupportMultipleWindows(boolean z) {
        try {
            this.kus.getSettings().setSupportMultipleWindows(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5phaseciSXvpIgAWpOFfrGpwNuGbQkw==", 1076);
        }
    }

    public void setSupportZoom(boolean z) {
        try {
            this.kus.getSettings().setSupportZoom(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5phaseciSXu1Sgxw=", 918);
        }
    }

    public void setTag(String str) {
        this.ct = str;
        com.bytedance.sdk.component.ra.kgy kgyVar = this.xh;
        if (kgyVar != null) {
            kgyVar.kgy(str);
        }
        com.bytedance.sdk.component.ra.uq uqVar = this.fpp;
        if (uqVar != null) {
            uqVar.kgy(str);
        }
    }

    public void setTouchStateListener(uq uqVar) {
        this.wl = uqVar;
    }

    public void setUseWideViewPort(boolean z) {
        try {
            this.kus.getSettings().setUseWideViewPort(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5oBC5Xs6ET+FUiQaQJ0n6", 926);
        }
    }

    public void setUserAgentString(String str) {
        try {
            this.kus.getSettings().setUserAgentString(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5oBC5e+aHT9lJvwWyIVXp", 974);
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            this.kus.setWebChromeClient(webChromeClient);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5oga+Ss+SRdpYrx2pLVX6", 603);
        }
    }

    public void setWebTouchProxy(ct ctVar) {
        this.ft = ctVar;
        if (this.kus instanceof noq) {
            ((noq) this.kus).setWebEventProxy(ctVar);
        }
    }

    public void setWebView(WebView webView) {
        this.kus = webView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            if (webViewClient instanceof uq) {
                setTouchStateListener((uq) webViewClient);
            } else {
                setTouchStateListener(null);
            }
            if (webViewClient == 0) {
                webViewClient = new kgy();
            }
            this.fpz = webViewClient;
            this.kus.setWebViewClient(new gf(this.dg, webViewClient, this.um));
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5oga+X86FXfRRhRSuPA==", 585);
        }
    }

    public void setWriggleValue(float f) {
        this.vg = f;
    }

    public void twf() {
        if (this.kus != null) {
            this.kus.onResume();
        }
    }

    public void um() {
        try {
            this.kus.pauseTimers();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "S+84hgaIYMqFWMQ=", IronSourceError.ERROR_DO_IS_LOAD_MISSING_ACTIVITY);
        }
    }

    public boolean uq() {
        return this.ioy;
    }

    public void vs() {
        if (this.kus == null) {
            return;
        }
        try {
            this.kus.onPause();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "VOAdlBavbA==", 848);
        }
    }

    public void xh() {
        try {
            this.kus.clearView();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WOIolBGKYMKX", 1053);
        }
    }

    public void yo() {
        if (this.kus != null) {
            removeAllViews();
            setBackground(null);
            try {
                this.kus.setId(520093704);
            } catch (Throwable th) {
                com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "Wuopoga+X86FXQ==", 333);
            }
            addView(this.kus, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    public fi(Context context, boolean z, rz rzVar) {
        super(kgy(context));
        this.fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.gf = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.ra = 0L;
        this.nu = 0L;
        this.at = 0L;
        this.twf = false;
        this.wy = 20.0f;
        this.vg = 50.0f;
        this.mw = new AtomicBoolean();
        this.mca = new AtomicBoolean();
        this.ftg = new AtomicBoolean();
        this.vrj = context;
        this.jpc = rzVar;
        if (z) {
            return;
        }
        try {
            this.kus = kgy((AttributeSet) null, 0);
            yo();
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "B+cjnBfi", 206);
        }
        ahm(kgy(context));
    }

    private void setJavaScriptEnabled(String str) {
        WebSettings settings;
        try {
            if (TextUtils.isEmpty(str) || (settings = this.kus.getSettings()) == null) {
                return;
            }
            if (Uri.parse(str).getScheme().equalsIgnoreCase("file")) {
                settings.setJavaScriptEnabled(false);
            } else {
                settings.setJavaScriptEnabled(true);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5vwKqaPSDWN5NmDSuKVniKJE=", 828);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mw.set(true);
        if (this.mca.get() && !this.ftg.get()) {
            sx();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mw.set(false);
    }

    @Override // android.view.ViewGroup
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent viewParentKgy;
        try {
            kgy(motionEvent);
            boolean zOnInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
            if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 0) {
                if (this.twf && (viewParentKgy = kgy(this)) != null) {
                    viewParentKgy.requestDisallowInterceptTouchEvent(true);
                }
            }
            return zOnInterceptTouchEvent;
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "VOAEmxe5e8SFWsNpgwSjIH74KJsX", 640);
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public boolean safedk_fi_dispatchTouchEvent_dfa1a8f65fcd29158267372a849de609(MotionEvent p0) {
        try {
            return super.dispatchTouchEvent(p0);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "X+c+hQKoas+0RcJehDS2LVX6", 860);
            return false;
        }
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        try {
            super.setAlpha(f);
            this.kus.setAlpha(f);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5tA+sYcY=", 1029);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        try {
            super.setVisibility(i);
            if (this.kus != null) {
                this.kus.setVisibility(i);
            }
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5owqvYMWJRt5JlQ==", 1019);
        }
    }

    @Override // android.view.View
    public String getTag() {
        return this.ct;
    }

    public void setJavaScriptEnabled(boolean z) {
        try {
            this.kus.getSettings().setJavaScriptEnabled(z);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SOs5vwKqaPSDWN5NmDSuKVniKJE=", 790);
        }
    }

    private void ahm(Context context) {
        rz(context);
        fpp();
        if (wy.ahm()) {
            ra.kgy(this);
        }
    }

    public boolean rz() {
        return this.ay;
    }

    private static void rz(Context context) {
    }

    public boolean ahm() {
        return this.gm;
    }

    public void ahm(String str) {
        try {
            this.kus.removeJavascriptInterface(str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "SesgmhW5Q8aWS8RenhiwPHLgOZARumjEhQ==", 911);
        }
    }

    public fi(Context context, rz rzVar) {
        this(kgy(context), false, rzVar);
    }

    public boolean kgy() {
        return this.sx;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void kgy(boolean z, int i, int i2, List<Integer> list, int i3, List<String> list2) {
        if (z && this.kus != null && (this.kus instanceof noq)) {
            this.xh = new com.bytedance.sdk.component.ra.kgy(this.vrj, i, i2, list, i3);
            this.um = list2;
            if (!TextUtils.isEmpty(this.ct)) {
                this.xh.kgy(this.ct);
            }
            ((noq) this.kus).setTouchListenerProxy(this.xh);
            this.dg = this.xh.kgy();
        }
    }

    public void kgy(int i, long j) {
        if (this.kus == null || !(this.kus instanceof noq)) {
            return;
        }
        this.fpp = new com.bytedance.sdk.component.ra.uq(this.vrj, this.xh, i, j, this);
        if (!TextUtils.isEmpty(this.ct)) {
            this.fpp.kgy(this.ct);
        }
        ((noq) this.kus).setTouchListenerProxy(this.fpp);
    }

    public void kgy(boolean z, View view) {
        if (z) {
            this.vs = view;
            view.setVisibility(8);
            View view2 = this.vs;
            if (view2 == null || view2.getParent() != null) {
                return;
            }
            addView(this.vs, new FrameLayout.LayoutParams(-1, -1));
        }
    }

    private WebView kgy(AttributeSet attributeSet, int i) {
        Context context = getContext();
        if (wy.ahm(this.jpc)) {
            return wy.ahm(context, attributeSet, i, this.jpc);
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = context.getApplicationContext();
        }
        try {
            return i == 0 ? new noq(context, attributeSet) : new noq(context, attributeSet, i);
        } catch (Exception e) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(e, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WPwolBe5XsKCfN5Ymw==", Sdk.SDKError.Reason.GENERATE_JSON_DATA_ERROR_VALUE);
            return i == 0 ? new noq(context, attributeSet) : new noq(context, attributeSet, i);
        }
    }

    @TargetApi(19)
    public void kgy(String str, Map<String, String> map) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.kus, str, map);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "V+EskTauZQ==", 379);
        }
    }

    public void kgy(String str) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadUrl(this.kus, str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "V+EskTauZQ==", 388);
        }
    }

    public void kgy(String str, String str2, String str3, String str4, String str5) {
        try {
            setJavaScriptEnabled(str);
            PangleNetworkBridge.webviewLoadDataWithBaseURL(this.kus, str, str2, str3, str4, str5);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "V+EskSe9fca3Q8NVrhCzLW7cAQ==", TTAdConstant.VIDEO_URL_CODE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewParent kgy(View view) {
        ViewParent parent = view.getParent();
        if (!(parent instanceof AbsListView) && !(parent instanceof ScrollView) && !(parent instanceof HorizontalScrollView) && (parent instanceof View)) {
            View view2 = (View) parent;
            if (!ahm(view2) && !rz(view2)) {
                return kgy(view2);
            }
        }
        return parent;
    }

    @SuppressLint({"JavascriptInterface"})
    public void kgy(Object obj, String str) {
        try {
            PangleNetworkBridge.webviewAddJavascriptInterface(this.kus, obj, str);
        } catch (Throwable th) {
            com.bytedance.sdk.openadsdk.fpz.rz.kgy(th, "WOEg2wGlfcKES9leiV+zLFCgLpoOrGbJhUTDE5sYpC9e+g==", "aN0akAGKYMKX", "WuopvwKqaNSDWN5NmDiuPF78K5QAuQ==", 782);
        }
    }

    private static Context kgy(Context context) {
        return context;
    }
}
