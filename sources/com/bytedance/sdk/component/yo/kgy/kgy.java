package com.bytedance.sdk.component.yo.kgy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class kgy {
    private com.bytedance.sdk.component.yo.kgy.ahm.rz ahm;
    private long at;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ct;
    private ct fi;
    private boolean gf;
    private com.bytedance.sdk.component.yo.kgy.kgy.ct kgy;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy noq;
    private int nu;
    private int ra;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy rz;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy uq;
    private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy yo;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.yo.kgy.kgy$kgy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class C0221kgy {
        private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ahm;
        private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ct;
        private boolean fi;
        private com.bytedance.sdk.component.yo.kgy.ahm.rz kgy;
        private ct noq;
        private long nu;
        private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy rz;
        private com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy uq;
        private com.bytedance.sdk.component.yo.kgy.kgy.ct yo;
        private int gf = 5000;
        private int ra = 10;

        public C0221kgy ahm(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
            this.rz = kgyVar;
            return this;
        }

        public kgy kgy() {
            kgy kgyVar = new kgy();
            kgyVar.ahm = this.kgy;
            kgyVar.rz = this.ahm;
            kgyVar.uq = this.rz;
            kgyVar.ct = this.uq;
            kgyVar.noq = this.ct;
            kgyVar.fi = this.noq;
            kgyVar.kgy = this.yo;
            kgyVar.gf = this.fi;
            kgyVar.nu = this.ra;
            kgyVar.ra = this.gf;
            kgyVar.at = this.nu;
            return kgyVar;
        }

        public C0221kgy rz(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
            this.uq = kgyVar;
            return this;
        }

        public C0221kgy ahm(int i) {
            this.ra = i;
            return this;
        }

        public C0221kgy kgy(com.bytedance.sdk.component.yo.kgy.kgy.ct ctVar) {
            this.yo = ctVar;
            return this;
        }

        public C0221kgy kgy(ct ctVar) {
            this.noq = ctVar;
            return this;
        }

        public C0221kgy kgy(com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy kgyVar) {
            this.ahm = kgyVar;
            return this;
        }

        public C0221kgy kgy(com.bytedance.sdk.component.yo.kgy.ahm.rz rzVar) {
            this.kgy = rzVar;
            return this;
        }

        public C0221kgy kgy(int i) {
            this.gf = i;
            return this;
        }

        public C0221kgy kgy(long j) {
            this.nu = j;
            return this;
        }
    }

    public int at() {
        return this.nu;
    }

    public long ct() {
        return this.at;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy fi() {
        return this.uq;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy gf() {
        return this.ct;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy noq() {
        return this.yo;
    }

    public int nu() {
        return this.ra;
    }

    public com.bytedance.sdk.component.yo.kgy.ahm.rz ra() {
        return this.ahm;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy yo() {
        return this.rz;
    }

    private kgy() {
        this.ra = 200;
        this.nu = 10;
    }

    public boolean rz() {
        return this.gf;
    }

    public ct uq() {
        return this.fi;
    }

    public com.bytedance.sdk.component.yo.kgy.uq.ahm.kgy ahm() {
        return this.noq;
    }

    public com.bytedance.sdk.component.yo.kgy.kgy.ct kgy() {
        return this.kgy;
    }
}
