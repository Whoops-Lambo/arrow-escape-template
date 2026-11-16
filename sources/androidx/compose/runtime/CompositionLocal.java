package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import defpackage.sr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Stable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/CompositionLocal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class CompositionLocal<T> {
    public final LazyValueHolder a;

    public abstract State a(Object obj, Composer composer);

    public CompositionLocal(sr0 sr0Var) {
        this.a = new LazyValueHolder(sr0Var);
    }
}
