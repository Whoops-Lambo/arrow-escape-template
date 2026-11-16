package com.ironsource;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import defpackage.e32;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4911p0 extends C5083yb {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final If.b b;

    @NotNull
    private final E5 c;

    @NotNull
    private final M8 d;
    private final long e;

    /* JADX INFO: renamed from: com.ironsource.p0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {

        @NotNull
        public static final a a = new a();

        private a() {
        }

        @NotNull
        public static final C4911p0 a(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
            aVar.getClass();
            bVar.getClass();
            return new C4911p0(aVar, bVar);
        }
    }

    @NotNull
    public final IronSource.a e() {
        return this.a;
    }

    @NotNull
    public final E5 f() {
        return this.c;
    }

    public final int g() {
        return Pb.w.d().s().a(this.a);
    }

    public C4911p0(@NotNull C4911p0 c4911p0, @NotNull E0.b bVar) {
        c4911p0.getClass();
        bVar.getClass();
        this.d = Pb.w.d().f();
        this.e = 3600000L;
        IronSource.a aVar = c4911p0.a;
        this.a = aVar;
        this.b = c4911p0.b;
        this.c = new E5(aVar, bVar, c4911p0.c.c(), null, 8, null);
    }

    @NotNull
    public final C4870md a(@NotNull String str) {
        str.getClass();
        C4597ab c4597abA = this.d.a();
        if (c4597abA != null) {
            C4870md c4870mdC = c4597abA.c(LevelPlay.AdFormat.BANNER, str);
            if (c4870mdC != null) {
                return c4870mdC;
            }
            e32.i("Error getting placement");
            return null;
        }
        e32.i("Error getting sdk configurations");
        return null;
    }

    @InterfaceC5065xb
    @NotNull
    public final InterfaceC5096z6.a b(@NotNull LevelPlay.AdFormat adFormat, @NotNull String str) {
        adFormat.getClass();
        str.getClass();
        C4597ab c4597abA = this.d.a();
        if (c4597abA != null) {
            return c4597abA.b(adFormat, str);
        }
        e32.i("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final C4870md c(@NotNull String str) {
        str.getClass();
        C4597ab c4597abA = this.d.a();
        if (c4597abA != null) {
            C4870md c4870mdC = c4597abA.c(LevelPlay.AdFormat.NATIVE_AD, str);
            if (c4870mdC != null) {
                return c4870mdC;
            }
            e32.i("Error getting sdk configurations");
            return null;
        }
        e32.i("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final Za.a d(@NotNull String str) {
        str.getClass();
        C4597ab c4597abA = this.d.a();
        if (c4597abA != null) {
            return c4597abA.a(str);
        }
        e32.i("Error getting sdk configurations");
        return null;
    }

    @NotNull
    public final String d() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    @NotNull
    public final String b(@Nullable String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final long b(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        C4597ab c4597abA = this.d.a();
        return c4597abA != null ? c4597abA.b(adFormat) : this.e;
    }

    @NotNull
    public final com.ironsource.lifecycle.b c() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        bVarD.getClass();
        return bVarD;
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable String str2) {
        String strA = this.b.a(str, str2);
        strA.getClass();
        return strA;
    }

    public static /* synthetic */ String a(C4911p0 c4911p0, String str, String str2, int i, Object obj) {
        if (obj != null) {
            defpackage.d.u("Super calls with default arguments not supported in this target, function: createLogMessage");
            return null;
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c4911p0.a(str, str2);
    }

    @Nullable
    public final C4870md a(@NotNull LevelPlay.AdFormat adFormat, @Nullable String str) {
        C4597ab c4597abA;
        adFormat.getClass();
        if (str == null || (c4597abA = this.d.a()) == null) {
            return null;
        }
        return c4597abA.c(adFormat, str);
    }

    public final void a(@NotNull Map<String, Object> map, @NotNull ISBannerSize iSBannerSize) {
        map.getClass();
        iSBannerSize.getClass();
        com.ironsource.mediationsdk.j.a(map, iSBannerSize);
    }

    @NotNull
    public final ISBannerSize a(@NotNull LevelPlayAdSize levelPlayAdSize) {
        levelPlayAdSize.getClass();
        return new C4857m0().b(levelPlayAdSize);
    }

    public C4911p0(@NotNull IronSource.a aVar, @NotNull E0.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.d = Pb.w.d().f();
        this.e = 3600000L;
        this.a = aVar;
        this.c = new E5(aVar, bVar, null, null, 12, null);
        If.b bVarB = If.b(aVar);
        bVarB.getClass();
        this.b = bVarB;
    }
}
