package androidx.compose.foundation;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.Density;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class MagnifierKt$magnifier$4$sourceCenterInRoot$2$1 extends rc1 implements sr0 {
    public final /* synthetic */ Density i;
    public final /* synthetic */ MutableState j;
    public final /* synthetic */ MutableState k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(Density density, MutableState mutableState, MutableState mutableState2) {
        super(0);
        this.i = density;
        this.j = mutableState;
        this.k = mutableState2;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        long j = ((Offset) ((wr0) this.j.getA()).invoke(this.i)).a;
        MutableState mutableState = this.k;
        return new Offset((OffsetKt.c(((Offset) mutableState.getA()).a) && OffsetKt.c(j)) ? Offset.f(((Offset) mutableState.getA()).a, j) : Offset.d);
    }
}
