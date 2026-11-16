package defpackage;

import com.google.android.gms.internal.ads.zzbub;
import com.google.android.gms.internal.ads.zzcly;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f04 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbub b;
    public final /* synthetic */ String c;

    public /* synthetic */ f04(zzbub zzbubVar, String str, int i) {
        this.a = i;
        this.b = zzbubVar;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        String str = this.c;
        zzbub zzbubVar = this.b;
        switch (i) {
            case 0:
                zzcly zzclyVar = zzbubVar.a;
                if (zzclyVar != null) {
                    zzclyVar.loadData(str, "text/html", "UTF-8");
                }
                break;
            default:
                zzcly zzclyVar2 = zzbubVar.a;
                if (zzclyVar2 != null) {
                    zzclyVar2.zza(str);
                }
                break;
        }
    }
}
