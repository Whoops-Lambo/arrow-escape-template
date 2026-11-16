package defpackage;

import com.google.android.gms.internal.ads.zzfhx;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfhx b;

    public /* synthetic */ vg4(zzfhx zzfhxVar, int i) {
        this.a = i;
        this.b = zzfhxVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzfhx zzfhxVar = this.b;
        switch (i) {
            case 0:
                zzfhxVar.a.d().execute(new vg4(zzfhxVar, 1));
                break;
            default:
                zzfhxVar.O3(5);
                break;
        }
    }
}
