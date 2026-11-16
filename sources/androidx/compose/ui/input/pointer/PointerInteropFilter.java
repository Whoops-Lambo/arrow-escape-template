package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ExperimentalComposeUiApi;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "Landroidx/compose/ui/input/pointer/PointerInputModifier;", "DispatchToViewState", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PointerInteropFilter implements PointerInputModifier {
    public wr0 a;
    public RequestDisallowInterceptTouchEvent b;
    public boolean c;
    public final PointerInteropFilter$pointerInputFilter$1 d = new PointerInteropFilter$pointerInputFilter$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DispatchToViewState {
        public static final DispatchToViewState a;
        public static final DispatchToViewState b;
        public static final DispatchToViewState c;
        public static final /* synthetic */ DispatchToViewState[] d;

        static {
            DispatchToViewState dispatchToViewState = new DispatchToViewState("Unknown", 0);
            a = dispatchToViewState;
            DispatchToViewState dispatchToViewState2 = new DispatchToViewState("Dispatching", 1);
            b = dispatchToViewState2;
            DispatchToViewState dispatchToViewState3 = new DispatchToViewState("NotDispatching", 2);
            c = dispatchToViewState3;
            d = new DispatchToViewState[]{dispatchToViewState, dispatchToViewState2, dispatchToViewState3};
        }

        public static DispatchToViewState valueOf(String str) {
            return (DispatchToViewState) Enum.valueOf(DispatchToViewState.class, str);
        }

        public static DispatchToViewState[] values() {
            return (DispatchToViewState[]) d.clone();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputModifier
    public final PointerInputFilter u0() {
        return this.d;
    }
}
