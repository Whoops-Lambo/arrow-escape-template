package defpackage;

import androidx.media3.common.MimeTypes;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzaof;
import com.google.android.gms.internal.ads.zzaoh;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzfq;
import com.google.android.gms.internal.ads.zzgvz;
import com.google.android.gms.internal.ads.zzj;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzv;
import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vt3 implements zzaia {
    public final zzaia a;
    public final zzaof b;
    public zzaoh g;
    public zzv h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = zzfq.b;
    public final zzey c = new zzey();

    public final void a(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int iMax = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final int c(zzj zzjVar, int i, boolean z) throws EOFException {
        if (this.g == null) {
            return this.a.c(zzjVar, i, z);
        }
        a(i);
        int i2 = zzjVar.i(this.f, this.e, i);
        if (i2 != -1) {
            this.e += i2;
            return i2;
        }
        if (z) {
            return -1;
        }
        d.s();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void e(long j, int i, int i2, int i3, zzahz zzahzVar) {
        if (this.g == null) {
            this.a.e(j, i, i2, i3, zzahzVar);
            return;
        }
        zzgvz.b("DRM on subtitles is not supported", zzahzVar == null);
        int i4 = (this.e - i3) - i2;
        try {
            this.g.a(i4, i2, new ip(this, j, i), this.f);
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            zzeh.d("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void f(zzv zzvVar) {
        String str = zzvVar.o;
        str.getClass();
        zzgvz.a(zzas.f(str) == 3);
        boolean zEquals = zzvVar.equals(this.h);
        zzaof zzaofVar = this.b;
        if (!zEquals) {
            this.h = zzvVar;
            this.g = zzaofVar.b(zzvVar) ? zzaofVar.f(zzvVar) : null;
        }
        zzaoh zzaohVar = this.g;
        zzaia zzaiaVar = this.a;
        if (zzaohVar == null) {
            zzaiaVar.f(zzvVar);
            return;
        }
        zzt zztVar = new zzt(zzvVar);
        zztVar.e(MimeTypes.APPLICATION_MEDIA3_CUES);
        zztVar.j = str;
        zztVar.s = Long.MAX_VALUE;
        zztVar.N = zzaofVar.c(zzvVar);
        zzaiaVar.f(new zzv(zztVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaia
    public final void g(zzey zzeyVar, int i, int i2) {
        if (this.g == null) {
            this.a.g(zzeyVar, i, i2);
            return;
        }
        a(i);
        zzeyVar.H(this.e, i, this.f);
        this.e += i;
    }

    public vt3(zzaia zzaiaVar, zzaof zzaofVar) {
        this.a = zzaiaVar;
        this.b = zzaofVar;
    }
}
