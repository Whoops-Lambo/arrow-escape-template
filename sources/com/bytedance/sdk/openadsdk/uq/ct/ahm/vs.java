package com.bytedance.sdk.openadsdk.uq.ct.ahm;

import com.bytedance.sdk.openadsdk.core.model.ioy;
import defpackage.le3;
import defpackage.zg3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class vs {
    private String ahm;
    private ioy ct;
    private long kgy;
    private int rz;
    private zg3 uq;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class kgy {
        private int at;
        private boolean ct;
        private int fi;
        private int gf;
        private le3 kus;
        private int nu;
        private int ra;
        private boolean uq;
        private long kgy = 0;
        private long ahm = 0;
        private long rz = 0;
        private long noq = 0;
        private boolean yo = false;
        private boolean twf = false;

        private void dg() {
            long j = this.rz;
            if (j > 0) {
                long j2 = this.kgy;
                if (j2 > j) {
                    long j3 = j2 % j;
                    this.kgy = j3;
                    if (j3 == 0) {
                        this.kgy = j;
                    }
                }
            }
        }

        public void ahm(long j) {
            this.kgy = j;
            dg();
        }

        public boolean at() {
            return this.yo;
        }

        public int ct() {
            return this.fi;
        }

        public int fi() {
            return this.ra;
        }

        public int gf() {
            return this.nu;
        }

        public long kgy() {
            return this.noq;
        }

        public boolean kus() {
            return this.uq;
        }

        public int noq() {
            return this.gf;
        }

        public boolean nu() {
            return this.twf;
        }

        public int ra() {
            return this.at;
        }

        public long rz() {
            return this.ahm;
        }

        public le3 twf() {
            return this.kus;
        }

        public void uq(long j) {
            this.rz = j;
            dg();
        }

        public boolean vs() {
            return this.ct;
        }

        public int yo() {
            long j = this.rz;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.kgy * 100) / j), 100);
        }

        public void kgy(long j) {
            this.noq = j;
        }

        public void rz(long j) {
            this.ahm = j;
        }

        public void kgy(int i) {
            this.fi = i;
        }

        public void rz(int i) {
            this.ra = i;
        }

        public void kgy(boolean z) {
            this.yo = z;
        }

        public void rz(boolean z) {
            this.ct = z;
        }

        public long ahm() {
            return this.kgy;
        }

        public void kgy(le3 le3Var) {
            this.kus = le3Var;
        }

        public long uq() {
            return this.rz;
        }

        public void ahm(int i) {
            this.gf = i;
        }

        public void uq(int i) {
            this.at = i;
        }

        public void ahm(boolean z) {
            this.uq = z;
        }
    }

    public String ahm() {
        return this.ahm;
    }

    public ioy ct() {
        return this.ct;
    }

    public long kgy() {
        return this.kgy;
    }

    public int rz() {
        return this.rz;
    }

    public zg3 uq() {
        return this.uq;
    }

    public vs(long j, String str, int i, zg3 zg3Var, ioy ioyVar) {
        this.kgy = j;
        this.ahm = str;
        this.rz = i;
        this.uq = zg3Var;
        this.ct = ioyVar;
    }
}
