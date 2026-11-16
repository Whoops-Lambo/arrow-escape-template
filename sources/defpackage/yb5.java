package defpackage;

import com.google.android.gms.internal.ads.zzdu;
import com.google.android.gms.internal.ads.zzxk;
import com.google.android.gms.internal.ads.zzxp;
import com.google.android.gms.internal.ads.zzxt;
import com.google.android.gms.internal.ads.zzyd;
import com.google.android.gms.internal.ads.zzye;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class yb5 implements zzdu {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzyd b;
    public final /* synthetic */ zzxk c;
    public final /* synthetic */ zzxp d;

    public /* synthetic */ yb5(zzyd zzydVar, zzxk zzxkVar, zzxp zzxpVar, int i) {
        this.a = i;
        this.b = zzydVar;
        this.c = zzxkVar;
        this.d = zzxpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdu, com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public final /* synthetic */ void mo82zza(Object obj) {
        int i = this.a;
        zzxp zzxpVar = this.d;
        zzxk zzxkVar = this.c;
        zzxt zzxtVar = this.b.a;
        zzye zzyeVar = (zzye) obj;
        switch (i) {
            case 0:
                zzyeVar.b(0, zzxtVar, zzxkVar, zzxpVar);
                break;
            default:
                zzyeVar.d(0, zzxtVar, zzxkVar, zzxpVar);
                break;
        }
    }
}
