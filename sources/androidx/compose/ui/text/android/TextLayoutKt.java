package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import defpackage.dt1;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class TextLayoutKt {
    public static final dt1 a = new dt1(0, 0);

    public static final TextDirectionHeuristic a(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            textDirectionHeuristic.getClass();
            return textDirectionHeuristic;
        }
        if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            textDirectionHeuristic2.getClass();
            return textDirectionHeuristic2;
        }
        if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            textDirectionHeuristic3.getClass();
            return textDirectionHeuristic3;
        }
        if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            textDirectionHeuristic4.getClass();
            return textDirectionHeuristic4;
        }
        if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            textDirectionHeuristic5.getClass();
            return textDirectionHeuristic5;
        }
        if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            textDirectionHeuristic6.getClass();
            return textDirectionHeuristic6;
        }
        TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
        textDirectionHeuristic7.getClass();
        return textDirectionHeuristic7;
    }
}
