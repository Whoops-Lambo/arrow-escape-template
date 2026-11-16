package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CacheOfferingCreator")
@SafeParcelable.Reserved({1})
public final class zzbic extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbic> CREATOR = new zzbid();
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final Bundle f;
    public final boolean g;
    public long h;
    public String i;
    public int j;

    public static zzbic d(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String string = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(string);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbic(queryParameter, j, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzj("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public zzbic(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.a = str;
        this.b = j;
        this.c = str2 == null ? "" : str2;
        this.d = str3 == null ? "" : str3;
        this.e = str4 == null ? "" : str4;
        this.f = bundle == null ? new Bundle() : bundle;
        this.g = z;
        this.h = j2;
        this.i = str5;
        this.j = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.a, false);
        SafeParcelWriter.writeLong(parcel, 3, this.b);
        SafeParcelWriter.writeString(parcel, 4, this.c, false);
        SafeParcelWriter.writeString(parcel, 5, this.d, false);
        SafeParcelWriter.writeString(parcel, 6, this.e, false);
        SafeParcelWriter.writeBundle(parcel, 7, this.f, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.g);
        SafeParcelWriter.writeLong(parcel, 9, this.h);
        SafeParcelWriter.writeString(parcel, 10, this.i, false);
        SafeParcelWriter.writeInt(parcel, 11, this.j);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
