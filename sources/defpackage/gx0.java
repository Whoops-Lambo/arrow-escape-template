package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class gx0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int d;

    public gx0(int i) {
        this.d = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        view.getClass();
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.a);
        accessibilityNodeInfoCompat.l(new AccessibilityNodeInfoCompat.CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(this.d, 2, false)));
    }
}
