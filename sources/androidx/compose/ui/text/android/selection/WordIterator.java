package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import defpackage.ak1;
import defpackage.d;
import defpackage.h50;
import defpackage.jc1;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WordIterator {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "", "WINDOW_WIDTH", "I", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static boolean a(int i) {
            int type = Character.getType(i);
            if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
                return false;
            }
            return true;
        }
    }

    public final void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        if (i > i3 || i2 > i) {
            ak1.n(h50.l(jc1.t("Invalid offset: ", i, ". Valid range is [", i2, " , "), i3, ']'));
        }
    }

    public final boolean b(int i) {
        return i <= this.c && this.b + 1 <= i && Character.isLetterOrDigit(Character.codePointBefore(this.a, i));
    }

    public final boolean c(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return Companion.a(Character.codePointBefore(this.a, i));
    }

    public final boolean d(int i) {
        return i < this.c && this.b <= i && Character.isLetterOrDigit(Character.codePointAt(this.a, i));
    }

    public final boolean e(int i) {
        if (i >= this.c || this.b > i) {
            return false;
        }
        return Companion.a(Character.codePointAt(this.a, i));
    }

    public WordIterator(CharSequence charSequence, int i, Locale locale) {
        this.a = charSequence;
        if (charSequence.length() >= 0) {
            if (i >= 0 && i <= charSequence.length()) {
                BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
                wordInstance.getClass();
                this.d = wordInstance;
                this.b = Math.max(0, -50);
                this.c = Math.min(charSequence.length(), i + 50);
                wordInstance.setText(new CharSequenceCharacterIterator(i, charSequence));
                return;
            }
            d.r("input end index is outside the CharSequence");
            throw null;
        }
        d.r("input start index is outside the CharSequence");
        throw null;
    }
}
