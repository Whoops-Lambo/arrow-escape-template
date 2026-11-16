package com.vungle.ads.internal.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.C4664b4;
import com.ironsource.R6;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.VungleError;
import com.vungle.ads.WebViewRenderingProcessGone;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.x;
import defpackage.eu;
import defpackage.gd1;
import defpackage.h50;
import defpackage.ia1;
import defpackage.kf3;
import defpackage.kk2;
import defpackage.n30;
import defpackage.ni0;
import defpackage.s71;
import defpackage.uj2;
import defpackage.vf3;
import defpackage.zu0;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class x extends WebViewClient implements com.vungle.ads.internal.util.v {
    public final i0 a;
    public final j3 b;
    public final ExecutorService c;
    public final com.vungle.ads.internal.platform.f d;
    public final com.vungle.ads.internal.load.f e;
    public final Long f;
    public final gd1 g;
    public boolean h;
    public String i;
    public String j;
    public String k;
    public String l;
    public WebView m;
    public boolean n;
    public com.vungle.ads.internal.ui.view.n o;
    public com.vungle.ads.internal.ui.view.o p;
    public com.vungle.ads.internal.omsdk.f q;
    public Boolean r;

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.d, view, url);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/x;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.d, webView, i, str, str2);
        safedk_x_onReceivedError_94021fc7ca54459e8f1f69d888df0e28(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/x;->onReceivedError(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;Landroid/webkit/WebResourceError;)V");
        BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.d, webView, webResourceRequest, webResourceError);
        safedk_x_onReceivedError_a76df87d9620e9c195ca619c0badebdb(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.m = null;
        if (Build.VERSION.SDK_INT < 26) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new t(webView));
            com.vungle.ads.internal.ui.view.o oVar = this.p;
            if (oVar != null) {
                ((com.vungle.ads.internal.presenter.r) oVar).a((VungleError) new WebViewRenderingProcessGone("didCrash=true"), true, (String) null);
                return true;
            }
        } else {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", new u(webView, renderProcessGoneDetail));
            com.vungle.ads.internal.ui.view.o oVar2 = this.p;
            if (oVar2 != null) {
                Boolean boolValueOf = renderProcessGoneDetail != null ? Boolean.valueOf(renderProcessGoneDetail.didCrash()) : null;
                com.vungle.ads.internal.presenter.r rVar = (com.vungle.ads.internal.presenter.r) oVar2;
                boolean zBooleanValue = boolValueOf != null ? boolValueOf.booleanValue() : true;
                rVar.a(new WebViewRenderingProcessGone(h50.j("didCrash=", zBooleanValue)), zBooleanValue, (String) null);
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.d, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/x;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z");
        boolean zSafedk_x_shouldOverrideUrlLoading_d259e078f790d7a26969e92f812a5f06 = safedk_x_shouldOverrideUrlLoading_d259e078f790d7a26969e92f812a5f06(webView, webResourceRequest);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.d, webView, webResourceRequest, zSafedk_x_shouldOverrideUrlLoading_d259e078f790d7a26969e92f812a5f06);
        return zSafedk_x_shouldOverrideUrlLoading_d259e078f790d7a26969e92f812a5f06;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("LiftoffMonetize|SafeDK: Execution> Lcom/vungle/ads/internal/ui/x;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_x_shouldOverrideUrlLoading_b1ce05df79a8dcccb16cfd2920efee4a = safedk_x_shouldOverrideUrlLoading_b1ce05df79a8dcccb16cfd2920efee4a(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.d, webView, str, zSafedk_x_shouldOverrideUrlLoading_b1ce05df79a8dcccb16cfd2920efee4a);
        return zSafedk_x_shouldOverrideUrlLoading_b1ce05df79a8dcccb16cfd2920efee4a;
    }

    public boolean safedk_x_shouldOverrideUrlLoading_d259e078f790d7a26969e92f812a5f06(WebView p0, WebResourceRequest p1) {
        Uri url;
        return a(p0, (p1 == null || (url = p1.getUrl()) == null) ? null : url.toString(), p1 != null ? p1.isForMainFrame() : true);
    }

    public x(i0 i0Var, j3 j3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar, com.vungle.ads.internal.load.f fVar2, Long l) {
        i0Var.getClass();
        j3Var.getClass();
        executorService.getClass();
        this.a = i0Var;
        this.b = j3Var;
        this.c = executorService;
        this.d = fVar;
        this.e = fVar2;
        this.f = l;
        this.g = eu.w(p.a);
    }

    public static final void a(boolean z, x xVar) {
        xVar.getClass();
        zu0 zu0Var = new zu0(1);
        uj2.k(zu0Var, "placementType", xVar.a.D());
        Boolean bool = xVar.r;
        if (bool != null) {
            uj2.j(zu0Var, C4664b4.i.o, bool);
        }
        uj2.k(zu0Var, R6.F, "android");
        uj2.k(zu0Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
        uj2.j(zu0Var, "incentivized", Boolean.valueOf(xVar.b.j()));
        com.vungle.ads.internal.platform.f fVar = xVar.d;
        if (fVar != null) {
            uj2.j(zu0Var, "isSilent", Boolean.valueOf(((com.vungle.ads.internal.platform.c) fVar).n()));
        }
        Long l = xVar.f;
        LinkedHashMap linkedHashMap = zu0Var.a;
        if (l != null) {
            kotlinx.serialization.json.d dVarB = ia1.b(l);
            dVarB.getClass();
        }
        if (xVar.h) {
            uj2.j(zu0Var, "consentRequired", Boolean.TRUE);
            uj2.k(zu0Var, "consentTitleText", xVar.i);
            uj2.k(zu0Var, "consentBodyText", xVar.j);
            uj2.k(zu0Var, "consentAcceptButtonText", xVar.k);
            uj2.k(zu0Var, "consentDenyButtonText", xVar.l);
        } else {
            uj2.j(zu0Var, "consentRequired", Boolean.FALSE);
        }
        uj2.k(zu0Var, "sdkVersion", BuildConfig.VERSION_NAME);
        String str = "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ',' + z + ')';
        WebView webView = xVar.m;
        if (webView != null) {
            xVar.a(webView, str);
        }
    }

    public static final void c(x xVar, WebView webView) throws Throwable {
        xVar.getClass();
        com.vungle.ads.internal.load.f fVar = xVar.e;
        if (fVar != null) {
            fVar.a();
        }
        xVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public final void b(boolean z) {
        this.r = Boolean.valueOf(z);
        WebView webView = this.m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kotlinx.serialization.json.d dVarA = ia1.a(Boolean.valueOf(z));
            dVarA.getClass();
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", s.a);
        if (webView != null) {
            this.m = webView;
            webView.setVisibility(0);
            a();
            if (Build.VERSION.SDK_INT >= 29) {
                webView.setWebViewRenderProcessClient(new o(this.p));
            }
            com.vungle.ads.internal.omsdk.f fVar = this.q;
            if (fVar != null) {
                ((com.vungle.ads.internal.omsdk.e) fVar).a(webView);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer numValueOf;
        boolean z;
        boolean zA;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri url = null;
        if (webResourceResponse != null) {
            numValueOf = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            numValueOf = null;
        }
        String strValueOf = String.valueOf(numValueOf);
        if (webResourceRequest != null) {
            url = webResourceRequest.getUrl();
        }
        String strValueOf2 = String.valueOf(url);
        boolean z2 = false;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Http Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
        if (strValueOf2.length() > 0) {
            zA = this.a.a(strValueOf2);
        } else {
            zA = false;
        }
        if (zA && z) {
            z2 = true;
        }
        String str = strValueOf2 + ' ' + strValueOf;
        com.vungle.ads.internal.ui.view.o oVar = this.p;
        if (oVar != null) {
            ((com.vungle.ads.internal.presenter.r) oVar).a(z2, str);
        }
    }

    public void safedk_x_onReceivedError_a76df87d9620e9c195ca619c0badebdb(WebView p0, WebResourceRequest p1, WebResourceError p2) {
        CharSequence description;
        boolean z;
        boolean zA;
        super.onReceivedError(p0, p1, p2);
        Uri url = null;
        if (p2 != null) {
            description = p2.getDescription();
        } else {
            description = null;
        }
        String strValueOf = String.valueOf(description);
        if (p1 != null) {
            url = p1.getUrl();
        }
        String strValueOf2 = String.valueOf(url);
        boolean z2 = false;
        if (p1 != null && p1.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.b("VungleWebClient", "Error desc " + strValueOf + ' ' + z + " for URL " + strValueOf2);
        if (strValueOf2.length() > 0) {
            zA = this.a.a(strValueOf2);
        } else {
            zA = false;
        }
        if (zA && z) {
            z2 = true;
        }
        String str = strValueOf2 + ' ' + strValueOf;
        com.vungle.ads.internal.ui.view.o oVar = this.p;
        if (oVar != null) {
            ((com.vungle.ads.internal.presenter.r) oVar).a(z2, str);
        }
    }

    public boolean safedk_x_shouldOverrideUrlLoading_b1ce05df79a8dcccb16cfd2920efee4a(WebView p0, String p1) {
        return a(p0, p1, true);
    }

    public /* synthetic */ x(i0 i0Var, j3 j3Var, ExecutorService executorService, com.vungle.ads.internal.platform.f fVar) {
        this(i0Var, j3Var, executorService, fVar, null, null);
    }

    public static final void b(x xVar, WebView webView) throws Throwable {
        xVar.getClass();
        com.vungle.ads.internal.load.f fVar = xVar.e;
        if (fVar != null) {
            fVar.b();
        }
        xVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
    }

    public void safedk_x_onReceivedError_94021fc7ca54459e8f1f69d888df0e28(WebView p0, int p1, String p2, String p3) {
        p2.getClass();
        p3.getClass();
        super.onReceivedError(p0, p1, p2, p3);
    }

    public final void a(int i) {
        ((com.vungle.ads.internal.util.j) this.g.getValue()).a(this.m, i, new q(this));
    }

    public final void a(boolean z, String str, String str2, String str3, String str4) {
        this.h = z;
        this.i = str;
        this.j = str2;
        this.k = str3;
        this.l = str4;
    }

    public final void a(com.vungle.ads.internal.ui.view.n nVar) {
        this.o = nVar;
    }

    public final boolean a(WebView webView, String str, boolean z) {
        boolean zA;
        String host;
        try {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID Command " + str + " mainFrame=" + z);
            if (str != null && str.length() != 0) {
                Uri uri = Uri.parse(str);
                uri.getClass();
                String scheme = uri.getScheme();
                if (scheme != null && scheme.length() != 0) {
                    if (!z) {
                        if (s71.b(scheme, "mraid")) {
                            host = uri.getHost();
                        } else if (!kk2.E(scheme, com.safedk.android.analytics.brandsafety.creatives.g.e, true) && !kk2.E(scheme, HttpRequest.DEFAULT_SCHEME, true)) {
                            host = "unknownScheme";
                        } else {
                            host = "openNonMraid";
                        }
                        if (host != null) {
                            com.vungle.ads.internal.ui.view.n nVar = this.o;
                            if (nVar != null) {
                                ((com.vungle.ads.internal.presenter.r) nVar).a(host, str);
                            }
                            return true;
                        }
                    }
                    if (s71.b(scheme, "mraid")) {
                        zA = a(webView, uri);
                    } else {
                        zA = (kk2.E(scheme, com.safedk.android.analytics.brandsafety.creatives.g.e, true) || kk2.E(scheme, HttpRequest.DEFAULT_SCHEME, true)) ? a(str) : false;
                    }
                    if (zA) {
                        return true;
                    }
                    com.vungle.ads.internal.util.t.a("VungleWebClient", new r(str));
                }
                return false;
            }
            com.vungle.ads.internal.util.t.b("VungleWebClient", "Invalid URL ");
            return false;
        } catch (Throwable th) {
            if (th instanceof OutOfMemoryError) {
                new OutOfMemory(com.iab.omid.library.vungle.d.a("mraid:", str)).logErrorNoReturnValue$vungle_ads_release();
            }
            return false;
        }
    }

    public static final void a(com.vungle.ads.internal.ui.view.n nVar, String str) {
        nVar.getClass();
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kotlinx.serialization.json.d dVarC = ia1.c(str);
        dVarC.getClass();
        ((com.vungle.ads.internal.presenter.r) nVar).a("openNonMraid", new kotlinx.serialization.json.c(linkedHashMap));
    }

    public static final void a(com.vungle.ads.internal.ui.view.n nVar, String str, x xVar, WebView webView, Uri uri) {
        nVar.getClass();
        str.getClass();
        xVar.getClass();
        uri.getClass();
        try {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str2 : uri.getQueryParameterNames()) {
                    str2.getClass();
                    kotlinx.serialization.json.d dVarC = ia1.c(uri.getQueryParameter(str2));
                    dVarC.getClass();
                }
                ((com.vungle.ads.internal.presenter.r) nVar).a(str, new kotlinx.serialization.json.c(linkedHashMap));
            } catch (Exception e) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("VungleWebClient", "MRAID command failed", e);
            }
        } finally {
            xVar.a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        }
    }

    public final boolean a(final WebView webView, Uri uri) {
        String host = uri.getHost();
        final int i = 0;
        if (host == null) {
            return false;
        }
        int iHashCode = host.hashCode();
        final int i2 = 1;
        if (iHashCode != -1943542072) {
            if (iHashCode != 88409791) {
                if (iHashCode == 119543762 && host.equals("readyToPlay")) {
                    this.c.execute(new Runnable(this) { // from class: li3
                        public final /* synthetic */ x b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
                            int i3 = i;
                            WebView webView2 = webView;
                            x xVar = this.b;
                            switch (i3) {
                                case 0:
                                    x.b(xVar, webView2);
                                    break;
                                case 1:
                                    x.c(xVar, webView2);
                                    break;
                                default:
                                    x.a(xVar, webView2);
                                    break;
                            }
                        }
                    });
                    return true;
                }
            } else if (host.equals("failToLoad")) {
                this.c.execute(new Runnable(this) { // from class: li3
                    public final /* synthetic */ x b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        int i3 = i2;
                        WebView webView2 = webView;
                        x xVar = this.b;
                        switch (i3) {
                            case 0:
                                x.b(xVar, webView2);
                                break;
                            case 1:
                                x.c(xVar, webView2);
                                break;
                            default:
                                x.a(xVar, webView2);
                                break;
                        }
                    }
                });
                return true;
            }
        } else if (host.equals("propertiesChangeCompleted")) {
            if (!this.n) {
                this.n = true;
                final int i3 = 2;
                this.c.execute(new Runnable(this) { // from class: li3
                    public final /* synthetic */ x b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        int i4 = i3;
                        WebView webView2 = webView;
                        x xVar = this.b;
                        switch (i4) {
                            case 0:
                                x.b(xVar, webView2);
                                break;
                            case 1:
                                x.c(xVar, webView2);
                                break;
                            default:
                                x.a(xVar, webView2);
                                break;
                        }
                    }
                });
            }
            return true;
        }
        a(webView, uri, host);
        return true;
    }

    public static final void a(x xVar, WebView webView) {
        xVar.getClass();
        xVar.a(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + xVar.a.g() + ')');
    }

    public final void a(WebView webView, Uri uri, String str) {
        com.vungle.ads.internal.ui.view.n nVar = this.o;
        if (nVar == null) {
            a(webView, "window.vungle.mraidBridge.notifyCommandComplete()");
        } else {
            this.c.execute(new ni0(nVar, str, this, webView, uri, 14));
        }
    }

    public final boolean a(String str) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Open URL" + str);
        com.vungle.ads.internal.ui.view.n nVar = this.o;
        if (nVar == null) {
            return true;
        }
        this.c.execute(new kf3(21, nVar, str));
        return true;
    }

    public final void a() {
        this.c.execute(new vf3(this, 9));
    }

    public final void a(long j, long j2) {
        WebView webView = this.m;
        if (webView != null) {
            StringBuilder sb = new StringBuilder("window.vungle.mraidBridgeExt.notifyAvailableDiskSpace(");
            sb.append(j);
            sb.append('+');
            a(webView, n30.o(sb, j2, ')'));
        }
    }

    public final void a(String str, int i) {
        str.getClass();
        WebView webView = this.m;
        if (webView != null) {
            a(webView, "window.vungle.mraidBridgeExt.notifyBlackScreenResult(" + i + ')');
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", "Returning black screen result: " + i + '%');
        if (i >= 0) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.BLACK_SCREEN_IS_DETECTED, i, this.a.q(), null, 8);
        } else {
            AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR, str, this.a.q());
        }
    }

    @Override // com.vungle.ads.internal.util.v
    public final void a(boolean z) {
        WebView webView = this.m;
        if (webView != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            kotlinx.serialization.json.d dVarA = ia1.a(Boolean.valueOf(z));
            dVarA.getClass();
            a(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + new kotlinx.serialization.json.c(linkedHashMap) + ')');
        }
    }

    public final void a(com.vungle.ads.internal.ui.view.o oVar) {
        oVar.getClass();
        this.p = oVar;
    }

    public final void a(com.vungle.ads.internal.omsdk.e eVar) {
        this.q = eVar;
    }

    public final void a(WebView webView, String str) {
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleWebClient", new v(str));
        Handler handler = com.vungle.ads.internal.util.y.a;
        com.vungle.ads.internal.util.y.a(new w(this, webView, str));
    }
}
