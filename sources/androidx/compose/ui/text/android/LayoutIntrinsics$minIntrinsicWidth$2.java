package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextPaint;
import com.unity3d.services.UnityAdsConstants;
import defpackage.dt1;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.x;
import java.text.BreakIterator;
import java.util.PriorityQueue;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class LayoutIntrinsics$minIntrinsicWidth$2 extends rc1 implements sr0 {
    public final /* synthetic */ CharSequence i;
    public final /* synthetic */ TextPaint j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutIntrinsics$minIntrinsicWidth$2(CharSequence charSequence, TextPaint textPaint) {
        super(0);
        this.i = charSequence;
        this.j = textPaint;
    }

    @Override // defpackage.sr0
    public final Object invoke() {
        CharSequence charSequence = this.i;
        charSequence.getClass();
        TextPaint textPaint = this.j;
        textPaint.getClass();
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence.length(), charSequence));
        PriorityQueue<dt1> priorityQueue = new PriorityQueue(10, new x(18));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new dt1(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                dt1 dt1Var = (dt1) priorityQueue.peek();
                if (dt1Var != null && ((Number) dt1Var.b).intValue() - ((Number) dt1Var.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new dt1(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        for (dt1 dt1Var2 : priorityQueue) {
            fMax = Math.max(fMax, Layout.getDesiredWidth(charSequence, ((Number) dt1Var2.a).intValue(), ((Number) dt1Var2.b).intValue(), textPaint));
        }
        return Float.valueOf(fMax);
    }
}
