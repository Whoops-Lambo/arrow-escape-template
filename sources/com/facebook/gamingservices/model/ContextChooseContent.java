package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ls;
import defpackage.sx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/gamingservices/model/ContextChooseContent;", "", "CREATOR", "ls", "sx", "facebook-gamingservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ContextChooseContent implements Parcelable {

    @NotNull
    public static final sx CREATOR = new sx();
    public final ArrayList a;
    public final Integer b;
    public final Integer c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List a() {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    public ContextChooseContent(Parcel parcel) {
        this.a = parcel.createStringArrayList();
        this.b = Integer.valueOf(parcel.readInt());
        this.c = Integer.valueOf(parcel.readInt());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        parcel.getClass();
        parcel.writeStringList(this.a);
        int iIntValue2 = 0;
        Integer num = this.b;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        Integer num2 = this.c;
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        parcel.writeInt(iIntValue2);
    }

    public ContextChooseContent(ls lsVar) {
        this.a = (ArrayList) lsVar.b;
        this.b = (Integer) lsVar.c;
        this.c = (Integer) lsVar.d;
    }
}
