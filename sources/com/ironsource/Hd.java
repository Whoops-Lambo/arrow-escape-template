package com.ironsource;

import defpackage.e80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class Hd {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    public static final String c = "type";

    @NotNull
    public static final String d = "single";

    @NotNull
    public static final String e = "onShowSuccess";

    @NotNull
    public static final String f = "onLoadSuccess";

    @Nullable
    private final InterfaceC5096z6.c a;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @Nullable
    public final InterfaceC5096z6.c a() {
        return this.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    public Hd(@NotNull JSONObject jSONObject) {
        InterfaceC5096z6.c cVar;
        jSONObject.getClass();
        String strOptString = jSONObject.optString("type");
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1900843810) {
                if (iHashCode != -999907609) {
                    if (iHashCode == -902265784 && strOptString.equals(d)) {
                        cVar = InterfaceC5096z6.c.SINGLE;
                    } else {
                        cVar = null;
                    }
                } else if (strOptString.equals(e)) {
                    cVar = InterfaceC5096z6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
                } else {
                    cVar = null;
                }
            } else if (strOptString.equals(f)) {
                cVar = InterfaceC5096z6.c.PROGRESSIVE_ON_LOAD_SUCCESS;
            } else {
                cVar = null;
            }
        } else {
            cVar = null;
        }
        this.a = cVar;
    }
}
