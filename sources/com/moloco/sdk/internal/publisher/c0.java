package com.moloco.sdk.internal.publisher;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.webkit.WebView;
import androidx.webkit.WebViewCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import defpackage.az2;
import defpackage.ba0;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.hh;
import defpackage.j52;
import defpackage.k52;
import defpackage.kc2;
import defpackage.li2;
import defpackage.nj;
import defpackage.sr0;
import defpackage.tb5;
import defpackage.wg1;
import defpackage.wr0;
import defpackage.wz2;
import defpackage.xc0;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class c0 implements AdLoad {
    public final wr0 a;
    public final String b;
    public final wr0 c;
    public final com.moloco.sdk.internal.ortb.d d;
    public final com.facebook.appevents.n e;
    public final AdFormatType f;
    public final com.moloco.sdk.internal.services.i g;
    public final com.moloco.sdk.acm.recorder.c h;
    public final sr0 i;
    public final dn j;
    public boolean k;
    public String l;
    public com.moloco.sdk.internal.ortb.model.c0 m;
    public final com.moloco.sdk.acm.i n;
    public li2 o;

    public static final com.moloco.sdk.internal.ortb.model.y a(c0 c0Var, com.moloco.sdk.internal.ortb.model.c0 c0Var2) {
        List list;
        com.moloco.sdk.internal.ortb.model.j jVar;
        List list2;
        if (c0Var2 == null || (list = c0Var2.a) == null || (jVar = (com.moloco.sdk.internal.ortb.model.j) list.get(0)) == null || (list2 = jVar.a) == null) {
            return null;
        }
        return (com.moloco.sdk.internal.ortb.model.y) list2.get(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(c0 c0Var, String str, fy fyVar) {
        y yVar;
        if (fyVar instanceof y) {
            yVar = (y) fyVar;
            int i = yVar.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                yVar.u = i - Integer.MIN_VALUE;
            } else {
                yVar = new y(c0Var, fyVar);
            }
        } else {
            yVar = new y(c0Var, fyVar);
        }
        Object objE = yVar.s;
        int i2 = yVar.u;
        dy dyVar = null;
        if (i2 == 0) {
            wz2.a0(objE);
            com.facebook.appevents.n nVar = c0Var.e;
            yVar.r = str;
            yVar.u = 1;
            objE = tb5.E(xc0.a, new hh(nVar, str, dyVar, 11), yVar);
            dz dzVar = dz.a;
            if (objE == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = yVar.r;
            wz2.a0(objE);
        }
        String str2 = (String) objE;
        return str2 != null ? str2 : str;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final boolean isLoaded() {
        return this.k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public final void load(String str, AdLoad.Listener listener) {
        PackageInfo packageInfoC;
        Object j52Var;
        str.getClass();
        com.moloco.sdk.internal.services.i iVar = this.g;
        Context context = iVar.a;
        int i = WebViewCompat.a;
        if (Build.VERSION.SDK_INT >= 26) {
            packageInfoC = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoC = WebViewCompat.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoC = null;
            }
        }
        if (packageInfoC == null) {
            try {
                String str2 = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", null).invoke(null, null);
                packageInfoC = str2 == null ? null : context.getPackageManager().getPackageInfo(str2, 0);
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }
        if (packageInfoC == null) {
            iVar.a("no_package");
            j52Var = new j52(new Exception("No current WebView package exists"));
        } else {
            try {
                int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(packageInfoC.packageName);
                if (applicationEnabledSetting == 2) {
                    iVar.a("disabled_by_system");
                    j52Var = new j52(new Exception("WebView component is disabled by system"));
                } else if (applicationEnabledSetting == 3) {
                    iVar.a("disabled_by_user");
                    j52Var = new j52(new Exception("WebView component is disabled by user"));
                } else if (applicationEnabledSetting != 4) {
                    j52Var = az2.a;
                } else {
                    iVar.a("disabled_until_used");
                    j52Var = new j52(new Exception("WebView component is disabled until used"));
                }
            } catch (IllegalArgumentException e) {
                iVar.a("unknown_package");
                j52Var = new j52(e);
            }
        }
        Throwable thB = k52.b(j52Var);
        if (thB != null) {
            MolocoLogger.INSTANCE.error("AdLoad", nj.r(thB, new StringBuilder("WebView Error: ")), thB, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.b, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        com.moloco.sdk.service_locator.i.b().getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: ".concat(str), false, 4, null);
        ((AtomicLong) this.n.a.b).set(System.currentTimeMillis());
        com.moloco.sdk.acm.e eVar = new com.moloco.sdk.acm.e("load_ad_attempted");
        String lowerCase = this.f.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        eVar.a("ad_type", lowerCase);
        this.h.a(eVar);
        tb5.t(this.j, null, null, new x(this, str, listener, jCurrentTimeMillis, null), 3);
    }

    public c0(dn dnVar, wr0 wr0Var, String str, wr0 wr0Var2, com.moloco.sdk.internal.ortb.d dVar, com.facebook.appevents.n nVar, AdFormatType adFormatType, com.moloco.sdk.internal.services.i iVar, com.moloco.sdk.acm.recorder.c cVar, sr0 sr0Var) {
        str.getClass();
        dVar.getClass();
        adFormatType.getClass();
        iVar.getClass();
        this.a = wr0Var;
        this.b = str;
        this.c = wr0Var2;
        this.d = dVar;
        this.e = nVar;
        this.f = adFormatType;
        this.g = iVar;
        this.h = cVar;
        this.i = sr0Var;
        ba0 ba0Var = xc0.a;
        this.j = kc2.u(dnVar, wg1.a);
        this.n = cVar.c("load_ad_time");
    }
}
