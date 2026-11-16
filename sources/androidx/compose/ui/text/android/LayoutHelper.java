package androidx.compose.ui.text.android;

import android.text.Layout;
import defpackage.dk2;
import defpackage.h50;
import defpackage.jc1;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@InternalPlatformTextApi
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LayoutHelper {
    public final Layout a;
    public final ArrayList b;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", "ui-text_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final /* data */ class BidiRun {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BidiRun);
        }

        public final int hashCode() {
            return jc1.d(0, Integer.hashCode(0) * 31, 31) + 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(0);
            sb.append(", end=");
            sb.append(0);
            sb.append(", isRtl=");
            return h50.m(sb, false, ')');
        }
    }

    public final float a(int i, boolean z) {
        Layout layout = this.a;
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public LayoutHelper(Layout layout) {
        layout.getClass();
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.a.getText();
            text.getClass();
            int iW = dk2.W(text, '\n', length, 4);
            if (iW < 0) {
                length = this.a.getText().length();
            } else {
                length = iW + 1;
            }
            arrayList.add(Integer.valueOf(length));
        } while (length < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[this.b.size()];
        this.b.size();
    }
}
