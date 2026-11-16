package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.e32;
import defpackage.pv1;
import defpackage.wb0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AuthenticatorAnnotatedDataCreator")
public final class zzu extends zzbz {
    public static final Parcelable.Creator<zzu> CREATOR = new zzv();
    public static final HashMap g;
    public final HashSet a;
    public final int b;
    public zzw c;
    public String d;
    public String e;
    public final String f;

    static {
        HashMap map = new HashMap();
        g = map;
        map.put("authenticatorInfo", FastJsonResponse.Field.forConcreteType("authenticatorInfo", 2, zzw.class));
        map.put(InAppPurchaseMetaData.KEY_SIGNATURE, FastJsonResponse.Field.forString(InAppPurchaseMetaData.KEY_SIGNATURE, 3));
        map.put("package", FastJsonResponse.Field.forString("package", 4));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return g;
    }

    public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
        this.a = hashSet;
        this.b = i;
        this.c = zzwVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.c = (zzw) fastJsonResponse;
            this.a.add(Integer.valueOf(safeParcelableFieldId));
        } else {
            wb0.g("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), fastJsonResponse.getClass().getCanonicalName()});
        }
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
                return this.d;
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
    public final void setStringInternal(FastJsonResponse.Field field, String str, String str2) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 3) {
            if (safeParcelableFieldId == 4) {
                this.e = str2;
            } else {
                wb0.g("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
                return;
            }
        } else {
            this.d = str2;
        }
        this.a.add(Integer.valueOf(safeParcelableFieldId));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.b);
        }
        if (hashSet.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel, 2, this.c, i, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.writeString(parcel, 3, this.d, true);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.writeString(parcel, 4, this.e, true);
        }
        if (hashSet.contains(5)) {
            SafeParcelWriter.writeString(parcel, 5, this.f, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzu() {
        this.a = new HashSet(3);
        this.b = 1;
    }
}
