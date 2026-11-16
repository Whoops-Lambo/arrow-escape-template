package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.du;
import defpackage.eu;
import defpackage.gg0;
import defpackage.m93;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4597ab extends C4943qe {

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private final InterfaceC5096z6.c a(LevelPlay.AdFormat adFormat, String str) {
        C4981t.b bVarB;
        Hd hdG;
        Map<String, C4981t.b> mapA;
        C4981t.b bVar;
        Hd hdG2;
        boolean z = adFormat == LevelPlay.AdFormat.REWARDED;
        C4981t c4981t = g().a().a().get(adFormat);
        InterfaceC5096z6.c cVarA = null;
        InterfaceC5096z6.c cVarA2 = (c4981t == null || (mapA = c4981t.a()) == null || (bVar = mapA.get(str)) == null || (hdG2 = bVar.g()) == null) ? null : hdG2.a();
        if (c4981t != null && (bVarB = c4981t.b()) != null && (hdG = bVarB.g()) != null) {
            cVarA = hdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        return z ? InterfaceC5096z6.c.PROGRESSIVE_ON_SHOW_SUCCESS : InterfaceC5096z6.c.SINGLE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4597ab(@NotNull C4943qe c4943qe) {
        super(c4943qe);
        c4943qe.getClass();
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        long jLongValue;
        C4981t.b bVarB;
        Long lD;
        adFormat.getClass();
        C4981t c4981t = g().a().a().get(adFormat);
        if (c4981t != null && (bVarB = c4981t.b()) != null && (lD = bVarB.d()) != null) {
            jLongValue = lD.longValue();
        } else {
            jLongValue = 60;
        }
        if (jLongValue > 0) {
            return TimeUnit.MINUTES.toMillis(jLongValue);
        }
        return jLongValue;
    }

    @Nullable
    public final C4870md c(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4870md c4870mdA;
        P9 p9A;
        adFormat.getClass();
        int i = a.a[adFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        Wb wbE = d().c().e();
                        if (wbE != null && str != null) {
                            C4780hc c4780hcA = wbE.a(str);
                            if (c4780hcA == null) {
                                c4780hcA = wbE.e();
                            }
                            if (c4780hcA != null) {
                                return new C4870md(c4780hcA);
                            }
                        }
                        m93.h(adFormat, " configurations", "Error getting ");
                        return null;
                    }
                    io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                    return null;
                }
                C4663b3 c4663b3C = d().c().c();
                if (c4663b3C != null) {
                    C4842l3 c4842l3A = c4663b3C.a(str);
                    if (c4842l3A == null) {
                        c4842l3A = c4663b3C.i();
                        c4842l3A.getClass();
                    }
                    return new C4870md(c4842l3A);
                }
                m93.h(adFormat, " configurations", "Error getting ");
                return null;
            }
            L9 l9D = d().c().d();
            if (l9D == null || (p9A = l9D.a(str)) == null) {
                return null;
            }
            return new C4870md(p9A);
        }
        C4800ie c4800ieF = d().c().f();
        if (c4800ieF == null || (c4870mdA = c4800ieF.a(str)) == null) {
            return null;
        }
        return new C4870md(c4870mdA.b(), c4870mdA.c(), c4870mdA.d(), c4870mdA.f(), c4870mdA.e(), c4870mdA.a());
    }

    @NotNull
    public final List<Ec> d(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        Map<String, Kd.b> mapA;
        Kd.b bVar;
        List<String> listA;
        adFormat.getClass();
        str.getClass();
        Kd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (bVar = mapA.get(str)) != null && (listA = bVar.a()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                Ec ec = g().e().a().get((String) it.next());
                if (ec != null) {
                    arrayList.add(ec);
                }
            }
            return arrayList;
        }
        return gg0.a;
    }

    @Nullable
    public final String h() {
        return g().a().b().c().a();
    }

    @Nullable
    public final Set<String> i() throws JSONException {
        JSONArray jSONArrayE = g().a().b().d().e();
        if (jSONArrayE != null) {
            List<String> listB = C4921pa.b(jSONArrayE);
            listB.getClass();
            return du.E0(listB);
        }
        return null;
    }

    @NotNull
    public final List<LevelPlayAdSize> j() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(eu.f(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float k() {
        return g().a().c().b().b();
    }

    public final boolean l() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        if (aVarA != null && aVarA.c()) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        return g().a().b().e();
    }

    @NotNull
    public final C4924pd b(@NotNull C5083yb c5083yb) {
        c5083yb.getClass();
        return new C4924pd(c5083yb, g().a().a());
    }

    @InterfaceC5065xb
    @NotNull
    public final InterfaceC5096z6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        adFormat.getClass();
        str.getClass();
        return new InterfaceC5096z6.a(a(adFormat, str));
    }

    @NotNull
    public final Za.a a(@NotNull String str) {
        long jD;
        str.getClass();
        C4589a3 c4589a3C = g().a().c();
        C4589a3.a aVar = c4589a3C.a().get(str);
        int iC = aVar != null ? aVar.c() : c4589a3C.b().c();
        boolean zE = aVar != null ? aVar.e() : c4589a3C.b().e();
        if (aVar != null) {
            jD = aVar.d();
        } else {
            jD = c4589a3C.b().d();
        }
        return new Za.a(zE, iC, jD);
    }

    @NotNull
    public final List<String> a(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Kd.b> mapA;
        Set<String> setKeySet;
        adFormat.getClass();
        Kd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null) ? gg0.a : du.z0(setKeySet);
    }

    @NotNull
    public final C5018v0 a(@NotNull C5083yb c5083yb) {
        c5083yb.getClass();
        return new C5018v0(c5083yb, g().a().a());
    }

    @NotNull
    public final List<Ec> d(@NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Kd.b> mapA;
        Set<String> setKeySet;
        adFormat.getClass();
        Kd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(eu.f(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            return du.z0(du.D0(eu.n(arrayList)));
        }
        return gg0.a;
    }

    public final boolean a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        Map<String, Kd.b> mapA;
        str.getClass();
        adFormat.getClass();
        Kd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(str)) ? false : true;
    }

    @NotNull
    public final Wd c(@NotNull C5083yb c5083yb) {
        c5083yb.getClass();
        C4981t c4981t = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Wd(c5083yb, c4981t != null ? c4981t.a() : null, c4981t != null ? c4981t.c() : null);
    }

    @NotNull
    public final List<Kd.c> c(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        return g().d().a(adFormat);
    }
}
