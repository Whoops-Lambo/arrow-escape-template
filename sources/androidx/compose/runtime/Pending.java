package androidx.compose.runtime;

import defpackage.cm2;
import defpackage.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class Pending {
    public final ArrayList a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final HashMap e;
    public final cm2 f;

    public Pending(int i, ArrayList arrayList) {
        this.a = arrayList;
        this.b = i;
        if (i >= 0) {
            this.d = new ArrayList();
            HashMap map = new HashMap();
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                KeyInfo keyInfo = (KeyInfo) this.a.get(i3);
                int i4 = keyInfo.c;
                int i5 = keyInfo.d;
                map.put(Integer.valueOf(i4), new GroupInfo(i3, i2, i5));
                i2 += i5;
            }
            this.e = map;
            this.f = new cm2(new Pending$keyMap$2(this));
            return;
        }
        d.r("Invalid start index");
        throw null;
    }

    public final int a(KeyInfo keyInfo) {
        keyInfo.getClass();
        GroupInfo groupInfo = (GroupInfo) this.e.get(Integer.valueOf(keyInfo.c));
        if (groupInfo != null) {
            return groupInfo.b;
        }
        return -1;
    }

    public final boolean b(int i, int i2) {
        int i3;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.e;
        GroupInfo groupInfo = (GroupInfo) map.get(numValueOf);
        if (groupInfo != null) {
            int i4 = groupInfo.b;
            int i5 = i2 - groupInfo.c;
            groupInfo.c = i2;
            if (i5 != 0) {
                Collection<GroupInfo> collectionValues = map.values();
                collectionValues.getClass();
                for (GroupInfo groupInfo2 : collectionValues) {
                    int i6 = groupInfo2.b;
                    if (i6 >= i4 && groupInfo2 != groupInfo && (i3 = i6 + i5) >= 0) {
                        groupInfo2.b = i3;
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
