package com.bytedance.adsdk.ahm.rz.ahm;

import com.bytedance.adsdk.ahm.kgy.kgy.gm;
import defpackage.d;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public class fpp implements rz {
    private final kgy ahm;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm ct;
    private final String kgy;
    private final boolean noq;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm rz;
    private final com.bytedance.adsdk.ahm.rz.kgy.ahm uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public enum kgy {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static kgy kgy(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            d.r("Unknown trim path type ".concat(String.valueOf(i)));
            return null;
        }
    }

    public kgy ahm() {
        return this.ahm;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm ct() {
        return this.ct;
    }

    @Override // com.bytedance.adsdk.ahm.rz.ahm.rz
    public com.bytedance.adsdk.ahm.kgy.kgy.rz kgy(com.bytedance.adsdk.ahm.gf gfVar, com.bytedance.adsdk.ahm.yo yoVar, com.bytedance.adsdk.ahm.rz.rz.kgy kgyVar) {
        return new gm(kgyVar, this);
    }

    public boolean noq() {
        return this.noq;
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm rz() {
        return this.uq;
    }

    public String toString() {
        return "Trim Path: {start: " + this.rz + ", end: " + this.uq + ", offset: " + this.ct + "}";
    }

    public com.bytedance.adsdk.ahm.rz.kgy.ahm uq() {
        return this.rz;
    }

    public fpp(String str, kgy kgyVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar2, com.bytedance.adsdk.ahm.rz.kgy.ahm ahmVar3, boolean z) {
        this.kgy = str;
        this.ahm = kgyVar;
        this.rz = ahmVar;
        this.uq = ahmVar2;
        this.ct = ahmVar3;
        this.noq = z;
    }

    public String kgy() {
        return this.kgy;
    }
}
