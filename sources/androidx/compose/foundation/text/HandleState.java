package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HandleState {
    public static final HandleState a;
    public static final HandleState b;
    public static final HandleState c;
    public static final /* synthetic */ HandleState[] d;

    static {
        HandleState handleState = new HandleState("None", 0);
        a = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        b = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        c = handleState3;
        d = new HandleState[]{handleState, handleState2, handleState3};
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) d.clone();
    }
}
