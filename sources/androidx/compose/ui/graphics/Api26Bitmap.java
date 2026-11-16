package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001J=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\t*\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\t*\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "", "width", "height", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "bitmapConfig", "", "hasAlpha", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "Landroid/graphics/Bitmap;", "c", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "a", "(Landroid/graphics/Bitmap;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Landroid/graphics/ColorSpace;", "d", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/ColorSpace;", "b", "(Landroid/graphics/ColorSpace;)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ui-graphics_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class Api26Bitmap {
    @DoNotInline
    @NotNull
    public static final ColorSpace a(@NotNull Bitmap bitmap) {
        ColorSpace colorSpaceB;
        bitmap.getClass();
        android.graphics.ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (colorSpaceB = b(colorSpace)) != null) {
            return colorSpaceB;
        }
        return ColorSpaces.c;
    }

    @DoNotInline
    @NotNull
    public static final ColorSpace b(@NotNull android.graphics.ColorSpace colorSpace) {
        colorSpace.getClass();
        android.graphics.ColorSpace.Named unused = android.graphics.ColorSpace.Named.SRGB;
        if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB))) {
            android.graphics.ColorSpace.Named unused2 = android.graphics.ColorSpace.Named.ACES;
            if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES))) {
                android.graphics.ColorSpace.Named unused3 = android.graphics.ColorSpace.Named.ACESCG;
                if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG))) {
                    android.graphics.ColorSpace.Named unused4 = android.graphics.ColorSpace.Named.ADOBE_RGB;
                    if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB))) {
                        android.graphics.ColorSpace.Named unused5 = android.graphics.ColorSpace.Named.BT2020;
                        if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020))) {
                            android.graphics.ColorSpace.Named unused6 = android.graphics.ColorSpace.Named.BT709;
                            if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709))) {
                                android.graphics.ColorSpace.Named unused7 = android.graphics.ColorSpace.Named.CIE_LAB;
                                if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB))) {
                                    android.graphics.ColorSpace.Named unused8 = android.graphics.ColorSpace.Named.CIE_XYZ;
                                    if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ))) {
                                        android.graphics.ColorSpace.Named unused9 = android.graphics.ColorSpace.Named.DCI_P3;
                                        if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3))) {
                                            android.graphics.ColorSpace.Named unused10 = android.graphics.ColorSpace.Named.DISPLAY_P3;
                                            if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3))) {
                                                android.graphics.ColorSpace.Named unused11 = android.graphics.ColorSpace.Named.EXTENDED_SRGB;
                                                if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB))) {
                                                    android.graphics.ColorSpace.Named unused12 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
                                                    if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
                                                        android.graphics.ColorSpace.Named unused13 = android.graphics.ColorSpace.Named.LINEAR_SRGB;
                                                        if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB))) {
                                                            android.graphics.ColorSpace.Named unused14 = android.graphics.ColorSpace.Named.NTSC_1953;
                                                            if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953))) {
                                                                android.graphics.ColorSpace.Named unused15 = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
                                                                if (!colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB))) {
                                                                    android.graphics.ColorSpace.Named unused16 = android.graphics.ColorSpace.Named.SMPTE_C;
                                                                    if (colorSpace.equals(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C))) {
                                                                        return ColorSpaces.l;
                                                                    }
                                                                    return ColorSpaces.c;
                                                                }
                                                                return ColorSpaces.n;
                                                            }
                                                            return ColorSpaces.k;
                                                        }
                                                        return ColorSpaces.d;
                                                    }
                                                    return ColorSpaces.f;
                                                }
                                                return ColorSpaces.e;
                                            }
                                            return ColorSpaces.j;
                                        }
                                        return ColorSpaces.i;
                                    }
                                    return ColorSpaces.q;
                                }
                                return ColorSpaces.r;
                            }
                            return ColorSpaces.g;
                        }
                        return ColorSpaces.h;
                    }
                    return ColorSpaces.m;
                }
                return ColorSpaces.p;
            }
            return ColorSpaces.o;
        }
        return ColorSpaces.c;
    }

    @DoNotInline
    @NotNull
    public static final Bitmap c(int width, int height, int bitmapConfig, boolean hasAlpha, @NotNull ColorSpace colorSpace) {
        colorSpace.getClass();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, width, height, AndroidImageBitmap_androidKt.b(bitmapConfig), hasAlpha, d(colorSpace));
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    @DoNotInline
    @NotNull
    public static final android.graphics.ColorSpace d(@NotNull ColorSpace colorSpace) {
        android.graphics.ColorSpace.Named named;
        colorSpace.getClass();
        if (colorSpace.equals(ColorSpaces.c)) {
            named = android.graphics.ColorSpace.Named.SRGB;
        } else if (colorSpace.equals(ColorSpaces.o)) {
            named = android.graphics.ColorSpace.Named.ACES;
        } else if (colorSpace.equals(ColorSpaces.p)) {
            named = android.graphics.ColorSpace.Named.ACESCG;
        } else if (colorSpace.equals(ColorSpaces.m)) {
            named = android.graphics.ColorSpace.Named.ADOBE_RGB;
        } else if (colorSpace.equals(ColorSpaces.h)) {
            named = android.graphics.ColorSpace.Named.BT2020;
        } else if (colorSpace.equals(ColorSpaces.g)) {
            named = android.graphics.ColorSpace.Named.BT709;
        } else if (colorSpace.equals(ColorSpaces.r)) {
            named = android.graphics.ColorSpace.Named.CIE_LAB;
        } else if (colorSpace.equals(ColorSpaces.q)) {
            named = android.graphics.ColorSpace.Named.CIE_XYZ;
        } else if (colorSpace.equals(ColorSpaces.i)) {
            named = android.graphics.ColorSpace.Named.DCI_P3;
        } else if (colorSpace.equals(ColorSpaces.j)) {
            named = android.graphics.ColorSpace.Named.DISPLAY_P3;
        } else if (colorSpace.equals(ColorSpaces.e)) {
            named = android.graphics.ColorSpace.Named.EXTENDED_SRGB;
        } else if (colorSpace.equals(ColorSpaces.f)) {
            named = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (colorSpace.equals(ColorSpaces.d)) {
            named = android.graphics.ColorSpace.Named.LINEAR_SRGB;
        } else if (colorSpace.equals(ColorSpaces.k)) {
            named = android.graphics.ColorSpace.Named.NTSC_1953;
        } else if (colorSpace.equals(ColorSpaces.n)) {
            named = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
        } else {
            named = colorSpace.equals(ColorSpaces.l) ? android.graphics.ColorSpace.Named.SMPTE_C : android.graphics.ColorSpace.Named.SRGB;
        }
        android.graphics.ColorSpace colorSpace2 = android.graphics.ColorSpace.get(named);
        colorSpace2.getClass();
        return colorSpace2;
    }
}
