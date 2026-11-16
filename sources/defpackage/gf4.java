package defpackage;

import com.google.android.gms.internal.ads.zzeth;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class gf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzeth b;

    public /* synthetic */ gf4(zzeth zzethVar, int i) {
        this.a = i;
        this.b = zzethVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzeth zzethVar = this.b;
        switch (i) {
            case 0:
                zzethVar.c();
                break;
            case 1:
                zzethVar.c();
                break;
            default:
                zzethVar.getClass();
                zzethVar.f.execute(new gf4(zzethVar, 1));
                break;
        }
    }
}
