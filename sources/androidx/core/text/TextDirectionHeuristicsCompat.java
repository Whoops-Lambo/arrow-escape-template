package androidx.core.text;

import android.text.TextUtils;
import defpackage.e32;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat a = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat b = new TextDirectionHeuristicInternal(null, true);
    public static final TextDirectionHeuristicCompat c;
    public static final TextDirectionHeuristicCompat d;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class AnyStrong implements TextDirectionAlgorithm {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public final int a(int i, CharSequence charSequence) {
            boolean z = false;
            for (int i2 = 0; i2 < i; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.a;
                if (directionality == 0) {
                    z = true;
                } else if (directionality == 1 || directionality == 2) {
                    return 0;
                }
            }
            return z ? 1 : 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class FirstStrong implements TextDirectionAlgorithm {
        public static final FirstStrong a = new FirstStrong();

        /* JADX WARN: Code duplicated, block: B:12:0x0020  */
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public final int a(int i, CharSequence charSequence) {
            int i2 = 0;
            i2 = 2;
            for (int i3 = 0; i3 < i && i2 == 2; i3++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i3));
                TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.a;
                if (directionality == 0) {
                    i2 = 1;
                    continue;
                } else if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            i2 = 1;
                            continue;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            continue;
                    }
                }
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public interface TextDirectionAlgorithm {
        int a(int i, CharSequence charSequence);
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        public final boolean b;

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            return this.b;
        }

        public TextDirectionHeuristicInternal(FirstStrong firstStrong, boolean z) {
            super(firstStrong);
            this.b = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        public final TextDirectionAlgorithm a;

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public final boolean a(int i, CharSequence charSequence) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                e32.a();
                return false;
            }
            TextDirectionAlgorithm textDirectionAlgorithm = this.a;
            if (textDirectionAlgorithm == null) {
                return b();
            }
            int iA = textDirectionAlgorithm.a(i, charSequence);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return b();
            }
            return false;
        }

        public abstract boolean b();

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.a = textDirectionAlgorithm;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public final boolean b() {
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.a;
        c = new TextDirectionHeuristicInternal(firstStrong, false);
        d = new TextDirectionHeuristicInternal(firstStrong, true);
    }
}
