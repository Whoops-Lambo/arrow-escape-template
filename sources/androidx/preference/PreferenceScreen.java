package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class PreferenceScreen extends PreferenceGroup {
    @Override // androidx.preference.Preference
    public final void g() {
        if (this.h == null && this.A.size() != 0) {
            throw null;
        }
    }

    @RestrictTo
    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, TypedArrayUtils.a(com.ecffri.arrows.R.attr.preferenceScreenStyle, context, android.R.attr.preferenceScreenStyle), 0);
    }
}
