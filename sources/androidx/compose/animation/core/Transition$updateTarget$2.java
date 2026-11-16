package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import defpackage.az2;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class Transition$updateTarget$2 extends rc1 implements zr0 {
    public final /* synthetic */ Transition i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$updateTarget$2(Transition transition, Object obj, int i) {
        super(2);
        this.i = transition;
        this.j = obj;
        this.k = i;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int i = this.k | 1;
        this.i.h(this.j, (Composer) obj, i);
        return az2.a;
    }
}
