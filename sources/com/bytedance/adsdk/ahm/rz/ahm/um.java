package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.Paint;
import com.bytedance.adsdk.ahm.kgy.kgy.sx;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class um implements rz {
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm ahm;
    private final com.bytedance.adsdk.ahm.rz.kgy.uq ct;
    private final ahm fi;
    private final float gf;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm noq;
    private final boolean ra;
    private final List<com.bytedance.adsdk.ahm.rz.kgy.ahm> rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.kgy uq;
    private final kgy yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum ahm {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join kgy() {
            int i = AnonymousClass1.ahm[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap kgy() {
            int i = AnonymousClass1.kgy[ordinal()];
            if (i != 1) {
                return i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.ahm.rz.ahm.um$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ahm;
        static final /* synthetic */ int[] kgy;

        static {
            int[] iArr = new int[ahm.values().length];
            ahm = iArr;
            try {
                iArr[ahm.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ahm[ahm.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ahm[ahm.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[kgy.values().length];
            kgy = iArr2;
            try {
                iArr2[kgy.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                kgy[kgy.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                kgy[kgy.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public com.bytedance.adsdk.ahm.rz.kgy.kgy ahm() {
        return this.uq;
    }

    public List<com.bytedance.adsdk.ahm.rz.kgy.ahm> ct() {
        return this.rz;
    }

    public ahm fi() {
        return this.fi;
    }

    public float gf() {
        return this.gf;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new sx(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm noq() {
        return this.ahm;
    }

    public boolean ra() {
        return this.ra;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.uq rz() {
        return this.ct;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm uq() {
        return this.noq;
    }

    public kgy yo() {
        return this.yo;
    }

    public um(String str, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar, List<com.bytedance.adsdk.ahm.rz.kgy.ahm> list, com.bytedance.adsdk.ahm.rz.kgy.kgy kgyVar, com.bytedance.adsdk.ahm.rz.kgy.uq uqVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2, kgy kgyVar2, ahm ahmVar3, float f, boolean z) {
        this.kgy = str;
        this.ahm = ahmVar;
        this.rz = list;
        this.uq = kgyVar;
        this.ct = uqVar;
        this.noq = ahmVar2;
        this.yo = kgyVar2;
        this.fi = ahmVar3;
        this.gf = f;
        this.ra = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
