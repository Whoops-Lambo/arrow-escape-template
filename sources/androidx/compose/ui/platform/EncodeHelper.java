package androidx.compose.ui.platform;

import android.os.Parcel;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/EncodeHelper;", "", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class EncodeHelper {
    public Parcel a;

    public final void a(byte b) {
        this.a.writeByte(b);
    }

    public final void b(float f) {
        this.a.writeFloat(f);
    }

    public final void c(long j) {
        long jB = TextUnit.b(j);
        byte b = 0;
        if (!TextUnitType.a(jB, 0L)) {
            if (TextUnitType.a(jB, 4294967296L)) {
                b = 1;
            } else if (TextUnitType.a(jB, 8589934592L)) {
                b = 2;
            }
        }
        a(b);
        if (!TextUnitType.a(TextUnit.b(j), 0L)) {
            b(TextUnit.c(j));
        }
    }
}
