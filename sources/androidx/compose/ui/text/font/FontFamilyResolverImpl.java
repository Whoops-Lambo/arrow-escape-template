package androidx.compose.ui.text.font;

import androidx.compose.ui.text.ExperimentalTextApi;
import defpackage.dr0;
import defpackage.wr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@ExperimentalTextApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/FontFamilyResolverImpl;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FontFamilyResolverImpl implements FontFamily.Resolver {
    public final AndroidFontLoader a;
    public final PlatformResolveInterceptor b;
    public final TypefaceRequestCache c;
    public final FontListFontFamilyTypefaceAdapter d;
    public final PlatformFontFamilyTypefaceAdapter e;
    public final wr0 f;

    public FontFamilyResolverImpl(AndroidFontLoader androidFontLoader, AndroidFontResolveInterceptor androidFontResolveInterceptor) {
        TypefaceRequestCache typefaceRequestCache = FontFamilyResolverKt.a;
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.b);
        PlatformFontFamilyTypefaceAdapter platformFontFamilyTypefaceAdapter = new PlatformFontFamilyTypefaceAdapter();
        typefaceRequestCache.getClass();
        this.a = androidFontLoader;
        this.b = androidFontResolveInterceptor;
        this.c = typefaceRequestCache;
        this.d = fontListFontFamilyTypefaceAdapter;
        this.e = platformFontFamilyTypefaceAdapter;
        this.f = new FontFamilyResolverImpl$createDefaultTypeface$1(this);
    }

    public final TypefaceResult b(TypefaceRequest typefaceRequest) {
        TypefaceRequestCache typefaceRequestCache = this.c;
        FontFamilyResolverImpl$resolve$result$1 fontFamilyResolverImpl$resolve$result$1 = new FontFamilyResolverImpl$resolve$result$1(this, typefaceRequest);
        typefaceRequestCache.getClass();
        synchronized (typefaceRequestCache.a) {
            TypefaceResult typefaceResult = (TypefaceResult) typefaceRequestCache.b.a(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getB()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) fontFamilyResolverImpl$resolve$result$1.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(typefaceRequestCache, typefaceRequest));
                synchronized (typefaceRequestCache.a) {
                    if (typefaceRequestCache.b.a(typefaceRequest) == null && typefaceResult2.getB()) {
                        typefaceRequestCache.b.b(typefaceRequest, typefaceResult2);
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                dr0.l("Could not load font", e);
                return null;
            }
        }
    }

    @Override // androidx.compose.ui.text.font.FontFamily.Resolver
    public final TypefaceResult a(FontFamily fontFamily, FontWeight fontWeight, int i, int i2) {
        fontWeight.getClass();
        PlatformResolveInterceptor platformResolveInterceptor = this.b;
        platformResolveInterceptor.getClass();
        int i3 = PlatformResolveInterceptor.a;
        FontWeight fontWeightA = platformResolveInterceptor.a(fontWeight);
        this.a.getClass();
        return b(new TypefaceRequest(fontFamily, fontWeightA, i, i2, null));
    }
}
