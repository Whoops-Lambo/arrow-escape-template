package androidx.compose.material;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.fy;
import defpackage.l32;
import defpackage.t50;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE, 161}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends fy {
    public zr0 r;
    public AwaitPointerEventScope s;
    public l32 t;
    public PointerInputChange u;
    public float v;
    public float w;
    public /* synthetic */ Object x;
    public int y;

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.a(null, 0L, 0, null, this);
    }
}
