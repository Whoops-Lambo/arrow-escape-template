package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidBlendMode_androidKt {
    public static final android.graphics.BlendMode a(int i) {
        if (i == 0) {
            return android.graphics.BlendMode.CLEAR;
        }
        if (i == 1) {
            return android.graphics.BlendMode.SRC;
        }
        if (i == 2) {
            return android.graphics.BlendMode.DST;
        }
        if (i == 3) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if (i == 5) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if (i == 6) {
            return android.graphics.BlendMode.DST_IN;
        }
        if (i == 7) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if (i == 9) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return android.graphics.BlendMode.XOR;
        }
        if (i == 12) {
            return android.graphics.BlendMode.PLUS;
        }
        if (i == 13) {
            return android.graphics.BlendMode.MODULATE;
        }
        if (i == 14) {
            return android.graphics.BlendMode.SCREEN;
        }
        if (i == 15) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if (i == 16) {
            return android.graphics.BlendMode.DARKEN;
        }
        if (i == 17) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return android.graphics.BlendMode.HUE;
        }
        if (i == 26) {
            return android.graphics.BlendMode.SATURATION;
        }
        if (i == 27) {
            return android.graphics.BlendMode.COLOR;
        }
        return i == 28 ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i) {
        if (i == 0) {
            return PorterDuff.Mode.CLEAR;
        }
        if (i == 1) {
            return PorterDuff.Mode.SRC;
        }
        if (i == 2) {
            return PorterDuff.Mode.DST;
        }
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 4) {
            return PorterDuff.Mode.DST_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 6) {
            return PorterDuff.Mode.DST_IN;
        }
        if (i == 7) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if (i == 8) {
            return PorterDuff.Mode.DST_OUT;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if (i == 10) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if (i == 11) {
            return PorterDuff.Mode.XOR;
        }
        if (i == 12) {
            return PorterDuff.Mode.ADD;
        }
        if (i == 14) {
            return PorterDuff.Mode.SCREEN;
        }
        if (i == 15) {
            return PorterDuff.Mode.OVERLAY;
        }
        if (i == 16) {
            return PorterDuff.Mode.DARKEN;
        }
        if (i == 17) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
