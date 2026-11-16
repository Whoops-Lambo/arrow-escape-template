package com.fyber.inneractive.sdk.protobuf;

import defpackage.e32;
import defpackage.nj;
import defpackage.vq2;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class q2 extends c implements RandomAccess {
    public static final q2 d;
    public Object[] b;
    public int c;

    static {
        q2 q2Var = new q2(new Object[0], 0);
        d = q2Var;
        q2Var.a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    public final k1 b(int i) {
        if (i >= this.c) {
            return new q2(Arrays.copyOf(this.b, i), this.c);
        }
        e32.a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (i >= 0 && i < this.c) {
            return this.b[i];
        }
        vq2.q(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    public q2(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c();
        if (i >= 0 && i <= (i2 = this.c)) {
            Object[] objArr = this.b;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[nj.f(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.b, i, objArr2, i + 1, this.c - i);
                this.b = objArr2;
            }
            this.b[i] = obj;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        vq2.q(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        c();
        if (i >= 0 && i < (i2 = this.c)) {
            Object[] objArr = this.b;
            Object obj = objArr[i];
            if (i < i2 - 1) {
                System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
            }
            this.c--;
            ((AbstractList) this).modCount++;
            return obj;
        }
        vq2.q(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        c();
        if (i >= 0 && i < this.c) {
            Object[] objArr = this.b;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            ((AbstractList) this).modCount++;
            return obj2;
        }
        vq2.q(this.c, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i, ", Size:"));
        return null;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i = this.c;
        Object[] objArr = this.b;
        if (i == objArr.length) {
            this.b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
