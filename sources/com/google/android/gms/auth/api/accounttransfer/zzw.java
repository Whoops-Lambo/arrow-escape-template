package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.d;
import defpackage.e32;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.wb0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AuthenticatorTransferInfoCreator")
public final class zzw extends zzbz {
    public static final Parcelable.Creator<zzw> CREATOR = new zzx();
    public static final HashMap h;
    public final Set a;
    public final int b;
    public String c;
    public int d;
    public byte[] e;
    public final PendingIntent f;
    public final DeviceMetaData g;

    static {
        HashMap map = new HashMap();
        h = map;
        map.put("accountType", FastJsonResponse.Field.forString("accountType", 2));
        map.put("status", FastJsonResponse.Field.forInteger("status", 3));
        map.put("transferBytes", FastJsonResponse.Field.forBase64("transferBytes", 4));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return h;
    }

    public zzw(HashSet hashSet, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.a = hashSet;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = deviceMetaData;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 1) {
            if (safeParcelableFieldId != 2) {
                if (safeParcelableFieldId != 3) {
                    if (safeParcelableFieldId == 4) {
                        return this.e;
                    }
                    e32.i(pv1.k(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                    return null;
                }
                return Integer.valueOf(this.d);
            }
            return this.c;
        }
        return Integer.valueOf(this.b);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setDecodedBytesInternal(FastJsonResponse.Field field, String str, byte[] bArr) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.e = bArr;
            this.a.add(Integer.valueOf(safeParcelableFieldId));
        } else {
            d.r(jc1.k(safeParcelableFieldId, "Field with id=", " is not known to be a byte array."));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setIntegerInternal(FastJsonResponse.Field field, String str, int i) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 3) {
            this.d = i;
            this.a.add(Integer.valueOf(safeParcelableFieldId));
        } else {
            d.r(jc1.k(safeParcelableFieldId, "Field with id=", " is not known to be an int."));
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.c = str2;
            this.a.add(Integer.valueOf(safeParcelableFieldId));
        } else {
            wb0.g("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            SafeParcelWriter.writeString(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel, 6, this.g, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzw() {
        this.a = new ArraySet(3);
        this.b = 1;
    }
}
