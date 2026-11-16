package defpackage;

import com.google.android.gms.internal.ads.zzdys;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class cb4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzdys b;

    public /* synthetic */ cb4(zzdys zzdysVar, int i) {
        this.a = i;
        this.b = zzdysVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzdys zzdysVar = this.b;
        switch (i) {
            case 0:
                zzdysVar.c.execute(new cb4(zzdysVar, 1));
                break;
            case 1:
                zzdysVar.a();
                break;
            default:
                zzdysVar.a();
                break;
        }
    }
}
