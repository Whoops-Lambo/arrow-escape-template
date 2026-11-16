package androidx.compose.ui.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotationType;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class AnnotationType {
    public static final AnnotationType a;
    public static final AnnotationType b;
    public static final AnnotationType c;
    public static final AnnotationType d;
    public static final /* synthetic */ AnnotationType[] e;

    static {
        AnnotationType annotationType = new AnnotationType("Paragraph", 0);
        a = annotationType;
        AnnotationType annotationType2 = new AnnotationType("Span", 1);
        b = annotationType2;
        AnnotationType annotationType3 = new AnnotationType("VerbatimTts", 2);
        c = annotationType3;
        AnnotationType annotationType4 = new AnnotationType("String", 3);
        d = annotationType4;
        e = new AnnotationType[]{annotationType, annotationType2, annotationType3, annotationType4};
    }

    public static AnnotationType valueOf(String str) {
        return (AnnotationType) Enum.valueOf(AnnotationType.class, str);
    }

    public static AnnotationType[] values() {
        return (AnnotationType[]) e.clone();
    }
}
