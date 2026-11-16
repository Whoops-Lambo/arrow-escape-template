package com.google.android.gms.games.internal.v2.resolution;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.ResultReceiver;
import com.google.android.gms.internal.games_v2.zzfr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
final class zza extends ResultReceiver {
    private final TaskCompletionSource zza;

    public zza() {
        super(new zzfr(Looper.getMainLooper()));
        this.zza = new TaskCompletionSource();
    }

    public final Task zza() {
        return this.zza.getTask();
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        boolean z;
        Intent intent;
        zzc zzcVarZzb;
        super.onReceiveResult(i, bundle);
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (bundle == null || (intent = (Intent) bundle.getParcelable("resultData")) == null) {
            intent = new Intent();
        }
        if (z) {
            zzcVarZzb = zzc.zza(intent);
        } else {
            zzcVarZzb = zzc.zzb(intent);
        }
        this.zza.trySetResult(zzcVarZzb);
    }
}
