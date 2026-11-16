package com.google.android.gms.internal.location;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.location.zzu;
import defpackage.pr4;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends zzi {
    public final zzav c;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        synchronized (this.c) {
            if (isConnected()) {
                try {
                    this.c.c();
                    zzav zzavVar = this.c;
                    if (zzavVar.c) {
                        pr4 pr4Var = (pr4) zzavVar.a;
                        pr4Var.a.checkConnected();
                        pr4Var.a().E1(false);
                        zzavVar.c = false;
                    }
                } catch (Exception e) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e);
                }
                super.disconnect();
            } else {
                super.disconnect();
            }
            throw th;
        }
    }

    public zzaz(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, String str, ClientSettings clientSettings) {
        super(context, looper, connectionCallbacks, onConnectionFailedListener, str, clientSettings);
        this.c = new zzav(context, this.b);
    }

    public final Location a(String str) {
        boolean zContains = ArrayUtils.contains(getAvailableFeatures(), zzu.a);
        zzav zzavVar = this.c;
        if (zContains) {
            pr4 pr4Var = (pr4) zzavVar.a;
            pr4Var.a.checkConnected();
            return pr4Var.a().zzn(str);
        }
        pr4 pr4Var2 = (pr4) zzavVar.a;
        pr4Var2.a.checkConnected();
        return pr4Var2.a().zzm();
    }
}
