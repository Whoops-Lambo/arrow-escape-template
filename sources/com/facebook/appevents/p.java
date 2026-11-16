package com.facebook.appevents;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.v0;
import com.facebook.k0;
import com.facebook.o0;
import com.fyber.inneractive.sdk.protobuf.m1;
import com.fyber.inneractive.sdk.protobuf.n1;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoBidTokenListener;
import defpackage.at1;
import defpackage.f32;
import defpackage.fj2;
import defpackage.gg;
import defpackage.gv0;
import defpackage.h41;
import defpackage.hv0;
import defpackage.i41;
import defpackage.i52;
import defpackage.ij;
import defpackage.iv0;
import defpackage.j02;
import defpackage.j92;
import defpackage.k7;
import defpackage.kn1;
import defpackage.l7;
import defpackage.lz;
import defpackage.ng1;
import defpackage.t43;
import defpackage.u43;
import defpackage.zg;
import io.p071bidmachine.AdRequest;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements com.facebook.internal.x, OnApplyWindowInsetsListener, MolocoBidTokenListener, io.p071bidmachine.utils.lazy.b {
    public final /* synthetic */ int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a() throws m1 {
        throw new m1();
    }

    public static /* synthetic */ void b(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void e(String str) {
        throw new com.facebook.u(str);
    }

    public static /* synthetic */ void g(Throwable th) {
        throw new IllegalStateException(th);
    }

    public static /* synthetic */ void h(String str) throws n1 {
        throw new n1(str);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat c(View view, WindowInsetsCompat windowInsetsCompat) {
        switch (this.a) {
            case 16:
                view.getClass();
                windowInsetsCompat.getClass();
                Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout());
                insets.getClass();
                view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
                return windowInsetsCompat;
            default:
                return com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.n.a(view, windowInsetsCompat);
        }
    }

    @Override // com.facebook.internal.x
    public void d(boolean z) {
        HashSet hashSet;
        HashSet hashSetG;
        HashSet hashSet2 = null;
        t43VarB = null;
        t43 t43VarB = null;
        hashSet2 = null;
        hashSet2 = null;
        hashSet2 = null;
        byte b = 0;
        switch (this.a) {
            case 0:
                if (z) {
                    zg zgVar = zg.a;
                    Set set = lz.a;
                    if (!set.contains(zg.class)) {
                        try {
                            if (!zg.b) {
                                zg zgVar2 = zg.a;
                                if (!set.contains(zgVar2)) {
                                    try {
                                        f0 f0VarQueryAppSettings = FetchedAppSettingsManager.queryAppSettings(com.facebook.a0.b(), false);
                                        if (f0VarQueryAppSettings != null) {
                                            JSONArray jSONArray = f0VarQueryAppSettings.u;
                                            try {
                                                if (!set.contains(zgVar2)) {
                                                    try {
                                                        hashSet = v0.g(jSONArray);
                                                        if (hashSet == null) {
                                                            hashSet = new HashSet();
                                                        }
                                                    } catch (Exception unused) {
                                                        hashSet = new HashSet();
                                                    }
                                                    hashSet2 = hashSet;
                                                }
                                            } catch (Throwable th) {
                                                lz.a(zgVar2, th);
                                            }
                                            zg.c = hashSet2;
                                            break;
                                        }
                                    } catch (Throwable th2) {
                                        lz.a(zgVar2, th2);
                                    }
                                }
                                zg.b = !zg.c.isEmpty();
                            }
                        } catch (Throwable th3) {
                            lz.a(zg.class, th3);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 1:
                if (z) {
                    i41 i41Var = i41.a;
                    if (!lz.a.contains(i41.class)) {
                        try {
                            if (gg.c()) {
                                i41.e.set(true);
                                i41.d();
                            } else {
                                h41.g();
                            }
                        } catch (Throwable th4) {
                            lz.a(i41.class, th4);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (z) {
                    fj2 fj2Var = fj2.a;
                    Set set2 = lz.a;
                    if (!set2.contains(fj2.class)) {
                        try {
                            if (!fj2.b) {
                                fj2 fj2Var2 = fj2.a;
                                if (!set2.contains(fj2Var2)) {
                                    try {
                                        f0 f0VarQueryAppSettings2 = FetchedAppSettingsManager.queryAppSettings(com.facebook.a0.b(), false);
                                        if (f0VarQueryAppSettings2 != null) {
                                            fj2Var2.a(f0VarQueryAppSettings2.t);
                                            break;
                                        }
                                    } catch (Throwable th5) {
                                        lz.a(fj2Var2, th5);
                                    }
                                }
                                fj2.b = (fj2.c.isEmpty() && fj2.d.isEmpty()) ? false : true;
                            }
                        } catch (Throwable th6) {
                            lz.a(fj2.class, th6);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 3:
                if (z) {
                    j02 j02Var = j02.a;
                    if (!lz.a.contains(j02.class)) {
                        try {
                            j02.b = true;
                            j02.a.a();
                        } catch (Throwable th7) {
                            lz.a(j02.class, th7);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 4:
                if (z) {
                    Set set3 = lz.a;
                    if (!set3.contains(ng1.class)) {
                        try {
                            ng1 ng1Var = ng1.b;
                            if (!set3.contains(ng1Var)) {
                                try {
                                    f0 f0VarQueryAppSettings3 = FetchedAppSettingsManager.queryAppSettings(com.facebook.a0.b(), false);
                                    if (f0VarQueryAppSettings3 != null) {
                                        ng1.d = f0VarQueryAppSettings3.o;
                                        break;
                                    }
                                } catch (Throwable th8) {
                                    lz.a(ng1Var, th8);
                                }
                            }
                            if (ng1.d != null) {
                                ng1.c = true;
                            }
                        } catch (Throwable th9) {
                            lz.a(ng1.class, th9);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 5:
                if (z) {
                    ij ijVar = ij.a;
                    Set set4 = lz.a;
                    if (!set4.contains(ij.class)) {
                        try {
                            ij ijVar2 = ij.a;
                            if (!set4.contains(ijVar2)) {
                                try {
                                    f0 f0VarQueryAppSettings4 = FetchedAppSettingsManager.queryAppSettings(com.facebook.a0.b(), false);
                                    if (f0VarQueryAppSettings4 != null && (hashSetG = v0.g(f0VarQueryAppSettings4.q)) != null) {
                                        ij.c = hashSetG;
                                    }
                                } catch (Throwable th10) {
                                    lz.a(ijVar2, th10);
                                }
                            }
                            HashSet hashSet3 = ij.c;
                            if (hashSet3 != null && !hashSet3.isEmpty()) {
                                ij.b = true;
                            }
                        } catch (Throwable th11) {
                            lz.a(ij.class, th11);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 6:
                if (z) {
                    f32 f32Var = f32.a;
                    if (!lz.a.contains(f32.class)) {
                        try {
                            f32.a.a();
                            if (!f32.c.isEmpty()) {
                                f32.b = true;
                            }
                        } catch (Throwable th12) {
                            lz.a(f32.class, th12);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 7:
                if (z) {
                    j92 j92Var = j92.a;
                    if (!lz.a.contains(j92.class)) {
                        try {
                            j92.a.a();
                            if (j92.c.isEmpty() && j92.d.isEmpty()) {
                                j92.b = false;
                            } else {
                                j92.b = true;
                            }
                        } catch (Throwable th13) {
                            lz.a(j92.class, th13);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 8:
                if (z) {
                    boolean z2 = l7.a;
                    try {
                        k0 k0Var = new k0(null, com.facebook.a0.b().concat("/cloudbridge_settings"), null, o0.a, new k7(b == true ? 1 : 0), 32);
                        n nVar = com.facebook.internal.k0.c;
                        synchronized (com.facebook.a0.b) {
                        }
                        k0Var.d();
                    } catch (JSONException e) {
                        n nVar2 = com.facebook.internal.k0.c;
                        l7.D(e);
                        synchronized (com.facebook.a0.b) {
                            return;
                        }
                    }
                }
                break;
            case 9:
                if (z) {
                    gv0 gv0Var = gv0.a;
                    if (!lz.a.contains(gv0.class)) {
                        try {
                            gv0.c = true;
                            gv0.d = new hv0(com.facebook.a0.a());
                            gv0.e = "https://www." + com.facebook.a0.t + "/privacy_sandbox/mobile/register/trigger";
                        } catch (Throwable th14) {
                            lz.a(gv0.class, th14);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 10:
                if (z) {
                    at1.a();
                }
                break;
            case 11:
                if (z) {
                    AtomicBoolean atomicBoolean = iv0.a;
                    if (!lz.a.contains(iv0.class)) {
                        try {
                            iv0.a.set(true);
                        } catch (Throwable th15) {
                            lz.a(iv0.class, th15);
                            return;
                        }
                        break;
                    }
                }
                break;
            case 12:
                if (z) {
                    u43 u43Var = u43.a;
                    Set set5 = lz.a;
                    if (!set5.contains(u43.class)) {
                        try {
                            u43.c = true;
                            u43 u43Var2 = u43.a;
                            if (!set5.contains(u43Var2)) {
                                try {
                                    f0 f0VarQueryAppSettings5 = FetchedAppSettingsManager.queryAppSettings(com.facebook.a0.b(), false);
                                    String str = f0VarQueryAppSettings5 != null ? f0VarQueryAppSettings5.v : null;
                                    if (str != null && str.length() != 0) {
                                        t43VarB = u43Var2.b(str);
                                    }
                                    u43.d = t43VarB;
                                } catch (Throwable th16) {
                                    lz.a(u43Var2, th16);
                                    return;
                                }
                                break;
                            }
                        } catch (Throwable th17) {
                            lz.a(u43.class, th17);
                            return;
                        }
                    }
                }
                break;
            case 13:
                if (z) {
                    i52 i52Var = i52.a;
                    if (!lz.a.contains(i52.class)) {
                        try {
                            i52.b = true;
                            i52.a.b();
                        } catch (Throwable th18) {
                            lz.a(i52.class, th18);
                            return;
                        }
                        break;
                    }
                }
                break;
            default:
                if (z) {
                    kn1 kn1Var = kn1.a;
                    if (!lz.a.contains(kn1.class)) {
                        try {
                            try {
                                com.facebook.a0.c().execute(new defpackage.u(10));
                            } catch (Exception unused2) {
                                return;
                            }
                        } catch (Throwable th19) {
                            lz.a(kn1.class, th19);
                        }
                        break;
                    }
                }
                break;
        }
    }

    @Override // io.p071bidmachine.utils.lazy.b
    /* JADX INFO: renamed from: get */
    public Object mo1394get() {
        switch (this.a) {
            case 24:
                return AdRequest.lambda$notifyMediationWin$6();
            case 25:
                return AdRequest.lambda$destroy$8();
            case 26:
                return AdRequest.lambda$processExpired$9();
            case 27:
                return "Request start";
            case 28:
                return "Can't create ViewabilityTrackerParams";
            default:
                return "PlaceholderSource don't found. Can't create Image";
        }
    }

    public static /* synthetic */ void f(StringBuilder sb, Object obj, Object obj2, Object obj3) {
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.moloco.sdk.publisher.MolocoBidTokenListener
    public void onBidTokenResult(String str, MolocoAdError.ErrorType errorType) {
        str.getClass();
    }
}
