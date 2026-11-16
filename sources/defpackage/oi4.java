package defpackage;

import com.google.android.gms.internal.ads.zzfui;
import com.google.android.gms.internal.ads.zzfvw;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class oi4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ zzfui b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzfvw d;

    public /* synthetic */ oi4(zzfui zzfuiVar, int i, zzfvw zzfvwVar) {
        this.b = zzfuiVar;
        this.c = i;
        this.d = zzfvwVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzfvw zzfvwVar = this.d;
        int i2 = this.c;
        zzfui zzfuiVar = this.b;
        switch (i) {
            case 0:
                zzfuiVar.o(zzfvwVar, i2);
                break;
            default:
                if (i2 > 0) {
                    zzfuiVar.o(zzfvwVar, i2);
                }
                zzfuiVar.l(0L);
                break;
        }
    }

    public /* synthetic */ oi4(zzfui zzfuiVar, zzfvw zzfvwVar, int i) {
        this.b = zzfuiVar;
        this.d = zzfvwVar;
        this.c = i;
    }
}
