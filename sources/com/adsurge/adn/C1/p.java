package com.adsurge.adn.C1;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public class p {
    public volatile int a;
    public volatile int b;

    /* JADX WARN: Code duplicated, block: B:29:0x0051 A[PHI: r2 r7
  0x0051: PHI (r2v3 int) = (r2v1 int), (r2v1 int), (r2v5 int), (r2v5 int) binds: [B:35:0x0062, B:36:0x0064, B:26:0x004c, B:27:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v0 int), (r7v0 int) binds: [B:35:0x0062, B:36:0x0064, B:26:0x004c, B:27:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    public Pair a(int i, int i2, int i3, int i4) {
        if (this.a == 0 || this.b == 0) {
            return new Pair(0, 0);
        }
        if (i == 1073741824 && i2 == 1073741824) {
            int i5 = this.a * i4;
            int i6 = this.b * i3;
            int i7 = this.a;
            if (i5 < i6) {
                i3 = (i7 * i4) / this.b;
            } else if (i7 * i4 > this.b * i3) {
                i4 = (this.b * i3) / this.a;
            }
        } else if (i == 1073741824) {
            int i8 = (this.b * i3) / this.a;
            if (i2 != Integer.MIN_VALUE || i8 <= i4) {
                i4 = i8;
            }
        } else {
            int i9 = this.a;
            if (i2 == 1073741824) {
                i9 = (i9 * i4) / this.b;
                if (i != Integer.MIN_VALUE || i9 <= i3) {
                    i3 = i9;
                }
            } else {
                int i10 = this.b;
                if (i2 != Integer.MIN_VALUE || i10 <= i4) {
                    i4 = i10;
                } else {
                    i9 = (this.a * i4) / this.b;
                }
                if (i != Integer.MIN_VALUE || i9 <= i3) {
                    i3 = i9;
                } else {
                    i4 = (this.b * i3) / this.a;
                }
            }
        }
        return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
