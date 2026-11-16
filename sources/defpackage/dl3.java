package defpackage;

import com.google.android.gms.internal.ads.zzaaw;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zznk;
import com.google.android.gms.internal.ads.zzv;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class dl3 extends nl3 implements Comparable {
    public final int e;
    public final int f;

    @Override // defpackage.nl3
    public final /* bridge */ /* synthetic */ boolean a(nl3 nl3Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f, ((dl3) obj).f);
    }

    @Override // defpackage.nl3
    public final int zza() {
        return this.e;
    }

    public dl3(int i, zzbg zzbgVar, int i2, zzaaw zzaawVar, int i3) {
        int i4;
        super(i, zzbgVar, i2);
        this.e = zznk.e(i3, zzaawVar.B) ? 1 : 0;
        zzv zzvVar = this.d;
        int i5 = zzvVar.v;
        int i6 = -1;
        if (i5 != -1 && (i4 = zzvVar.w) != -1) {
            i6 = i5 * i4;
        }
        this.f = i6;
    }
}
