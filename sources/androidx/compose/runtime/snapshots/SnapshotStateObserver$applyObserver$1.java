package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.compose.runtime.collection.MutableVector;
import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.zr0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "applied", "Landroidx/compose/runtime/snapshots/Snapshot;", "<anonymous parameter 1>", "Laz2;", "invoke", "(Ljava/util/Set;Landroidx/compose/runtime/snapshots/Snapshot;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SnapshotStateObserver$applyObserver$1 extends rc1 implements zr0 {
    public final /* synthetic */ SnapshotStateObserver i;

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateObserver$applyObserver$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Laz2;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    final class AnonymousClass2 extends rc1 implements sr0 {
        public final /* synthetic */ SnapshotStateObserver i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SnapshotStateObserver snapshotStateObserver) {
            super(0);
            this.i = snapshotStateObserver;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            MutableVector mutableVector = this.i.d;
            int i = mutableVector.c;
            if (i > 0) {
                Object[] objArr = mutableVector.a;
                int i2 = 0;
                do {
                    SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) objArr[i2];
                    HashSet hashSet = applyMap.c;
                    if (!hashSet.isEmpty()) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            applyMap.a.invoke(it.next());
                        }
                        hashSet.clear();
                    }
                    i2++;
                } while (i2 < i);
            }
            return az2.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateObserver$applyObserver$1(SnapshotStateObserver snapshotStateObserver) {
        super(2);
        this.i = snapshotStateObserver;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        int i;
        Set set = (Set) obj;
        set.getClass();
        ((Snapshot) obj2).getClass();
        SnapshotStateObserver snapshotStateObserver = this.i;
        synchronized (snapshotStateObserver.d) {
            MutableVector mutableVector = snapshotStateObserver.d;
            int i2 = mutableVector.c;
            i = 0;
            if (i2 > 0) {
                Object[] objArr = mutableVector.a;
                int i3 = 0;
                do {
                    SnapshotStateObserver.ApplyMap applyMap = (SnapshotStateObserver.ApplyMap) objArr[i];
                    HashSet hashSet = applyMap.c;
                    IdentityScopeMap identityScopeMap = applyMap.b;
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        int iB = identityScopeMap.b(it.next());
                        if (iB >= 0) {
                            IdentityArraySet.AnonymousClass1 anonymousClass1 = new IdentityArraySet.AnonymousClass1();
                            while (anonymousClass1.hasNext()) {
                                hashSet.add(anonymousClass1.next());
                                i3 = 1;
                            }
                        }
                    }
                    i++;
                } while (i < i2);
                i = i3;
            }
        }
        if (i != 0) {
            SnapshotStateObserver snapshotStateObserver2 = this.i;
            snapshotStateObserver2.a.invoke(new AnonymousClass2(snapshotStateObserver2));
        }
        return az2.a;
    }
}
