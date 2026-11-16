package androidx.compose.ui.semantics;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.xr0;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxr0;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/semantics/AccessibilityAction;", "parentValue", "childValue", "invoke", "(Landroidx/compose/ui/semantics/AccessibilityAction;Landroidx/compose/ui/semantics/AccessibilityAction;)Landroidx/compose/ui/semantics/AccessibilityAction;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
public final class SemanticsPropertiesKt$ActionPropertyKey$1 extends rc1 implements zr0 {
    public static final SemanticsPropertiesKt$ActionPropertyKey$1 i = new SemanticsPropertiesKt$ActionPropertyKey$1(2);

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        String str;
        xr0 xr0Var;
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj2;
        accessibilityAction2.getClass();
        if (accessibilityAction == null || (str = accessibilityAction.a) == null) {
            str = accessibilityAction2.a;
        }
        if (accessibilityAction == null || (xr0Var = accessibilityAction.b) == null) {
            xr0Var = accessibilityAction2.b;
        }
        return new AccessibilityAction(str, xr0Var);
    }
}
