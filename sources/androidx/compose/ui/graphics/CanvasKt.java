package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CanvasKt {
    public static final AndroidCanvas a(AndroidImageBitmap androidImageBitmap) {
        android.graphics.Canvas canvas = AndroidCanvas_androidKt.a;
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.a = new android.graphics.Canvas(AndroidImageBitmap_androidKt.a(androidImageBitmap));
        return androidCanvas;
    }
}
