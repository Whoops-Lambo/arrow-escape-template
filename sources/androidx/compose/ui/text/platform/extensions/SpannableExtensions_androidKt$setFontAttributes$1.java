package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.text.SpannableString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.android.style.TypefaceSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import defpackage.as0;
import defpackage.az2;
import defpackage.bs0;
import defpackage.rc1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/SpanStyle;", "spanStyle", "", "start", "end", "Laz2;", "invoke", "(Landroidx/compose/ui/text/SpanStyle;II)V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
final class SpannableExtensions_androidKt$setFontAttributes$1 extends rc1 implements as0 {
    public final /* synthetic */ SpannableString i;
    public final /* synthetic */ bs0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpannableExtensions_androidKt$setFontAttributes$1(SpannableString spannableString, bs0 bs0Var) {
        super(3);
        this.i = spannableString;
        this.j = bs0Var;
    }

    @Override // defpackage.as0
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SpanStyle spanStyle = (SpanStyle) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        spanStyle.getClass();
        FontFamily fontFamily = spanStyle.fontFamily;
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.f;
        }
        FontStyle fontStyle = spanStyle.fontStyle;
        FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.a : 0);
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        this.i.setSpan(new TypefaceSpan((Typeface) this.j.invoke(fontFamily, fontWeight, fontStyle2, new FontSynthesis(fontSynthesis != null ? fontSynthesis.a : 1))), iIntValue, iIntValue2, 33);
        return az2.a;
    }
}
