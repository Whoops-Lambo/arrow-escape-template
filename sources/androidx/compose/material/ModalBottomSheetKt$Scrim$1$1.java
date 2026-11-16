package androidx.compose.material;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.az2;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class ModalBottomSheetKt$Scrim$1$1 extends rc1 implements wr0 {
    public final /* synthetic */ long i;
    public final /* synthetic */ State j;

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        DrawScope drawScope = (DrawScope) obj;
        drawScope.getClass();
        DrawScope.M(drawScope, this.i, 0L, 0L, ((Number) this.j.getA()).floatValue(), null, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
        return az2.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$Scrim$1$1(long j, AnimationState animationState) {
        super(1);
        this.i = j;
        this.j = animationState;
    }
}
