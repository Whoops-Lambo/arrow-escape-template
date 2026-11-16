package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzarq implements zzase {
    public final zzarp a;
    public final zzey b = new zzey(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    @Override // com.google.android.gms.internal.ads.zzase
    public final void b(int i, zzey zzeyVar) {
        int iK;
        int i2 = i & 1;
        if (i2 != 0) {
            iK = zzeyVar.b + zzeyVar.K();
        } else {
            iK = -1;
        }
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            zzeyVar.E(iK);
            this.d = 0;
        }
        while (zzeyVar.B() > 0) {
            int i3 = this.d;
            zzey zzeyVar2 = this.b;
            if (i3 < 3) {
                if (i3 == 0) {
                    int iK2 = zzeyVar.K();
                    zzeyVar.E(zzeyVar.b - 1);
                    if (iK2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int iMin = Math.min(zzeyVar.B(), 3 - this.d);
                zzeyVar.H(this.d, iMin, zzeyVar2.a);
                int i4 = this.d + iMin;
                this.d = i4;
                if (i4 == 3) {
                    zzeyVar2.E(0);
                    zzeyVar2.C(3);
                    zzeyVar2.G(1);
                    int iK3 = zzeyVar2.K();
                    boolean z = (iK3 & 128) != 0;
                    int iK4 = zzeyVar2.K();
                    this.e = z;
                    int i5 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.c = i5;
                    byte[] bArr = zzeyVar2.a;
                    if (bArr.length < i5) {
                        int length = bArr.length;
                        zzeyVar2.A(Math.min(4098, Math.max(i5, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(zzeyVar.B(), this.c - this.d);
                zzeyVar.H(this.d, iMin2, zzeyVar2.a);
                int i6 = this.d + iMin2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        zzeyVar2.C(i7);
                    } else {
                        if (zzfq.h(0, i7, -1, zzeyVar2.a) != 0) {
                            this.f = true;
                            return;
                        }
                        zzeyVar2.C(this.c - 4);
                    }
                    zzeyVar2.E(0);
                    this.a.e(zzeyVar2);
                    this.d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void zzb() {
        this.f = true;
    }

    @Override // com.google.android.gms.internal.ads.zzase
    public final void a(zzfn zzfnVar, zzagr zzagrVar, zzasd zzasdVar) {
        this.a.a(zzfnVar, zzagrVar, zzasdVar);
        this.f = true;
    }

    public zzarq(zzarp zzarpVar) {
        this.a = zzarpVar;
    }
}
