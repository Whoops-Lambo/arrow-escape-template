package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Shader;
import android.os.RemoteException;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.gamessignin.AuthScope;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.internal.ads.zzbjr;
import com.google.android.gms.internal.ads.zzcha;
import com.google.android.gms.internal.ads.zzdfl;
import com.google.android.gms.internal.ads.zzeng;
import com.google.android.gms.internal.ads.zzenh;
import com.google.android.gms.internal.ads.zzesf;
import com.google.android.gms.internal.ads.zzfrj;
import com.google.android.gms.internal.ads.zzfrt;
import com.google.android.gms.internal.ads.zzhed;
import com.google.android.gms.internal.games_v2.zzfn;
import com.google.android.gms.internal.games_v2.zzi;
import com.google.android.gms.internal.games_v2.zzq;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.p071bidmachine.util.gradient.a;
import io.p071bidmachine.util.gradient.b;
import io.p071bidmachine.util.gradient.e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class ma implements e, Continuation, RemoteCall, zzdfl, zzhed {
    public boolean a;
    public Object b;
    public Object c;

    public synchronized void c() {
        ((zzcha) this.c).zzc(null);
    }

    public synchronized void d(int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        e(new zze(i, zzesf.c(i, ((zzeng) this.b).a), AdError.UNDEFINED_DOMAIN, null, null));
    }

    public synchronized void e(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) zzba.zzc().a(zzbjr.M6)).booleanValue()) {
            i = 3;
        }
        ((zzcha) this.c).zzd(new zzenh(i, zzeVar));
    }

    public /* synthetic */ ma(boolean z, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
    }

    public void a(boolean z) {
        la laVar = (la) this.c;
        Context context = (Context) this.b;
        if (z && !this.a) {
            Util.registerReceiverNotExported(context, laVar, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.a = true;
        } else {
            if (z || !this.a) {
                return;
            }
            context.unregisterReceiver(laVar);
            this.a = false;
        }
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
        ((zzah) obj).zzS((TaskCompletionSource) obj2, (String) this.b, this.a, AuthScope.zza((List) this.c));
    }

    @Override // io.p071bidmachine.util.gradient.e
    public Shader b(boolean z) {
        b bVar;
        return (this.a && (bVar = (b) this.c) != null && z) ? bVar : (a) this.b;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        wx2 wx2Var = (wx2) this.b;
        zzq zzqVar = (zzq) this.c;
        boolean z = this.a;
        wx2Var.getClass();
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            if ((exception instanceof ApiException) && ((ApiException) exception).getStatusCode() == 20) {
                zzfn.a("GamesAuthenticator", "Service connection suspended during the first sign-in attempt. Trying again.");
                Activity activityZzd = ((zzf) wx2Var.c).zzd();
                ei3 ei3Var = (ei3) wx2Var.d;
                zzi zziVar = (zzi) ei3Var.c;
                return (activityZzd != null ? new p45(activityZzd, p45.a, zziVar, GoogleApi.Settings.DEFAULT_SETTINGS) : new p45((Application) ei3Var.b, p45.a, zziVar, GoogleApi.Settings.DEFAULT_SETTINGS)).a(zzqVar, z);
            }
        }
        return task;
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zza(Throwable th) {
        zzfrj zzfrjVar = (zzfrj) this.c;
        if (zzfrjVar.zzb()) {
            zzfrt zzfrtVar = (zzfrt) this.b;
            zzfrjVar.e(th);
            zzfrjVar.zzd(false);
            zzfrtVar.a(zzfrjVar);
            if (this.a) {
                zzfrtVar.i();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public void zzb(Object obj) {
        zzfrj zzfrjVar = (zzfrj) this.c;
        zzfrjVar.zzd(true);
        zzfrt zzfrtVar = (zzfrt) this.b;
        zzfrtVar.a(zzfrjVar);
        if (this.a) {
            zzfrtVar.i();
        }
    }
}
