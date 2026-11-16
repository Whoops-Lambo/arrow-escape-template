package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.d7;
import defpackage.jc1;
import defpackage.s71;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/memory/MemoryCache$Key", "Landroid/os/Parcelable;", "coil-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MemoryCache$Key implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR = new d7(22);
    public final String a;
    public final Map b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        return s71.b(this.a, memoryCache$Key.a) && s71.b(this.b, memoryCache$Key.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(key=");
        sb.append(this.a);
        sb.append(", extras=");
        return jc1.r(sb, this.b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Map map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public MemoryCache$Key(String str, Map map) {
        this.a = str;
        this.b = map;
    }
}
