package androidx.compose.ui.semantics;

import defpackage.az2;
import defpackage.eu;
import defpackage.jp1;
import defpackage.p32;
import defpackage.sr0;
import defpackage.zr0;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SemanticsPropertiesKt {
    public static final /* synthetic */ KProperty[] a;
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

    static {
        jp1 jp1Var = new jp1(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        p32.a.getClass();
        a = new KProperty[]{jp1Var, new jp1(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new jp1(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new jp1(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jp1(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jp1(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new jp1(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new jp1(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jp1(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new jp1(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new jp1(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new jp1(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new jp1(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new jp1(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new jp1(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new jp1(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new jp1(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};
        b = SemanticsProperties.c;
        c = SemanticsProperties.d;
        d = SemanticsProperties.j;
        e = SemanticsProperties.k;
        f = SemanticsProperties.m;
        g = SemanticsProperties.n;
        h = SemanticsProperties.q;
        i = SemanticsProperties.r;
        j = SemanticsProperties.t;
        k = SemanticsProperties.u;
        l = SemanticsProperties.v;
        m = SemanticsProperties.w;
        n = SemanticsProperties.f;
        o = SemanticsProperties.x;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.a;
    }

    public static void a(SemanticsPropertyReceiver semanticsPropertyReceiver, sr0 sr0Var) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsActions.m, new AccessibilityAction(null, sr0Var));
    }

    public static final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsProperties.i, az2.a);
    }

    public static void c(SemanticsPropertyReceiver semanticsPropertyReceiver, sr0 sr0Var) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsActions.n, new AccessibilityAction(null, sr0Var));
    }

    public static void d(SemanticsPropertyReceiver semanticsPropertyReceiver, sr0 sr0Var) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsActions.l, new AccessibilityAction(null, sr0Var));
    }

    public static void e(SemanticsPropertyReceiver semanticsPropertyReceiver, sr0 sr0Var) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsActions.b, new AccessibilityAction(null, sr0Var));
    }

    public static void f(SemanticsPropertyReceiver semanticsPropertyReceiver, zr0 zr0Var) {
        semanticsPropertyReceiver.getClass();
        semanticsPropertyReceiver.a(SemanticsActions.d, new AccessibilityAction(null, zr0Var));
    }

    public static final void g(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.getClass();
        str.getClass();
        semanticsPropertyReceiver.a(SemanticsProperties.a, eu.y(str));
    }

    public static final void h(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        semanticsPropertyReceiver.getClass();
        f.a(semanticsPropertyReceiver, a[5], scrollAxisRange);
    }

    public static final void i(SemanticsPropertyReceiver semanticsPropertyReceiver, int i2) {
        semanticsPropertyReceiver.getClass();
        h.a(semanticsPropertyReceiver, a[7], new Role(i2));
    }

    public static final void j(String str, SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.getClass();
        i.a(semanticsPropertyReceiver, a[8], str);
    }

    public static final void k(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        semanticsPropertyReceiver.getClass();
        g.a(semanticsPropertyReceiver, a[6], scrollAxisRange);
    }
}
