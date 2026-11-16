package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import defpackage.ks0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
final /* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends ks0 implements wr0 {
    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        CharSequence charSequence = (CharSequence) this.receiver;
        charSequence.getClass();
        int i = iIntValue - 1;
        while (true) {
            if (i <= 0) {
                i = 0;
                break;
            }
            if (charSequence.charAt(i - 1) == '\n') {
                break;
            }
            i--;
        }
        int length = iIntValue + 1;
        int length2 = charSequence.length();
        while (length < length2) {
            if (charSequence.charAt(length) == '\n') {
                return new TextRange(TextRangeKt.a(i, length));
            }
            length++;
        }
        length = charSequence.length();
        return new TextRange(TextRangeKt.a(i, length));
    }
}
