package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfh;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzs;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class ch2 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ch2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what == 0) {
                    u61 u61Var = (u61) this.b;
                    if (message.obj == null) {
                        synchronized (u61Var.b) {
                            try {
                                throw null;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    m93.b();
                }
                return false;
            case 1:
                zzeg zzegVar = (zzeg) this.b;
                zzec zzecVar = zzegVar.c;
                zzecVar.getClass();
                for (fc4 fc4Var : zzegVar.d) {
                    if (!fc4Var.d && fc4Var.c) {
                        zzs zzsVarB = fc4Var.b.b();
                        fc4Var.b = new zzr();
                        fc4Var.c = false;
                        zzecVar.g(fc4Var.a, zzsVarB);
                    }
                    zzea zzeaVar = zzegVar.b;
                    zzeaVar.getClass();
                    if (zzeaVar.zzb(1)) {
                        return true;
                    }
                }
                return true;
            default:
                zzfh zzfhVar = (zzfh) this.b;
                int i = message.what;
                if (i == 1) {
                    zzfhVar.f.a();
                    return true;
                }
                if (i == 2) {
                    zzfhVar.g.a();
                    return true;
                }
                if (i == 3) {
                    zzfhVar.h.a();
                    return true;
                }
                if (i != 4) {
                    return false;
                }
                zzfhVar.i.a();
                return true;
        }
    }
}
