package com.google.android.gms.auth.blockstore;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@SafeParcelable.Class(creator = "RetrieveBytesRequestCreator")
public class RetrieveBytesRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<RetrieveBytesRequest> CREATOR = new zzc();
    public final ArrayList a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public Builder() {
            new ArrayList();
        }
    }

    public RetrieveBytesRequest(ArrayList arrayList, boolean z) {
        int i = 0;
        if (z) {
            boolean z2 = true;
            if (arrayList != null && !arrayList.isEmpty()) {
                z2 = false;
            }
            Preconditions.checkState(z2, "retrieveAll was set to true but other constraint(s) was also provided: keys");
        }
        this.b = z;
        this.a = new ArrayList();
        if (arrayList != null) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                Preconditions.checkNotEmpty(str, "Element in keys cannot be null or empty");
                this.a.add(str);
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringList(parcel, 1, Collections.unmodifiableList(this.a), false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.b);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
