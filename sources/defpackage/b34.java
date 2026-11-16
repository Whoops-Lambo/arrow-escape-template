package defpackage;

import com.google.android.gms.internal.ads.zzcir;
import com.google.android.gms.internal.ads.zzcjj;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b34 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b34(Object obj, boolean z, long j, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        long j = this.c;
        boolean z = this.b;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((zzcjj) obj).c.V(j, z);
                break;
            default:
                ((zzcir) obj).V(j, z);
                break;
        }
    }
}
