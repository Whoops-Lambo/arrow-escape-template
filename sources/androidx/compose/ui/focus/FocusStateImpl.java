package androidx.compose.ui.focus;

import io.p071bidmachine.ads.networks.adaptiverendering.e;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FocusStateImpl implements FocusState {
    public static final FocusStateImpl a;
    public static final FocusStateImpl b;
    public static final FocusStateImpl c;
    public static final FocusStateImpl d;
    public static final FocusStateImpl e;
    public static final FocusStateImpl f;
    public static final /* synthetic */ FocusStateImpl[] g;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[2] = 1;
            iArr[0] = 2;
            iArr[1] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        a = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        b = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        c = focusStateImpl3;
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Deactivated", 3);
        d = focusStateImpl4;
        FocusStateImpl focusStateImpl5 = new FocusStateImpl("DeactivatedParent", 4);
        e = focusStateImpl5;
        FocusStateImpl focusStateImpl6 = new FocusStateImpl("Inactive", 5);
        f = focusStateImpl6;
        g = new FocusStateImpl[]{focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4, focusStateImpl5, focusStateImpl6};
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) g.clone();
    }

    @Override // androidx.compose.ui.focus.FocusState
    public final boolean d() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                e.b();
                return false;
        }
    }

    public final boolean f() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                e.b();
                return false;
        }
    }
}
