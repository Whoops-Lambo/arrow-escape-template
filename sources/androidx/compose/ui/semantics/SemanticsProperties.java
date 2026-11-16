package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SemanticsProperties {
    public static final SemanticsPropertyKey A;
    public static final SemanticsPropertyKey a = new SemanticsPropertyKey("ContentDescription", SemanticsProperties$ContentDescription$1.i);
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
    public static final SemanticsPropertyKey q;
    public static final SemanticsPropertyKey r;
    public static final SemanticsPropertyKey s;
    public static final SemanticsPropertyKey t;
    public static final SemanticsPropertyKey u;
    public static final SemanticsPropertyKey v;
    public static final SemanticsPropertyKey w;
    public static final SemanticsPropertyKey x;
    public static final SemanticsPropertyKey y;
    public static final SemanticsPropertyKey z;

    static {
        SemanticsPropertyKey.AnonymousClass1 anonymousClass1 = SemanticsPropertyKey.AnonymousClass1.i;
        b = new SemanticsPropertyKey("StateDescription", anonymousClass1);
        c = new SemanticsPropertyKey("ProgressBarRangeInfo", anonymousClass1);
        d = new SemanticsPropertyKey("PaneTitle", SemanticsProperties$PaneTitle$1.i);
        e = new SemanticsPropertyKey("SelectableGroup", anonymousClass1);
        f = new SemanticsPropertyKey("CollectionInfo", anonymousClass1);
        g = new SemanticsPropertyKey("CollectionItemInfo", anonymousClass1);
        h = new SemanticsPropertyKey("Heading", anonymousClass1);
        i = new SemanticsPropertyKey("Disabled", anonymousClass1);
        j = new SemanticsPropertyKey("LiveRegion", anonymousClass1);
        k = new SemanticsPropertyKey("Focused", anonymousClass1);
        l = new SemanticsPropertyKey("InvisibleToUser", SemanticsProperties$InvisibleToUser$1.i);
        m = new SemanticsPropertyKey("HorizontalScrollAxisRange", anonymousClass1);
        n = new SemanticsPropertyKey("VerticalScrollAxisRange", anonymousClass1);
        o = new SemanticsPropertyKey("IsPopup", SemanticsProperties$IsPopup$1.i);
        p = new SemanticsPropertyKey("IsDialog", SemanticsProperties$IsDialog$1.i);
        q = new SemanticsPropertyKey("Role", SemanticsProperties$Role$1.i);
        r = new SemanticsPropertyKey("TestTag", SemanticsProperties$TestTag$1.i);
        s = new SemanticsPropertyKey("Text", SemanticsProperties$Text$1.i);
        t = new SemanticsPropertyKey("EditableText", anonymousClass1);
        u = new SemanticsPropertyKey("TextSelectionRange", anonymousClass1);
        v = new SemanticsPropertyKey("ImeAction", anonymousClass1);
        w = new SemanticsPropertyKey("Selected", anonymousClass1);
        x = new SemanticsPropertyKey("ToggleableState", anonymousClass1);
        y = new SemanticsPropertyKey("Password", anonymousClass1);
        z = new SemanticsPropertyKey("Error", anonymousClass1);
        A = new SemanticsPropertyKey("IndexForKey", anonymousClass1);
    }
}
