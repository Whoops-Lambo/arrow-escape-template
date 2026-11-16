package androidx.compose.ui.graphics;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/graphics/Paint;", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class AndroidPaint_androidKt {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[android.graphics.Paint.Style.values().length];
            iArr[android.graphics.Paint.Style.STROKE.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[android.graphics.Paint.Cap.values().length];
            iArr2[android.graphics.Paint.Cap.BUTT.ordinal()] = 1;
            iArr2[android.graphics.Paint.Cap.ROUND.ordinal()] = 2;
            iArr2[android.graphics.Paint.Cap.SQUARE.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[android.graphics.Paint.Join.values().length];
            iArr3[android.graphics.Paint.Join.MITER.ordinal()] = 1;
            iArr3[android.graphics.Paint.Join.BEVEL.ordinal()] = 2;
            iArr3[android.graphics.Paint.Join.ROUND.ordinal()] = 3;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final AndroidPaint a() {
        AndroidPaint androidPaint = new AndroidPaint();
        androidPaint.a = new android.graphics.Paint(7);
        androidPaint.b = 3;
        return androidPaint;
    }
}
