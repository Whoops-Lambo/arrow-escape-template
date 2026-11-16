package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class fx0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int d;

    public fx0(int i) {
        this.d = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.getClass();
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.m(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(this.d, 1, 1, 1, false, false));
    }
}
