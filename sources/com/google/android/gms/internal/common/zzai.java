package com.google.android.gms.internal.common;

import defpackage.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzai extends zzag {
    public Object[] a;
    public int b;
    public boolean c;

    public zzai(int i) {
        this.a = new Object[4];
        this.b = 0;
    }

    public final void a(Object obj) {
        int i;
        obj.getClass();
        int length = this.a.length;
        int i2 = this.b;
        int i3 = i2 + 1;
        if (i3 >= 0) {
            if (i3 <= length) {
                i = length;
            } else {
                i = (length >> 1) + length + 1;
                if (i < i3) {
                    int iHighestOneBit = Integer.highestOneBit(i2);
                    i = iHighestOneBit + iHighestOneBit;
                }
                if (i < 0) {
                    i = Integer.MAX_VALUE;
                }
            }
            if (i > length || this.c) {
                this.a = Arrays.copyOf(this.a, i);
                this.c = false;
            }
            Object[] objArr = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            objArr[i4] = obj;
            return;
        }
        d.r("cannot store more than Integer.MAX_VALUE elements");
    }

    public zzai() {
        this(0);
    }
}
