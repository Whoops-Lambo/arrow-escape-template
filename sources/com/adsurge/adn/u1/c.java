package com.adsurge.adn.u1;

import android.text.TextUtils;
import com.adsurge.adn.Q.j;
import com.adsurge.adn.Y0.g;
import com.adsurge.adn.ads.AdConfig;
import com.adsurge.adn.ads.AdSurgeAd;
import com.adsurge.adn.ads.AdSurgeAdFormat;
import com.adsurge.adn.ads.BaseAdListener;
import com.adsurge.adn.p036k1.l;
import com.adsurge.adn.x1.r;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class c extends com.adsurge.adn.Q.b implements g {
    public boolean A0;
    public AdSurgeAd B0;
    public BaseAdListener C0;
    public final AtomicInteger D0;
    public final AtomicInteger E0;
    public boolean F0;
    public volatile int G0;
    public List H0;
    public List I0;
    public int J0;
    public int K0;
    public int L0;
    public String c0;
    public b d0;
    public String e0;
    public int f0;
    public com.adsurge.adn.p006a1.a g0;
    public int h0;
    public int i0;
    public final Map j0;
    public final Map k0;
    public int l0;
    public volatile int m0;
    public j n0;
    public j o0;
    public boolean p0;
    public final AtomicInteger q0;
    public final AtomicInteger r0;
    public final AtomicInteger s0;
    public long t0;
    public JSONObject u0;
    public JSONObject v0;
    public final int w0;
    public final int x0;
    public int y0;
    public boolean z0;

    public final int I0() {
        return 0;
    }

    public final boolean O0() {
        return false;
    }

    public boolean Q0() {
        return true;
    }

    public boolean T0() {
        return false;
    }

    @Override // com.adsurge.adn.Y0.g
    public int k() {
        return 0;
    }

    @Override // com.adsurge.adn.Y0.g
    public final String m() {
        return null;
    }

    public final int p0() {
        return -1;
    }

    public int C0() {
        return this.D0.get();
    }

    public final String D0() {
        j jVar = this.o0;
        if (jVar != null) {
            return jVar.c();
        }
        j jVar2 = this.n0;
        return (jVar2 == null || jVar2.c() == null) ? e0() : this.n0.c();
    }

    public final int F0() {
        return this.G0;
    }

    public int G0() {
        return this.s0.get();
    }

    public int H0() {
        return this.q0.get();
    }

    public final boolean J0() {
        return this.F0;
    }

    public boolean K0() {
        if (this.J0 < 0) {
            this.J0 = l.b(this);
        }
        int i = this.K0 + 1;
        this.K0 = i;
        int i2 = this.J0;
        if (i2 > 0) {
            l.a(this, i2, i);
        }
        return Z0();
    }

    public void L0() {
        this.D0.incrementAndGet();
    }

    public boolean M0() {
        return this.p0;
    }

    public boolean N0() {
        com.adsurge.adn.p006a1.a aVar = this.g0;
        return (aVar == null || !aVar.f() || TextUtils.isEmpty(z())) ? false : true;
    }

    public boolean P0() {
        return this.A0;
    }

    public boolean Y0() {
        return this.z0;
    }

    public boolean Z0() {
        int i = this.J0;
        return i > 0 && this.K0 >= i;
    }

    public void b(com.adsurge.adn.Q.g gVar) {
        if (gVar == null) {
            return;
        }
        String strJ = gVar.j();
        if (!TextUtils.isEmpty(strJ)) {
            String strJ2 = J();
            if (!TextUtils.isEmpty(strJ2)) {
                b(r.b(strJ2, "template_id", strJ));
            }
            String strF = F();
            if (!TextUtils.isEmpty(strF)) {
                a(r.b(strF, "template_id", strJ));
            }
        }
        a(gVar);
        this.c0 = strJ;
    }

    public boolean b1() {
        boolean z = !this.z0;
        this.z0 = z;
        return z;
    }

    public void c(int i) {
        this.y0 = i * 1000;
    }

    public void d(int i) {
        AtomicInteger atomicInteger = this.r0;
        atomicInteger.compareAndSet(atomicInteger.get(), i);
    }

    public void f(int i) {
        this.s0.set(i);
    }

    public j g0() {
        return this.o0;
    }

    public JSONObject h0() {
        return this.v0;
    }

    public final String i0() {
        if (TextUtils.isEmpty(this.e0)) {
            JSONObject jSONObjectR = R();
            if (!jSONObjectR.has("sdk_ad_type")) {
                try {
                    jSONObjectR.put("sdk_ad_type", x().type);
                } catch (Exception unused) {
                }
            }
            this.e0 = jSONObjectR.toString();
        }
        return this.e0;
    }

    @Override // com.adsurge.adn.Y0.g
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public final com.adsurge.adn.p006a1.a i() {
        return this.g0;
    }

    public final b k0() {
        return this.d0;
    }

    public j l0() {
        return this.n0;
    }

    public int m0() {
        return this.w0 - this.y0;
    }

    public final String n0() {
        return "";
    }

    public JSONObject q0() {
        return this.u0;
    }

    public int u0() {
        return this.r0.get();
    }

    public long v0() {
        return this.t0;
    }

    public int w0() {
        return this.x0 - this.y0;
    }

    public int x0() {
        if (this.L0 == -1) {
            this.L0 = l.a(this, a0());
        }
        return this.L0;
    }

    public c(String str, String str2, com.adsurge.adn.p006a1.a aVar, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        boolean z;
        super(jSONObject, aVar.k(), str, str2);
        this.f0 = Integer.MIN_VALUE;
        this.h0 = 2;
        this.i0 = 0;
        this.j0 = new ConcurrentHashMap();
        this.k0 = new ConcurrentHashMap();
        this.m0 = -1;
        this.q0 = new AtomicInteger(0);
        this.r0 = new AtomicInteger(0);
        this.s0 = new AtomicInteger(0);
        this.z0 = true;
        this.A0 = false;
        this.D0 = new AtomicInteger(0);
        this.E0 = new AtomicInteger(0);
        this.F0 = false;
        this.H0 = new ArrayList();
        this.I0 = new ArrayList();
        this.J0 = -1;
        this.L0 = -1;
        this.g0 = aVar;
        this.v0 = jSONObject3;
        b bVar = new b();
        this.d0 = bVar;
        bVar.a(V());
        this.d0.b(r());
        this.u0 = jSONObject2;
        if (!com.adsurge.adn.p020f0.c.d()) {
            if (com.adsurge.adn.N.b.a(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_DOWNLOAD_BYTES, 0, this) == 1) {
                z = true;
            } else {
                z = false;
            }
            com.adsurge.adn.p020f0.c.a(z);
        }
        if (a0() != null) {
            com.adsurge.adn.p066x0.b.b = com.adsurge.adn.N.b.a("dlvncc", 10, this);
            com.adsurge.adn.p066x0.b.c = com.adsurge.adn.N.b.a("dlvnc", 0, this) == 0;
            com.adsurge.adn.p036k1.j.a().a(this);
        }
        if (aVar == com.adsurge.adn.p006a1.a.REWARDVIDEOAD) {
            if (X0()) {
                int iA = a();
                this.w0 = a("skrvct", 30, iA);
                this.x0 = a("skrvrt", 30, iA);
                return;
            } else if (S0()) {
                this.w0 = a("skrhct", 30, 0);
                this.x0 = a("skrhrt", 30, 0);
                return;
            } else {
                this.w0 = a("skrict", 15, 0);
                this.x0 = a("skrirt", 15, 0);
                return;
            }
        }
        if (X0()) {
            this.w0 = a("skivct", 3, a());
        } else if (R0()) {
            this.w0 = a("skiict", 3, 0);
        } else {
            this.w0 = a("skipct", 3, 0);
        }
        this.x0 = Integer.MAX_VALUE;
    }

    public int A0() {
        com.adsurge.adn.Q.g gVarA0 = a0();
        if (gVarA0 == null) {
            return 0;
        }
        return gVarA0.s();
    }

    public final String B0() {
        return K();
    }

    public int E0() {
        return super.a();
    }

    public boolean R0() {
        if (z0() == 1) {
            return true;
        }
        return false;
    }

    public boolean S0() {
        if (z0() == 3) {
            return true;
        }
        return false;
    }

    public boolean U0() {
        if (x() == AdSurgeAdFormat.REWARDED) {
            return true;
        }
        return false;
    }

    public final boolean V0() {
        return !TextUtils.isEmpty(U());
    }

    public boolean W0() {
        if (!S0() && !a0().v()) {
            return false;
        }
        return true;
    }

    public boolean X0() {
        if (z0() == 2) {
            return true;
        }
        return false;
    }

    public final String a(boolean z) {
        boolean zV = a0().v();
        int iZ0 = z0();
        if (zV) {
            if (z) {
                return X();
            }
            if (iZ0 == 1) {
                return P();
            }
            return e0();
        }
        if (iZ0 == 1) {
            return P();
        }
        if (iZ0 == 2) {
            return e0();
        }
        return X();
    }

    public void a1() {
        try {
            R().put("tpl_info", a0().z().toString());
        } catch (Exception unused) {
        }
    }

    @Override // com.adsurge.adn.Y0.g
    public final String e() {
        return h();
    }

    @Override // com.adsurge.adn.Y0.g
    public boolean g() {
        return !TextUtils.isEmpty(D0());
    }

    @Override // com.adsurge.adn.Y0.g
    public final String l() {
        return y();
    }

    public final String o0() {
        return G();
    }

    public final String r0() {
        return P();
    }

    public final int s0() {
        return O();
    }

    public final int t0() {
        return Q();
    }

    public final String y0() {
        com.adsurge.adn.Q.g gVarA0 = a0();
        if (gVarA0 == null) {
            return "";
        }
        return gVarA0.j();
    }

    public int z0() {
        int iQ = a0().q();
        if (iQ == 0) {
            return Y();
        }
        return iQ;
    }

    @Override // com.adsurge.adn.Y0.g
    public String c() {
        return "";
    }

    public final void e(int i) {
        this.G0 = i;
    }

    public final void c(boolean z) {
        this.F0 = z;
    }

    @Override // com.adsurge.adn.Y0.g
    public String f() {
        return y0();
    }

    public void d(boolean z) {
        this.A0 = z;
    }

    public void g(int i) {
        AtomicInteger atomicInteger = this.q0;
        atomicInteger.compareAndSet(atomicInteger.get(), i);
    }

    public void a(AdConfig adConfig) {
        AdConfig.SoundState soundState = adConfig.mute;
        AdSurgeAdFormat adSurgeAdFormatX = x();
        if (adSurgeAdFormatX == AdSurgeAdFormat.APP_OPEN) {
            this.z0 = false;
        } else if (soundState != null && soundState != AdConfig.SoundState.DEFAULT) {
            this.z0 = soundState == AdConfig.SoundState.UNMUTED;
        } else {
            this.z0 = adSurgeAdFormatX == AdSurgeAdFormat.REWARDED;
        }
    }

    @Override // com.adsurge.adn.Y0.g
    public int b() {
        return this.f0;
    }

    public final c b(int i) {
        return null;
    }

    public void b(j jVar) {
        this.n0 = jVar;
    }

    public void b(boolean z) {
        this.p0 = z;
    }

    @Override // com.adsurge.adn.Q.b, com.adsurge.adn.Y0.g
    public int a() {
        return super.a() / 1000;
    }

    public void a(int i) {
        this.l0 = i | this.l0;
    }

    public void a(j jVar) {
        this.o0 = jVar;
    }

    public void a(long j) {
        this.t0 = j;
    }

    public final int a(String str, int i, int i2) {
        int iA = com.adsurge.adn.N.b.a(str, i, this);
        if (i2 <= 0 || iA <= i2) {
            i2 = iA;
        }
        return i2 * 1000;
    }
}
