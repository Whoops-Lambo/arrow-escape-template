package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import com.ironsource.InterfaceC4802j;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public interface h extends q {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static abstract class a implements h {

        @Nullable
        private final String a;

        @Nullable
        private final String b;
        private final boolean c;

        @Override // com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public abstract IronSourceError a();

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String b() {
            return this.b;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        public boolean c() {
            return this.c;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h
        @Nullable
        public String e() {
            return this.a;
        }

        public a(@Nullable String str, @Nullable String str2, boolean z) {
            this.a = str;
            this.b = str2;
            this.c = z;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b extends a {

        @NotNull
        private final String d;

        @Nullable
        private final Activity e;

        @Nullable
        private final ISDemandOnlyBannerLayout f;

        public /* synthetic */ b(String str, Activity activity, String str2, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str3, boolean z, int i, e80 e80Var) {
            this(str, activity, str2, iSDemandOnlyBannerLayout, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.a(this.d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Nullable
        public final Activity f() {
            return this.e;
        }

        @Nullable
        public final ISDemandOnlyBannerLayout g() {
            return this.f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull String str, @Nullable Activity activity, @Nullable String str2, @Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, @Nullable String str3, boolean z) {
            super(str2, str3, z);
            str.getClass();
            this.d = str;
            this.e = activity;
            this.f = iSDemandOnlyBannerLayout;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c {

        @NotNull
        private String a = "";

        @Nullable
        private Activity b;

        @Nullable
        private String c;
        private boolean d;

        @Nullable
        private String e;

        @Nullable
        private ISDemandOnlyBannerLayout f;

        @NotNull
        public final b a() {
            return new b(this.a, this.b, this.c, this.f, this.e, this.d);
        }

        @NotNull
        public final d b() {
            return new d(this.a, this.b, this.c, this.e, this.d);
        }

        @NotNull
        public final c b(@Nullable String str) {
            this.c = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity) {
            this.b = activity;
            return this;
        }

        @NotNull
        public final c a(@Nullable Activity activity, @Nullable Activity activity2) {
            if (activity == null) {
                activity = activity2;
            }
            this.b = activity;
            return this;
        }

        @NotNull
        public final c a(boolean z) {
            this.d = z;
            return this;
        }

        @NotNull
        public final c a(@Nullable String str) {
            this.e = str;
            return this;
        }

        @NotNull
        public final c a(@Nullable ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout) {
            this.f = iSDemandOnlyBannerLayout;
            return this;
        }

        @NotNull
        public final c a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            String string = aVar.toString();
            string.getClass();
            this.a = string;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d extends a implements InterfaceC4802j {

        @NotNull
        private final String d;

        @Nullable
        private final Activity e;

        public /* synthetic */ d(String str, Activity activity, String str2, String str3, boolean z, int i, e80 e80Var) {
            this(str, activity, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? false : z);
        }

        @Override // com.ironsource.mediationsdk.demandOnly.h.a, com.ironsource.mediationsdk.demandOnly.q
        @Nullable
        public IronSourceError a() {
            IronSourceError ironSourceErrorA = new q.b(this.d).a(this);
            if (ironSourceErrorA != null) {
                return ironSourceErrorA;
            }
            return null;
        }

        @Override // com.ironsource.InterfaceC4802j
        @Nullable
        public Activity d() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String str, @Nullable Activity activity, @Nullable String str2, @Nullable String str3, boolean z) {
            super(str2, str3, z);
            str.getClass();
            this.d = str;
            this.e = activity;
        }
    }

    @Nullable
    String b();

    boolean c();

    @Nullable
    String e();
}
