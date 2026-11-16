package defpackage;

import com.google.android.gms.internal.measurement.zzaaa;
import com.google.android.gms.internal.measurement.zzyl;
import com.google.android.gms.internal.measurement.zzzc;
import com.google.android.gms.internal.measurement.zzzj;
import com.google.android.gms.internal.measurement.zzzq;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class md5 extends zzaaa {
    public final zzzj b;
    public final zzzj c;
    public final int[] d;
    public final int e;

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final void a(zzzq zzzqVar, zzzc zzzcVar) {
        for (int i = 0; i < this.e; i++) {
            int i2 = this.d[i];
            zzyl zzylVarD = d(i2 & 31);
            if (zzylVarD.c) {
                zzzqVar.b(zzylVarD, new ld5(this, zzylVarD, i2), zzzcVar);
            } else {
                zzzj zzzjVar = this.b;
                int iA = zzzjVar.a();
                if (i2 >= iA) {
                    zzzjVar = this.c;
                    i2 -= iA;
                }
                zzzqVar.a(zzylVarD, zzylVarD.b.cast(zzzjVar.c(i2)), zzzcVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final int b() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.zzaaa
    public final Set c() {
        return new yg2(this, 8);
    }

    public final zzyl d(int i) {
        zzzj zzzjVar = this.b;
        int iA = zzzjVar.a();
        return i >= iA ? this.c.b(i - iA) : zzzjVar.b(i);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    public md5(zzzj zzzjVar, zzzj zzzjVar2) {
        boolean z;
        int i;
        this.b = zzzjVar;
        this.c = zzzjVar2;
        int iA = zzzjVar2.a();
        if (iA <= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int[] iArr = new int[iA];
            this.d = iArr;
            long j = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < iA) {
                zzyl zzylVarD = d(i2);
                long j2 = zzylVarD.e | j;
                if (j2 == j) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            if (zzylVarD.equals(d(iArr[i4] & 31))) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 != -1) {
                        if (zzylVarD.c) {
                            i = iArr[i4] | (1 << (i2 + 4));
                        } else {
                            i = i2;
                        }
                        iArr[i4] = i;
                    } else {
                        iArr[i3] = i2;
                        i3++;
                    }
                } else {
                    iArr[i3] = i2;
                    i3++;
                }
                i2++;
                j = j2;
            }
            this.e = i3;
            return;
        }
        d.r("metadata size too large");
        throw null;
    }
}
