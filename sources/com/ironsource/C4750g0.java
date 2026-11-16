package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import defpackage.e80;
import defpackage.eu;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4750g0 {

    @NotNull
    private final IronSource.a a;

    @NotNull
    private final UUID b;

    @NotNull
    private final String c;

    @Nullable
    private C4870md d;

    @Nullable
    private final Tf e;

    @Nullable
    private final Double f;

    /* JADX INFO: renamed from: com.ironsource.g0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @NotNull
    public final IronSource.a a() {
        return this.a;
    }

    @NotNull
    public final UUID b() {
        return this.b;
    }

    @NotNull
    public final String c() {
        return this.c;
    }

    @Nullable
    public final Double d() {
        return this.f;
    }

    @NotNull
    public final LevelPlay.AdFormat e() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return LevelPlay.AdFormat.REWARDED;
        }
        if (i == 2) {
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        if (i == 3) {
            return LevelPlay.AdFormat.BANNER;
        }
        if (i == 4) {
            return LevelPlay.AdFormat.NATIVE_AD;
        }
        io.p071bidmachine.ads.networks.adaptiverendering.e.b();
        return null;
    }

    @Nullable
    public final C4870md f() {
        return this.d;
    }

    @Nullable
    public final Tf g() {
        return this.e;
    }

    public final boolean h() {
        return eu.z(IronSource.a.REWARDED_VIDEO, IronSource.a.INTERSTITIAL).contains(this.a);
    }

    public C4750g0(@NotNull IronSource.a aVar, @NotNull UUID uuid, @NotNull String str, @Nullable C4870md c4870md, @Nullable Tf tf, @Nullable Double d) {
        aVar.getClass();
        uuid.getClass();
        str.getClass();
        this.a = aVar;
        this.b = uuid;
        this.c = str;
        this.d = c4870md;
        this.e = tf;
        this.f = d;
    }

    public final void a(@Nullable C4870md c4870md) {
        this.d = c4870md;
    }

    public /* synthetic */ C4750g0(IronSource.a aVar, UUID uuid, String str, C4870md c4870md, Tf tf, Double d, int i, e80 e80Var) {
        this(aVar, uuid, str, (i & 8) != 0 ? null : c4870md, (i & 16) != 0 ? null : tf, (i & 32) != 0 ? null : d);
    }
}
