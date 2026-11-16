package androidx.compose.runtime.saveable;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.rc1;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/MutableState;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/saveable/SaverScope;", "state", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
final class RememberSaveableKt$mutableStateSaver$1$1 extends rc1 implements zr0 {
    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        MutableState mutableState = (MutableState) obj2;
        ((SaverScope) obj).getClass();
        mutableState.getClass();
        if (!(mutableState instanceof SnapshotMutableState)) {
            throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
        }
        mutableState.getA();
        throw null;
    }
}
