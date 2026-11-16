package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.az2;
import defpackage.cp0;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.wz2;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "", "anchors", "Laz2;", "<anonymous>", "(Ljava/util/Map;)V"}, k = 3, mv = {1, 6, 0})
final class SwipeableState$animateTo$2 implements cp0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ SwipeableState b;
    public final /* synthetic */ AnimationSpec c;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.cp0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(Map map, dy dyVar) {
        SwipeableState$animateTo$2$emit$1 swipeableState$animateTo$2$emit$1;
        if (dyVar instanceof SwipeableState$animateTo$2$emit$1) {
            swipeableState$animateTo$2$emit$1 = (SwipeableState$animateTo$2$emit$1) dyVar;
            int i = swipeableState$animateTo$2$emit$1.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                swipeableState$animateTo$2$emit$1.v = i - Integer.MIN_VALUE;
            } else {
                swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, dyVar);
            }
        } else {
            swipeableState$animateTo$2$emit$1 = new SwipeableState$animateTo$2$emit$1(this, dyVar);
        }
        Object obj = swipeableState$animateTo$2$emit$1.t;
        int i2 = swipeableState$animateTo$2$emit$1.v;
        try {
            if (i2 == 0) {
                wz2.a0(obj);
                Float fA = SwipeableKt.a(this.a, map);
                if (fA == null) {
                    throw new IllegalArgumentException("The target value must have an associated anchor.");
                }
                SwipeableState swipeableState = this.b;
                float fFloatValue = fA.floatValue();
                AnimationSpec animationSpec = this.c;
                swipeableState$animateTo$2$emit$1.r = this;
                swipeableState$animateTo$2$emit$1.s = map;
                swipeableState$animateTo$2$emit$1.v = 1;
                Object objA = swipeableState.a(fFloatValue, animationSpec, swipeableState$animateTo$2$emit$1);
                dz dzVar = dz.a;
                if (objA == dzVar) {
                    return dzVar;
                }
            } else {
                if (i2 != 1) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = swipeableState$animateTo$2$emit$1.s;
                this = (SwipeableState$animateTo$2) swipeableState$animateTo$2$emit$1.r;
                wz2.a0(obj);
            }
            SwipeableState swipeableState2 = this.b;
            float fFloatValue2 = ((Number) swipeableState2.g.getA()).floatValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (Math.abs(((Number) entry.getKey()).floatValue() - fFloatValue2) < 0.5f) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Object objB0 = du.b0(linkedHashMap.values());
            if (objB0 == null) {
                objB0 = swipeableState2.c.getA();
            }
            swipeableState2.g(objB0);
            return az2.a;
        } catch (Throwable th) {
            SwipeableState swipeableState3 = this.b;
            float fFloatValue3 = ((Number) swipeableState3.g.getA()).floatValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry2 : map.entrySet()) {
                if (Math.abs(((Number) entry2.getKey()).floatValue() - fFloatValue3) < 0.5f) {
                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                }
            }
            Object objB1 = du.b0(linkedHashMap2.values());
            if (objB1 == null) {
                objB1 = swipeableState3.c.getA();
            }
            swipeableState3.g(objB1);
            throw th;
        }
    }

    public SwipeableState$animateTo$2(Object obj, SwipeableState swipeableState, AnimationSpec animationSpec) {
        this.a = obj;
        this.b = swipeableState;
        this.c = animationSpec;
    }
}
