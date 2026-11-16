package androidx.compose.runtime.saveable;

import defpackage.rc1;
import defpackage.wr0;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012&\u0010\u0002\u001a\"\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u00050\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/saveable/SaveableStateHolderImpl;", "it", "", "", "", "", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
public final class SaveableStateHolderImpl$Companion$Saver$2 extends rc1 implements wr0 {
    public static final SaveableStateHolderImpl$Companion$Saver$2 i = new SaveableStateHolderImpl$Companion$Saver$2(1);

    @Override // defpackage.wr0
    public final Object invoke(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return new SaveableStateHolderImpl(map);
    }
}
