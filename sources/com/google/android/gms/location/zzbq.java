package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.a;
import com.google.android.gms.internal.location.zzbs;
import defpackage.mz3;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@SafeParcelable.Class(creator = "RemoveGeofencingRequestCreator")
@SafeParcelable.Reserved({1000})
public final class zzbq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbq> CREATOR = new zzbr();
    public final zzbs a;
    public final PendingIntent b;
    public final String c;

    public zzbq(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        a aVar;
        if (arrayList == null) {
            mz3 mz3Var = zzbs.b;
            aVar = a.e;
        } else {
            mz3 mz3Var2 = zzbs.b;
            Object[] array = arrayList.toArray();
            int length = array.length;
            for (int i = 0; i < length; i++) {
                if (array[i] == null) {
                    StringBuilder sb = new StringBuilder(20);
                    sb.append("at index ");
                    sb.append(i);
                    throw new NullPointerException(sb.toString());
                }
            }
            if (length == 0) {
                aVar = a.e;
            } else {
                aVar = new a(array, length);
            }
        }
        this.a = aVar;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, this.a, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.c, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
