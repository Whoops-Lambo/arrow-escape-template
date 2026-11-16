package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbbu;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcgh;
import com.google.android.gms.internal.ads.zzfun;
import com.google.android.gms.internal.ads.zzfvc;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class u22 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public u22(zzcgh zzcghVar) {
        this.a = 2;
        Objects.requireNonNull(zzcghVar);
        this.b = zzcghVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ls.h((ls) obj, network, true);
                break;
            case 1:
            default:
                super.onAvailable(network);
                break;
            case 2:
                ((zzcgh) obj).p.set(true);
                break;
            case 3:
                zzfun zzfunVar = (zzfun) obj;
                zzfunVar.getClass();
                if (((Boolean) zzba.zzc().a(zzbjr.C)).booleanValue()) {
                    zzfunVar.a(true);
                }
                break;
            case 4:
                ((zzfvc) obj).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                synchronized (zzbbu.class) {
                    ((zzbbu) this.b).a = networkCapabilities;
                    break;
                }
                return;
            case 5:
                mo4 mo4Var = (mo4) this.b;
                synchronized (mo4Var) {
                    mo4Var.d = network;
                    mo4Var.c = networkCapabilities;
                    break;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                ls.h((ls) this.b, network, false);
                return;
            case 1:
                synchronized (zzbbu.class) {
                    ((zzbbu) this.b).a = null;
                    break;
                }
                return;
            case 2:
                ((zzcgh) this.b).p.set(false);
                return;
            case 3:
                zzfun zzfunVar = (zzfun) this.b;
                zzfunVar.getClass();
                if (((Boolean) zzba.zzc().a(zzbjr.C)).booleanValue()) {
                    zzfunVar.a(false);
                    return;
                }
                return;
            case 4:
                ((zzfvc) this.b).b(false);
                return;
            default:
                mo4 mo4Var = (mo4) this.b;
                synchronized (mo4Var) {
                    try {
                        if (network.equals(mo4Var.d)) {
                            mo4Var.d = null;
                            mo4Var.c = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ u22(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public u22(zzfun zzfunVar) {
        this.a = 3;
        Objects.requireNonNull(zzfunVar);
        this.b = zzfunVar;
    }

    public u22(zzfvc zzfvcVar) {
        this.a = 4;
        Objects.requireNonNull(zzfvcVar);
        this.b = zzfvcVar;
    }
}
