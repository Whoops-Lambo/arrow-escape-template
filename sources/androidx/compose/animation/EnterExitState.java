package androidx.compose.animation;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/EnterExitState;", "", "animation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
@ExperimentalAnimationApi
public final class EnterExitState {
    public static final EnterExitState a;
    public static final EnterExitState b;
    public static final EnterExitState c;
    public static final /* synthetic */ EnterExitState[] d;

    static {
        EnterExitState enterExitState = new EnterExitState("PreEnter", 0);
        a = enterExitState;
        EnterExitState enterExitState2 = new EnterExitState("Visible", 1);
        b = enterExitState2;
        EnterExitState enterExitState3 = new EnterExitState("PostExit", 2);
        c = enterExitState3;
        d = new EnterExitState[]{enterExitState, enterExitState2, enterExitState3};
    }

    public static EnterExitState valueOf(String str) {
        return (EnterExitState) Enum.valueOf(EnterExitState.class, str);
    }

    public static EnterExitState[] values() {
        return (EnterExitState[]) d.clone();
    }
}
