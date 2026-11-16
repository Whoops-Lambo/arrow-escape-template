package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zza.zzM();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzsVar.zzV() == null || str == null) {
            return;
        }
        AdMobNetworkBridge.webviewLoadUrl(zzsVar.zzV(), str);
    }

    public /* synthetic */ zzq(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }
}
