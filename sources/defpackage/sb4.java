package defpackage;

import com.google.android.gms.internal.ads.zzeav;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class sb4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzeav b;

    public /* synthetic */ sb4(zzeav zzeavVar, int i) {
        this.a = i;
        this.b = zzeavVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzeav zzeavVar = this.b;
        switch (i) {
            case 0:
                zzeavVar.b.a.c(zzeavVar.a);
                break;
            default:
                zzeavVar.b.a.b(zzeavVar.a);
                break;
        }
    }
}
