package androidx.datastore.migrations;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.datastore.core.DataMigration;
import com.google.android.gms.ads.RequestConfiguration;
import defpackage.as0;
import defpackage.az2;
import defpackage.cm2;
import defpackage.dr0;
import defpackage.du;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.fy;
import defpackage.rc1;
import defpackage.sr0;
import defpackage.t50;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.zr0;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/core/DataMigration;", "Api24Impl", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPreferencesMigration<T> implements DataMigration<T> {
    public final zr0 a;
    public final as0 b;
    public final Context c;
    public final String d;
    public final cm2 e;
    public final Set f;

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @t50(c = "androidx.datastore.migrations.SharedPreferencesMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass1 extends ul2 implements zr0 {
        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass1(2, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create(obj, (dy) obj2)).invokeSuspend(az2.a);
            return Boolean.TRUE;
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            wz2.a0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @t50(c = "androidx.datastore.migrations.SharedPreferencesMigration$2", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass2 extends ul2 implements zr0 {
        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass2(2, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create(obj, (dy) obj2)).invokeSuspend(az2.a);
            return Boolean.TRUE;
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            wz2.a0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @t50(c = "androidx.datastore.migrations.SharedPreferencesMigration$3", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass3 extends ul2 implements zr0 {
        @Override // defpackage.ph
        public final dy create(Object obj, dy dyVar) {
            return new AnonymousClass3(2, dyVar);
        }

        @Override // defpackage.zr0
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass3) create(obj, (dy) obj2)).invokeSuspend(az2.a);
            return Boolean.TRUE;
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            wz2.a0(obj);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    final class AnonymousClass4 extends rc1 implements sr0 {
        public final /* synthetic */ Context i;
        public final /* synthetic */ String j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Context context, String str) {
            super(0);
            this.i = context;
            this.j = str;
        }

        @Override // defpackage.sr0
        public final Object invoke() {
            SharedPreferences sharedPreferences = this.i.getSharedPreferences(this.j, 0);
            sharedPreferences.getClass();
            return sharedPreferences;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.migrations.SharedPreferencesMigration$shouldMigrate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    @t50(c = "androidx.datastore.migrations.SharedPreferencesMigration", f = "SharedPreferencesMigration.android.kt", l = {151}, m = "shouldMigrate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final class C16231 extends fy {
        public SharedPreferencesMigration r;
        public /* synthetic */ Object s;
        public int u;

        public C16231(fy fyVar) {
            super(fyVar);
        }

        @Override // defpackage.ph
        public final Object invokeSuspend(Object obj) {
            this.s = obj;
            this.u |= Integer.MIN_VALUE;
            return SharedPreferencesMigration.this.shouldMigrate(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @RequiresApi
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/datastore/migrations/SharedPreferencesMigration$Api24Impl;", "", "Landroid/content/Context;", "context", "", "name", "", "a", "(Landroid/content/Context;Ljava/lang/String;)Z", "datastore_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {
        @DoNotInline
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            context.getClass();
            name.getClass();
            return context.deleteSharedPreferences(name);
        }
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object cleanUp(dy dyVar) throws IOException {
        Context context;
        String str;
        cm2 cm2Var = this.e;
        SharedPreferences.Editor editorEdit = ((SharedPreferences) cm2Var.getValue()).edit();
        Set set = this.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            dr0.h("Unable to delete migrated keys from SharedPreferences.");
            return null;
        }
        if (((SharedPreferences) cm2Var.getValue()).getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            Api24Impl.a(context, str);
        }
        if (set != null) {
            set.clear();
        }
        return az2.a;
    }

    @Override // androidx.datastore.core.DataMigration
    public final Object migrate(Object obj, dy dyVar) {
        return this.b.invoke(new SharedPreferencesView((SharedPreferences) this.e.getValue(), this.f), obj, dyVar);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.datastore.core.DataMigration
    public final Object shouldMigrate(Object obj, dy dyVar) {
        C16231 c16231;
        if (dyVar instanceof C16231) {
            c16231 = (C16231) dyVar;
            int i = c16231.u;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16231.u = i - Integer.MIN_VALUE;
            } else {
                c16231 = new C16231((fy) dyVar);
            }
        } else {
            c16231 = new C16231((fy) dyVar);
        }
        Object objInvoke = c16231.s;
        int i2 = c16231.u;
        boolean z = true;
        if (i2 == 0) {
            wz2.a0(objInvoke);
            c16231.r = this;
            c16231.u = 1;
            objInvoke = this.a.invoke(obj, c16231);
            dz dzVar = dz.a;
            if (objInvoke == dzVar) {
                return dzVar;
            }
        } else {
            if (i2 != 1) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = c16231.r;
            wz2.a0(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f;
        cm2 cm2Var = this.e;
        if (set == null) {
            Map<String, ?> all = ((SharedPreferences) cm2Var.getValue()).getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferences = (SharedPreferences) cm2Var.getValue();
            if (set.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferences.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    public SharedPreferencesMigration(Context context, String str, Set set, zr0 zr0Var, as0 as0Var) {
        Set setD0;
        context.getClass();
        str.getClass();
        set.getClass();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context, str);
        this.a = zr0Var;
        this.b = as0Var;
        this.c = context;
        this.d = str;
        this.e = new cm2(anonymousClass4);
        if (set == SharedPreferencesMigration_androidKt.a) {
            setD0 = null;
        } else {
            setD0 = du.D0(set);
        }
        this.f = setD0;
    }
}
