package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import defpackage.c71;
import defpackage.fs1;
import defpackage.gc2;
import defpackage.n81;
import defpackage.ns1;
import defpackage.q31;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final q31 SINGLE_STYLE_VALUES = q31.B("auto", "none");
    private static final q31 MARK_SHAPE_VALUES = q31.C(TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
    private static final q31 MARK_FILL_VALUES = q31.B(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN);
    private static final q31 POSITION_VALUES = q31.C(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strB = ns1.B(str.trim());
        if (strB.isEmpty()) {
            return null;
        }
        return parseWords(q31.z(TextUtils.split(strB, WHITESPACE_PATTERN)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:27:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00db  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ef  */
    private static TextEmphasis parseWords(q31 q31Var) {
        int i;
        gc2 gc2VarO;
        int i2;
        gc2 gc2VarO2;
        gc2 gc2VarO3;
        String str;
        int iHashCode;
        int i3;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) fs1.v(c71.o(POSITION_VALUES, q31Var), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int iHashCode4 = str4.hashCode();
        int i4 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    i = 2;
                }
            } else if (str4.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                i = -2;
            }
            gc2VarO = c71.o(SINGLE_STYLE_VALUES, q31Var);
            i2 = -1;
            if (!gc2VarO.isEmpty()) {
                str3 = (String) new n81(gc2VarO).next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i2 = 0;
                }
                return new TextEmphasis(i2, 0, i);
            }
            gc2VarO2 = c71.o(MARK_FILL_VALUES, q31Var);
            gc2VarO3 = c71.o(MARK_SHAPE_VALUES, q31Var);
            if (!gc2VarO2.isEmpty() && gc2VarO3.isEmpty()) {
                return new TextEmphasis(-1, 0, i);
            }
            str = (String) fs1.v(gc2VarO2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                    i3 = 2;
                }
                str2 = (String) fs1.v(gc2VarO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        i4 = 2;
                    }
                } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i4 = 3;
                }
                return new TextEmphasis(i4, i3, i);
            }
            str.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
            i3 = 1;
            str2 = (String) fs1.v(gc2VarO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i4 = 3;
            }
            return new TextEmphasis(i4, i3, i);
        }
        str4.equals(TtmlNode.ANNOTATION_POSITION_BEFORE);
        i = 1;
        gc2VarO = c71.o(SINGLE_STYLE_VALUES, q31Var);
        i2 = -1;
        if (!gc2VarO.isEmpty()) {
            str3 = (String) new n81(gc2VarO).next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new TextEmphasis(i2, 0, i);
        }
        gc2VarO2 = c71.o(MARK_FILL_VALUES, q31Var);
        gc2VarO3 = c71.o(MARK_SHAPE_VALUES, q31Var);
        if (!gc2VarO2.isEmpty()) {
        }
        str = (String) fs1.v(gc2VarO2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i3 = 2;
            }
            str2 = (String) fs1.v(gc2VarO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                i4 = 3;
            }
            return new TextEmphasis(i4, i3, i);
        }
        str.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i3 = 1;
        str2 = (String) fs1.v(gc2VarO3, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i4 = 2;
            }
        } else if (str2.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
            i4 = 3;
        }
        return new TextEmphasis(i4, i3, i);
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }
}
