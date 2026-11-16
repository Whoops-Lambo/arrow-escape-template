package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Looper;
import android.os.RemoteException;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.facebook.a0;
import com.facebook.internal.v0;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.internal.ads.zzdjt;
import com.google.android.gms.internal.ads.zzdjz;
import com.google.android.gms.internal.games_v2.zzap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.p071bidmachine.media3.common.util.a;
import io.p071bidmachine.media3.common.util.p;
import io.p071bidmachine.media3.common.util.s;
import io.p071bidmachine.media3.container.o;
import io.p071bidmachine.media3.container.r;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class a50 implements zzap, RemoteCall, zzdjz {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public boolean b;

    public a50(o oVar, r rVar) {
        this.a = 5;
        int i = rVar.a;
        ByteBuffer byteBuffer = rVar.b;
        a.c(i == 6 || i == 3);
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        p pVar = new p(bArr, iMin);
        oVar.getClass();
        o.a(false);
        if (pVar.h()) {
            this.b = false;
            return;
        }
        int i2 = pVar.i(2);
        boolean zH = pVar.h();
        o.a(false);
        if (!zH) {
            this.b = true;
            return;
        }
        boolean zH2 = (i2 == 3 || i2 == 0) ? true : pVar.h();
        pVar.s();
        o.a(!false);
        if (pVar.h()) {
            o.a(!false);
            pVar.s();
        }
        o.a(false);
        if (i2 != 3) {
            pVar.s();
        }
        pVar.t(0);
        if (i2 != 2 && i2 != 0 && !zH2) {
            pVar.t(3);
        }
        this.b = ((i2 == 3 || i2 == 0) ? 255 : pVar.i(8)) != 0;
    }

    public synchronized void a() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        zzah zzahVar = (zzah) obj;
        switch (this.a) {
            case 10:
                zzahVar.zzB(taskCompletionSource, this.b);
                break;
            case 11:
                zzahVar.zzG(taskCompletionSource, this.b);
                break;
            case 13:
                zzahVar.zzu(taskCompletionSource, this.b);
                break;
            case 17:
                zzahVar.zzJ(taskCompletionSource, this.b);
                break;
            case 19:
                zzahVar.zzr(taskCompletionSource, this.b);
                break;
            default:
                zzahVar.zzK(taskCompletionSource, this.b);
                break;
        }
    }

    @Override // com.google.android.gms.internal.games_v2.zzap
    public /* synthetic */ Task b(GoogleApi googleApi) {
        switch (this.a) {
            case 9:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 10)).setMethodKey(6693).build());
            case 12:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 11)).setMethodKey(6727).build());
            case 14:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 13)).setMethodKey(6702).build());
            case 18:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 17)).setMethodKey(6708).build());
            case 20:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 19)).setMethodKey(6710).build());
            default:
                return googleApi.doRead(TaskApiCall.builder().run(new a50(this.b, 21)).setMethodKey(6720).build());
        }
    }

    public void d(boolean z) {
        switch (this.a) {
            case 6:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
            default:
                if (this.b != z) {
                    this.b = z;
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjz
    /* JADX INFO: renamed from: zza */
    public /* synthetic */ void mo82zza(Object obj) {
        zzdjt zzdjtVar = (zzdjt) obj;
        switch (this.a) {
            case 15:
                zzdjtVar.x(this.b);
                break;
            default:
                zzdjtVar.H(this.b);
                break;
        }
    }

    public /* synthetic */ a50(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public a50() {
        this.a = 1;
        v0.U();
        s40 s40Var = new s40(this);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(a0.a());
        localBroadcastManager.getClass();
        if (this.b) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        localBroadcastManager.registerReceiver(s40Var, intentFilter);
        this.b = true;
    }

    public a50(Context context, Looper looper, s sVar, int i) {
        this.a = i;
        switch (i) {
            case 7:
                new io.p071bidmachine.displays.mapper.a(context.getApplicationContext(), 10);
                sVar.a(looper, null);
                break;
            default:
                new io.p071bidmachine.displays.mapper.a(context.getApplicationContext(), 9);
                sVar.a(looper, null);
                break;
        }
    }

    public /* synthetic */ a50(int i) {
        this.a = i;
    }
}
