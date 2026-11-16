package defpackage;

import com.google.android.gms.internal.ads.zzeyj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzeyj b;

    public /* synthetic */ rf4(zzeyj zzeyjVar, int i) {
        this.a = i;
        this.b = zzeyjVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzeyj zzeyjVar = this.b;
        switch (i) {
            case 0:
                zzeyjVar.a.set(new qf4(zzeyjVar.e.zza(), zzeyjVar.f, zzeyjVar.c));
                break;
            default:
                zzeyjVar.d.execute(new rf4(zzeyjVar, 0));
                break;
        }
    }
}
