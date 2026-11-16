package defpackage;

import com.google.android.gms.internal.ads.zzfui;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class pi4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfui b;

    public /* synthetic */ pi4(zzfui zzfuiVar, int i) {
        this.a = i;
        this.b = zzfuiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfui zzfuiVar = this.b;
        switch (i) {
            case 0:
                zzfuiVar.m();
                break;
            case 1:
                zzfuiVar.m();
                break;
            case 2:
                zzfuiVar.m();
                break;
            case 3:
                zzfuiVar.m();
                break;
            default:
                zzfuiVar.b.set(false);
                zzfuiVar.m();
                break;
        }
    }
}
