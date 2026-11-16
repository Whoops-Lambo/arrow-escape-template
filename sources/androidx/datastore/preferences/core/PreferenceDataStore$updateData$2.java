package androidx.datastore.preferences.core;

import defpackage.az2;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@t50(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/preferences/core/Preferences;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class PreferenceDataStore$updateData$2 extends ul2 implements zr0 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ zr0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(zr0 zr0Var, dy dyVar) {
        super(2, dyVar);
        this.t = zr0Var;
    }

    @Override // defpackage.ph
    public final dy create(Object obj, dy dyVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.t, dyVar);
        preferenceDataStore$updateData$2.s = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // defpackage.zr0
    public final Object invoke(Object obj, Object obj2) {
        return ((PreferenceDataStore$updateData$2) create((Preferences) obj, (dy) obj2)).invokeSuspend(az2.a);
    }

    @Override // defpackage.ph
    public final Object invokeSuspend(Object obj) {
        int i = this.r;
        if (i == 0) {
            wz2.a0(obj);
            Preferences preferences = (Preferences) this.s;
            this.r = 1;
            obj = this.t.invoke(preferences, this);
            dz dzVar = dz.a;
            if (obj == dzVar) {
                return dzVar;
            }
        } else {
            if (i != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
        }
        Preferences preferences2 = (Preferences) obj;
        preferences2.getClass();
        ((MutablePreferences) preferences2).b.a.set(true);
        return preferences2;
    }
}
