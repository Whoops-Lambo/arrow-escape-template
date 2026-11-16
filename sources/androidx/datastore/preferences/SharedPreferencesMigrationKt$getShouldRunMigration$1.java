package androidx.datastore.preferences;

import androidx.datastore.preferences.core.Preferences;
import defpackage.az2;
import defpackage.dy;
import defpackage.eu;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@t50(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "prefs", "Landroidx/datastore/preferences/core/Preferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends ul2 implements zr0 {
    public /* synthetic */ Object r;
    public final /* synthetic */ Set s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, dy dyVar) {
        super(2, dyVar);
        this.s = set;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.s, dyVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.r = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create((Preferences) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        wz2.a0(obj);
        Set setKeySet = ((Preferences) this.r).a().keySet();
        ArrayList arrayList = new ArrayList(eu.f(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).a);
        }
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.a;
        boolean z = true;
        Set set = this.s;
        if (set != linkedHashSet) {
            if (set.isEmpty()) {
                z = false;
            } else {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
