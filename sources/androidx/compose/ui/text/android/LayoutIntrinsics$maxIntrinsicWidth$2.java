package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LayoutIntrinsics$maxIntrinsicWidth$2 extends rc1 implements sr0 {
    public final /* synthetic */ LayoutIntrinsics i;
    public final /* synthetic */ CharSequence j;
    public final /* synthetic */ TextPaint k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$maxIntrinsicWidth$2(LayoutIntrinsics layoutIntrinsics, CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.i = layoutIntrinsics;
        this.j = charSequence;
        this.k = textPaint;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    @Override // defpackage.sr0
    public final Object invoke() {
        BoringLayout.Metrics metrics = (BoringLayout.Metrics) this.i.a.getValue();
        TextPaint textPaint = this.k;
        CharSequence charSequence = this.j;
        float desiredWidth = metrics != null ? metrics.width : Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint);
        if (desiredWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (charSequence instanceof Spanned)) {
            if (textPaint.getLetterSpacing() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Spanned spanned = (Spanned) charSequence;
                if (spanned.nextSpanTransition(-1, spanned.length(), LetterSpacingSpanPx.class) != spanned.length() || spanned.nextSpanTransition(-1, spanned.length(), LetterSpacingSpanEm.class) != spanned.length()) {
                    desiredWidth += 0.5f;
                }
            } else {
                desiredWidth += 0.5f;
            }
        }
        return Float.valueOf(desiredWidth);
    }
}
