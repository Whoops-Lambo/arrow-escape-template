package androidx.compose.animation.core;

import defpackage.rc1;
import defpackage.sr0;
import java.util.ListIterator;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "S", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class Transition$totalDurationNanos$2 extends rc1 implements sr0 {
    public final /* synthetic */ Transition i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition transition) {
        super(0);
        this.i = transition;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        Transition transition = this.i;
        ListIterator listIterator = transition.h.listIterator();
        long jMax = 0;
        while (listIterator.hasNext()) {
            jMax = Math.max(jMax, ((Transition.TransitionAnimationState) listIterator.next()).c().h);
        }
        ListIterator listIterator2 = transition.i.listIterator();
        while (listIterator2.hasNext()) {
            jMax = Math.max(jMax, ((Number) ((Transition) listIterator2.next()).k.getA()).longValue());
        }
        return Long.valueOf(jMax);
    }
}
