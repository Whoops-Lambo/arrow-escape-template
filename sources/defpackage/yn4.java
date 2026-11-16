package defpackage;

import com.google.android.gms.internal.ads.zzgil;
import com.google.android.gms.internal.ads.zzhdo;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yn4 implements zzhdo {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn4 b;
    public final /* synthetic */ zzgil c;

    public /* synthetic */ yn4(zn4 zn4Var, zzgil zzgilVar, int i) {
        this.a = i;
        this.b = zn4Var;
        this.c = zzgilVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhdo
    public final ListenableFuture zza(Object obj) {
        int i = this.a;
        zzgil zzgilVar = this.c;
        zn4 zn4Var = this.b;
        switch (i) {
            case 0:
                xu4 xu4VarB = zn4Var.a.b(zzgilVar);
                zn4Var.d.e(20303, xu4VarB);
                return xu4VarB;
            default:
                xu4 xu4VarB2 = zn4Var.a.b(zzgilVar);
                zn4Var.d.e(20303, xu4VarB2);
                return xu4VarB2;
        }
    }
}
