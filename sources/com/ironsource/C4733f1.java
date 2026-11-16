package com.ironsource;

import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.singular.sdk.internal.UserDetailsUtils;
import defpackage.e80;
import defpackage.n30;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4733f1 {

    @NotNull
    public static final a a = new a(null);

    /* JADX INFO: renamed from: com.ironsource.f1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private final String a(String str) {
            try {
                Object objInvoke = Class.forName(n30.n("com.ironsource.adapters.", StringUtils.toLowerCase(str), UserDetailsUtils.UserDetailsLiterals.DOT, str, "Adapter")).getMethod("networkAdapterVersion", null).invoke(null, null);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
            } catch (ReflectiveOperationException unused) {
            } catch (Throwable th) {
                C4950r4.d().a(th);
                IronLog.INTERNAL.error("AdapterVersionScanner: failed to get version for " + str + ": " + th);
            }
            return null;
        }

        private a() {
        }

        @NotNull
        public final Map<String, Map<String, String>> a(@NotNull List<String> list) {
            list.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : list) {
                String strA = a(str);
                if (strA != null && strA.length() != 0) {
                    Map mapSingletonMap = Collections.singletonMap(R6.G1, strA);
                    mapSingletonMap.getClass();
                    linkedHashMap.put(str, mapSingletonMap);
                }
            }
            return linkedHashMap;
        }

        @NotNull
        public final Map<String, Map<String, String>> a() {
            return a(C5081y9.a.a());
        }
    }

    @NotNull
    public static final Map<String, Map<String, String>> a() {
        return a.a();
    }

    @NotNull
    public static final Map<String, Map<String, String>> a(@NotNull List<String> list) {
        return a.a(list);
    }
}
