package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import defpackage.bp0;
import defpackage.dy;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/datastore/preferences/core/PreferenceDataStore;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStore implements DataStore<Preferences> {
    public final DataStore a;

    @Override // androidx.datastore.core.DataStore
    public final Object a(zr0 zr0Var, dy dyVar) {
        return this.a.a(new PreferenceDataStore$updateData$2(zr0Var, null), dyVar);
    }

    @Override // androidx.datastore.core.DataStore
    public final bp0 getData() {
        return this.a.getData();
    }

    public PreferenceDataStore(DataStore dataStore) {
        this.a = dataStore;
    }
}
