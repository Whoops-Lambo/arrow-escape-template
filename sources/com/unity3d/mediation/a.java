package com.unity3d.mediation;

import com.ironsource.mediationsdk.IronSource;
import io.p071bidmachine.ads.networks.adaptiverendering.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    @NotNull
    public static final a a = new a();

    /* JADX INFO: renamed from: com.unity3d.mediation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class C1563a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    private a() {
    }

    @NotNull
    public static final IronSource.a a(@NotNull LevelPlay.AdFormat adFormat) {
        adFormat.getClass();
        int i = C1563a.a[adFormat.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return IronSource.a.NATIVE_AD;
                    }
                    e.b();
                    return null;
                }
                return IronSource.a.REWARDED_VIDEO;
            }
            return IronSource.a.INTERSTITIAL;
        }
        return IronSource.a.BANNER;
    }
}
