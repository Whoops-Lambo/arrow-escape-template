package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4932q3 implements InterfaceC4715e1 {

    @NotNull
    private final S3 a;

    @Nullable
    private final Nd b;

    @NotNull
    private final IronSource.a c;

    /* JADX INFO: renamed from: com.ironsource.q3$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4932q3(@NotNull S3 s3, @Nullable Nd nd, @NotNull IronSource.a aVar) {
        s3.getClass();
        aVar.getClass();
        this.a = s3;
        this.b = nd;
        this.c = aVar;
    }

    @Override // com.ironsource.InterfaceC4715e1
    @Nullable
    public InterfaceC5027v9 a(@NotNull Jd jd) {
        NetworkSettings networkSettingsB;
        C4800ie c4800ieF;
        jd.getClass();
        Nd nd = this.b;
        if (nd == null || (networkSettingsB = nd.b(jd.value())) == null) {
            return null;
        }
        int i = a.a[this.c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 || (c4800ieF = this.a.f()) == null) {
                    return null;
                }
                return new Zd(new C4679c1(networkSettingsB, networkSettingsB.getRewardedVideoSettings(), this.c), c4800ieF);
            }
            L9 l9D = this.a.d();
            if (l9D == null) {
                return null;
            }
            return new O9(new C4679c1(networkSettingsB, networkSettingsB.getInterstitialSettings(), this.c), l9D);
        }
        C4663b3 c4663b3C = this.a.c();
        if (c4663b3C == null) {
            return null;
        }
        return new C4753g3(new C4679c1(networkSettingsB, networkSettingsB.getBannerSettings(), this.c), c4663b3C);
    }
}
