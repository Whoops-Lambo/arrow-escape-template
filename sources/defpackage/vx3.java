package defpackage;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.internal.ads.zzbcr;
import com.google.android.gms.internal.ads.zzbjr;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class vx3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzbcr b;

    public /* synthetic */ vx3(zzbcr zzbcrVar, int i) {
        this.a = i;
        this.b = zzbcrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zzbcr zzbcrVar = this.b;
                zzbcrVar.getClass();
                try {
                    if (zzbcrVar.f == null && zzbcrVar.g) {
                        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(zzbcrVar.a);
                        advertisingIdClient.start();
                        zzbcrVar.f = advertisingIdClient;
                        break;
                    }
                } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException unused) {
                    zzbcrVar.f = null;
                    return;
                }
                break;
            default:
                zzbjr.a(this.b.a);
                break;
        }
    }
}
