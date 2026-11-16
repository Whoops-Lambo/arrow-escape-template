package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhr;
import com.google.android.gms.internal.ads.zzhw;
import com.google.android.gms.internal.ads.zzia;
import com.google.android.gms.internal.ads.zziu;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class l34 implements zzhw {
    public final zzhr a;
    public final long b;
    public final zzhw c;
    public long d;
    public Uri e;

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void a(zziu zziuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final long e(zzia zziaVar) {
        zzia zziaVar2;
        zzia zziaVar3;
        Uri uri = zziaVar.a;
        long j = zziaVar.d;
        this.e = uri;
        long j2 = zziaVar.c;
        long j3 = this.b;
        if (j2 >= j3) {
            zziaVar2 = null;
        } else {
            long jMin = j3 - j2;
            if (j != -1) {
                jMin = Math.min(j, jMin);
            }
            zziaVar2 = new zzia(uri, j2, jMin);
        }
        if (j == -1 || j2 + j > j3) {
            zziaVar3 = new zzia(uri, Math.max(j3, j2), j != -1 ? Math.min(j, (j2 + j) - j3) : -1L);
        } else {
            zziaVar3 = null;
        }
        long jE = zziaVar2 != 0 ? this.a.e(zziaVar2) : 0L;
        long jE2 = zziaVar3 != null ? this.c.e(zziaVar3) : 0L;
        this.d = j2;
        if (jE == -1 || jE2 == -1) {
            return -1L;
        }
        return jE + jE2;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int i(byte[] bArr, int i, int i2) {
        int i3;
        long j = this.d;
        long j2 = this.b;
        if (j < j2) {
            int i4 = this.a.i(bArr, i, (int) Math.min(i2, j2 - j));
            long j3 = this.d + ((long) i4);
            this.d = j3;
            i3 = i4;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < j2) {
            return i3;
        }
        int i5 = this.c.i(bArr, i + i3, i2 - i3);
        int i6 = i3 + i5;
        this.d += (long) i5;
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Uri zzc() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final void zzd() {
        this.a.zzd();
        this.c.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzhw
    public final Map zzj() {
        return js4.d;
    }

    public l34(zzhr zzhrVar, int i, zzhw zzhwVar) {
        this.a = zzhrVar;
        this.b = i;
        this.c = zzhwVar;
    }
}
