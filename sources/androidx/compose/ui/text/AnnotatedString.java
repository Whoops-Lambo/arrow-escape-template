package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.foundation.download.Command;
import defpackage.d;
import defpackage.e32;
import defpackage.gg0;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.s71;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "Builder", Command.HTTP_HEADER_RANGE, "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AnnotatedString implements CharSequence {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "MutableRange", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Builder {
        public final StringBuilder a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;

        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final /* data */ class MutableRange<T> {
            public final Object a;
            public final int b;
            public final int c;
            public final String d;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                return s71.b(this.a, mutableRange.a) && this.b == mutableRange.b && this.c == mutableRange.c && s71.b(this.d, mutableRange.d);
            }

            public final Range a(int i) {
                int i2 = this.c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i == Integer.MIN_VALUE) {
                    e32.i("Item.end should be set first");
                    return null;
                }
                int i3 = this.b;
                return new Range(this.a, this.d, i3, i);
            }

            public final int hashCode() {
                Object obj = this.a;
                return this.d.hashCode() + jc1.d(this.c, jc1.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.a);
                sb.append(", start=");
                sb.append(this.b);
                sb.append(", end=");
                sb.append(this.c);
                sb.append(", tag=");
                return jc1.q(sb, this.d, ')');
            }

            public MutableRange(Object obj, String str, int i, int i2) {
                str.getClass();
                this.a = obj;
                this.b = i;
                this.c = i2;
                this.d = str;
            }

            public /* synthetic */ MutableRange(int i, int i2, Object obj) {
                this(obj, "", i, i2);
            }
        }

        public final AnnotatedString c() {
            StringBuilder sb = this.a;
            String string = sb.toString();
            ArrayList arrayList = this.b;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(((MutableRange) arrayList.get(i)).a(sb.length()));
            }
            ArrayList arrayList3 = this.c;
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList4.add(((MutableRange) arrayList3.get(i2)).a(sb.length()));
            }
            ArrayList arrayList5 = this.d;
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            int size3 = arrayList5.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList6.add(((MutableRange) arrayList5.get(i3)).a(sb.length()));
            }
            return new AnnotatedString(string, arrayList2, arrayList4, arrayList6);
        }

        public Builder(AnnotatedString annotatedString) {
            annotatedString.getClass();
            this.a = new StringBuilder(16);
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            new ArrayList();
            b(annotatedString);
        }

        public final void a(SpanStyle spanStyle, int i, int i2) {
            spanStyle.getClass();
            this.b.add(new MutableRange(i, i2, spanStyle));
        }

        public final void b(AnnotatedString annotatedString) {
            annotatedString.getClass();
            StringBuilder sb = this.a;
            int length = sb.length();
            sb.append(annotatedString.a);
            List list = annotatedString.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range range = (Range) list.get(i);
                a((SpanStyle) range.a, range.b + length, range.c + length);
            }
            List list2 = annotatedString.c;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Range range2 = (Range) list2.get(i2);
                ParagraphStyle paragraphStyle = (ParagraphStyle) range2.a;
                int i3 = range2.b + length;
                int i4 = range2.c + length;
                paragraphStyle.getClass();
                this.c.add(new MutableRange(i3, i4, paragraphStyle));
            }
            List list3 = annotatedString.d;
            int size3 = list3.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Range range3 = (Range) list3.get(i5);
                this.d.add(new MutableRange(range3.a, range3.d, range3.b + length, range3.c + length));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    @Immutable
    public static final /* data */ class Range<T> {
        public final Object a;
        public final int b;
        public final int c;
        public final String d;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            return s71.b(this.a, range.a) && this.b == range.b && this.c == range.c && s71.b(this.d, range.d);
        }

        public final int hashCode() {
            Object obj = this.a;
            return this.d.hashCode() + jc1.d(this.c, jc1.d(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.a);
            sb.append(", start=");
            sb.append(this.b);
            sb.append(", end=");
            sb.append(this.c);
            sb.append(", tag=");
            return jc1.q(sb, this.d, ')');
        }

        public Range(Object obj, String str, int i, int i2) {
            str.getClass();
            this.a = obj;
            this.b = i;
            this.c = i2;
            this.d = str;
            if (i <= i2) {
                return;
            }
            d.r("Reversed range is not supported");
            throw null;
        }

        public Range(int i, int i2, Object obj) {
            this(obj, "", i, i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        return s71.b(this.a, annotatedString.a) && s71.b(this.b, annotatedString.b) && s71.b(this.c, annotatedString.c) && s71.b(this.d, annotatedString.d);
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AnnotatedString subSequence(int i, int i2) {
        if (i <= i2) {
            String str = this.a;
            return (i == 0 && i2 == str.length()) ? this : new AnnotatedString(str.substring(i, i2), AnnotatedStringKt.a(i, i2, this.b), AnnotatedStringKt.a(i, i2, this.c), AnnotatedStringKt.a(i, i2, this.d));
        }
        d.k(") should be less or equal to end (", "start (", i, i2);
        return null;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.a.charAt(i);
    }

    public final int hashCode() {
        return this.d.hashCode() + pv1.e(pv1.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.a.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a;
    }

    public AnnotatedString(String str, List list, List list2, List list3) {
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        int size = list2.size();
        int i = -1;
        int i2 = 0;
        while (i2 < size) {
            Range range = (Range) list2.get(i2);
            int i3 = range.b;
            int i4 = range.c;
            if (i3 >= i) {
                if (i4 <= this.a.length()) {
                    i2++;
                    i = i4;
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + range.b + ", " + i4 + ") is out of boundary").toString());
                }
            } else {
                d.r("ParagraphStyle should not overlap");
                throw null;
            }
        }
    }

    public final AnnotatedString a(AnnotatedString annotatedString) {
        annotatedString.getClass();
        Builder builder = new Builder(this);
        builder.b(annotatedString);
        return builder.c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(int i, String str, List list) {
        int i2 = i & 2;
        gg0 gg0Var = gg0.a;
        list = i2 != 0 ? gg0Var : list;
        str.getClass();
        list.getClass();
        this(str, list, gg0Var, gg0Var);
    }
}
