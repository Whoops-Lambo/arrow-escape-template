package com.bytedance.adsdk.ahm.rz.ahm;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public class ra implements rz {
    private final kgy ahm;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm ct;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm fi;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm gf;
    private final String kgy;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm noq;
    private final boolean nu;
    private final boolean ra;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> uq;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm yo;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        STAR(1),
        POLYGON(2);

        private final int rz;

        kgy(int i) {
            this.rz = i;
        }

        public static kgy kgy(int i) {
            for (kgy kgyVar : values()) {
                if (kgyVar.rz == i) {
                    return kgyVar;
                }
            }
            return null;
        }
    }

    public kgy ahm() {
        return this.ahm;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm ct() {
        return this.ct;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm fi() {
        return this.fi;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm gf() {
        return this.gf;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new com.bytedance.adsdk.ahm.kgy.kgy.kus(gfVar, kgyVar, this);
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm noq() {
        return this.noq;
    }

    public boolean nu() {
        return this.nu;
    }

    public boolean ra() {
        return this.ra;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm rz() {
        return this.rz;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> uq() {
        return this.uq;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm yo() {
        return this.yo;
    }

    public ra(String str, kgy kgyVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar, com.bytedance.adsdk.ahm.rz.kgy.twf<PointF, PointF> twfVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar3, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar4, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar5, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar6, boolean z, boolean z2) {
        this.kgy = str;
        this.ahm = kgyVar;
        this.rz = ahmVar;
        this.uq = twfVar;
        this.ct = ahmVar2;
        this.noq = ahmVar3;
        this.yo = ahmVar4;
        this.fi = ahmVar5;
        this.gf = ahmVar6;
        this.ra = z;
        this.nu = z2;
    }

    public String kgy() {
        return this.kgy;
    }
}
