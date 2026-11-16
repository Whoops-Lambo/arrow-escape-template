package androidx.compose.ui.graphics.vector.compat;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import defpackage.h50;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AndroidVectorParser {
    public final XmlResourceParser a;
    public int b = 0;

    public final TypedArray c(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        typedArrayObtainStyledAttributes.getClass();
        d(typedArrayObtainStyledAttributes.getChangingConfigurations());
        return typedArrayObtainStyledAttributes;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (this.a.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            f = typedArray.getFloat(i, f);
        }
        d(typedArray.getChangingConfigurations());
        return f;
    }

    public final int b(TypedArray typedArray, String str, int i, int i2) {
        if (TypedArrayUtils.d(this.a, str)) {
            i2 = typedArray.getInt(i, i2);
        }
        d(typedArray.getChangingConfigurations());
        return i2;
    }

    public final void d(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) obj;
        return this.a.equals(androidVectorParser.a) && this.b == androidVectorParser.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return h50.l(sb, this.b, ')');
    }

    public AndroidVectorParser(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }
}
