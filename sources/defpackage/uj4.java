package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzbet;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzfzx;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbk;
import com.google.android.gms.internal.ads.zzgbm;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class uj4 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzgba a;
    public final String b;
    public final String c;
    public final zzbet d;
    public final LinkedBlockingQueue e;
    public final HandlerThread f;
    public final zzfzx g;
    public final long h;

    public final void a() {
        zzgba zzgbaVar = this.a;
        if (zzgbaVar != null) {
            if (zzgbaVar.isConnected() || zzgbaVar.isConnecting()) {
                zzgbaVar.disconnect();
            }
        }
    }

    public final void b(int i, long j, Exception exc) {
        zzfzx zzfzxVar = this.g;
        if (zzfzxVar != null) {
            zzfzxVar.c(i, System.currentTimeMillis() - j, exc);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzgbf zzgbfVar;
        long j = this.h;
        HandlerThread handlerThread = this.f;
        try {
            zzgbfVar = (zzgbf) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzgbfVar = null;
        }
        if (zzgbfVar != null) {
            try {
                zzgbk zzgbkVar = new zzgbk(1, 1, this.d.a, this.b, this.c);
                Parcel parcelZzda = zzgbfVar.zzda();
                zzbfh.c(parcelZzda, zzgbkVar);
                Parcel parcelZzdb = zzgbfVar.zzdb(3, parcelZzda);
                zzgbm zzgbmVar = (zzgbm) zzbfh.b(parcelZzdb, zzgbm.CREATOR);
                parcelZzdb.recycle();
                b(IronSourceConstants.errorCode_internal, j, null);
                this.e.put(zzgbmVar);
            } catch (Throwable th) {
                try {
                    b(2010, j, new Exception(th));
                } finally {
                    a();
                    handlerThread.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            b(4012, this.h, null);
            this.e.put(new zzgbm());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            b(4011, this.h, null);
            this.e.put(new zzgbm());
        } catch (InterruptedException unused) {
        }
    }

    public uj4(Context context, zzbet zzbetVar, String str, String str2, zzfzx zzfzxVar) {
        this.b = str;
        this.d = zzbetVar;
        this.c = str2;
        this.g = zzfzxVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f = handlerThread;
        handlerThread.start();
        this.h = System.currentTimeMillis();
        zzgba zzgbaVar = new zzgba(context, handlerThread.getLooper(), this, this, 19621000);
        this.a = zzgbaVar;
        this.e = new LinkedBlockingQueue();
        zzgbaVar.checkAvailabilityAndConnect();
    }
}
