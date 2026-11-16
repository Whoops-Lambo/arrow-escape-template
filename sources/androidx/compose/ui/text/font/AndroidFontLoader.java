package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.core.content.res.ResourcesCompat;
import defpackage.ba0;
import defpackage.dz;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.vq2;
import defpackage.xc0;
import defpackage.y80;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFontLoader;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidFontLoader implements PlatformFontLoader {
    public final Context a;

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final Object a(Font font, ul2 ul2Var) throws Throwable {
        boolean z = font instanceof AndroidFont;
        Context context = this.a;
        if (z) {
            context.getClass();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            vq2.r(font, "Unknown font type: ");
            return null;
        }
        context.getClass();
        ba0 ba0Var = xc0.a;
        Object objE = tb5.E(y80.c, new AndroidFontLoader_androidKt$loadAsync$2((ResourceFont) font, context, null), ul2Var);
        return objE == dz.a ? objE : (android.graphics.Typeface) objE;
    }

    public final Object b(Font font) {
        boolean z = font instanceof AndroidFont;
        Context context = this.a;
        if (z) {
            context.getClass();
            throw null;
        }
        if (!(font instanceof ResourceFont)) {
            return null;
        }
        ResourceFont resourceFont = (ResourceFont) font;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 26) {
            return ResourceFontHelper.a.a(context, resourceFont);
        }
        android.graphics.Typeface typefaceB = ResourcesCompat.b(context, 0);
        typefaceB.getClass();
        return typefaceB;
    }

    public AndroidFontLoader(Context context) {
        this.a = context.getApplicationContext();
    }
}
