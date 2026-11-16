package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsActions {
    public static final SemanticsPropertyKey a;
    public static final SemanticsPropertyKey b;
    public static final SemanticsPropertyKey c;
    public static final SemanticsPropertyKey d;
    public static final SemanticsPropertyKey e;
    public static final SemanticsPropertyKey f;
    public static final SemanticsPropertyKey g;
    public static final SemanticsPropertyKey h;
    public static final SemanticsPropertyKey i;
    public static final SemanticsPropertyKey j;
    public static final SemanticsPropertyKey k;
    public static final SemanticsPropertyKey l;
    public static final SemanticsPropertyKey m;
    public static final SemanticsPropertyKey n;
    public static final SemanticsPropertyKey o;
    public static final SemanticsPropertyKey p;

    static {
        SemanticsPropertiesKt$ActionPropertyKey$1 semanticsPropertiesKt$ActionPropertyKey$1 = SemanticsPropertiesKt$ActionPropertyKey$1.i;
        a = new SemanticsPropertyKey("GetTextLayoutResult", semanticsPropertiesKt$ActionPropertyKey$1);
        b = new SemanticsPropertyKey("OnClick", semanticsPropertiesKt$ActionPropertyKey$1);
        c = new SemanticsPropertyKey("OnLongClick", semanticsPropertiesKt$ActionPropertyKey$1);
        d = new SemanticsPropertyKey("ScrollBy", semanticsPropertiesKt$ActionPropertyKey$1);
        e = new SemanticsPropertyKey("ScrollToIndex", semanticsPropertiesKt$ActionPropertyKey$1);
        f = new SemanticsPropertyKey("SetProgress", semanticsPropertiesKt$ActionPropertyKey$1);
        g = new SemanticsPropertyKey("SetSelection", semanticsPropertiesKt$ActionPropertyKey$1);
        h = new SemanticsPropertyKey("SetText", semanticsPropertiesKt$ActionPropertyKey$1);
        i = new SemanticsPropertyKey("CopyText", semanticsPropertiesKt$ActionPropertyKey$1);
        j = new SemanticsPropertyKey("CutText", semanticsPropertiesKt$ActionPropertyKey$1);
        k = new SemanticsPropertyKey("PasteText", semanticsPropertiesKt$ActionPropertyKey$1);
        l = new SemanticsPropertyKey("Expand", semanticsPropertiesKt$ActionPropertyKey$1);
        m = new SemanticsPropertyKey("Collapse", semanticsPropertiesKt$ActionPropertyKey$1);
        n = new SemanticsPropertyKey("Dismiss", semanticsPropertiesKt$ActionPropertyKey$1);
        o = new SemanticsPropertyKey("RequestFocus", semanticsPropertiesKt$ActionPropertyKey$1);
        p = new SemanticsPropertyKey("CustomActions", SemanticsPropertyKey.AnonymousClass1.i);
    }
}
