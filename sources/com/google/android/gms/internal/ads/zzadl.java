package com.google.android.gms.internal.ads;

import defpackage.jo0;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzadl {
    public boolean c;
    public int e;
    public long h;
    public final zzadj i;
    public jo0 a = new jo0(2);
    public jo0 b = new jo0(2);
    public long d = -9223372036854775807L;
    public float f = -1.0f;
    public float g = -1.0f;

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    public final void a(long j) {
        if (j == this.d) {
            return;
        }
        this.h++;
        this.a.f(j);
        if (this.a.e()) {
            this.c = false;
        } else if (this.d != -9223372036854775807L) {
            if (this.c) {
                jo0 jo0Var = this.b;
                long j2 = jo0Var.e;
                if (j2 == 0 ? false : jo0Var.h[(int) ((j2 - 1) % 15)]) {
                    this.b.d();
                    this.b.f(this.d);
                }
            } else {
                this.b.d();
                this.b.f(this.d);
            }
            this.c = true;
            this.b.f(j);
        }
        if (this.c && this.b.e()) {
            jo0 jo0Var2 = this.a;
            this.a = this.b;
            this.b = jo0Var2;
            this.c = false;
        }
        this.d = j;
        this.e = this.a.e() ? 0 : this.e + 1;
        c();
    }

    public final long b() {
        if (!this.a.e()) {
            return -9223372036854775807L;
        }
        jo0 jo0Var = this.a;
        long j = jo0Var.f;
        if (j == 0) {
            return 0L;
        }
        return jo0Var.g / j;
    }

    public final void c() {
        float f;
        boolean zE = this.a.e();
        if (zE) {
            jo0 jo0Var = this.a;
            long j = jo0Var.f;
            f = (float) (1.0E9d / (j != 0 ? jo0Var.g / j : 0L));
        } else {
            f = this.f;
        }
        float f2 = this.g;
        if (f == f2) {
            return;
        }
        if (f != -1.0f && f2 != -1.0f) {
            float f3 = 1.0f;
            if (zE && this.a.g >= 5000000000L) {
                f3 = 0.1f;
            }
            if (Math.abs(f - f2) < f3) {
                return;
            }
        } else if (f == -1.0f && this.e < 30) {
            return;
        }
        this.g = f;
        this.i.j(f);
    }

    public zzadl(zzadj zzadjVar) {
        this.i = zzadjVar;
    }
}
