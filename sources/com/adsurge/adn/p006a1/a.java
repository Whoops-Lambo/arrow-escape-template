package com.adsurge.adn.p006a1;

import com.adsurge.adn.Y0.f;
import com.adsurge.adn.ads.AdSurgeAdFormat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public enum a implements f {
    APPOPEN(4, 1, 3, 3),
    NATIVEEXPRESSAD(9, 1, 4, 4),
    REWARDVIDEOAD(11, 1, 5, 5),
    NATIVEUNIFIEDAD(12, 1, 6, 6),
    UNIFIED_BANNER(13, 1, 7, 7),
    UNIFIED_INTERSTITIAL(14, 2, 8, 8),
    UNIFIED_INTERSTITIAL_FULLSCREEN(22, 2, 9, 9);

    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* JADX INFO: renamed from: com.adsurge.adn.a1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class C0099a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdSurgeAdFormat.values().length];
            a = iArr;
            try {
                iArr[AdSurgeAdFormat.APP_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AdSurgeAdFormat.REWARDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AdSurgeAdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AdSurgeAdFormat.INTERSTITIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[AdSurgeAdFormat.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public String c() {
        return String.valueOf(this.d);
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this == APPOPEN;
    }

    public boolean f() {
        return this == UNIFIED_BANNER;
    }

    public boolean g() {
        return this == UNIFIED_INTERSTITIAL_FULLSCREEN;
    }

    public boolean h() {
        return this == UNIFIED_INTERSTITIAL;
    }

    public boolean i() {
        return this == NATIVEUNIFIEDAD;
    }

    public boolean j() {
        return this == REWARDVIDEOAD;
    }

    a(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static a a(int i) {
        switch (i) {
            case 3:
                return APPOPEN;
            case 4:
                return NATIVEEXPRESSAD;
            case 5:
                return REWARDVIDEOAD;
            case 6:
                return NATIVEUNIFIEDAD;
            case 7:
                return UNIFIED_BANNER;
            case 8:
                return UNIFIED_INTERSTITIAL;
            case 9:
                return UNIFIED_INTERSTITIAL_FULLSCREEN;
            default:
                return null;
        }
    }

    public AdSurgeAdFormat k() {
        if (j()) {
            return AdSurgeAdFormat.REWARDED;
        }
        if (g()) {
            return AdSurgeAdFormat.INTERSTITIAL;
        }
        if (f()) {
            return AdSurgeAdFormat.BANNER;
        }
        if (i()) {
            return AdSurgeAdFormat.NATIVE;
        }
        if (e()) {
            return AdSurgeAdFormat.APP_OPEN;
        }
        return AdSurgeAdFormat.UNKNOWN;
    }

    public static a a(AdSurgeAdFormat adSurgeAdFormat) {
        int i = C0099a.a[adSurgeAdFormat.ordinal()];
        if (i == 1) {
            return APPOPEN;
        }
        if (i == 2) {
            return REWARDVIDEOAD;
        }
        if (i == 3) {
            return UNIFIED_BANNER;
        }
        if (i == 4) {
            return UNIFIED_INTERSTITIAL_FULLSCREEN;
        }
        if (i != 5) {
            return UNIFIED_INTERSTITIAL_FULLSCREEN;
        }
        return NATIVEUNIFIEDAD;
    }

    @Override // com.adsurge.adn.Y0.f
    public int a() {
        return k().type;
    }
}
