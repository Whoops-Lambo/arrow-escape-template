package com.bytedance.sdk.openadsdk.xh;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class ahm {
    public static int ahm = 0;
    public static int ct = 3;
    public static int kgy = -1;
    public static int rz = 1;
    public static int uq = 2;
    private int noq = kgy;
    private long yo = 0;
    private long fi = 0;
    private final List<rz> gf = new ArrayList();
    private long ra = 0;

    public void ahm(long j) {
        int i;
        int i2 = this.noq;
        if (i2 == kgy || i2 == (i = ct)) {
            return;
        }
        this.noq = i;
        this.fi = j;
    }

    public long kgy(long j, long j2) {
        long j3;
        long j4;
        long j5;
        long jAhm;
        long j6 = this.fi;
        if (j6 != 0 && j > j6) {
            return 0L;
        }
        int i = 0;
        for (rz rzVar : this.gf) {
            if (rzVar.ahm() > j) {
                if (j < rzVar.kgy()) {
                    j5 = i;
                    jAhm = rzVar.ahm() - rzVar.kgy();
                } else {
                    j5 = i;
                    jAhm = rzVar.ahm() - j;
                }
                i = (int) (jAhm + j5);
            }
        }
        long j7 = this.yo;
        long j8 = this.ra;
        if (j7 < j) {
            if (j8 != 0) {
                if (j8 <= j) {
                    return 0L;
                }
                j4 = j8 - j;
                return j4 - ((long) i);
            }
            long j9 = this.fi;
            if (j9 != 0) {
                return (j9 - j) - ((long) i);
            }
            j3 = j2 - j;
            return j3 - ((long) i);
        }
        if (j8 != 0) {
            if (j8 <= j7) {
                return 0L;
            }
            j4 = j8 - j7;
            return j4 - ((long) i);
        }
        long j10 = this.fi;
        if (j10 != 0) {
            return (j10 - j7) - ((long) i);
        }
        j3 = j2 - j7;
        return j3 - ((long) i);
    }

    public void rz(long j) {
        int i;
        int i2 = this.noq;
        if (i2 == kgy || i2 == (i = uq) || i2 == ct) {
            return;
        }
        this.noq = i;
        this.ra = j;
    }

    public void uq(long j) {
        int i = this.noq;
        if (i == kgy || i != uq) {
            return;
        }
        this.noq = rz;
        this.gf.add(new rz(this.ra, j));
        this.ra = 0L;
    }

    public void kgy(long j) {
        this.noq = ahm;
        this.yo = j;
    }

    public int kgy() {
        return this.noq;
    }
}
