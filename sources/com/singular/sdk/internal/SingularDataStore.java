package com.singular.sdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.C4664b4;
import com.ironsource.mediationsdk.d;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.az2;
import defpackage.ba0;
import defpackage.cg0;
import defpackage.cz;
import defpackage.dn;
import defpackage.dy;
import defpackage.dz;
import defpackage.e32;
import defpackage.e80;
import defpackage.eu;
import defpackage.h00;
import defpackage.kc2;
import defpackage.nl2;
import defpackage.qb5;
import defpackage.s71;
import defpackage.t50;
import defpackage.tb5;
import defpackage.ul2;
import defpackage.wz2;
import defpackage.xc0;
import defpackage.y80;
import defpackage.zr0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 E2\u00020\u0001:\u0001EB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001d\u0010(\u001a\u00020'2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020'¢\u0006\u0004\b(\u0010)J\u001d\u0010*\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020,¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020,2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b3\u00104R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00105R\u001c\u00107\u001a\n 6*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\f\n\u0004\b<\u0010;\u0012\u0004\b=\u0010\u001cR\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lcom/singular/sdk/internal/SingularDataStore;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/datastore/preferences/core/Preferences;", "loadedCache", "()Landroidx/datastore/preferences/core/Preferences;", "loadInitialSnapshot", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/preferences/core/Preferences$Key;", C4664b4.i.W, "value", "Laz2;", "write", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "readLegacyPreferences", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences;", "writeLegacyPreference", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "keys", "removeLegacyPreferences", "(Ljava/util/List;)V", "preload", "()V", "defaultValue", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "", "getLong", "(Ljava/lang/String;J)J", "putLong", "(Ljava/lang/String;J)V", "", "getInt", "(Ljava/lang/String;I)I", "putInt", "(Ljava/lang/String;I)V", "", "getBoolean", "(Ljava/lang/String;Z)Z", "putBoolean", "(Ljava/lang/String;Z)V", "contains", "(Ljava/lang/String;)Z", "remove", "(Ljava/lang/String;)V", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "appContext", "Landroid/content/Context;", "Lcz;", "scope", "Lcz;", "writeScope", "getWriteScope$annotations", "Landroidx/datastore/core/DataStore;", "dataStore", "Landroidx/datastore/core/DataStore;", "cache", "Landroidx/datastore/preferences/core/Preferences;", "usingLegacyPrefs", "Z", "Companion", "Singular-v12.16.1-4dab205.master_standardRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingularDataStore {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, SingularDataStore> instances = new ConcurrentHashMap<>();
    private final Context appContext;

    @Nullable
    private volatile Preferences cache;

    @NotNull
    private final DataStore<Preferences> dataStore;

    @NotNull
    private final String name;

    @NotNull
    private final cz scope;
    private volatile boolean usingLegacyPrefs;

    @NotNull
    private final cz writeScope;

    /* JADX INFO: renamed from: com.singular.sdk.internal.SingularDataStore$preload$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {1, 8, 0})
    @t50(c = "com.singular.sdk.internal.SingularDataStore$preload$1", f = "SingularDataStore.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends ul2 implements zr0 {
        int label;

        public AnonymousClass1(dy dyVar) {
            super(2, dyVar);
        }

        @Override // defpackage.ph
        @NotNull
        public final dy create(@Nullable Object obj, @NotNull dy dyVar) {
            return SingularDataStore.this.new AnonymousClass1(dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            if (this.label != 0) {
                e32.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wz2.a0(obj);
            try {
                SingularDataStore.this.loadedCache();
            } catch (Throwable th) {
                SingularDataStoreKt.logger.error("SingularDataStore preload failed for '" + SingularDataStore.this.name + '\'', th);
            }
            return az2.a;
        }

        @Override // defpackage.zr0
        @Nullable
        public final Object invoke(@NotNull cz czVar, @Nullable dy dyVar) {
            return ((AnonymousClass1) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.singular.sdk.internal.SingularDataStore$remove$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {1, 8, 0})
    @t50(c = "com.singular.sdk.internal.SingularDataStore$remove$3", f = "SingularDataStore.kt", l = {228}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends ul2 implements zr0 {
        final /* synthetic */ List<Preferences.Key<?>> $match;
        int label;

        /* JADX INFO: renamed from: com.singular.sdk.internal.SingularDataStore$remove$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "prefs", "Laz2;", "<anonymous>", "(Landroidx/datastore/preferences/core/MutablePreferences;)V"}, k = 3, mv = {1, 8, 0})
        @t50(c = "com.singular.sdk.internal.SingularDataStore$remove$3$1", f = "SingularDataStore.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends ul2 implements zr0 {
            final /* synthetic */ List<Preferences.Key<?>> $match;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(List<? extends Preferences.Key<?>> list, dy dyVar) {
                super(2, dyVar);
                this.$match = list;
            }

            @Override // defpackage.ph
            @NotNull
            public final dy create(@Nullable Object obj, @NotNull dy dyVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$match, dyVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.ph
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                if (this.label != 0) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                Iterator<T> it = this.$match.iterator();
                while (it.hasNext()) {
                    mutablePreferences.e((Preferences.Key) it.next());
                }
                return az2.a;
            }

            @Override // defpackage.zr0
            @Nullable
            public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable dy dyVar) {
                return ((AnonymousClass1) create(mutablePreferences, dyVar)).invokeSuspend(az2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(List<? extends Preferences.Key<?>> list, dy dyVar) {
            super(2, dyVar);
            this.$match = list;
        }

        @Override // defpackage.ph
        @NotNull
        public final dy create(@Nullable Object obj, @NotNull dy dyVar) {
            return SingularDataStore.this.new AnonymousClass3(this.$match, dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    wz2.a0(obj);
                    DataStore dataStore = SingularDataStore.this.dataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$match, null);
                    this.label = 1;
                    Object objA = PreferencesKt.a(dataStore, anonymousClass1, this);
                    dz dzVar = dz.a;
                    if (objA == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wz2.a0(obj);
                }
            } catch (Throwable th) {
                SingularDataStoreKt.logger.error("DataStore remove failed", th);
            }
            return az2.a;
        }

        @Override // defpackage.zr0
        @Nullable
        public final Object invoke(@NotNull cz czVar, @Nullable dy dyVar) {
            return ((AnonymousClass3) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    /* JADX INFO: renamed from: com.singular.sdk.internal.SingularDataStore$write$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lcz;", "Laz2;", "<anonymous>", "(Lcz;)V"}, k = 3, mv = {1, 8, 0})
    @t50(c = "com.singular.sdk.internal.SingularDataStore$write$2", f = "SingularDataStore.kt", l = {Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends ul2 implements zr0 {
        final /* synthetic */ Preferences.Key<T> $key;
        final /* synthetic */ T $value;
        int label;

        /* JADX INFO: renamed from: com.singular.sdk.internal.SingularDataStore$write$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/datastore/preferences/core/MutablePreferences;", "it", "Laz2;", "<anonymous>", "(Landroidx/datastore/preferences/core/MutablePreferences;)V"}, k = 3, mv = {1, 8, 0})
        @t50(c = "com.singular.sdk.internal.SingularDataStore$write$2$1", f = "SingularDataStore.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends ul2 implements zr0 {
            final /* synthetic */ Preferences.Key<T> $key;
            final /* synthetic */ T $value;
            /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Preferences.Key<T> key, T t, dy dyVar) {
                super(2, dyVar);
                this.$key = key;
                this.$value = t;
            }

            @Override // defpackage.ph
            @NotNull
            public final dy create(@Nullable Object obj, @NotNull dy dyVar) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, dyVar);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // defpackage.ph
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                if (this.label != 0) {
                    e32.i("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wz2.a0(obj);
                ((MutablePreferences) this.L$0).f(this.$key, this.$value);
                return az2.a;
            }

            @Override // defpackage.zr0
            @Nullable
            public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable dy dyVar) {
                return ((AnonymousClass1) create(mutablePreferences, dyVar)).invokeSuspend(az2.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Preferences.Key<T> key, T t, dy dyVar) {
            super(2, dyVar);
            this.$key = key;
            this.$value = t;
        }

        @Override // defpackage.ph
        @NotNull
        public final dy create(@Nullable Object obj, @NotNull dy dyVar) {
            return SingularDataStore.this.new AnonymousClass2(this.$key, this.$value, dyVar);
        }

        @Override // defpackage.ph
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    wz2.a0(obj);
                    DataStore dataStore = SingularDataStore.this.dataStore;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$key, this.$value, null);
                    this.label = 1;
                    Object objA = PreferencesKt.a(dataStore, anonymousClass1, this);
                    dz dzVar = dz.a;
                    if (objA == dzVar) {
                        return dzVar;
                    }
                } else {
                    if (i != 1) {
                        e32.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    wz2.a0(obj);
                }
            } catch (Throwable th) {
                SingularDataStoreKt.logger.error("DataStore write failed", th);
            }
            return az2.a;
        }

        @Override // defpackage.zr0
        @Nullable
        public final Object invoke(@NotNull cz czVar, @Nullable dy dyVar) {
            return ((AnonymousClass2) create(czVar, dyVar)).invokeSuspend(az2.a);
        }
    }

    private static /* synthetic */ void getWriteScope$annotations() {
    }

    private final synchronized <T> void write(Preferences.Key<T> key, T value) {
        try {
            MutablePreferences mutablePreferencesC = loadedCache().c();
            mutablePreferencesC.f(key, value);
            this.cache = mutablePreferencesC;
            if (this.usingLegacyPrefs) {
                writeLegacyPreference(key.a, value);
            } else {
                tb5.t(this.writeScope, null, null, new AnonymousClass2(key, value, null), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void remove(@NotNull String key) {
        try {
            key.getClass();
            Set setKeySet = loadedCache().a().keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : setKeySet) {
                if (s71.b(((Preferences.Key) obj).a, key)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            MutablePreferences mutablePreferencesC = loadedCache().c();
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                mutablePreferencesC.e((Preferences.Key) obj2);
            }
            this.cache = mutablePreferencesC;
            if (this.usingLegacyPrefs) {
                ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
                int size2 = arrayList.size();
                while (i < size2) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    arrayList2.add(((Preferences.Key) obj3).a);
                }
                removeLegacyPreferences(arrayList2);
            } else {
                tb5.t(this.writeScope, null, null, new AnonymousClass3(arrayList, null), 3);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/singular/sdk/internal/SingularDataStore$Companion;", "", "()V", d.k, "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/singular/sdk/internal/SingularDataStore;", "get", "context", "Landroid/content/Context;", "name", "Singular-v12.16.1-4dab205.master_standardRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(e80 e80Var) {
            this();
        }

        @NotNull
        public final SingularDataStore get(@NotNull Context context, @NotNull String name) {
            SingularDataStore singularDataStore;
            context.getClass();
            name.getClass();
            SingularDataStore singularDataStore2 = (SingularDataStore) SingularDataStore.instances.get(name);
            if (singularDataStore2 == null) {
                synchronized (SingularDataStore.instances) {
                    singularDataStore = (SingularDataStore) SingularDataStore.instances.get(name);
                    if (singularDataStore == null) {
                        singularDataStore = new SingularDataStore(context, name, null);
                        SingularDataStore.instances.put(name, singularDataStore);
                    }
                }
                return singularDataStore;
            }
            return singularDataStore2;
        }

        private Companion() {
        }
    }

    @NotNull
    public static final SingularDataStore get(@NotNull Context context, @NotNull String str) {
        return INSTANCE.get(context, str);
    }

    private final Preferences loadInitialSnapshot() {
        try {
            Preferences preferences = (Preferences) tb5.y(cg0.a, new SingularDataStore$loadInitialSnapshot$prefs$1(this, null));
            this.usingLegacyPrefs = false;
            return preferences;
        } catch (Throwable th) {
            SingularDataStoreKt.logger.error("SingularDataStore init failed for '" + this.name + "'; falling back to SharedPreferences", th);
            this.usingLegacyPrefs = true;
            return readLegacyPreferences(this.name);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Preferences loadedCache() {
        Preferences preferencesLoadInitialSnapshot;
        Preferences preferences = this.cache;
        if (preferences != null) {
            return preferences;
        }
        synchronized (this) {
            preferencesLoadInitialSnapshot = this.cache;
            if (preferencesLoadInitialSnapshot == null) {
                preferencesLoadInitialSnapshot = loadInitialSnapshot();
                this.cache = preferencesLoadInitialSnapshot;
            }
        }
        return preferencesLoadInitialSnapshot;
    }

    private final Preferences readLegacyPreferences(String name) {
        try {
            SharedPreferences sharedPreferences = this.appContext.getSharedPreferences(name, 0);
            MutablePreferences mutablePreferencesA = PreferencesFactory.a(new Preferences.Pair[0]);
            Map<String, ?> all = sharedPreferences.getAll();
            all.getClass();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof String) {
                    key.getClass();
                    mutablePreferencesA.g(new Preferences.Key(key), value);
                } else if (value instanceof Long) {
                    key.getClass();
                    mutablePreferencesA.g(new Preferences.Key(key), value);
                } else if (value instanceof Integer) {
                    key.getClass();
                    mutablePreferencesA.g(new Preferences.Key(key), value);
                } else if (value instanceof Boolean) {
                    key.getClass();
                    mutablePreferencesA.g(new Preferences.Key(key), value);
                }
            }
            return mutablePreferencesA;
        } catch (Throwable th) {
            SingularDataStoreKt.logger.error("Reading legacy SharedPreferences failed for '" + name + '\'', th);
            return new MutablePreferences(true);
        }
    }

    private final void removeLegacyPreferences(List<String> keys) {
        try {
            SharedPreferences.Editor editorEdit = this.appContext.getSharedPreferences(this.name, 0).edit();
            Iterator<T> it = keys.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            SingularDataStoreKt.logger.error("SharedPreferences remove failed for '" + this.name + '\'', th);
        }
    }

    private final void writeLegacyPreference(String key, Object value) {
        try {
            SharedPreferences.Editor editorEdit = this.appContext.getSharedPreferences(this.name, 0).edit();
            if (value instanceof String) {
                editorEdit.putString(key, (String) value);
            } else if (value instanceof Long) {
                editorEdit.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Integer) {
                editorEdit.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            }
            editorEdit.apply();
        } catch (Throwable th) {
            SingularDataStoreKt.logger.error("SharedPreferences write failed for '" + this.name + '\'', th);
        }
    }

    public final void preload() {
        tb5.t(this.scope, null, null, new AnonymousClass1(null), 3);
    }

    private SingularDataStore(Context context, String str) {
        this.name = str;
        Context applicationContext = context.getApplicationContext();
        this.appContext = applicationContext;
        nl2 nl2VarA = tb5.a();
        ba0 ba0Var = xc0.a;
        y80 y80Var = y80.c;
        dn dnVarA = kc2.a(qb5.l(nl2VarA, y80Var));
        this.scope = dnVarA;
        this.writeScope = kc2.a(h00.o(tb5.a(), y80Var.T(1)));
        applicationContext.getClass();
        this.dataStore = PreferenceDataStoreFactory.a(null, eu.y(SharedPreferencesMigrationKt.a(applicationContext, str)), dnVarA, new SingularDataStore$dataStore$1(this));
    }

    public final boolean contains(@NotNull String key) {
        key.getClass();
        Set setKeySet = loadedCache().a().keySet();
        if (setKeySet == null || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (s71.b(((Preferences.Key) it.next()).a, key)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean getBoolean(@NotNull String key, boolean defaultValue) {
        key.getClass();
        Boolean bool = (Boolean) loadedCache().b(new Preferences.Key(key));
        if (bool == null) {
            return defaultValue;
        }
        return bool.booleanValue();
    }

    public final int getInt(@NotNull String key, int defaultValue) {
        key.getClass();
        Integer num = (Integer) loadedCache().b(new Preferences.Key(key));
        if (num == null) {
            return defaultValue;
        }
        return num.intValue();
    }

    public final long getLong(@NotNull String key, long defaultValue) {
        key.getClass();
        Long l = (Long) loadedCache().b(new Preferences.Key(key));
        if (l == null) {
            return defaultValue;
        }
        return l.longValue();
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String defaultValue) {
        key.getClass();
        String str = (String) loadedCache().b(new Preferences.Key(key));
        if (str == null) {
            return defaultValue;
        }
        return str;
    }

    public final void putBoolean(@NotNull String key, boolean value) {
        key.getClass();
        write(new Preferences.Key(key), Boolean.valueOf(value));
    }

    public final void putInt(@NotNull String key, int value) {
        key.getClass();
        write(new Preferences.Key(key), Integer.valueOf(value));
    }

    public final void putLong(@NotNull String key, long value) {
        key.getClass();
        write(new Preferences.Key(key), Long.valueOf(value));
    }

    public final void putString(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        write(new Preferences.Key(key), value);
    }

    public /* synthetic */ SingularDataStore(Context context, String str, e80 e80Var) {
        this(context, str);
    }
}
