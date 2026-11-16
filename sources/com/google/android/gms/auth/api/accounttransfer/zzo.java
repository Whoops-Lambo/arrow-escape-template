package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.e32;
import defpackage.pv1;
import defpackage.wb0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AccountTransferMsgCreator")
public final class zzo extends zzbz {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();
    public static final HashMap f;
    public final HashSet a;
    public final int b;
    public ArrayList c;
    public final int d;
    public zzs e;

    static {
        HashMap map = new HashMap();
        f = map;
        map.put("authenticatorData", FastJsonResponse.Field.forConcreteTypeArray("authenticatorData", 2, zzu.class));
        map.put(NotificationCompat.CATEGORY_PROGRESS, FastJsonResponse.Field.forConcreteType(NotificationCompat.CATEGORY_PROGRESS, 4, zzs.class));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final /* synthetic */ Map getFieldMappings() {
        return f;
    }

    public zzo() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 2) {
            this.c = arrayList;
            this.a.add(Integer.valueOf(safeParcelableFieldId));
        } else {
            wb0.g("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(safeParcelableFieldId), arrayList.getClass().getCanonicalName()});
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(FastJsonResponse.Field field, String str, FastJsonResponse fastJsonResponse) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId == 4) {
            this.e = (zzs) fastJsonResponse;
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
                if (safeParcelableFieldId == 4) {
                    return this.e;
                }
                e32.i(pv1.k(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                return null;
            }
            return this.c;
        }
        return Integer.valueOf(this.b);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return this.a.contains(Integer.valueOf(field.getSafeParcelableFieldId()));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        HashSet hashSet = this.a;
        if (hashSet.contains(1)) {
            SafeParcelWriter.writeInt(parcel, 1, this.b);
        }
        if (hashSet.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel, 2, this.c, true);
        }
        if (hashSet.contains(3)) {
            SafeParcelWriter.writeInt(parcel, 3, this.d);
        }
        if (hashSet.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel, 4, this.e, i, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
        this.a = hashSet;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = zzsVar;
    }
}
