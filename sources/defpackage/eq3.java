package defpackage;

import com.google.android.gms.internal.ads.zzahd;
import com.google.android.gms.internal.ads.zzahp;
import com.google.android.gms.internal.ads.zzahr;
import com.google.android.gms.internal.ads.zzahs;
import com.google.android.gms.internal.ads.zzahy;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class eq3 extends zzahd {
    public final /* synthetic */ zzahr b;
    public final /* synthetic */ zzahy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq3(zzahy zzahyVar, zzahr zzahrVar, zzahr zzahrVar2) {
        super(zzahrVar);
        this.b = zzahrVar2;
        this.c = zzahyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzahd, com.google.android.gms.internal.ads.zzahr
    public final zzahp a(long j) {
        zzahp zzahpVarA = this.b.a(j);
        zzahs zzahsVar = zzahpVarA.a;
        long j2 = zzahsVar.a;
        long j3 = zzahsVar.b;
        long j4 = this.c.a;
        zzahs zzahsVar2 = new zzahs(j2, j3 + j4);
        zzahs zzahsVar3 = zzahpVarA.b;
        return new zzahp(zzahsVar2, new zzahs(zzahsVar3.a, zzahsVar3.b + j4));
    }
}
