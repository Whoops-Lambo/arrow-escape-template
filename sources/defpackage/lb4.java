package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.games.internal.zzah;
import com.google.android.gms.games.internal.zzao;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.games.zzi;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public abstract class lb4 extends Api.AbstractClientBuilder {
    @Override // com.google.android.gms.common.api.Api.BaseClientBuilder
    public final int getPriority() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.Api.AbstractClientBuilder
    public final /* bridge */ /* synthetic */ Api.Client buildClient(Context context, Looper looper, ClientSettings clientSettings, Object obj, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        zzi zziVarZzd = (zzi) obj;
        if (zziVarZzd == null) {
            zziVarZzd = zzi.zza().zzd();
        }
        zzi zziVar = zziVarZzd;
        zzah zzahVar = new zzah(context, looper, clientSettings, zziVar, connectionCallbacks, onConnectionFailedListener, zzao.zza());
        if (zziVar.zzn.zza()) {
            int i = zzf.zza;
            zzahVar.zzp(zzf.zza((Application) context.getApplicationContext()));
        }
        return zzahVar;
    }
}
