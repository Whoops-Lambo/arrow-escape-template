package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.internal.ads.zzayj;
import com.google.android.gms.internal.ads.zzazk;
import com.google.android.gms.internal.ads.zzbfh;
import com.google.android.gms.internal.ads.zzgba;
import com.google.android.gms.internal.ads.zzgbb;
import com.google.android.gms.internal.ads.zzgbd;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzigm;
import com.google.android.gms.internal.ads.zzihu;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class tj4 implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    public final zzgba a;
    public final String b;
    public final String c;
    public final LinkedBlockingQueue d;
    public final HandlerThread e;

    public final void a() {
        zzgba zzgbaVar = this.a;
        if (zzgbaVar != null) {
            if (zzgbaVar.isConnected() || zzgbaVar.isConnecting()) {
                zzgbaVar.disconnect();
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzgbf zzgbfVar;
        LinkedBlockingQueue linkedBlockingQueue = this.d;
        HandlerThread handlerThread = this.e;
        try {
            zzgbfVar = (zzgbf) this.a.getService();
        } catch (DeadObjectException | IllegalStateException unused) {
            zzgbfVar = null;
        }
        if (zzgbfVar != null) {
            try {
                try {
                    zzgbb zzgbbVar = new zzgbb(1, this.b, this.c);
                    Parcel parcelZzda = zzgbfVar.zzda();
                    zzbfh.c(parcelZzda, zzgbbVar);
                    Parcel parcelZzdb = zzgbfVar.zzdb(1, parcelZzda);
                    zzgbd zzgbdVar = (zzgbd) zzbfh.b(parcelZzdb, zzgbd.CREATOR);
                    parcelZzdb.recycle();
                    if (zzgbdVar.b == null) {
                        try {
                            byte[] bArr = zzgbdVar.c;
                            zzigm zzigmVar = zzigm.b;
                            int i = dy4.a;
                            zzgbdVar.b = zzazk.M0(bArr, zzigm.c);
                            zzgbdVar.c = null;
                        } catch (zzihu | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    zzgbdVar.r0();
                    linkedBlockingQueue.put(zzgbdVar.b);
                } catch (InterruptedException unused2) {
                } finally {
                    a();
                    handlerThread.quit();
                }
            } catch (Throwable unused3) {
                linkedBlockingQueue.put(b());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.d.put(b());
        } catch (InterruptedException unused) {
        }
    }

    public tj4(Context context, String str, String str2) {
        this.b = str;
        this.c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        zzgba zzgbaVar = new zzgba(context, handlerThread.getLooper(), this, this, 9200000);
        this.a = zzgbaVar;
        this.d = new LinkedBlockingQueue();
        zzgbaVar.checkAvailabilityAndConnect();
    }

    public static zzazk b() {
        zzayj zzayjVarN0 = zzazk.N0();
        zzayjVarN0.p(32768L);
        return (zzazk) zzayjVarN0.m();
    }
}
