package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class Ig {
    public static final int a(Hg hg) {
        hg.getClass();
        int iOrdinal = hg.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 270;
                }
                io.p071bidmachine.ads.networks.adaptiverendering.e.b();
                return 0;
            }
            return 180;
        }
        return 90;
    }

    public static final boolean b(Hg hg) {
        hg.getClass();
        if (hg != Hg.LANDSCAPE && hg != Hg.REVERSE_LANDSCAPE) {
            return false;
        }
        return true;
    }

    public static final Hg a(byte b) {
        if (b == 1) {
            return Hg.PORTRAIT;
        }
        if (b == 2) {
            return Hg.REVERSE_PORTRAIT;
        }
        if (b == 3) {
            return Hg.LANDSCAPE;
        }
        if (b == 4) {
            return Hg.REVERSE_LANDSCAPE;
        }
        return Hg.PORTRAIT;
    }
}
