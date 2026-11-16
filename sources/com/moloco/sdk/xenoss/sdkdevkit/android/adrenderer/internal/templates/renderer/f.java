package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.explorestack.protobuf.z;
import com.moloco.sdk.internal.MolocoLogger;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dn;
import defpackage.dz;
import defpackage.e32;
import defpackage.er;
import defpackage.eu;
import defpackage.fy;
import defpackage.kc2;
import defpackage.l22;
import defpackage.ox;
import defpackage.qb5;
import defpackage.vi2;
import defpackage.wg1;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.xi2;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends WebView {
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f a;
    public final com.moloco.sdk.acm.recorder.c b;
    public final j c;
    public final dn d;
    public final xi2 e;
    public final l22 f;
    public final l22 g;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.h.D, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public f(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f fVar2, com.moloco.sdk.acm.recorder.c cVar, boolean z) {
        j jVar = new j(fVar, cVar, z);
        super(context);
        this.a = fVar2;
        this.b = cVar;
        this.c = jVar;
        ba0 ba0Var = xc0.a;
        this.d = kc2.a(wg1.a);
        this.e = qb5.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a());
        setWebViewClient(jVar);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f = jVar.j;
        this.g = jVar.h;
    }

    public final String b() {
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                PackageInfo currentWebViewPackage = WebView.getCurrentWebViewPackage();
                if (currentWebViewPackage != null && (str = currentWebViewPackage.versionName) != null) {
                    return str;
                }
            } else {
                PackageManager packageManager = getContext().getPackageManager();
                for (String str2 : eu.z("com.google.android.webview", "com.android.webview", "com.android.chrome")) {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Pre-O, legacy webview version: " + str2 + " → " + packageInfo.versionName, null, false, 12, null);
                    String str3 = packageInfo.versionName;
                    str3.getClass();
                    if (str3.length() > 0) {
                        String str4 = packageInfo.versionName;
                        str4.getClass();
                        return str4;
                    }
                }
            }
            return "unknown";
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "WebView version retrieval exception", e, false, 8, null);
            return "unknown";
        }
    }

    @NotNull
    public final vi2 getOrientation$moloco_sdk_release() {
        return this.e;
    }

    @NotNull
    public final vi2 getUnrecoverableError() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(f fVar, a aVar, fy fyVar) throws Throwable {
        c cVar;
        String str;
        fVar.getClass();
        if (fyVar instanceof c) {
            cVar = (c) fyVar;
            int i = cVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.v = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar, fyVar);
            }
        } else {
            cVar = new c(fVar, fyVar);
        }
        Object objA = cVar.t;
        int i2 = cVar.v;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    aVar = cVar.s;
                    fVar = cVar.r;
                    wz2.a0(objA);
                } else {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                wz2.a0(objA);
                m mVar = m.a;
                float f = aVar.c;
                cVar.r = fVar;
                cVar.s = aVar;
                cVar.v = 1;
                objA = mVar.a(fVar, f, cVar);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            }
            if (((Boolean) objA).booleanValue()) {
                str = "black";
            } else {
                str = "rendered";
            }
        } catch (CancellationException unused) {
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "Creative rendering check failed to sample WebView", e, false, 8, null);
            str = "capture_failed";
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Black screen creative rendering check: result=".concat(str), null, false, 12, null);
        String strB = fVar.b();
        com.moloco.sdk.acm.recorder.c cVar2 = fVar.b;
        com.moloco.sdk.acm.e eVarN = z.n("creative_rendering_check", "result", str);
        eVarN.a("creative_type", aVar.b);
        eVarN.a("webview_version", strB);
        cVar2.a(eVarN);
        try {
            String string = new JSONObject().put("result", str).put("webview_version", strB).toString();
            string.getClass();
            byte[] bytes = string.getBytes(er.a);
            bytes.getClass();
            ((com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.k) com.moloco.sdk.service_locator.j.b()).a(aVar.a, bytes, ox.a, null);
        } catch (Exception e2) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, "TemplateWebView", "Creative rendering check URL fire failed", e2, false, 8, null);
        }
        return az2.a;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ViewGroup viewGroup;
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "onDetachedFromWindow called, cancelling viewScope", null, false, 12, null);
        kc2.g(this.d, null);
    }
}
