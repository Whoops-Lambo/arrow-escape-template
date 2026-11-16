package io.p071bidmachine.media3.extractor.text.cea;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import com.unity3d.services.UnityAdsConstants;
import defpackage.l83;
import io.p071bidmachine.media3.common.text.b;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final l83 c = new l83(22);
    public final b a;
    public final int b;

    public d(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i, float f2, int i2, boolean z, int i3, int i4) {
        this.a = new b(spannableStringBuilder, alignment, null, null, f, 0, i, f2, i2, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, z, z ? i3 : -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.b = i4;
    }
}
