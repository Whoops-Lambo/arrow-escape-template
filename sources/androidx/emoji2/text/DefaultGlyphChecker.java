package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@AnyThread
@RestrictTo
class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {
    public static final ThreadLocal b = new ThreadLocal();
    public final TextPaint a;

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public final boolean a(CharSequence charSequence, int i, int i2) {
        ThreadLocal threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i < i2) {
            sb.append(charSequence.charAt(i));
            i++;
        }
        String string = sb.toString();
        int i3 = PaintCompat.a;
        return this.a.hasGlyph(string);
    }

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
