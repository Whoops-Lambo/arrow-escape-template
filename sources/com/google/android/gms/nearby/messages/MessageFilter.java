package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@SafeParcelable.Class(creator = "MessageFilterCreator")
public class MessageFilter extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MessageFilter> CREATOR = new zzb();
    public final int a;
    public final List b;
    public final List c;
    public final boolean d;
    public final List e;
    public final int f;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
        public final HashSet a = new HashSet();
        public final ArrayList b = new ArrayList();
        public final HashSet c = new HashSet();
        public boolean d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.d == messageFilter.d && Objects.equal(this.b, messageFilter.b) && Objects.equal(this.c, messageFilter.c) && Objects.equal(this.e, messageFilter.e);
    }

    static {
        Builder builder = new Builder();
        builder.d = true;
        Preconditions.checkState(true, "At least one of the include methods must be called.");
        new MessageFilter(2, new ArrayList(builder.a), builder.b, builder.d, new ArrayList(builder.c), 0);
    }

    public final int hashCode() {
        return Objects.hashCode(this.b, this.c, Boolean.valueOf(this.d), this.e);
    }

    public final String toString() {
        return "MessageFilter{includeAllMyTypes=" + this.d + ", messageTypes=" + String.valueOf(this.b) + "}";
    }

    public MessageFilter(int i, ArrayList arrayList, List list, boolean z, ArrayList arrayList2, int i2) {
        this.a = i;
        this.b = Collections.unmodifiableList((List) Preconditions.checkNotNull(arrayList));
        this.d = z;
        this.c = Collections.unmodifiableList(list == null ? Collections.EMPTY_LIST : list);
        this.e = Collections.unmodifiableList(arrayList2 == null ? Collections.EMPTY_LIST : arrayList2);
        this.f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, this.b, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.c, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.d);
        SafeParcelWriter.writeTypedList(parcel, 4, this.e, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f);
        SafeParcelWriter.writeInt(parcel, 1000, this.a);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
