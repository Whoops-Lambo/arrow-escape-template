package com.applovin.impl;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class q0 {
    private static final a a = new a("Age Restricted User", e5.r);
    private static final a b = new a("Has User Consent", e5.q);
    private static final a c = new a("\"Do Not Sell\"", e5.s);

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static class a {
        private final String a;
        private final e5 b;

        public Boolean b(Context context) {
            e5 e5Var = this.b;
            if (context != null) {
                return (Boolean) f5.a(e5Var, (Object) null, context);
            }
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to get value for key: " + e5Var);
            return null;
        }

        public a(String str, e5 e5Var) {
            this.a = str;
            this.b = e5Var;
        }

        public String a(Context context) {
            Boolean boolB = b(context);
            if (boolB != null) {
                return boolB.toString();
            }
            return "No value set";
        }

        public String a() {
            return this.a;
        }
    }

    private static boolean a(e5 e5Var, Boolean bool, Context context) {
        if (context == null) {
            com.applovin.impl.sdk.p.h("AppLovinSdk", "Failed to update compliance value for key: " + e5Var);
            return false;
        }
        try {
            Boolean bool2 = (Boolean) f5.a(e5Var, (Object) null, context);
            f5.b(e5Var, bool, context);
            return bool2 == null || bool2 != bool;
        } catch (Throwable th) {
            com.applovin.impl.sdk.p.c("ComplianceManager", "Unable to update compliance", th);
            com.applovin.impl.sdk.l lVar = com.applovin.impl.sdk.l.F0;
            if (lVar != null) {
                lVar.E().a("ComplianceManager", "updateCompliance", th);
            }
            return false;
        }
    }

    public static boolean b(boolean z, Context context) {
        return a(e5.q, Boolean.valueOf(z), context);
    }

    public static a c() {
        return a;
    }

    public static a b() {
        return b;
    }

    public static boolean a(boolean z, Context context) {
        return a(e5.s, Boolean.valueOf(z), context);
    }

    public static String a(Context context) {
        return a(b, context) + a(c, context);
    }

    public static a a() {
        return c;
    }

    private static String a(a aVar, Context context) {
        return "\n" + aVar.a + " - " + aVar.a(context);
    }
}
