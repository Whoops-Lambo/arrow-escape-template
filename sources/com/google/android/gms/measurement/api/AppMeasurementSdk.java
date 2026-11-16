package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzcm;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import defpackage.db4;
import defpackage.ha4;
import defpackage.m84;
import defpackage.r84;
import defpackage.te4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@ShowFirstParty
@KeepForSdk
public class AppMeasurementSdk {
    public final zzez a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzjp {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzjq {
    }

    @NonNull
    @Keep
    @RequiresPermission
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return zzez.c(context, null).c;
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @KeepForSdk
    public static final class ConditionalUserProperty {
        private ConditionalUserProperty() {
        }
    }

    public final void a(OnEventListener onEventListener) {
        zzez zzezVar = this.a;
        Preconditions.checkNotNull(onEventListener);
        ArrayList arrayList = zzezVar.d;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (onEventListener.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            te4 te4Var = new te4(onEventListener);
            arrayList.add(new Pair(onEventListener, te4Var));
            if (zzezVar.g != null) {
                try {
                    zzezVar.g.registerOnMeasurementEventListener(te4Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            zzezVar.a(new r84(zzezVar, te4Var, 3));
        }
    }

    @Keep
    @KeepForSdk
    public void beginAdUnitExposure(@NonNull @Size String str) {
        zzez zzezVar = this.a;
        zzezVar.a(new m84(zzezVar, str, 1));
    }

    @Keep
    @KeepForSdk
    public void endAdUnitExposure(@NonNull @Size String str) {
        zzez zzezVar = this.a;
        zzezVar.a(new m84(zzezVar, str, 2));
    }

    @Keep
    @KeepForSdk
    public long generateEventId() {
        return this.a.d();
    }

    @Nullable
    @Keep
    @KeepForSdk
    public String getAppInstanceId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 1));
        return zzcmVar.z1(50L);
    }

    @Nullable
    @Keep
    @KeepForSdk
    public String getGmpAppId() {
        zzcm zzcmVar = new zzcm();
        zzez zzezVar = this.a;
        zzezVar.a(new ha4(zzezVar, zzcmVar, 0));
        return zzcmVar.z1(500L);
    }

    @Keep
    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        zzez zzezVar = this.a;
        zzezVar.a(new db4(zzezVar, str, str2, bundle, true));
    }

    public AppMeasurementSdk(zzez zzezVar) {
        this.a = zzezVar;
    }
}
