package androidx.compose.ui.text.font;

import defpackage.rc1;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class FontFamilyResolverImpl$createDefaultTypeface$1 extends rc1 implements wr0 {
    public final /* synthetic */ FontFamilyResolverImpl i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontFamilyResolverImpl$createDefaultTypeface$1(FontFamilyResolverImpl fontFamilyResolverImpl) {
        super(1);
        this.i = fontFamilyResolverImpl;
    }

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        TypefaceRequest typefaceRequest = (TypefaceRequest) obj;
        typefaceRequest.getClass();
        FontWeight fontWeight = typefaceRequest.b;
        int i = typefaceRequest.c;
        int i2 = typefaceRequest.d;
        Object obj2 = typefaceRequest.e;
        fontWeight.getClass();
        return this.i.b(new TypefaceRequest(null, fontWeight, i, i2, obj2)).getA();
    }
}
