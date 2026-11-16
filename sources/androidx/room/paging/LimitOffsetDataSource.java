package androidx.room.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PositionalDataSource;
import androidx.room.InvalidationTracker;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@RestrictTo
public abstract class LimitOffsetDataSource<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: androidx.room.paging.LimitOffsetDataSource$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes.dex */
    class AnonymousClass1 extends InvalidationTracker.Observer {
        @Override // androidx.room.InvalidationTracker.Observer
        public final void a(Set set) {
            LimitOffsetDataSource limitOffsetDataSource = null;
            limitOffsetDataSource.invalidate();
            throw null;
        }
    }
}
