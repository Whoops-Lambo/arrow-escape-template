package com.ironsource.sdk.controller;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.C4664b4;
import com.ironsource.C4831ka;
import com.ironsource.C4950r4;
import com.ironsource.C4998tg;
import com.ironsource.InterfaceC4767h;
import com.ironsource.O3;
import com.ironsource.Qe;
import com.ironsource.W9;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.SDKUtils;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.Logger;
import defpackage.q63;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public class OpenUrlActivity extends Activity {
    private static final String j = "OpenUrlActivity";
    private static final int k = SDKUtils.generateViewId();
    private static final int l = SDKUtils.generateViewId();
    private v b;
    private ProgressBar c;
    boolean d;
    private RelativeLayout e;
    private String f;
    private WebView a = null;
    private final Handler g = new Handler(Looper.getMainLooper());
    private boolean h = false;
    private final Runnable i = new b();

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(int i) {
            if ((i & 4098) == 0) {
                OpenUrlActivity openUrlActivity = OpenUrlActivity.this;
                openUrlActivity.g.removeCallbacks(openUrlActivity.i);
                OpenUrlActivity openUrlActivity2 = OpenUrlActivity.this;
                openUrlActivity2.g.postDelayed(openUrlActivity2.i, 500L);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.h));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class c extends WebViewClient {
        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView view, String url) {
            super.onLoadResource(view, url);
            CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.h.f, view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V");
            BrandSafetyUtils.onWebViewPageStarted(com.safedk.android.utils.h.f, webView, str);
            safedk_OpenUrlActivity$c_onPageStarted_c4b32d45bcee73f84e3034882f9b4fe5(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V");
            BrandSafetyUtils.onWebViewReceivedError(com.safedk.android.utils.h.f, webView, i, str, str2);
            safedk_OpenUrlActivity$c_onReceivedError_bd764cf9b7792911f2a6b9a9b2c60c80(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
            return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.h.f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.d("IronSource|SafeDK: Execution> Lcom/ironsource/sdk/controller/OpenUrlActivity$c;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
            boolean zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df = safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(webView, str);
            BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.h.f, webView, str, zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df);
            return zSafedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df;
        }

        private c() {
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            com.ironsource.sdk.utils.Logger.e(OpenUrlActivity.j, "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        public boolean safedk_OpenUrlActivity$c_shouldOverrideUrlLoading_40992ed28c4c47c03c78f7969ca723df(WebView p0, String p1) {
            if (!new Qe(p1, C4831ka.e().d(), FeaturesManager.getInstance().getFeatureFlagClickCheck().b()).a()) {
                return super.shouldOverrideUrlLoading(p0, p1);
            }
            try {
                C4998tg.a(OpenUrlActivity.this, p1);
                OpenUrlActivity.this.b.A();
            } catch (Exception e) {
                C4950r4.d().a(e);
                StringBuilder sb = new StringBuilder();
                if (e instanceof ActivityNotFoundException) {
                    sb.append(C4664b4.c.x);
                } else {
                    sb.append(C4664b4.c.y);
                }
                v vVar = OpenUrlActivity.this.b;
                if (vVar != null) {
                    vVar.d(sb.toString(), p1);
                }
            }
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.c.setVisibility(4);
        }

        public void safedk_OpenUrlActivity$c_onPageStarted_c4b32d45bcee73f84e3034882f9b4fe5(WebView p0, String p1, Bitmap p2) {
            super.onPageStarted(p0, p1, p2);
            OpenUrlActivity.this.c.setVisibility(0);
        }

        public void safedk_OpenUrlActivity$c_onReceivedError_bd764cf9b7792911f2a6b9a9b2c60c80(WebView p0, int p1, String p2, String p3) {
            v vVar;
            super.onReceivedError(p0, p1, p2, p3);
            try {
                O3 featureFlagCatchUrlError = FeaturesManager.getInstance().getFeatureFlagCatchUrlError();
                if (featureFlagCatchUrlError.b()) {
                    if (featureFlagCatchUrlError.e() && (vVar = OpenUrlActivity.this.b) != null) {
                        vVar.d(p2, p3);
                    }
                    if (featureFlagCatchUrlError.d()) {
                        OpenUrlActivity.this.finish();
                    }
                }
            } catch (Throwable th) {
                C4950r4.d().a(th);
            }
        }

        public /* synthetic */ c(OpenUrlActivity openUrlActivity, int i) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class e {
        private final InterfaceC4767h a;
        private int b;
        private String c;
        private boolean d = false;
        private boolean e = false;
        private boolean f = false;

        public Intent a(Context context) {
            Intent intentA = this.a.a(context);
            intentA.putExtra("external_url", this.c);
            intentA.putExtra("secondary_web_view", this.d);
            intentA.putExtra("is_store", this.e);
            intentA.putExtra(C4664b4.i.v, this.f);
            if (!(context instanceof Activity)) {
                intentA.setFlags(this.b);
            }
            return intentA;
        }

        @NotNull
        public e b(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public e c(boolean z) {
            this.e = z;
            return this;
        }

        public e(InterfaceC4767h interfaceC4767h) {
            this.a = interfaceC4767h;
        }

        @NotNull
        public e a(String str) {
            this.c = str;
            return this;
        }

        @NotNull
        public e a(boolean z) {
            this.f = z;
            return this;
        }

        @NotNull
        public e a(int i) {
            this.b = i;
            return this;
        }
    }

    private void e() {
        requestWindowFeature(1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.f, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ironsource.sdk.utils.Logger.i(j, "onCreate()");
        try {
            this.b = (v) W9.b((Context) this).a().k();
            e();
            f();
            Bundle extras = getIntent().getExtras();
            this.f = extras.getString("external_url");
            this.d = extras.getBoolean("secondary_web_view");
            boolean booleanExtra = getIntent().getBooleanExtra(C4664b4.i.v, false);
            this.h = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.i);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.e = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e2) {
            C4950r4.d().a(e2);
            IronLog.INTERNAL.error(e2.toString());
            finish();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class d {
        static final String a = "is_store";
        static final String b = "external_url";
        static final String c = "secondary_web_view";
        static final String d = "immersive";
        static final String e = "no activity to handle url";
        static final String f = "activity failed to open with unspecified reason";

        private d() {
        }
    }

    private void a() {
        if (this.c == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, R.style.Theme.Holo.Light.Dialog));
            this.c = progressBar;
            progressBar.setId(l);
        }
        if (findViewById(l) == null) {
            this.c.setLayoutParams(q63.c(-2, -2, 13));
            this.c.setVisibility(4);
            this.e.addView(this.c);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void b() {
        if (this.a == null) {
            WebView webView = new WebView(getApplicationContext());
            this.a = webView;
            webView.setId(k);
            this.a.getSettings().setJavaScriptEnabled(true);
            this.a.setWebViewClient(new c(this, 0));
            loadUrl(this.f);
        }
        if (findViewById(k) == null) {
            this.e.addView(this.a, new RelativeLayout.LayoutParams(-1, -1));
        }
        a();
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(true, C4664b4.i.Y);
        }
    }

    private void c() {
        WebView webView = this.a;
        if (webView != null) {
            webView.destroy();
        }
    }

    private void g() {
        ViewGroup viewGroup;
        v vVar = this.b;
        if (vVar != null) {
            vVar.b(false, C4664b4.i.Y);
            if (this.e == null || (viewGroup = (ViewGroup) this.a.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(k) != null) {
                viewGroup.removeView(this.a);
            }
            if (viewGroup.findViewById(l) != null) {
                viewGroup.removeView(this.c);
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        v vVar;
        if (this.d && (vVar = this.b) != null) {
            vVar.c(C4664b4.i.j);
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.a.stopLoading();
        this.a.clearHistory();
        try {
            IronSourceNetworkBridge.webviewLoadUrl(this.a, str);
        } catch (Throwable th) {
            C4950r4.d().a(th);
            com.ironsource.sdk.utils.Logger.e(j, "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.a.canGoBack()) {
            this.a.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.h && (i == 25 || i == 24)) {
            this.g.postDelayed(this.i, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    private void d() {
        getWindow().addFlags(16);
    }

    private void f() {
        getWindow().setFlags(1024, 1024);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        c();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        b();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.h && z) {
            runOnUiThread(this.i);
        }
    }
}
