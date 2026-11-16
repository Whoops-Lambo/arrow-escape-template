package defpackage;

import com.google.android.gms.measurement.internal.zzjl;
import com.google.android.gms.measurement.internal.zzlj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
public final class j15 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzjl b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ zzlj e;

    public /* synthetic */ j15(zzlj zzljVar, zzjl zzjlVar, long j, boolean z, int i) {
        this.a = i;
        this.b = zzjlVar;
        this.c = j;
        this.d = z;
        this.e = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.d;
        zzjl zzjlVar = this.b;
        zzlj zzljVar = this.e;
        switch (i) {
            case 0:
                zzljVar.T(zzjlVar);
                zzljVar.J(zzjlVar, j, z);
                break;
            default:
                zzljVar.T(zzjlVar);
                zzljVar.J(zzjlVar, j, z);
                break;
        }
    }
}
