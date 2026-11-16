package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class r0 extends OutputStream implements t0 {
    public final Handler a;
    public final HashMap b = new HashMap();
    public k0 c;
    public u0 d;
    public int e;

    @Override // com.facebook.t0
    public final void b(k0 k0Var) {
        this.c = k0Var;
        this.d = k0Var != null ? (u0) this.b.get(k0Var) : null;
    }

    public final void f(long j) {
        k0 k0Var = this.c;
        if (k0Var == null) {
            return;
        }
        if (this.d == null) {
            u0 u0Var = new u0(this.a, k0Var);
            this.d = u0Var;
            this.b.put(k0Var, u0Var);
        }
        u0 u0Var2 = this.d;
        if (u0Var2 != null) {
            u0Var2.f += j;
        }
        this.e += (int) j;
    }

    public r0(Handler handler) {
        this.a = handler;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
        f(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        f(i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        f(1L);
    }
}
