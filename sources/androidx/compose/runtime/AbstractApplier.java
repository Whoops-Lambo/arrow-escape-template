package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.e32;
import java.util.ArrayList;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/Applier;", "runtime_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractApplier<T> implements Applier<T> {
    public final Object a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public abstract void j();

    @Override // androidx.compose.runtime.Applier
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getC() {
        return this.c;
    }

    @Override // androidx.compose.runtime.Applier
    public final void g(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // androidx.compose.runtime.Applier
    public final void h() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            e32.i("Check failed.");
        } else {
            this.c = arrayList.remove(arrayList.size() - 1);
        }
    }

    public final void i() {
        this.b.clear();
        this.c = this.a;
        j();
    }

    public AbstractApplier(Object obj) {
        this.a = obj;
        this.c = obj;
    }
}
