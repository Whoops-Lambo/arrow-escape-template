package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.ironsource.C4664b4;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.AdCantPlayWithoutWebView;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.i2;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.model.s3;
import com.vungle.ads.internal.presenter.f0;
import com.vungle.ads.internal.presenter.z;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.u0;
import defpackage.c3;
import defpackage.eu;
import defpackage.gd1;
import defpackage.gy;
import defpackage.n30;
import defpackage.n62;
import defpackage.pd1;
import defpackage.pv1;
import defpackage.we3;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class l extends Activity {
    public static volatile u0 h;
    public static volatile com.vungle.ads.internal.presenter.a i;
    public com.vungle.ads.internal.presenter.r a;
    public s3 b;
    public Object c;
    public com.vungle.ads.internal.util.s e;
    public final com.vungle.ads.internal.util.w d = new com.vungle.ads.internal.util.w();
    public final b f = new b(this);
    public final AtomicBoolean g = new AtomicBoolean(false);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(this, com.safedk.android.utils.h.d, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) throws Throwable {
        String watermark$vungle_ads_release;
        View decorView;
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(16777216, 16777216);
        u0 u0Var = h;
        com.vungle.ads.internal.presenter.a aVar = i;
        if (u0Var == null) {
            Intent intent = getIntent();
            intent.getClass();
            String strB = a.b(intent);
            if (strB == null) {
                strB = "";
            }
            if (aVar != null) {
                aVar.a(new AdNotLoadedCantPlay(pv1.n("Can not play fullscreen ad. placement=", strB, " pendingData is null")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), strB);
            }
            finish();
            return;
        }
        i0 i0VarA = u0Var.a();
        j3 j3VarB = u0Var.b();
        z zVarC = u0Var.c();
        this.e = i0VarA.q();
        try {
            com.vungle.ads.internal.ui.view.j jVar = new com.vungle.ads.internal.ui.view.j(this, i0VarA.h());
            int i2 = 0;
            WindowCompat.a(getWindow(), false);
            long j = getIntent().getBooleanExtra("ad_invisible_logged", false) ? 3L : 2L;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            i2 i2Var = new i2(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
            i2Var.a(Long.valueOf(j));
            AnalyticsClient.a(analyticsClient, i2Var, this.e, 4);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("AdActivity", "Log metric AD_VISIBILITY: " + j);
            pd1 pd1Var = pd1.a;
            gd1 gd1VarV = eu.v(pd1Var, new d(this));
            Intent intent2 = getIntent();
            intent2.getClass();
            String strA = a.a(intent2);
            FrameLayout frameLayout = null;
            s3 s3Var = strA != null ? new s3(strA) : null;
            this.b = s3Var;
            if (s3Var != null) {
                ((com.vungle.ads.internal.signals.j) gd1VarV.getValue()).a(s3Var);
            }
            jVar.setCloseDelegate(new h(this, gd1VarV));
            jVar.setOnViewTouchListener(new i(this));
            jVar.setOrientationDelegate(new j(this));
            gd1 gd1VarV2 = eu.v(pd1Var, new e(this));
            gd1 gd1VarV3 = eu.v(pd1Var, new f(this));
            com.vungle.ads.internal.executor.j jVarF = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) gd1VarV2.getValue())).f();
            ReentrantLock reentrantLock = f0.a;
            x xVarA = f0.a(i0VarA, j3VarB, jVarF, (com.vungle.ads.internal.platform.f) gd1VarV3.getValue());
            com.vungle.ads.internal.omsdk.d dVar = (com.vungle.ads.internal.omsdk.d) eu.v(pd1Var, new g(this)).getValue();
            boolean z2 = i0VarA.z();
            dVar.getClass();
            com.vungle.ads.internal.omsdk.e eVarA = com.vungle.ads.internal.omsdk.d.a(z2);
            com.vungle.ads.internal.executor.j jVarD = ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) gd1VarV2.getValue())).d();
            xVarA.a(eVarA);
            this.d.a(xVarA);
            com.vungle.ads.internal.presenter.r rVar = new com.vungle.ads.internal.presenter.r(jVar, i0VarA, j3VarB, xVarA, jVarD, eVarA, (com.vungle.ads.internal.platform.f) gd1VarV3.getValue());
            rVar.a(aVar);
            rVar.a(zVarC);
            rVar.a(new k(this));
            rVar.h();
            setContentView(jVar, jVar.getLayoutParams());
            try {
                getWindow().getDecorView().setBackgroundColor(-16777216);
            } catch (Throwable unused) {
            }
            ViewCompat.G(jVar, new we3(this, i2));
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
            windowInsetsControllerCompat.d();
            windowInsetsControllerCompat.a(WindowInsetsCompat.Type.systemBars());
            AdConfig adConfigJ = i0VarA.j();
            if (adConfigJ != null && (watermark$vungle_ads_release = adConfigJ.getWatermark$vungle_ads_release()) != null) {
                Window window = getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    frameLayout = (FrameLayout) decorView.findViewById(R.id.content);
                }
                if (frameLayout != null) {
                    y yVar = new y(this, watermark$vungle_ads_release);
                    frameLayout.addView(yVar);
                    yVar.bringToFront();
                }
            }
            this.a = rVar;
            if (Build.VERSION.SDK_INT >= 33) {
                a();
            }
            com.vungle.ads.internal.util.d dVar2 = com.vungle.ads.internal.util.d.f;
            com.vungle.ads.internal.util.a.a(this.f);
            try {
                registerReceiver(this.d, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
            } catch (Throwable unused2) {
            }
        } catch (InstantiationException e) {
            if (aVar != null) {
                aVar.a(new AdCantPlayWithoutWebView(e.getMessage()).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release(), j3VarB.b());
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Intent intent2 = getIntent();
        intent2.getClass();
        String strB = a.b(intent2);
        String strB2 = a.b(intent);
        Intent intent3 = getIntent();
        intent3.getClass();
        String strA = a.a(intent3);
        String strA2 = a.a(intent);
        if ((strB == null || strB2 == null || strB.equals(strB2)) && (strA == null || strA2 == null || strA.equals(strA2))) {
            return;
        }
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", "Tried to play another placement " + strB2 + " while playing " + strB);
        VungleError vungleErrorLogError$vungle_ads_release = new ConcurrentPlaybackUnsupported(n30.n("Trying to show ", strB2, " but ", strB, " is already showing")).setLogEntry$vungle_ads_release(this.e).logError$vungle_ads_release();
        com.vungle.ads.internal.presenter.a aVar = i;
        if (aVar != null) {
            aVar.a(vungleErrorLogError$vungle_ads_release, strB2);
        }
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onConcurrentPlaybackError: ");
        sbA.append(vungleErrorLogError$vungle_ads_release.getLocalizedMessage());
        com.vungle.ads.internal.util.t.b("AdActivity", sbA.toString());
    }

    static {
        new a();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        try {
            super.onConfigurationChanged(configuration);
            int i2 = configuration.orientation;
            if (i2 == 2) {
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", C4664b4.i.C);
            } else if (i2 == 1) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("AdActivity", C4664b4.i.D);
            }
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                rVar.g();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("onConfigurationChanged: ");
            sbA.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("AdActivity", sbA.toString());
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object obj = this.c;
            OnBackInvokedCallback onBackInvokedCallbackF = n62.A(obj) ? c3.f(obj) : null;
            if (onBackInvokedCallbackF != null) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(onBackInvokedCallbackF);
            }
            this.c = null;
        }
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            rVar.a((isChangingConfigurations() ? 1 : 0) | 2);
        }
        com.vungle.ads.internal.presenter.r rVar2 = this.a;
        if (rVar2 != null) {
            rVar2.a((k) null);
        }
        com.vungle.ads.internal.util.d dVar = com.vungle.ads.internal.util.d.f;
        com.vungle.ads.internal.util.a.b(this.f);
        try {
            unregisterReceiver(this.d);
        } catch (Throwable unused) {
        }
        this.a = null;
        i = null;
        h = null;
        super.onDestroy();
    }

    public static final WindowInsetsCompat a(l lVar, View view, WindowInsetsCompat windowInsetsCompat) {
        lVar.getClass();
        view.getClass();
        windowInsetsCompat.getClass();
        if (!lVar.g.get()) {
            Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
            insets.getClass();
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        }
        return windowInsetsCompat;
    }

    public static final void b(l lVar) {
        lVar.getClass();
        com.vungle.ads.internal.presenter.r rVar = lVar.a;
        if (rVar != null) {
            rVar.d();
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) throws Throwable {
        super.onActivityResult(i2, i3, intent);
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("AdActivity", new c(i2, i3, intent));
        if (i2 == 10001) {
            this.g.set(false);
            com.vungle.ads.internal.presenter.r rVar = this.a;
            if (rVar != null) {
                String strK = pv1.k(i3, "onActivityResultCode=");
                i2 i2Var = new i2(Sdk.SDKMetric.SDKMetricType.INLINE_INSTALL_STATUS);
                i2Var.c = 3L;
                AnalyticsClient.INSTANCE.a(i2Var, rVar.b(), strK);
            }
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "stop()");
            rVar.a.b();
            rVar.d.b(false);
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        com.vungle.ads.internal.presenter.r rVar = this.a;
        if (rVar != null) {
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("MRAIDPresenter", "start()");
            rVar.a.d();
            rVar.d.b(true);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(getWindow(), getWindow().getDecorView());
            windowInsetsControllerCompat.d();
            windowInsetsControllerCompat.a(WindowInsetsCompat.Type.systemBars());
        }
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i2) {
        super.setRequestedOrientation(i2);
    }

    public static final com.vungle.ads.internal.signals.j a(gd1 gd1Var) {
        return (com.vungle.ads.internal.signals.j) gd1Var.getValue();
    }

    public final void a() {
        gy gyVar = new gy(this, 5);
        this.c = gyVar;
        getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, gyVar);
    }
}
