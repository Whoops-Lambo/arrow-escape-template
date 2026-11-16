package io.p071bidmachine.media3.extractor.ts;

import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.common.util.v;
import io.p071bidmachine.media3.common.util.x;
import io.p071bidmachine.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 implements g0 {
    public final b0 a;
    public final q b = new q(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    @Override // io.p071bidmachine.media3.extractor.ts.g0
    public final void a(int i, q qVar) {
        int iT;
        boolean z = (i & 1) != 0;
        if (z) {
            iT = qVar.b + qVar.t();
        } else {
            iT = -1;
        }
        if (this.f) {
            if (!z) {
                return;
            }
            this.f = false;
            qVar.F(iT);
            this.d = 0;
        }
        while (qVar.a() > 0) {
            int i2 = this.d;
            q qVar2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int iT2 = qVar.t();
                    qVar.F(qVar.b - 1);
                    if (iT2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(qVar.a(), 3 - this.d);
                qVar.e(qVar2.a, this.d, iMin);
                int i3 = this.d + iMin;
                this.d = i3;
                if (i3 == 3) {
                    qVar2.F(0);
                    qVar2.E(3);
                    qVar2.G(1);
                    int iT3 = qVar2.t();
                    int iT4 = qVar2.t();
                    this.e = (iT3 & 128) != 0;
                    int i4 = (((iT3 & 15) << 8) | iT4) + 3;
                    this.c = i4;
                    byte[] bArr = qVar2.a;
                    if (bArr.length < i4) {
                        qVar2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(qVar.a(), this.c - this.d);
                qVar.e(qVar2.a, this.d, iMin2);
                int i5 = this.d + iMin2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        qVar2.E(i6);
                    } else {
                        if (x.l(qVar2.a, 0, i6, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        qVar2.E(this.c - 4);
                    }
                    qVar2.F(0);
                    this.a.c(qVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.g0
    public final void seek() {
        this.f = true;
    }

    @Override // io.p071bidmachine.media3.extractor.ts.g0
    public final void d(v vVar, o oVar, f0 f0Var) {
        this.a.d(vVar, oVar, f0Var);
        this.f = true;
    }

    public c0(b0 b0Var) {
        this.a = b0Var;
    }
}
