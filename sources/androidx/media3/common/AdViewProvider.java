package androidx.media3.common;

import android.view.ViewGroup;
import androidx.annotation.Nullable;
import defpackage.d31;
import defpackage.y32;
import defpackage.z21;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public interface AdViewProvider {
    @Nullable
    ViewGroup getAdViewGroup();

    default List<AdOverlayInfo> getAdOverlayInfos() {
        z21 z21Var = d31.b;
        return y32.e;
    }
}
