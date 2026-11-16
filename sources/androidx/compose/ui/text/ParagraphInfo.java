package androidx.compose.ui.text;

import androidx.compose.ui.text.platform.AndroidParagraph;
import defpackage.h50;
import defpackage.jc1;
import defpackage.n30;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class ParagraphInfo {
    public final AndroidParagraph a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public final int a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return tb5.g(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParagraphInfo) {
            ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
            if (this.a == paragraphInfo.a && this.b == paragraphInfo.b && this.c == paragraphInfo.c && this.d == paragraphInfo.d && this.e == paragraphInfo.e && Float.valueOf(this.f).equals(Float.valueOf(paragraphInfo.f)) && Float.valueOf(this.g).equals(Float.valueOf(paragraphInfo.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + n30.b(this.f, jc1.d(this.e, jc1.d(this.d, jc1.d(this.c, jc1.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return h50.k(sb, this.g, ')');
    }

    public ParagraphInfo(AndroidParagraph androidParagraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.a = androidParagraph;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }
}
