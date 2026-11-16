package androidx.compose.ui.input.pointer;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventPass;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PointerEventPass {
    public static final PointerEventPass a;
    public static final PointerEventPass b;
    public static final PointerEventPass c;
    public static final /* synthetic */ PointerEventPass[] d;

    static {
        PointerEventPass pointerEventPass = new PointerEventPass("Initial", 0);
        a = pointerEventPass;
        PointerEventPass pointerEventPass2 = new PointerEventPass("Main", 1);
        b = pointerEventPass2;
        PointerEventPass pointerEventPass3 = new PointerEventPass("Final", 2);
        c = pointerEventPass3;
        d = new PointerEventPass[]{pointerEventPass, pointerEventPass2, pointerEventPass3};
    }

    public static PointerEventPass valueOf(String str) {
        return (PointerEventPass) Enum.valueOf(PointerEventPass.class, str);
    }

    public static PointerEventPass[] values() {
        return (PointerEventPass[]) d.clone();
    }
}
