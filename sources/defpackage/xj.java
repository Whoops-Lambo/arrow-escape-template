package defpackage;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class xj implements AccessibilityViewCommand {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomSheetBehavior b;

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean a(View view) {
        this.b.C(this.a);
        return true;
    }

    public xj(BottomSheetBehavior bottomSheetBehavior, int i) {
        this.b = bottomSheetBehavior;
        this.a = i;
    }
}
