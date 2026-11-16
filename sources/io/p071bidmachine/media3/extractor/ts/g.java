package io.p071bidmachine.media3.extractor.ts;

import io.p071bidmachine.media3.common.f0;
import io.p071bidmachine.media3.common.m;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.b;
import io.p071bidmachine.media3.common.util.q;
import io.p071bidmachine.media3.extractor.e0;
import io.p071bidmachine.media3.extractor.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements h {
    public final /* synthetic */ int a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public g(List list) {
        this.a = 0;
        this.f = list;
        this.g = new e0[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void c(q qVar) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (qVar.a() == 0) {
                            z2 = false;
                        } else {
                            if (qVar.t() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (qVar.a() == 0) {
                            z = false;
                        } else {
                            if (qVar.t() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = qVar.b;
                    int iA = qVar.a();
                    for (e0 e0Var : (e0[]) this.g) {
                        qVar.F(i);
                        e0Var.d(qVar, iA, 0);
                    }
                    this.e += iA;
                }
                break;
            default:
                q qVar2 = (q) this.f;
                a.j((e0) this.g);
                if (this.b) {
                    int iA2 = qVar.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(qVar.a, qVar.b, qVar2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            qVar2.F(0);
                            if (73 == qVar2.t() && 68 == qVar2.t() && 51 == qVar2.t()) {
                                qVar2.G(3);
                                this.d = qVar2.s() + 10;
                            } else {
                                a.A("Id3Reader", "Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((e0) this.g).d(qVar, iMin2, 0);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void d(o oVar, f0 f0Var) {
        switch (this.a) {
            case 0:
                e0[] e0VarArr = (e0[]) this.g;
                for (int i = 0; i < e0VarArr.length; i++) {
                    e0 e0Var = (e0) ((List) this.f).get(i);
                    f0Var.a();
                    f0Var.b();
                    e0 e0VarTrack = oVar.track(f0Var.d, 3);
                    m mVar = new m();
                    f0Var.b();
                    mVar.a = f0Var.e;
                    mVar.l = f0.p("video/mp2t");
                    mVar.m = f0.p("application/dvbsubs");
                    mVar.p = Collections.singletonList(e0Var.b);
                    mVar.d = e0Var.a;
                    b.d(mVar, e0VarTrack);
                    e0VarArr[i] = e0VarTrack;
                }
                break;
            default:
                f0Var.a();
                f0Var.b();
                e0 e0VarTrack2 = oVar.track(f0Var.d, 5);
                this.g = e0VarTrack2;
                m mVar2 = new m();
                f0Var.b();
                mVar2.a = f0Var.e;
                mVar2.l = f0.p("video/mp2t");
                mVar2.m = f0.p("application/id3");
                b.d(mVar2, e0VarTrack2);
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void packetFinished(boolean z) {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    a.i(this.c != -9223372036854775807L);
                    for (e0 e0Var : (e0[]) this.g) {
                        e0Var.b(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                a.j((e0) this.g);
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    a.i(this.c != -9223372036854775807L);
                    ((e0) this.g).b(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void packetStarted(long j, int i) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    @Override // io.p071bidmachine.media3.extractor.ts.h
    public final void seek() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    public g() {
        this.a = 1;
        this.f = new q(10);
        this.c = -9223372036854775807L;
    }
}
