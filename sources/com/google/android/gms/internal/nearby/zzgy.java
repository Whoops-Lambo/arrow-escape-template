package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.nearby.Nearby;
import defpackage.el4;
import defpackage.ti4;
import defpackage.yl4;
import java.io.Closeable;
import java.io.File;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzgy extends GmsClient {
    public long a;
    public final ArraySet b;
    public final ArraySet c;
    public final ArraySet d;
    public final ArraySet e;
    public final ArraySet f;
    public zzlt g;

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i) {
        if (i == 1) {
            c();
            i = 1;
        }
        super.onConnectionSuspended(i);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    public zzgy(Context context, Looper looper, ClientSettings clientSettings, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.b = new ArraySet(0);
        this.c = new ArraySet(0);
        this.d = new ArraySet(0);
        this.e = new ArraySet(0);
        this.f = new ArraySet(0);
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            Log.e("NearbyConnections", "Cannot set null temp directory");
        } else {
            zzmd.a = cacheDir;
        }
    }

    public static Status b(int i) {
        String statusCodeString;
        if (i == 8025) {
            statusCodeString = "MISSING_SETTING_LOCATION_MUST_BE_ON";
        } else if (i != 8050) {
            switch (i) {
                case 8000:
                    statusCodeString = "STATUS_NETWORK_NOT_CONNECTED";
                    break;
                case 8001:
                    statusCodeString = "STATUS_ALREADY_ADVERTISING";
                    break;
                case 8002:
                    statusCodeString = "STATUS_ALREADY_DISCOVERING";
                    break;
                case 8003:
                    statusCodeString = "STATUS_ALREADY_CONNECTED_TO_ENDPOINT";
                    break;
                case 8004:
                    statusCodeString = "STATUS_CONNECTION_REJECTED";
                    break;
                case 8005:
                    statusCodeString = "STATUS_NOT_CONNECTED_TO_ENDPOINT";
                    break;
                default:
                    switch (i) {
                        case 8007:
                            statusCodeString = "STATUS_RADIO_ERROR";
                            break;
                        case 8008:
                            statusCodeString = "STATUS_ALREADY_HAVE_ACTIVE_STRATEGY";
                            break;
                        case 8009:
                            statusCodeString = "STATUS_OUT_OF_ORDER_API_CALL";
                            break;
                        case 8010:
                            statusCodeString = "STATUS_UNSUPPORTED_PAYLOAD_TYPE_FOR_STRATEGY";
                            break;
                        case 8011:
                            statusCodeString = "STATUS_ENDPOINT_UNKNOWN";
                            break;
                        case 8012:
                            statusCodeString = "STATUS_ENDPOINT_IO_ERROR";
                            break;
                        case 8013:
                            statusCodeString = "STATUS_PAYLOAD_IO_ERROR";
                            break;
                        case 8014:
                            statusCodeString = "STATUS_PAYLOAD_UNKNOWN";
                            break;
                        case 8015:
                            statusCodeString = "STATUS_ALREADY_LISTENING";
                            break;
                        default:
                            switch (i) {
                                case 8029:
                                    statusCodeString = "MISSING_PERMISSION_NEARBY_WIFI_DEVICES";
                                    break;
                                case 8030:
                                    statusCodeString = "MISSING_PERMISSION_BLUETOOTH";
                                    break;
                                case 8031:
                                    statusCodeString = "MISSING_PERMISSION_BLUETOOTH_ADMIN";
                                    break;
                                case 8032:
                                    statusCodeString = "MISSING_PERMISSION_ACCESS_WIFI_STATE";
                                    break;
                                case 8033:
                                    statusCodeString = "MISSING_PERMISSION_CHANGE_WIFI_STATE";
                                    break;
                                case 8034:
                                    statusCodeString = "MISSING_PERMISSION_ACCESS_COARSE_LOCATION";
                                    break;
                                case 8035:
                                    statusCodeString = "MISSING_PERMISSION_RECORD_AUDIO";
                                    break;
                                case 8036:
                                    statusCodeString = "MISSING_PERMISSION_ACCESS_FINE_LOCATION";
                                    break;
                                case 8037:
                                    statusCodeString = "MISSING_PERMISSION_BLUETOOTH_SCAN";
                                    break;
                                case 8038:
                                    statusCodeString = "MISSING_PERMISSION_BLUETOOTH_ADVERTISE";
                                    break;
                                case 8039:
                                    statusCodeString = "MISSING_PERMISSION_BLUETOOTH_CONNECT";
                                    break;
                                default:
                                    statusCodeString = CommonStatusCodes.getStatusCodeString(i);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            statusCodeString = "API_CONNECTION_FAILED_ALREADY_IN_USE";
        }
        return new Status(i, statusCodeString);
    }

    public final void c() {
        SimpleArrayMap simpleArrayMap;
        SimpleArrayMap simpleArrayMap2;
        Iterator it = this.b.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                break;
            }
            el4 el4Var = (el4) indexBasedArrayIterator.next();
            synchronized (el4Var) {
                try {
                    Iterator it2 = el4Var.b.iterator();
                    while (true) {
                        IndexBasedArrayIterator indexBasedArrayIterator2 = (IndexBasedArrayIterator) it2;
                        if (!indexBasedArrayIterator2.hasNext()) {
                            break;
                        }
                        el4Var.a.notifyListener(new ti4((String) indexBasedArrayIterator2.next(), 2));
                    }
                    el4Var.b.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Iterator it3 = this.c.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator3 = (IndexBasedArrayIterator) it3;
            if (!indexBasedArrayIterator3.hasNext()) {
                break;
            } else {
                ((yl4) indexBasedArrayIterator3.next()).zzf();
            }
        }
        Iterator it4 = this.d.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator4 = (IndexBasedArrayIterator) it4;
            if (!indexBasedArrayIterator4.hasNext()) {
                break;
            } else {
                ((yl4) indexBasedArrayIterator4.next()).zzf();
            }
        }
        Iterator it5 = this.e.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator5 = (IndexBasedArrayIterator) it5;
            if (!indexBasedArrayIterator5.hasNext()) {
                break;
            } else {
                ((yl4) indexBasedArrayIterator5.next()).zzf();
            }
        }
        Iterator it6 = this.f.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator6 = (IndexBasedArrayIterator) it6;
            if (!indexBasedArrayIterator6.hasNext()) {
                break;
            } else {
                ((yl4) indexBasedArrayIterator6.next()).zzf();
            }
        }
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        zzlt zzltVar = this.g;
        if (zzltVar != null) {
            synchronized (zzltVar) {
                try {
                    zzltVar.a.shutdownNow();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        simpleArrayMap = zzltVar.b;
                        if (i2 >= simpleArrayMap.c) {
                            break;
                        }
                        IOUtils.closeQuietly((Closeable) simpleArrayMap.j(i2));
                        i2++;
                    }
                    simpleArrayMap.clear();
                    int i3 = 0;
                    while (true) {
                        simpleArrayMap2 = zzltVar.c;
                        if (i3 >= simpleArrayMap2.c) {
                            break;
                        }
                        IOUtils.closeQuietly((Closeable) simpleArrayMap2.j(i3));
                        i3++;
                    }
                    simpleArrayMap2.clear();
                    while (true) {
                        SimpleArrayMap simpleArrayMap3 = zzltVar.d;
                        if (i < simpleArrayMap3.c) {
                            zzmb zzmbVar = (zzmb) simpleArrayMap3.j(i);
                            IOUtils.closeQuietly(zzmbVar.d);
                            IOUtils.closeQuietly(zzmbVar.g);
                            i++;
                        } else {
                            simpleArrayMap3.clear();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.g = null;
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof zzkd ? (zzkd) iInterfaceQueryLocalInterface : new zzkd(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.a, com.google.android.gms.nearby.zza.n, com.google.android.gms.nearby.zza.r, com.google.android.gms.nearby.zza.p, com.google.android.gms.nearby.zza.s, com.google.android.gms.nearby.zza.o, com.google.android.gms.nearby.zza.b, com.google.android.gms.nearby.zza.q};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.a);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final /* bridge */ /* synthetic */ void onConnectedLocked(IInterface iInterface) {
        super.onConnectedLocked((zzkd) iInterface);
        this.g = new zzlt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        zzkd zzkdVar = (zzkd) getService();
        zzmy zzmyVar = new zzmy();
        Parcel parcelR = zzkdVar.r();
        ClassLoader classLoader = zzc.a;
        parcelR.writeInt(1);
        zzmyVar.writeToParcel(parcelR, 0);
        zzkdVar.z1(2002, parcelR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                zzkd zzkdVar = (zzkd) getService();
                zzfp zzfpVar = new zzfp();
                Parcel parcelR = zzkdVar.r();
                ClassLoader classLoader = zzc.a;
                parcelR.writeInt(1);
                zzfpVar.writeToParcel(parcelR, 0);
                zzkdVar.z1(2011, parcelR);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        c();
        super.disconnect();
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
