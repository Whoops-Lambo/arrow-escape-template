package defpackage;

import com.google.android.gms.internal.ads.zzcif;
import com.google.android.gms.internal.ads.zzcln;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s34 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzcln b;

    public /* synthetic */ s34(zzcln zzclnVar, int i) {
        this.a = i;
        this.b = zzclnVar;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        zzcln zzclnVar = this.b;
        switch (i) {
            case 0:
                zzcif zzcifVar = zzclnVar.e;
                if (zzcifVar != null) {
                    if (!zzclnVar.f) {
                        zzcifVar.m();
                        zzclnVar.f = true;
                    }
                    zzclnVar.e.g();
                }
                break;
            case 1:
                zzcif zzcifVar2 = zzclnVar.e;
                if (zzcifVar2 != null) {
                    zzcifVar2.h();
                }
                break;
            default:
                zzcif zzcifVar3 = zzclnVar.e;
                if (zzcifVar3 != null) {
                    zzcifVar3.f();
                }
                break;
        }
    }
}
