package androidx.core.text;

import android.text.SpannableStringBuilder;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class BidiFormatter {
    public static final TextDirectionHeuristicCompat c = TextDirectionHeuristicsCompat.c;
    public static final String d = Character.toString(8206);
    public static final String e = Character.toString(8207);
    public static final BidiFormatter f = new BidiFormatter(false);
    public static final BidiFormatter g = new BidiFormatter(true);
    public final boolean a;
    public final TextDirectionHeuristicCompat b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class Builder {
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class DirectionalityEstimator {
        public static final byte[] e = new byte[1792];
        public final CharSequence a;
        public final int b;
        public int c;
        public char d;

        static {
            for (int i = 0; i < 1792; i++) {
                e[i] = Character.getDirectionality(i);
            }
        }

        public final byte a() {
            int i = this.c - 1;
            CharSequence charSequence = this.a;
            char cCharAt = charSequence.charAt(i);
            this.d = cCharAt;
            boolean zIsLowSurrogate = Character.isLowSurrogate(cCharAt);
            int i2 = this.c;
            if (zIsLowSurrogate) {
                int iCodePointBefore = Character.codePointBefore(charSequence, i2);
                this.c -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.c = i2 - 1;
            char c = this.d;
            return c < 1792 ? e[c] : Character.getDirectionality(c);
        }

        public DirectionalityEstimator(CharSequence charSequence) {
            this.a = charSequence;
            this.b = charSequence.length();
        }
    }

    public BidiFormatter(boolean z) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.c;
        this.a = z;
        this.b = textDirectionHeuristicCompat;
    }

    public static int a(CharSequence charSequence) {
        byte directionality;
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = directionalityEstimator.c;
            if (i4 < directionalityEstimator.b && i == 0) {
                CharSequence charSequence2 = directionalityEstimator.a;
                char cCharAt = charSequence2.charAt(i4);
                directionalityEstimator.d = cCharAt;
                boolean zIsHighSurrogate = Character.isHighSurrogate(cCharAt);
                int i5 = directionalityEstimator.c;
                if (zIsHighSurrogate) {
                    int iCodePointAt = Character.codePointAt(charSequence2, i5);
                    directionalityEstimator.c = Character.charCount(iCodePointAt) + directionalityEstimator.c;
                    directionality = Character.getDirectionality(iCodePointAt);
                } else {
                    directionalityEstimator.c = i5 + 1;
                    char c2 = directionalityEstimator.d;
                    directionality = c2 < 1792 ? DirectionalityEstimator.e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
        }
        if (i != 0) {
            if (i2 == 0) {
                while (directionalityEstimator.c > 0) {
                    switch (directionalityEstimator.a()) {
                        case 14:
                        case 15:
                            if (i == i3) {
                                return -1;
                            }
                            i3--;
                            break;
                        case 16:
                        case 17:
                            if (i == i3) {
                                return 1;
                            }
                            i3--;
                            break;
                        case 18:
                            i3++;
                            break;
                        default:
                            break;
                    }
                }
            } else {
                return i2;
            }
        }
        return 0;
    }

    public static int b(CharSequence charSequence) {
        DirectionalityEstimator directionalityEstimator = new DirectionalityEstimator(charSequence);
        directionalityEstimator.c = directionalityEstimator.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (directionalityEstimator.c > 0) {
                byte bA = directionalityEstimator.a();
                if (bA == 0) {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA == 1 || bA == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                    }
                } else if (bA != 9) {
                    switch (bA) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                            }
                            break;
                    }
                } else {
                    continue;
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder c(CharSequence charSequence) {
        String str;
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.c;
        if (charSequence == null) {
            return null;
        }
        boolean zA = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) textDirectionHeuristicCompat).a(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean zA2 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.a)).a(charSequence.length(), charSequence);
        String str2 = "";
        String str3 = e;
        String str4 = d;
        boolean z = this.a;
        if (z || !(zA2 || a(charSequence) == 1)) {
            str = (!z || (zA2 && a(charSequence) != -1)) ? "" : str3;
        } else {
            str = str4;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (zA != z) {
            spannableStringBuilder.append(zA ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean zA3 = ((TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl) (zA ? TextDirectionHeuristicsCompat.b : TextDirectionHeuristicsCompat.a)).a(charSequence.length(), charSequence);
        if (!z && (zA3 || b(charSequence) == 1)) {
            str2 = str4;
        } else if (z && (!zA3 || b(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
