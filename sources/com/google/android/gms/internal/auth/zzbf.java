package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbf extends zzb implements zzbg {
    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean r(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ProxyResponse proxyResponse = (ProxyResponse) zzc.a(parcel, ProxyResponse.CREATOR);
            zzc.b(parcel);
            G1(proxyResponse);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            zzc.b(parcel);
            d(string);
        }
        parcel2.writeNoException();
        return true;
    }

    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }
}
