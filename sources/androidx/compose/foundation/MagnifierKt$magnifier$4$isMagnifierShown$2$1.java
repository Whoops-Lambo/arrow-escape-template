package androidx.compose.foundation;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class MagnifierKt$magnifier$4$isMagnifierShown$2$1 extends rc1 implements sr0 {
    public final /* synthetic */ State i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MagnifierKt$magnifier$4$isMagnifierShown$2$1(State state) {
        super(0);
        this.i = state;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        return Boolean.valueOf(OffsetKt.c(((Offset) this.i.getA()).a));
    }
}
