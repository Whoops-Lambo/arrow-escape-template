package androidx.collection;

import com.ironsource.C4664b4;
import defpackage.j71;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/collection/LongList;", "", "Landroidx/collection/MutableLongList;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LongList {
    public final int hashCode() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LongList)) {
            return false;
        }
        j71 j71VarD = tb5.D(0, 0);
        if (j71VarD.a > j71VarD.b) {
            return true;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) C4664b4.j.d);
        sb.append((CharSequence) C4664b4.j.e);
        return sb.toString();
    }
}
