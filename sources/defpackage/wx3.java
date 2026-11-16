package defpackage;

import android.app.AppOpsManager$OnOpActiveChangedListener;
import com.google.android.gms.internal.ads.zzbda;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class wx3 implements AppOpsManager$OnOpActiveChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wx3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        switch (this.a) {
            case 0:
                zzbda zzbdaVar = (zzbda) this.b;
                if (z) {
                    zzbdaVar.a = System.currentTimeMillis();
                    zzbdaVar.d = true;
                    return;
                }
                long j = zzbdaVar.b;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j > 0) {
                    long j2 = zzbdaVar.b;
                    if (jCurrentTimeMillis >= j2) {
                        zzbdaVar.c = jCurrentTimeMillis - j2;
                    }
                }
                zzbdaVar.d = false;
                return;
            default:
                oo4 oo4Var = (oo4) this.b;
                synchronized (oo4Var) {
                    try {
                        if (z) {
                            oo4Var.c = System.currentTimeMillis();
                            oo4Var.f = true;
                        } else {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            long j3 = oo4Var.d;
                            if (j3 > 0 && jCurrentTimeMillis2 >= j3) {
                                oo4Var.e = jCurrentTimeMillis2 - j3;
                            }
                            oo4Var.f = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }
}
