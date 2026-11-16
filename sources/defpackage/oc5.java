package defpackage;

import com.google.android.gms.internal.ads.zzagl;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzahz;
import com.google.android.gms.internal.ads.zzaia;
import com.google.android.gms.internal.ads.zzey;
import com.google.android.gms.internal.ads.zzj;
import com.google.android.gms.internal.ads.zzzl;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class oc5 extends zzahe {
    public final zzzl b;
    public final zzagl c;
    public final AtomicBoolean d;

    public final zzaia a() {
        return this.d.get() ? this.c : this.b;
    }

    public oc5(zzzl zzzlVar) {
        super(zzzlVar);
        this.b = zzzlVar;
        this.c = new zzagl();
        this.d = new AtomicBoolean(false);
    }

    @Override // com.google.android.gms.internal.ads.zzahe, com.google.android.gms.internal.ads.zzaia
    public final void b(int i, zzey zzeyVar) {
        a().b(i, zzeyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahe, com.google.android.gms.internal.ads.zzaia
    public final int c(zzj zzjVar, int i, boolean z) {
        return a().c(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahe, com.google.android.gms.internal.ads.zzaia
    public final int d(zzj zzjVar, int i, boolean z) {
        return a().d(zzjVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzahe, com.google.android.gms.internal.ads.zzaia
    public final void e(long j, int i, int i2, int i3, zzahz zzahzVar) {
        a().e(j, i, i2, i3, zzahzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahe, com.google.android.gms.internal.ads.zzaia
    public final void g(zzey zzeyVar, int i, int i2) {
        a().g(zzeyVar, i, i2);
    }
}
