package defpackage;

import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzchx;
import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcjj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u24 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ zzchx d;

    public /* synthetic */ u24(zzchx zzchxVar, int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
        this.d = zzchxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        zzchx zzchxVar = this.d;
        switch (i) {
            case 0:
                zzcif zzcifVar = ((zzchv) zzchxVar).q;
                if (zzcifVar != null) {
                    zzcifVar.l(i3, i2);
                }
                break;
            default:
                zzcif zzcifVar2 = ((zzcjj) zzchxVar).g;
                if (zzcifVar2 != null) {
                    zzcifVar2.l(i3, i2);
                }
                break;
        }
    }
}
