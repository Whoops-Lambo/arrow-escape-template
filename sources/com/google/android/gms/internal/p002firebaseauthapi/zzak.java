package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzak<E> extends zzai {
    public Object[] a = new Object[4];
    public int b = 0;
    public boolean c;

    public final void b(Object obj) {
        Object[] objArr = this.a;
        int iA = zzai.a(objArr.length, this.b + 1);
        if (iA > objArr.length || this.c) {
            this.a = Arrays.copyOf(this.a, iA);
            this.c = false;
        }
        Object[] objArr2 = this.a;
        int i = this.b;
        this.b = i + 1;
        objArr2[i] = obj;
    }
}
