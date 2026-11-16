package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ironsourceads.AdSize;
import defpackage.jc1;
import defpackage.pv1;
import defpackage.s71;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4876n1 {

    @NotNull
    public static final C4876n1 a = new C4876n1();

    /* JADX INFO: renamed from: com.ironsource.n1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements InterfaceC4894o1 {

        @NotNull
        private final IronSource.a a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return "AdFormatEntity(value=" + this.a + ")";
        }

        public a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("adUnit", Integer.valueOf(If.c(this.a)));
        }

        @NotNull
        public final a a(@NotNull IronSource.a aVar) {
            aVar.getClass();
            return new a(aVar);
        }

        public static /* synthetic */ a a(a aVar, IronSource.a aVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                aVar2 = aVar.a;
            }
            return aVar.a(aVar2);
        }

        private final IronSource.a a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$b */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s71.b(this.a, ((b) obj).a);
        }

        public static /* synthetic */ b a(b bVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.a;
            }
            return bVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("AdIdentifier(value=", this.a, ")");
        }

        public b(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final b a(@NotNull String str) {
            str.getClass();
            return new b(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_IRONSOURCE_AD_OBJECT_ID, this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$d */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class d implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s71.b(this.a, ((d) obj).a);
        }

        public static /* synthetic */ d a(d dVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.a;
            }
            return dVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("AuctionId(auctionId=", this.a, ")");
        }

        public d(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final d a(@NotNull String str) {
            str.getClass();
            return new d(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("auctionId", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$e */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class e implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "DemandOnly(value=", ")");
        }

        public e(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, Integer.valueOf(this.a));
        }

        @NotNull
        public final e a(int i) {
            return new e(i);
        }

        public static /* synthetic */ e a(e eVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = eVar.a;
            }
            return eVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$f */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class f implements InterfaceC4894o1 {
        private final long a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public int hashCode() {
            return Long.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return pv1.m(this.a, "Duration(duration=", ")");
        }

        public f(long j) {
            this.a = j;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("duration", Long.valueOf(this.a));
        }

        @NotNull
        public final f a(long j) {
            return new f(j);
        }

        public static /* synthetic */ f a(f fVar, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = fVar.a;
            }
            return fVar.a(j);
        }

        private final long a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$g */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class g implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && s71.b(this.a, ((g) obj).a);
        }

        public static /* synthetic */ g a(g gVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gVar.a;
            }
            return gVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("DynamicDemandSourceId(dynamicSourceId=", this.a, ")");
        }

        public g(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final g a(@NotNull String str) {
            str.getClass();
            return new g(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$h */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class h implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && s71.b(this.a, ((h) obj).a);
        }

        public static /* synthetic */ h a(h hVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = hVar.a;
            }
            return hVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("DynamicSourceId(sourceId=", this.a, ")");
        }

        public h(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final h a(@NotNull String str) {
            str.getClass();
            return new h(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("dynamicDemandSource", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$j */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class j implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "ErrorCode(code=", ")");
        }

        public j(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(this.a));
        }

        @NotNull
        public final j a(int i) {
            return new j(i);
        }

        public static /* synthetic */ j a(j jVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = jVar.a;
            }
            return jVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$k */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class k implements InterfaceC4894o1 {

        @Nullable
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && s71.b(this.a, ((k) obj).a);
        }

        public int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("ErrorReason(reason=", this.a, ")");
        }

        public k(@Nullable String str) {
            this.a = str;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            String str = this.a;
            if (str != null && str.length() != 0) {
                map.put("reason", this.a);
            }
        }

        @NotNull
        public final k a(@Nullable String str) {
            return new k(str);
        }

        public static /* synthetic */ k a(k kVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.a;
            }
            return kVar.a(str);
        }

        private final String a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$l */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class l implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && s71.b(this.a, ((l) obj).a);
        }

        public static /* synthetic */ l a(l lVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lVar.a;
            }
            return lVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("Ext1(value=", this.a, ")");
        }

        public l(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final l a(@NotNull String str) {
            str.getClass();
            return new l(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_EXT1, this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$m */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class m implements InterfaceC4894o1 {

        @Nullable
        private final JSONObject a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && s71.b(this.a, ((m) obj).a);
        }

        public int hashCode() {
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return 0;
            }
            return jSONObject.hashCode();
        }

        @NotNull
        public String toString() {
            return "GenericParams(genericParams=" + this.a + ")";
        }

        public m(@Nullable JSONObject jSONObject) {
            this.a = jSONObject;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            JSONObject jSONObject = this.a;
            if (jSONObject == null) {
                return;
            }
            map.put("genericParams", jSONObject);
        }

        @NotNull
        public final m a(@Nullable JSONObject jSONObject) {
            return new m(jSONObject);
        }

        public static /* synthetic */ m a(m mVar, JSONObject jSONObject, int i, Object obj) {
            if ((i & 1) != 0) {
                jSONObject = mVar.a;
            }
            return mVar.a(jSONObject);
        }

        private final JSONObject a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$n */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class n implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "InstanceType(instanceType=", ")");
        }

        public n(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("instanceType", Integer.valueOf(this.a));
        }

        @NotNull
        public final n a(int i) {
            return new n(i);
        }

        public static /* synthetic */ n a(n nVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = nVar.a;
            }
            return nVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$o */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class o implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "MultipleAdObjects(value=", ")");
        }

        public o(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("isMultipleAdObjects", Integer.valueOf(this.a));
        }

        @NotNull
        public final o a(int i) {
            return new o(i);
        }

        public static /* synthetic */ o a(o oVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = oVar.a;
            }
            return oVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$p */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class p implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "OneFlow(value=", ")");
        }

        public p(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("isOneFlow", Integer.valueOf(this.a));
        }

        @NotNull
        public final p a(int i) {
            return new p(i);
        }

        public static /* synthetic */ p a(p pVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pVar.a;
            }
            return pVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$q */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class q implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && s71.b(this.a, ((q) obj).a);
        }

        public static /* synthetic */ q a(q qVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.a;
            }
            return qVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("Placement(value=", this.a, ")");
        }

        public q(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final q a(@NotNull String str) {
            str.getClass();
            return new q(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("placement", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$r */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class r implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "Programmatic(programmatic=", ")");
        }

        public r(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(this.a));
        }

        @NotNull
        public final r a(int i) {
            return new r(i);
        }

        public static /* synthetic */ r a(r rVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = rVar.a;
            }
            return rVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$s */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class s implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && s71.b(this.a, ((s) obj).a);
        }

        public static /* synthetic */ s a(s sVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sVar.a;
            }
            return sVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("Provider(sourceName=", this.a, ")");
        }

        public s(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final s a(@NotNull String str) {
            str.getClass();
            return new s(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$t */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class t implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "RewardAmount(value=", ")");
        }

        public t(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.a));
        }

        @NotNull
        public final t a(int i) {
            return new t(i);
        }

        public static /* synthetic */ t a(t tVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tVar.a;
            }
            return tVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$u */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class u implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof u) && s71.b(this.a, ((u) obj).a);
        }

        public static /* synthetic */ u a(u uVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uVar.a;
            }
            return uVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("RewardName(value=", this.a, ")");
        }

        public u(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final u a(@NotNull String str) {
            str.getClass();
            return new u(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_REWARD_NAME, this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$v */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class v implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && s71.b(this.a, ((v) obj).a);
        }

        public static /* synthetic */ v a(v vVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = vVar.a;
            }
            return vVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("SdkVersion(version=", this.a, ")");
        }

        public v(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final v a(@NotNull String str) {
            str.getClass();
            return new v(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$w */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class w implements InterfaceC4894o1 {
        private final int a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.a == ((w) obj).a;
        }

        public int hashCode() {
            return Integer.hashCode(this.a);
        }

        @NotNull
        public String toString() {
            return jc1.k(this.a, "SessionDepth(sessionDepth=", ")");
        }

        public w(int i) {
            this.a = i;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("sessionDepth", Integer.valueOf(this.a));
        }

        @NotNull
        public final w a(int i) {
            return new w(i);
        }

        public static /* synthetic */ w a(w wVar, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = wVar.a;
            }
            return wVar.a(i);
        }

        private final int a() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$x */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class x implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && s71.b(this.a, ((x) obj).a);
        }

        public static /* synthetic */ x a(x xVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = xVar.a;
            }
            return xVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("SubProviderId(subProviderId=", this.a, ")");
        }

        public x(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final x a(@NotNull String str) {
            str.getClass();
            return new x(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("spId", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$y */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class y implements InterfaceC4894o1 {

        @NotNull
        private final String a;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && s71.b(this.a, ((y) obj).a);
        }

        public static /* synthetic */ y a(y yVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = yVar.a;
            }
            return yVar.a(str);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        @NotNull
        public String toString() {
            return pv1.n("TransId(value=", this.a, ")");
        }

        public y(@NotNull String str) {
            str.getClass();
            this.a = str;
        }

        @NotNull
        public final y a(@NotNull String str) {
            str.getClass();
            return new y(str);
        }

        private final String a() {
            return this.a;
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
            map.put("transId", this.a);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$c */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class c implements InterfaceC4894o1 {

        @NotNull
        private final AdSize a;

        public c(@NotNull AdSize adSize) {
            adSize.getClass();
            this.a = adSize;
        }

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            int i;
            map.getClass();
            String sizeDescription = this.a.getSizeDescription();
            int iHashCode = sizeDescription.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && sizeDescription.equals("BANNER")) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                    } else if (sizeDescription.equals(com.ironsource.mediationsdk.j.d)) {
                        i = 4;
                    } else {
                        i = 0;
                    }
                } else if (sizeDescription.equals(com.ironsource.mediationsdk.j.b)) {
                    i = 2;
                } else {
                    i = 0;
                }
            } else if (!sizeDescription.equals("MEDIUM_RECTANGLE")) {
                i = 0;
            } else {
                i = 3;
            }
            map.put(com.ironsource.mediationsdk.j.h, Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n1$i */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class i implements InterfaceC4894o1 {

        @NotNull
        public static final i a = new i();

        private i() {
        }

        @Override // com.ironsource.InterfaceC4894o1
        public void a(@NotNull Map<String, Object> map) {
            map.getClass();
        }
    }

    private C4876n1() {
    }
}
