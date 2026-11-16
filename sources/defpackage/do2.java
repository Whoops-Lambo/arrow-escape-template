package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class do2 extends DataSetObserver {
    public final /* synthetic */ TabLayout a;

    public do2(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
