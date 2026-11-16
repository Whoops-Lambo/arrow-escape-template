package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.nearby.Nearby;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzqs extends GmsClient {
    public final com.google.android.gms.nearby.uwb.zze a;
    public Long b;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean getUseDynamicLookup() {
        return true;
    }

    public zzqs(Context context, Looper looper, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, com.google.android.gms.nearby.uwb.zze zzeVar) {
        super(context, looper, 298, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = zzeVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
        return iInterfaceQueryLocalInterface instanceof zzos ? (zzos) iInterfaceQueryLocalInterface : new zzos(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.t, com.google.android.gms.nearby.zza.u, com.google.android.gms.nearby.zza.v};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        if (this.b == null) {
            this.b = Long.valueOf(hashCode());
        }
        bundle.putLong("clientId", this.b.longValue());
        if (this.a != null) {
            bundle.putInt("deviceType", 0);
            bundle.putBoolean("isTestOnly", false);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.uwb.internal.INearbyUwbService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.uwb.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                zzos zzosVar = (zzos) getService();
                zzob zzobVar = new zzob();
                Parcel parcelR = zzosVar.r();
                ClassLoader classLoader = zzc.a;
                parcelR.writeInt(1);
                zzobVar.writeToParcel(parcelR, 0);
                zzosVar.A1(1007, parcelR);
            } catch (RemoteException e) {
                Log.w("NearbyUwbClient", "Failed to notify client disconnect.", e);
            }
        }
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 211600000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.a(getContext());
    }
}
