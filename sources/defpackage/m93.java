package defpackage;

import androidx.arch.core.util.Function;
import com.adsurge.adn.E.c;
import com.adsurge.adn.N.d;
import com.adsurge.adn.oversea_ad.ITuringPrivacyPolicy;
import com.applovin.impl.c3;
import com.applovin.impl.m5;
import com.applovin.impl.sdk.ad.b;
import com.facebook.a0;
import com.facebook.appevents.q;
import com.facebook.appevents.r;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.b0;
import com.facebook.internal.x;
import com.facebook.internal.z;
import com.facebook.w0;
import com.mbridge.msdk.config.component.common.metrics.a;
import com.mbridge.msdk.tracker.e;
import com.mbridge.msdk.tracker.f;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m93 implements f, ITuringPrivacyPolicy, Function, c.d, x {
    public final /* synthetic */ int a;

    public /* synthetic */ m93(int i) {
        this.a = i;
    }

    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void c(int i) {
        throw new b03(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(int i, long j) {
        throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + j);
    }

    public static /* synthetic */ void f(int i, String str) throws IOException {
        throw new IOException(str + i);
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new RuntimeException(str + obj);
    }

    public static /* synthetic */ void j(String str) throws Exception {
        throw new Exception(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3) {
        throw new RuntimeException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Throwable th) {
        throw new RuntimeException(str + obj + obj2, th);
    }

    @Override // androidx.arch.core.util.Function
    public Object apply(Object obj) {
        m5 m5Var = (m5) obj;
        switch (this.a) {
            case 6:
                return b.n(m5Var);
            case 7:
                return b.h(m5Var);
            case 8:
                return b.l(m5Var);
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return c3.e(m5Var);
            case 14:
                return c3.f(m5Var);
            case 15:
                return c3.g(m5Var);
            case 16:
                return c3.b(m5Var);
            case 17:
                return c3.d(m5Var);
        }
    }

    @Override // com.facebook.internal.x
    public void d(boolean z) {
        switch (this.a) {
            case 22:
                if (z && w0.c()) {
                    b0.a(new dr0(12), z.CrashReport);
                    b0.a(new dr0(13), z.ErrorReport);
                    b0.a(new dr0(14), z.AnrReport);
                    break;
                }
                break;
            case 23:
                if (z && !lz.a.contains(r.class)) {
                    try {
                        FetchedAppSettingsManager.getAppSettingsAsync(new q());
                    } catch (Throwable th) {
                        lz.a(r.class, th);
                        return;
                    }
                    break;
                }
                break;
            case 24:
                if (z) {
                    a0.o = true;
                }
                break;
            case 25:
                if (z) {
                    a0.p = true;
                }
                break;
            case 26:
                if (z) {
                    a0.q = true;
                }
                break;
            case 27:
            default:
                if (z) {
                    bi0 bi0Var = bi0.a;
                    if (!lz.a.contains(bi0.class)) {
                        try {
                            bi0.b = true;
                            bi0.a.a();
                        } catch (Throwable th2) {
                            lz.a(bi0.class, th2);
                        }
                        break;
                    }
                }
                break;
            case 28:
                if (z && !lz.a.contains(wl1.class)) {
                    try {
                        try {
                            a0.c().execute(new u(9));
                        } catch (Throwable th3) {
                            lz.a(wl1.class, th3);
                            return;
                        }
                    } catch (Exception unused) {
                        a0 a0Var = a0.a;
                        return;
                    }
                    break;
                }
                break;
        }
    }

    public static /* synthetic */ void g(int i, StringBuilder sb) {
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) {
        return a.a(eVar);
    }

    @Override // com.adsurge.adn.oversea_ad.ITuringPrivacyPolicy, com.adsurge.adn.oversea_ad.Sagittarius
    public boolean userAgreement() {
        return com.adsurge.adn.P.a.c();
    }

    @Override // com.adsurge.adn.E.c.d
    public void a(c.C0071c c0071c) {
        c0071c.b.c = Long.valueOf(d.b().a());
    }
}
