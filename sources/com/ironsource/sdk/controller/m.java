package com.ironsource.sdk.controller;

import com.ironsource.C4990t8;
import defpackage.e80;
import defpackage.pv1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public interface m {

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a implements m {

        @NotNull
        private final String a;

        @Nullable
        private final String b;

        @Nullable
        private final String c;

        @Nullable
        private final String d;

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i, e80 e80Var) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append("SSA_CORE.SDKController.runFunction('" + this.a);
            String str = this.b;
            if (str != null && str.length() != 0) {
                sb.append("?parameters=" + this.b);
            }
            String str2 = this.c;
            if (str2 != null && str2.length() != 0) {
                sb.append("','" + this.c);
            }
            String str3 = this.d;
            if (str3 != null && str3.length() != 0) {
                sb.append("','" + this.d);
            }
            sb.append("');");
            return sb.toString();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2) {
            this(str, str2, null, null, 12, null);
            str.getClass();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str, @Nullable String str2, @Nullable String str3) {
            this(str, str2, str3, null, 8, null);
            str.getClass();
        }

        public a(@NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            str.getClass();
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull String str) {
            this(str, null, null, null, 14, null);
            str.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class b implements m {
        private int a;

        @NotNull
        private String b;

        @Override // com.ironsource.sdk.controller.m
        @NotNull
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.a != C4990t8.d.MODE_0.b() && (this.a < C4990t8.d.MODE_1.b() || this.a > C4990t8.d.MODE_3.b())) {
                str = "empty";
            }
            return pv1.p(new StringBuilder("try{"), this.b, "}catch(e){", str, "}");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@NotNull m mVar, int i) {
            this(mVar.a(), i);
            mVar.getClass();
        }

        public b(@NotNull String str, int i) {
            str.getClass();
            this.b = str;
            this.a = i;
        }
    }

    @NotNull
    String a();
}
