package defpackage;

import com.google.android.gms.internal.ads.zzcva;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i64 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcva b;

    public /* synthetic */ i64(zzcva zzcvaVar, int i) {
        this.a = i;
        this.b = zzcvaVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzcva zzcvaVar = this.b;
        switch (i) {
            case 0:
                zzcvaVar.b.execute(new i64(zzcvaVar, 1));
                break;
            default:
                zzcvaVar.m();
                break;
        }
    }
}
