package com.bytedance.sdk.openadsdk.core.kus.uq;

import defpackage.ai3;
import defpackage.je3;
import defpackage.le3;
import defpackage.qe3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public class rz extends ai3 {
    private final kgy uq;
    private final List<ahm> kgy = Collections.synchronizedList(new ArrayList());
    private int ahm = 1;
    private int rz = 1;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface ahm extends je3 {
        @Override // defpackage.je3
        /* synthetic */ void ahm(qe3 qe3Var);

        @Override // defpackage.je3
        /* synthetic */ void ahm(qe3 qe3Var, int i);

        @Override // defpackage.je3
        /* synthetic */ void ct(qe3 qe3Var);

        void kgy(int i, int i2);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, int i);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, int i, int i2);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, int i, int i2, int i3);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, long j);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, long j, long j2);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, le3 le3Var);

        @Override // defpackage.je3
        /* synthetic */ void kgy(qe3 qe3Var, boolean z);

        @Override // defpackage.je3
        /* synthetic */ void rz(qe3 qe3Var);

        @Override // defpackage.je3
        /* synthetic */ void uq(qe3 qe3Var);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public class kgy implements je3 {
        private kgy() {
        }

        @Override // defpackage.je3
        public void ahm(qe3 qe3Var) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).ahm(qe3Var);
            }
        }

        @Override // defpackage.je3
        public void ct(qe3 qe3Var) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).ct(qe3Var);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var) {
            rz.kgy(rz.this);
            int i = rz.this.rz;
            int i2 = rz.this.ahm;
            rz rzVar = rz.this;
            if (i > i2) {
                Iterator it = rzVar.kgy.iterator();
                while (it.hasNext()) {
                    ((ahm) it.next()).kgy(qe3Var);
                }
            } else {
                Iterator it2 = rzVar.kgy.iterator();
                while (it2.hasNext()) {
                    ((ahm) it2.next()).kgy(rz.this.rz, rz.this.ahm);
                }
                rz.this.gf();
            }
        }

        @Override // defpackage.je3
        public void rz(qe3 qe3Var) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).rz(qe3Var);
            }
        }

        @Override // defpackage.je3
        public void uq(qe3 qe3Var) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).uq(qe3Var);
            }
        }

        @Override // defpackage.je3
        public void ahm(qe3 qe3Var, int i) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).ahm(qe3Var, i);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, long j) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, j);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, le3 le3Var) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, le3Var);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, boolean z) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, z);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, int i, int i2) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, i, i2);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, int i, int i2, int i3) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, i, i2, i3);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, int i) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, i);
            }
        }

        @Override // defpackage.je3
        public void kgy(qe3 qe3Var, long j, long j2) {
            Iterator it = rz.this.kgy.iterator();
            while (it.hasNext()) {
                ((ahm) it.next()).kgy(qe3Var, j, j2);
            }
        }
    }

    public void rz(int i) {
        this.ahm = Math.max(1, i);
    }

    public int gm() {
        return this.rz;
    }

    @Override // defpackage.ai3
    public void kgy(je3 je3Var) {
        if (!(je3Var instanceof ahm)) {
            super.kgy(je3Var);
        } else {
            if (this.kgy.contains(je3Var)) {
                return;
            }
            this.kgy.add((ahm) je3Var);
        }
    }

    public rz() {
        kgy kgyVar = new kgy();
        this.uq = kgyVar;
        super.kgy(kgyVar);
        kgy(500);
    }

    @Override // defpackage.ai3
    public long um() {
        long jUm = super.um();
        if (this.ahm == 1) {
            return jUm;
        }
        return (((long) (this.rz - 1)) * super.xh()) + jUm;
    }

    @Override // defpackage.ai3
    public long xh() {
        return super.xh() * ((long) this.ahm);
    }

    public static /* synthetic */ int kgy(rz rzVar) {
        int i = rzVar.rz;
        rzVar.rz = i + 1;
        return i;
    }
}
