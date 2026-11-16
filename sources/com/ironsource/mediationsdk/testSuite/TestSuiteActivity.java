package com.ironsource.mediationsdk.testSuite;

import android.app.Activity;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import com.ironsource.C4694cg;
import com.ironsource.C4950r4;
import com.ironsource.Of;
import com.ironsource.W8;
import com.ironsource.Xf;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import com.safedk.android.utils.h;
import defpackage.s71;
import defpackage.so2;
import defpackage.to2;
import defpackage.uo2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class TestSuiteActivity extends Activity implements W8 {
    private RelativeLayout a;
    private C4694cg b;
    private Xf c;

    @Nullable
    private OnBackInvokedCallback d;

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, h.f, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.a = relativeLayout;
        setContentView(relativeLayout, e());
        g();
        C4694cg c4694cg = new C4694cg(this, this, d(), c());
        this.b = c4694cg;
        Xf xf = new Xf(c4694cg);
        this.c = xf;
        xf.d();
        RelativeLayout relativeLayout2 = this.a;
        if (relativeLayout2 == null) {
            s71.D("mContainer");
            throw null;
        }
        C4694cg c4694cg2 = this.b;
        if (c4694cg2 == null) {
            s71.D("mWebViewWrapper");
            throw null;
        }
        relativeLayout2.addView(c4694cg2.d(), e());
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(TestSuiteActivity testSuiteActivity) {
        C4694cg c4694cg = testSuiteActivity.b;
        if (c4694cg == null) {
            s71.D("mWebViewWrapper");
            throw null;
        }
        if (c4694cg.c().getParent() == null) {
            RelativeLayout relativeLayout = testSuiteActivity.a;
            if (relativeLayout == null) {
                s71.D("mContainer");
                throw null;
            }
            C4694cg c4694cg2 = testSuiteActivity.b;
            if (c4694cg2 == null) {
                s71.D("mWebViewWrapper");
                throw null;
            }
            relativeLayout.removeView(c4694cg2.d());
            RelativeLayout relativeLayout2 = testSuiteActivity.a;
            if (relativeLayout2 == null) {
                s71.D("mContainer");
                throw null;
            }
            C4694cg c4694cg3 = testSuiteActivity.b;
            if (c4694cg3 == null) {
                s71.D("mWebViewWrapper");
                throw null;
            }
            relativeLayout2.addView(c4694cg3.c(), testSuiteActivity.e());
            C4694cg c4694cg4 = testSuiteActivity.b;
            if (c4694cg4 != null) {
                c4694cg4.b();
            } else {
                s71.D("mWebViewWrapper");
                throw null;
            }
        }
    }

    private final JSONObject d() {
        String strB = new Of().b(this);
        if (strB != null) {
            try {
                if (strB.length() != 0) {
                    return IronSourceNetworkBridge.jsonObjectInit(strB);
                }
            } catch (Exception unused) {
                return IronSourceNetworkBridge.jsonObjectInit();
            }
        }
        return IronSourceNetworkBridge.jsonObjectInit();
    }

    private final RelativeLayout.LayoutParams e() {
        return new RelativeLayout.LayoutParams(-1, -1);
    }

    private final void f() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedCallback = this.d) == null) {
            return;
        }
        try {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.d = null;
        } catch (Exception e) {
            C4950r4.d().a(e);
            IronLog.INTERNAL.error("Failed to unregister OnBackInvokedCallback: " + e);
        }
    }

    private final void g() {
        if (Build.VERSION.SDK_INT >= 35) {
            RelativeLayout relativeLayout = this.a;
            if (relativeLayout == null) {
                s71.D("mContainer");
                throw null;
            }
            relativeLayout.setOnApplyWindowInsetsListener(new so2());
            RelativeLayout relativeLayout2 = this.a;
            if (relativeLayout2 != null) {
                relativeLayout2.requestApplyInsets();
            } else {
                s71.D("mContainer");
                throw null;
            }
        }
    }

    @NotNull
    public final RelativeLayout getContainer() {
        RelativeLayout relativeLayout = this.a;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        s71.D("mContainer");
        throw null;
    }

    @Override // com.ironsource.W8
    public void onClosed() {
        runOnUiThread(new uo2(this, 0));
    }

    @Override // com.ironsource.W8
    public void onUIReady() {
        runOnUiThread(new uo2(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets a(View view, WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
        insets.getClass();
        view.setPadding(0, insets.top, 0, insets.bottom);
        return windowInsets;
    }

    private final String c() {
        Bundle extras;
        if (getIntent() == null || getIntent().getExtras() == null || (extras = getIntent().getExtras()) == null) {
            return null;
        }
        return extras.getString("controllerUrl");
    }

    @Override // android.app.Activity
    public void onDestroy() {
        f();
        Xf xf = this.c;
        if (xf != null) {
            xf.a();
            RelativeLayout relativeLayout = this.a;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
                C4694cg c4694cg = this.b;
                if (c4694cg != null) {
                    c4694cg.a();
                    super.onDestroy();
                    return;
                } else {
                    s71.D("mWebViewWrapper");
                    throw null;
                }
            }
            s71.D("mContainer");
            throw null;
        }
        s71.D("mNativeBridge");
        throw null;
    }

    private final void a() {
        if (Build.VERSION.SDK_INT >= 33) {
            to2 to2Var = new to2();
            this.d = to2Var;
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, to2Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TestSuiteActivity testSuiteActivity) {
        testSuiteActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b() {
    }
}
