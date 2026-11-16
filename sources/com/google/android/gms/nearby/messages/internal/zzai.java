package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.nearby.zzns;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.MessagesOptions;
import defpackage.aq3;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzai extends GmsClient {
    public final zzns a;
    public final ClientAppContext b;
    public final int c;

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i) {
        String str = i != 1 ? "CLIENT_DISCONNECTED" : "ACTIVITY_STOPPED";
        if (!isConnected()) {
            if (Log.isLoggable("NearbyMessagesClient", 3)) {
                Log.d("NearbyMessagesClient", "Failed to emit client lifecycle event " + str + " due to GmsClient being disconnected");
                return;
            }
            return;
        }
        zzj zzjVar = new zzj(1, null, i);
        if (Log.isLoggable("NearbyMessagesClient", 3)) {
            Log.d("NearbyMessagesClient", "Emitting client lifecycle event ".concat(str));
        }
        zzs zzsVar = (zzs) getService();
        Parcel parcelR = zzsVar.r();
        ClassLoader classLoader = com.google.android.gms.internal.nearby.zzc.a;
        parcelR.writeInt(1);
        zzjVar.writeToParcel(parcelR, 0);
        zzsVar.A1(9, parcelR);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        try {
            b(2);
        } catch (RemoteException e) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", String.format("Failed to emit CLIENT_DISCONNECTED from override of GmsClient#disconnect(): %s", e));
            }
        }
        this.a.a.clear();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    public zzai(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        int i;
        int i2;
        super(context, looper, 62, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.a = new zzns();
        String realClientPackageName = clientSettings.getRealClientPackageName();
        if (context instanceof Activity) {
            i2 = 1;
        } else {
            if (!(context instanceof Application)) {
                if (context instanceof Service) {
                    i2 = 3;
                } else {
                    i = 0;
                }
                if (messagesOptions != null) {
                    this.b = new ClientAppContext(1, realClientPackageName, null, null, false, i);
                    this.c = 0;
                } else {
                    this.b = new ClientAppContext(1, realClientPackageName, null, null, false, i);
                    this.c = -1;
                }
            }
            i2 = 2;
        }
        i = i2;
        if (messagesOptions != null) {
            this.b = new ClientAppContext(1, realClientPackageName, null, null, false, i);
            this.c = 0;
        } else {
            this.b = new ClientAppContext(1, realClientPackageName, null, null, false, i);
            this.c = -1;
        }
    }

    public static zzai a(Context context, Looper looper, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener, ClientSettings clientSettings, MessagesOptions messagesOptions) {
        zzai zzaiVar = new zzai(context, looper, connectionCallbacks, onConnectionFailedListener, clientSettings, messagesOptions);
        if ((context instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwich()) {
            Activity activity = (Activity) context;
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                Log.v("NearbyMessagesClient", "Registering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for " + activity.getPackageName());
            }
            activity.getApplication().registerActivityLifecycleCallbacks(new aq3(activity, zzaiVar));
        }
        return zzaiVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
        return iInterfaceQueryLocalInterface instanceof zzs ? (zzs) iInterfaceQueryLocalInterface : new zzs(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.messages.internal.INearbyMessagesService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.messages.service.NearbyMessagesService.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle getServiceRequestExtraArgs = super.getGetServiceRequestExtraArgs();
        getServiceRequestExtraArgs.putInt("NearbyPermissions", this.c);
        getServiceRequestExtraArgs.putParcelable("ClientAppContext", this.b);
        return getServiceRequestExtraArgs;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.a(getContext());
    }
}
