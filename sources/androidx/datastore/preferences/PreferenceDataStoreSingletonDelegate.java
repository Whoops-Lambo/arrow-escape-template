package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import defpackage.cz;
import defpackage.e22;
import defpackage.wr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001¨\u0006\u0005"}, d2 = {"Landroidx/datastore/preferences/PreferenceDataStoreSingletonDelegate;", "Le22;", "Landroid/content/Context;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "datastore-preferences_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PreferenceDataStoreSingletonDelegate implements e22 {
    public final String a;
    public final ReplaceFileCorruptionHandler b;
    public final wr0 c;
    public final cz d;
    public final Object e = new Object();
    public volatile PreferenceDataStore f;

    @Override // defpackage.e22
    public final Object getValue(Object obj, KProperty kProperty) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        context.getClass();
        kProperty.getClass();
        PreferenceDataStore preferenceDataStore2 = this.f;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    ReplaceFileCorruptionHandler replaceFileCorruptionHandler = this.b;
                    wr0 wr0Var = this.c;
                    applicationContext.getClass();
                    this.f = PreferenceDataStoreFactory.a(replaceFileCorruptionHandler, (List) wr0Var.invoke(applicationContext), this.d, new PreferenceDataStoreSingletonDelegate$getValue$1$1(applicationContext, this));
                }
                preferenceDataStore = this.f;
                preferenceDataStore.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }

    public PreferenceDataStoreSingletonDelegate(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, wr0 wr0Var, cz czVar) {
        this.a = str;
        this.b = replaceFileCorruptionHandler;
        this.c = wr0Var;
        this.d = czVar;
    }
}
