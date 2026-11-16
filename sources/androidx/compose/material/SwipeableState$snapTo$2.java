package androidx.compose.material;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.cp0;
import defpackage.dy;
import defpackage.wz2;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "Laz2;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 6, 0})
final class SwipeableState$snapTo$2 implements cp0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Map map, dy dyVar) {
        SwipeableState$snapTo$2$emit$1 swipeableState$snapTo$2$emit$1;
        if (dyVar instanceof SwipeableState$snapTo$2$emit$1) {
            swipeableState$snapTo$2$emit$1 = (SwipeableState$snapTo$2$emit$1) dyVar;
            int i = swipeableState$snapTo$2$emit$1.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$snapTo$2$emit$1.u = i - Integer.MIN_VALUE;
            } else {
                swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, dyVar);
            }
        } else {
            swipeableState$snapTo$2$emit$1 = new SwipeableState$snapTo$2$emit$1(this, dyVar);
        }
        Object obj = swipeableState$snapTo$2$emit$1.s;
        int i2 = swipeableState$snapTo$2$emit$1.u;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SwipeableState$snapTo$2 swipeableState$snapTo$2 = (SwipeableState$snapTo$2) swipeableState$snapTo$2$emit$1.r;
            wz2.a0(obj);
            swipeableState$snapTo$2.getClass();
            throw null;
        }
        wz2.a0(obj);
        if (SwipeableKt.a(null, map) == null) {
            throw new IllegalArgumentException("The target value must have an associated anchor.");
        }
        swipeableState$snapTo$2$emit$1.r = this;
        swipeableState$snapTo$2$emit$1.u = 1;
        throw null;
    }

    @Override // defpackage.cp0
    public final /* bridge */ /* synthetic */ Object emit(Object obj, dy dyVar) {
        a((Map) obj, dyVar);
        throw null;
    }
}
