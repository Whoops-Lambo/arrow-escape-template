package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzaib {
    public final byte[] a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(zzagp zzagpVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        zzagpVar.f(0, 10, bArr);
        zzagpVar.zzl();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }

    public final void b(zzaia zzaiaVar, long j, int i, int i2, int i3, zzahz zzahzVar) {
        zzgvz.g("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                c(zzaiaVar, zzahzVar);
            }
        }
    }

    public final void c(zzaia zzaiaVar, zzahz zzahzVar) {
        if (this.c > 0) {
            zzaiaVar.e(this.d, this.e, this.f, this.g, zzahzVar);
            this.c = 0;
        }
    }
}
