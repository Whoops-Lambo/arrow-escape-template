package androidx.compose.foundation.interaction;

import defpackage.cp0;
import defpackage.dy;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@t50(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1", f = "DragInteraction.kt", l = {84}, m = "invokeSuspend")
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final class DragInteractionKt$collectIsDraggedAsState$1 extends ul2 implements zr0 {

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes3.dex */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 implements cp0 {
        @Override // defpackage.cp0
        public final Object emit(Object obj, dy dyVar) {
            Interaction interaction = (Interaction) obj;
            if (interaction instanceof DragInteraction.Start) {
                throw null;
            }
            if (interaction instanceof DragInteraction.Stop) {
                throw null;
            }
            if (interaction instanceof DragInteraction.Cancel) {
                throw null;
            }
            throw null;
        }
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        throw null;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        new ArrayList();
        throw null;
    }
}
