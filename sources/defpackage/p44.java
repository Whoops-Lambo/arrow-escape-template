package defpackage;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzcnf;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p44 implements Runnable {
    public final /* synthetic */ zzcnf a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i;
        boolean z;
        boolean z2;
        zzed zzedVar;
        zzed zzedVar2;
        zzed zzedVar3;
        zzcnf zzcnfVar = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        synchronized (zzcnfVar.b) {
            try {
                boolean z5 = zzcnfVar.g;
                if (z5 || i3 != 1) {
                    i = i3;
                    z = false;
                } else {
                    i3 = 1;
                    i = 1;
                    z = true;
                }
                boolean z6 = i2 != i3;
                if (z6 && i == 1) {
                    z2 = true;
                    i = 1;
                } else {
                    z2 = false;
                }
                boolean z7 = z6 && i == 2;
                boolean z8 = z6 && i == 3;
                zzcnfVar.g = z5 || z;
                if (z) {
                    try {
                        zzed zzedVar4 = zzcnfVar.f;
                        if (zzedVar4 != null) {
                            zzedVar4.zze();
                        }
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z2 && (zzedVar3 = zzcnfVar.f) != null) {
                    zzedVar3.zzf();
                }
                if (z7 && (zzedVar2 = zzcnfVar.f) != null) {
                    zzedVar2.zzg();
                }
                if (z8) {
                    zzed zzedVar5 = zzcnfVar.f;
                    if (zzedVar5 != null) {
                        zzedVar5.zzh();
                    }
                    zzcnfVar.a.zzz();
                }
                if (z3 != z4 && (zzedVar = zzcnfVar.f) != null) {
                    zzedVar.zzi(z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ p44(zzcnf zzcnfVar, int i, int i2, boolean z, boolean z2) {
        this.a = zzcnfVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
