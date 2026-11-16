package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SaversKt {
    public static final SaverKt$Saver$1 a = SaverKt.a(SaversKt$AnnotatedStringSaver$1.i, SaversKt$AnnotatedStringSaver$2.i);
    public static final SaverKt$Saver$1 b = SaverKt.a(SaversKt$AnnotationRangeListSaver$1.i, SaversKt$AnnotationRangeListSaver$2.i);
    public static final SaverKt$Saver$1 c = SaverKt.a(SaversKt$AnnotationRangeSaver$1.i, SaversKt$AnnotationRangeSaver$2.i);
    public static final SaverKt$Saver$1 d = SaverKt.a(SaversKt$VerbatimTtsAnnotationSaver$1.i, SaversKt$VerbatimTtsAnnotationSaver$2.i);
    public static final SaverKt$Saver$1 e = SaverKt.a(SaversKt$ParagraphStyleSaver$1.i, SaversKt$ParagraphStyleSaver$2.i);
    public static final SaverKt$Saver$1 f = SaverKt.a(SaversKt$SpanStyleSaver$1.i, SaversKt$SpanStyleSaver$2.i);
    public static final SaverKt$Saver$1 g = SaverKt.a(SaversKt$TextDecorationSaver$1.i, SaversKt$TextDecorationSaver$2.i);
    public static final SaverKt$Saver$1 h = SaverKt.a(SaversKt$TextGeometricTransformSaver$1.i, SaversKt$TextGeometricTransformSaver$2.i);
    public static final SaverKt$Saver$1 i = SaverKt.a(SaversKt$TextIndentSaver$1.i, SaversKt$TextIndentSaver$2.i);
    public static final SaverKt$Saver$1 j = SaverKt.a(SaversKt$FontWeightSaver$1.i, SaversKt$FontWeightSaver$2.i);
    public static final SaverKt$Saver$1 k = SaverKt.a(SaversKt$BaselineShiftSaver$1.i, SaversKt$BaselineShiftSaver$2.i);
    public static final SaverKt$Saver$1 l = SaverKt.a(SaversKt$TextRangeSaver$1.i, SaversKt$TextRangeSaver$2.i);
    public static final SaverKt$Saver$1 m = SaverKt.a(SaversKt$ShadowSaver$1.i, SaversKt$ShadowSaver$2.i);
    public static final SaverKt$Saver$1 n = SaverKt.a(SaversKt$ColorSaver$1.i, SaversKt$ColorSaver$2.i);
    public static final SaverKt$Saver$1 o = SaverKt.a(SaversKt$TextUnitSaver$1.i, SaversKt$TextUnitSaver$2.i);
    public static final SaverKt$Saver$1 p = SaverKt.a(SaversKt$OffsetSaver$1.i, SaversKt$OffsetSaver$2.i);
    public static final SaverKt$Saver$1 q = SaverKt.a(SaversKt$LocaleListSaver$1.i, SaversKt$LocaleListSaver$2.i);
    public static final SaverKt$Saver$1 r = SaverKt.a(SaversKt$LocaleSaver$1.i, SaversKt$LocaleSaver$2.i);

    public static final Object a(Object obj, Saver saver, SaverScope saverScope) {
        Object objA;
        saver.getClass();
        saverScope.getClass();
        if (obj != null && (objA = saver.a(saverScope, obj)) != null) {
            return objA;
        }
        return Boolean.FALSE;
    }
}
