package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.flatbuffer.MetadataItem;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@RequiresApi
public abstract class EmojiSpan extends ReplacementSpan {
    public final TypefaceEmojiRasterizer b;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        TypefaceEmojiRasterizer typefaceEmojiRasterizer = this.b;
        MetadataItem metadataItemB = typefaceEmojiRasterizer.b();
        int iA = metadataItemB.a(14);
        this.d = fAbs / (iA != 0 ? metadataItemB.b.getShort(iA + metadataItemB.a) : (short) 0);
        MetadataItem metadataItemB2 = typefaceEmojiRasterizer.b();
        int iA2 = metadataItemB2.a(14);
        if (iA2 != 0) {
            metadataItemB2.b.getShort(iA2 + metadataItemB2.a);
        }
        MetadataItem metadataItemB3 = typefaceEmojiRasterizer.b();
        int iA3 = metadataItemB3.a(12);
        short s = (short) ((iA3 != 0 ? metadataItemB3.b.getShort(iA3 + metadataItemB3.a) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }

    public EmojiSpan(TypefaceEmojiRasterizer typefaceEmojiRasterizer) {
        Preconditions.c(typefaceEmojiRasterizer, "rasterizer cannot be null");
        this.b = typefaceEmojiRasterizer;
    }
}
