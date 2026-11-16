package androidx.compose.ui.text.font;

import defpackage.h50;
import defpackage.tb5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontResolveInterceptor;", "Landroidx/compose/ui/text/font/PlatformResolveInterceptor;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public final int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.b == ((AndroidFontResolveInterceptor) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return h50.l(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.b, ')');
    }

    public AndroidFontResolveInterceptor(int i) {
        this.b = i;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public final FontWeight a(FontWeight fontWeight) {
        fontWeight.getClass();
        int i = this.b;
        if (i != 0 && i != Integer.MAX_VALUE) {
            return new FontWeight(tb5.g(fontWeight.a + i, 1, 1000));
        }
        return fontWeight;
    }
}
