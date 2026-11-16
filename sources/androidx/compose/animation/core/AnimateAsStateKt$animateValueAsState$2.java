package androidx.compose.animation.core;

import defpackage.az2;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.vp;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class AnimateAsStateKt$animateValueAsState$2 extends rc1 implements sr0 {
    public final /* synthetic */ vp i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(vp vpVar, Object obj) {
        super(0);
        this.i = vpVar;
        this.j = obj;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        this.i.c(this.j);
        return az2.a;
    }
}
