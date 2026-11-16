package defpackage;

import com.google.android.gms.internal.ads.zzcva;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j64 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcva b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ j64(zzcva zzcvaVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = zzcvaVar;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        int i2 = this.d;
        int i3 = this.c;
        zzcva zzcvaVar = this.b;
        switch (i) {
            case 0:
                zzcvaVar.b.execute(new j64(zzcvaVar, i3, i2, 1));
                break;
            default:
                zzcvaVar.f(i3 - 1, i2);
                break;
        }
    }
}
