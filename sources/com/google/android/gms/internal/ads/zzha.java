package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzha {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final byte l;
    public final byte m;

    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    public zzha(zzgz zzgzVar) {
        boolean z;
        byte bH;
        int i = zzgzVar.a;
        ByteBuffer byteBuffer = zzgzVar.b;
        boolean zG = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        zzgvz.a(z);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        zzet zzetVar = new zzet(bArr, iRemaining);
        this.g = zzetVar.h(3);
        zzetVar.e();
        boolean zG2 = zzetVar.g();
        this.a = zG2;
        if (zG2) {
            zzetVar.h(5);
            this.b = false;
            this.h = false;
        } else {
            if (zzetVar.g()) {
                zzetVar.f(64);
                if (zzetVar.g()) {
                    int i2 = 0;
                    while (!zzetVar.g()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        zzetVar.f(i2);
                    }
                }
                boolean zG3 = zzetVar.g();
                this.b = zG3;
                if (zG3) {
                    zzetVar.f(47);
                }
            } else {
                this.b = false;
            }
            this.h = zzetVar.g();
            int iH = zzetVar.h(5);
            for (int i3 = 0; i3 <= iH; i3++) {
                zzetVar.f(12);
                if (i3 == 0) {
                    if (zzetVar.h(5) > 7) {
                        zzetVar.g();
                    }
                } else if (zzetVar.h(5) > 7) {
                    zzetVar.e();
                }
                if (this.b) {
                    zzetVar.e();
                }
                if (this.h && zzetVar.g()) {
                    if (i3 == 0) {
                        zzetVar.h(4);
                    } else {
                        zzetVar.f(4);
                    }
                }
            }
        }
        int iH2 = zzetVar.h(4);
        int iH3 = zzetVar.h(4);
        zzetVar.f(iH2 + 1);
        zzetVar.f(iH3 + 1);
        if (!this.a) {
            boolean zG4 = zzetVar.g();
            this.c = zG4;
            if (zG4) {
                zzetVar.f(4);
                zzetVar.f(3);
            }
        } else {
            this.c = false;
        }
        zzetVar.f(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            zzetVar.f(4);
            boolean zG5 = zzetVar.g();
            if (zG5) {
                zzetVar.f(2);
            }
            if (zzetVar.g()) {
                this.d = true;
            } else {
                boolean zG6 = zzetVar.g();
                this.d = zG6;
                if (!zG6) {
                    this.e = true;
                }
                if (zG5) {
                    this.f = zzetVar.h(3) + 1;
                } else {
                    this.f = 0;
                }
            }
            if (zzetVar.g()) {
                this.e = true;
            } else {
                this.e = zzetVar.g();
            }
            if (zG5) {
                this.f = zzetVar.h(3) + 1;
            } else {
                this.f = 0;
            }
        }
        zzetVar.f(3);
        boolean zG7 = zzetVar.g();
        if (this.g == 2 && zG7) {
            this.i = zzetVar.g();
        } else {
            this.i = false;
        }
        if (this.g != 1) {
            this.j = zzetVar.g();
        } else {
            this.j = false;
        }
        if (zzetVar.g()) {
            this.l = (byte) zzetVar.h(8);
            this.m = (byte) zzetVar.h(8);
            bH = (byte) zzetVar.h(8);
        } else {
            this.l = (byte) 0;
            this.m = (byte) 0;
            bH = 0;
        }
        if (this.j) {
            zzetVar.e();
            this.k = false;
        } else if (this.l == 1 && this.m == 13 && bH == 0) {
            this.k = false;
        } else {
            zzetVar.e();
            int i4 = this.g;
            if (i4 == 0) {
                this.k = true;
                zG = true;
            } else if (i4 == 1) {
                this.k = false;
            } else if (this.i) {
                boolean zG8 = zzetVar.g();
                this.k = zG8;
                if (zG8) {
                    zG = zzetVar.g();
                }
            } else {
                this.k = true;
            }
            if (this.k && zG) {
                zzetVar.h(2);
            }
        }
        zzetVar.e();
    }
}
