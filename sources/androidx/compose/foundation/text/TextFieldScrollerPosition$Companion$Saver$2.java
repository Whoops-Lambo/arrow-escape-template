package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import defpackage.rc1;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "restored", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class TextFieldScrollerPosition$Companion$Saver$2 extends rc1 implements wr0 {
    public static final TextFieldScrollerPosition$Companion$Saver$2 i = new TextFieldScrollerPosition$Companion$Saver$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        return new TextFieldScrollerPosition(((Boolean) list.get(1)).booleanValue() ? Orientation.a : Orientation.b, ((Float) list.get(0)).floatValue());
    }
}
