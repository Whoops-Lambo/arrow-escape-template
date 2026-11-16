package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidImageBitmap implements ImageBitmap {
    public final Bitmap a;

    public final int a() {
        Bitmap.Config config = this.a.getConfig();
        config.getClass();
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || config != Bitmap.Config.RGBA_F16) {
            return (i < 26 || config != Bitmap.Config.HARDWARE) ? 0 : 4;
        }
        return 3;
    }

    public final void b() {
        this.a.prepareToDraw();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getHeight() {
        return this.a.getHeight();
    }

    @Override // androidx.compose.ui.graphics.ImageBitmap
    public final int getWidth() {
        return this.a.getWidth();
    }

    public AndroidImageBitmap(Bitmap bitmap) {
        bitmap.getClass();
        this.a = bitmap;
    }
}
