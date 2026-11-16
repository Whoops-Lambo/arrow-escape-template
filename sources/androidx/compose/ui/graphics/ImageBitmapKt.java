package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ImageBitmapKt {
    public static AndroidImageBitmap a(int i, int i2, int i3, int i4) {
        Bitmap bitmapCreateBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        Rgb rgb = ColorSpaces.c;
        rgb.getClass();
        Bitmap.Config configB = AndroidImageBitmap_androidKt.b(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = Api26Bitmap.c(i, i2, i3, true, rgb);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, configB);
            bitmapCreateBitmap.getClass();
            bitmapCreateBitmap.setHasAlpha(true);
        }
        return new AndroidImageBitmap(bitmapCreateBitmap);
    }
}
