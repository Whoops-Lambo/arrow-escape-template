package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.az2;
import defpackage.cz;
import defpackage.kc2;
import defpackage.n30;
import defpackage.rp1;
import java.io.ByteArrayOutputStream;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class N0 {
    public final AdConfig.AdQualityConfig a;
    public final Y9 b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final CopyOnWriteArrayList f;
    public AdQualityControl g;
    public Vp h;
    public AdQualityResult i;
    public String j;
    public JSONObject k;
    public final AtomicBoolean l;

    public final void a(boolean z) {
        String beacon;
        AdQualityControl adQualityControl = this.g;
        if (adQualityControl == null || (beacon = adQualityControl.getBeacon()) == null) {
            return;
        }
        if (this.f.isEmpty() && this.d.get() && !this.e.get()) {
            this.e.set(true);
            a("session end - queuing result");
            AdQualityResult adQualityResult = this.i;
            if (adQualityResult == null) {
                adQualityResult = new AdQualityResult("null", null, beacon, null, 8, null);
            }
            a(adQualityResult, true);
            return;
        }
        if (!this.d.get() || z || this.e.get()) {
            this.f.size();
            this.d.get();
            Objects.toString(this.e);
            return;
        }
        this.e.set(true);
        a("session stop - queuing result");
        cz czVar = G0.e;
        if (czVar != null) {
            kc2.g(czVar, new CancellationException("Shutdown"));
        }
        G0.e = null;
        AdQualityResult adQualityResult2 = this.i;
        if (adQualityResult2 == null) {
            adQualityResult2 = new AdQualityResult("null", null, beacon, null, 8, null);
        }
        a(adQualityResult2, true);
    }

    public N0(AdConfig.AdQualityConfig adQualityConfig, Y9 y9) {
        adQualityConfig.getClass();
        this.a = adQualityConfig;
        this.b = y9;
        this.c = new AtomicBoolean(false);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new CopyOnWriteArrayList();
        this.h = Vp.UNKNOWN;
        this.j = "";
        this.k = new JSONObject();
        this.l = new AtomicBoolean(false);
    }

    public final void a(Activity activity, String str, boolean z, JSONObject jSONObject, C4276oj c4276oj) {
        activity.getClass();
        str.getClass();
        jSONObject.getClass();
        c4276oj.getClass();
        if (jSONObject.length() > 0 && str.length() > 0) {
            this.j = str;
            this.k = jSONObject;
            a("report ad starting");
            if (z) {
                a("report ad capture");
                a(activity, 0L, true, c4276oj);
                return;
            } else {
                a("report ad report");
                a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                return;
            }
        }
        c4276oj.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
        a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
    }

    public final void a(Ej ej, String str, boolean z, JSONObject jSONObject, C4276oj c4276oj) {
        ej.getClass();
        str.getClass();
        jSONObject.getClass();
        c4276oj.getClass();
        if (jSONObject.length() > 0 && str.length() > 0) {
            this.j = str;
            this.k = jSONObject;
            if (z) {
                a(ej, 0L, true, c4276oj);
                return;
            } else {
                a(new AdQualityResult("", null, str, jSONObject.toString()), false);
                return;
            }
        }
        c4276oj.a.h("window.mraidview.broadcastEvent('AdReportFailed')");
        a("Incorrect parameters for reporting. url - " + str + " , extras - " + jSONObject, (Exception) null);
    }

    public final boolean a() {
        if (this.c.get()) {
            a("ad quality session is already in progress. skipping...");
            return false;
        }
        if (!this.a.getEnabled()) {
            a("config kill switch while state check - false. ad quality will skip");
            return false;
        }
        if (this.g == null) {
            a("setup not done. skipping");
            return false;
        }
        Vp vp = this.h;
        if (vp != Vp.UNKNOWN && vp != Vp.HIDDEN) {
            return true;
        }
        a("ad view is not visible. skipping");
        return false;
    }

    public final void a(AdQualityResult adQualityResult, boolean z) {
        if (adQualityResult.getBeaconUrl().length() != 0) {
            AbstractC3977e.a(new Hi(adQualityResult), new K0(this, z), null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(11));
        } else {
            a("beacon is empty");
        }
    }

    public final void a(Ej ej, long j, boolean z, C4276oj c4276oj) {
        a("isCapture started - " + this.l.get() + ", isReporting - " + z);
        if (this.l.get() && !z) {
            a("Screenshot process already in progress... skipping...", (Exception) null);
        } else {
            ej.post(new rp1(this, ej, j, z, c4276oj, 0));
        }
    }

    public static final void a(N0 n0, View view, long j, boolean z, C4276oj c4276oj) {
        n0.getClass();
        view.getClass();
        n0.a(new C4165kk(view, n0.a), j, z, c4276oj);
        n0.l.set(!z);
    }

    public final void a(Activity activity, long j, boolean z, C4276oj c4276oj) {
        a("isCapture started - " + this.l.get() + ", isReporting - " + z);
        if (this.l.get() && !z) {
            a("Screenshot process already in progress... skipping...", (Exception) null);
        } else {
            activity.getWindow().getDecorView().post(new rp1(this, activity, j, z, c4276oj, 1));
        }
    }

    public static final void a(N0 n0, Activity activity, long j, boolean z, C4276oj c4276oj) {
        n0.a("activity is visible");
        Window window = activity.getWindow();
        window.getClass();
        n0.a(new Ih(window, n0.a), j, z, c4276oj);
        n0.l.set(!z);
    }

    public final void a(Q2 q2, long j, boolean z, C4276oj c4276oj) {
        if (!z) {
            this.f.add(q2);
        }
        AbstractC3977e.a(q2, new M0(this, q2, z, c4276oj), Long.valueOf(j), new defpackage.s5(this, 27));
    }

    public static final boolean a(N0 n0) {
        return n0.h == Vp.VISIBLE;
    }

    public final void a(Bitmap bitmap, O0 o0, boolean z, C4276oj c4276oj) {
        String beacon;
        o0.getClass();
        a("Screen shot result received - isReporting - " + z);
        this.f.remove(o0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap != null) {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (bitmap != null && c4276oj != null) {
            c4276oj.a.h("window.mraidview.broadcastEvent('ScreenshotSuccess')");
        }
        if (!z) {
            AdQualityControl adQualityControl = this.g;
            if (adQualityControl != null && (beacon = adQualityControl.getBeacon()) != null) {
                a("saving to file - beacon - ".concat(beacon));
                byteArray.getClass();
                a(beacon, byteArray, false);
            }
        } else {
            String str = this.j;
            byteArray.getClass();
            a(str, byteArray, true);
        }
        this.l.set(false);
    }

    public final void a(Exception exc, O0 o0) {
        o0.getClass();
        a("error in running process - ".concat(o0.getClass().getSimpleName()), exc);
        this.f.remove(o0);
        a(true);
    }

    public final void a(String str, O0 o0, String str2, boolean z) {
        str.getClass();
        o0.getClass();
        str2.getClass();
        if (z) {
            a(new AdQualityResult(str, null, str2, this.k.toString()), false);
            return;
        }
        this.f.remove(o0);
        AdQualityResult adQualityResult = this.i;
        if (adQualityResult != null) {
            adQualityResult.setImageLocation(str);
        } else {
            this.i = new AdQualityResult(str, null, str2, null, 8, null);
        }
        a("file is saved. result - " + this.i);
        a(true);
    }

    public final void a(String str, byte[] bArr, boolean z) {
        Context context = AbstractC4221mk.a;
        if (context != null) {
            C4306pl c4306pl = new C4306pl(n30.m(context.getFilesDir().getAbsolutePath(), "/adQuality/screenshots"), bArr);
            if (!z) {
                this.f.add(c4306pl);
            }
            AbstractC3977e.a(c4306pl, new L0(this, z, c4306pl, str), null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d0(11));
        }
    }

    public final void a(String str) {
        Y9 y9 = this.b;
        if (y9 != null) {
            ((Z9) y9).a("AdQualityManager", str);
        }
    }

    public final void a(String str, Exception exc) {
        az2 az2Var;
        if (exc != null) {
            Y9 y9 = this.b;
            if (y9 != null) {
                ((Z9) y9).a("AdQualityManager", str, exc);
                az2Var = az2.a;
            } else {
                az2Var = null;
            }
            if (az2Var != null) {
                return;
            }
        }
        Y9 y10 = this.b;
        if (y10 != null) {
            ((Z9) y10).b("AdQualityManager", n30.y("Error with null exception : ", str));
        }
    }
}
