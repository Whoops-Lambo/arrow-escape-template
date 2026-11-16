package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.Stable;
import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/BottomSheetState;", "Landroidx/compose/material/SwipeableState;", "Landroidx/compose/material/BottomSheetValue;", "Companion", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
public final class BottomSheetState extends SwipeableState<BottomSheetValue> {

    /* JADX INFO: renamed from: androidx.compose.material.BottomSheetState$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomSheetValue;", "invoke", "(Landroidx/compose/material/BottomSheetValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    final class AnonymousClass1 extends rc1 implements wr0 {
        @Override // defpackage.wr0
        public final Object invoke(Object obj) {
            ((BottomSheetValue) obj).getClass();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/BottomSheetState$Companion;", "", "material_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetState(BottomSheetValue bottomSheetValue, AnimationSpec animationSpec, wr0 wr0Var) {
        super(bottomSheetValue, animationSpec, wr0Var);
        bottomSheetValue.getClass();
        new SwipeableKt$PreUpPostDownNestedScrollConnection$1(this);
    }
}
