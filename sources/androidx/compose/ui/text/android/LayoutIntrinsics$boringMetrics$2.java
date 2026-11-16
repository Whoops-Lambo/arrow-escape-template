package androidx.compose.ui.text.android;

import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import defpackage.rc1;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/BoringLayout$Metrics;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LayoutIntrinsics$boringMetrics$2 extends rc1 implements sr0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ CharSequence j;
    public final /* synthetic */ TextPaint k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$boringMetrics$2(int i, TextPaint textPaint, CharSequence charSequence) {
        super(0);
        this.i = i;
        this.j = charSequence;
        this.k = textPaint;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        TextDirectionHeuristic textDirectionHeuristicA = TextLayoutKt.a(this.i);
        CharSequence charSequence = this.j;
        charSequence.getClass();
        if (textDirectionHeuristicA.isRtl(charSequence, 0, charSequence.length())) {
            return null;
        }
        return BoringLayout.isBoring(charSequence, this.k, null);
    }
}
