package defpackage;

import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzcif;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class t24 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzchv b;

    public /* synthetic */ t24(zzchv zzchvVar, int i) {
        this.a = i;
        this.b = zzchvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzchv zzchvVar = this.b;
        switch (i) {
            case 0:
                zzcif zzcifVar = zzchvVar.q;
                if (zzcifVar != null) {
                    zzcifVar.i();
                }
                break;
            case 1:
                zzcif zzcifVar2 = zzchvVar.q;
                if (zzcifVar2 != null) {
                    zzcifVar2.e();
                }
                break;
            case 2:
                zzcif zzcifVar3 = zzchvVar.q;
                if (zzcifVar3 != null) {
                    zzcifVar3.h();
                    zzchvVar.q.k();
                }
                break;
            case 3:
                zzcif zzcifVar4 = zzchvVar.q;
                if (zzcifVar4 != null) {
                    if (!zzchvVar.r) {
                        zzcifVar4.m();
                        zzchvVar.r = true;
                    }
                    zzchvVar.q.g();
                }
                break;
            default:
                zzcif zzcifVar5 = zzchvVar.q;
                if (zzcifVar5 != null) {
                    zzcifVar5.h();
                }
                break;
        }
    }
}
