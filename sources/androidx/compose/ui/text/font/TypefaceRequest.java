package androidx.compose.ui.text.font;

import defpackage.jc1;
import defpackage.s71;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/TypefaceRequest;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class TypefaceRequest {
    public final FontFamily a;
    public final FontWeight b;
    public final int c;
    public final int d;
    public final Object e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TypefaceRequest)) {
            return false;
        }
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        return s71.b(this.a, typefaceRequest.a) && s71.b(this.b, typefaceRequest.b) && this.c == typefaceRequest.c && this.d == typefaceRequest.d && s71.b(this.e, typefaceRequest.e);
    }

    public final int hashCode() {
        FontFamily fontFamily = this.a;
        int iD = jc1.d(this.d, jc1.d(this.c, (((fontFamily == null ? 0 : fontFamily.hashCode()) * 31) + this.b.a) * 31, 31), 31);
        Object obj = this.e;
        return iD + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.b);
        sb.append(", fontStyle=");
        sb.append((Object) FontStyle.a(this.c));
        sb.append(", fontSynthesis=");
        int i = this.d;
        if (i == 0) {
            str = "None";
        } else if (i == 1) {
            str = "All";
        } else if (i == 2) {
            str = "Weight";
        } else {
            str = i == 3 ? "Style" : "Invalid";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }

    public TypefaceRequest(FontFamily fontFamily, FontWeight fontWeight, int i, int i2, Object obj) {
        this.a = fontFamily;
        this.b = fontWeight;
        this.c = i;
        this.d = i2;
        this.e = obj;
    }
}
