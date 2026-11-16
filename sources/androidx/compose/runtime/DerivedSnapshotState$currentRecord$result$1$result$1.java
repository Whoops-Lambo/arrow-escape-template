package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.StateObject;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.e32;
import defpackage.rc1;
import defpackage.wr0;
import java.util.HashSet;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "Laz2;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class DerivedSnapshotState$currentRecord$result$1$result$1 extends rc1 implements wr0 {
    public final /* synthetic */ DerivedSnapshotState i;
    public final /* synthetic */ HashSet j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState derivedSnapshotState, HashSet hashSet) {
        super(1);
        this.i = derivedSnapshotState;
        this.j = hashSet;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        obj.getClass();
        if (obj != this.i) {
            if (obj instanceof StateObject) {
                this.j.add(obj);
            }
            return az2.a;
        }
        e32.i("A derived state calculation cannot read itself");
        return null;
    }
}
