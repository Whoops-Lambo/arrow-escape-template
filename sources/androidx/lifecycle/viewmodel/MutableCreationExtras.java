package androidx.lifecycle.viewmodel;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/viewmodel/MutableCreationExtras;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras(CreationExtras creationExtras) {
        creationExtras.getClass();
        this.a.putAll(creationExtras.a);
    }

    public /* synthetic */ MutableCreationExtras(int i) {
        this(CreationExtras.Empty.b);
    }
}
