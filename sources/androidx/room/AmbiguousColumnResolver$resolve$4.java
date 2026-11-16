package androidx.room;

import defpackage.rc1;
import defpackage.wr0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/room/AmbiguousColumnResolver$Match;", "it", "Laz2;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
final class AmbiguousColumnResolver$resolve$4 extends rc1 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        int i = AmbiguousColumnResolver.Solution.d;
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            throw null;
        }
        Iterator it2 = list2.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        throw null;
    }
}
