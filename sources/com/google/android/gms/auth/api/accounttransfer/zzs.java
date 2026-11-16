package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzbz;
import defpackage.e32;
import defpackage.pv1;
import defpackage.wb0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@SafeParcelable.Class(creator = "AccountTransferProgressCreator")
public final class zzs extends zzbz {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    public static final ArrayMap g;
    public final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isFieldSet(FastJsonResponse.Field field) {
        return true;
    }

    static {
        ArrayMap arrayMap = new ArrayMap(0);
        g = arrayMap;
        arrayMap.put("registered", FastJsonResponse.Field.forStrings("registered", 2));
        arrayMap.put("in_progress", FastJsonResponse.Field.forStrings("in_progress", 3));
        arrayMap.put("success", FastJsonResponse.Field.forStrings("success", 4));
        arrayMap.put("failed", FastJsonResponse.Field.forStrings("failed", 5));
        arrayMap.put("escrowed", FastJsonResponse.Field.forStrings("escrowed", 6));
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return g;
    }

    public zzs(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final Object getFieldValue(FastJsonResponse.Field field) {
        switch (field.getSafeParcelableFieldId()) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                e32.i(pv1.k(field.getSafeParcelableFieldId(), "Unknown SafeParcelable id="));
                return null;
        }
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final void setStringsInternal(FastJsonResponse.Field field, String str, ArrayList arrayList) {
        int safeParcelableFieldId = field.getSafeParcelableFieldId();
        if (safeParcelableFieldId != 2) {
            if (safeParcelableFieldId != 3) {
                if (safeParcelableFieldId != 4) {
                    if (safeParcelableFieldId != 5) {
                        if (safeParcelableFieldId == 6) {
                            this.f = arrayList;
                            return;
                        } else {
                            wb0.g("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(safeParcelableFieldId)});
                            return;
                        }
                    }
                    this.e = arrayList;
                    return;
                }
                this.d = arrayList;
                return;
            }
            this.c = arrayList;
            return;
        }
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.a);
        SafeParcelWriter.writeStringList(parcel, 2, this.b, false);
        SafeParcelWriter.writeStringList(parcel, 3, this.c, false);
        SafeParcelWriter.writeStringList(parcel, 4, this.d, false);
        SafeParcelWriter.writeStringList(parcel, 5, this.e, false);
        SafeParcelWriter.writeStringList(parcel, 6, this.f, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzs() {
        this.a = 1;
    }
}
