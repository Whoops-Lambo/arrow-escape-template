package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zzgs;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhl;
import com.google.android.gms.measurement.internal.zzic;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements zzhl.zza {
    public zzhl c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new zzhl(this);
        }
        zzhl zzhlVar = this.c;
        zzhlVar.getClass();
        zzgu zzguVar = zzic.r(context, null, null, null).f;
        zzic.l(zzguVar);
        zzgs zzgsVar = zzguVar.n;
        zzgs zzgsVar2 = zzguVar.i;
        if (intent == null) {
            zzgsVar2.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        zzgsVar.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                zzgsVar2.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        zzgsVar.a("Starting wakeful intent.");
        zzhlVar.a.getClass();
        SparseArray sparseArray = WakefulBroadcastReceiver.a;
        synchronized (sparseArray) {
            try {
                int i = WakefulBroadcastReceiver.b;
                int i2 = i + 1;
                WakefulBroadcastReceiver.b = i2;
                if (i2 <= 0) {
                    WakefulBroadcastReceiver.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
