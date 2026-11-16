package defpackage;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzfwd;
import com.google.android.gms.internal.ads.zzfwk;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzfwk b;

    public /* synthetic */ wd4(zzfwk zzfwkVar, int i) {
        this.a = i;
        this.b = zzfwkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zzfwk zzfwkVar = this.b;
        switch (i) {
            case 0:
                zzfwkVar.d();
                break;
            default:
                if (((Boolean) zzba.zzc().a(zzbjr.x6)).booleanValue() && zzfwd.a.a) {
                    zzfwkVar.b();
                    break;
                }
                break;
        }
    }
}
