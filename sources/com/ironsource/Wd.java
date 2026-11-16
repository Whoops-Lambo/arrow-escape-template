package com.ironsource;

import defpackage.az2;
import defpackage.j52;
import defpackage.k52;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class Wd {

    @NotNull
    private final C5083yb a;

    @Nullable
    private final Map<String, C4981t.b> b;

    @Nullable
    private final Map<String, C4981t.b> c;

    public Wd(@NotNull C5083yb c5083yb, @Nullable Map<String, C4981t.b> map, @Nullable Map<String, C4981t.b> map2) {
        c5083yb.getClass();
        this.a = c5083yb;
        this.b = map;
        this.c = map2;
    }

    private final void b(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (!(objA instanceof j52)) {
            str2.getClass();
            num.getClass();
            aVar.a(str, str2, num.intValue());
        }
        Throwable thB = k52.b(objA);
        if (thB != null) {
            this.a.b(str, 3004, thB.getMessage());
        }
    }

    public final void a(@NotNull S7.a aVar) {
        aVar.getClass();
        Map<String, C4981t.b> map = this.c;
        if (map != null && (r0 = map.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4981t.b> entry : map.entrySet()) {
                String key = entry.getKey();
                Ud udF = entry.getValue().f();
                if (udF != null) {
                    b(aVar, key, udF.b(), udF.a());
                }
            }
        }
        Map<String, C4981t.b> map2 = this.b;
        if (map2 != null && (r0 = map2.entrySet().iterator()) != null) {
            for (Map.Entry<String, C4981t.b> entry2 : map2.entrySet()) {
                String key2 = entry2.getKey();
                Ud udA = entry2.getValue().a();
                if (udA != null) {
                    a(aVar, key2, udA.b(), udA.a());
                }
            }
        }
    }

    private final void a(S7.a aVar, String str, String str2, Integer num) throws JSONException {
        Object objA = a(str2, num);
        if (!(objA instanceof j52)) {
            str2.getClass();
            num.getClass();
            aVar.b(str, str2, num.intValue());
        }
        Throwable thB = k52.b(objA);
        if (thB != null) {
            this.a.b(str, 3004, thB.getMessage());
        }
    }

    private final Object a(String str, Integer num) {
        if (str != null && num != null) {
            return az2.a;
        }
        return new j52(new Exception("name - " + str + " or amount - " + num + " is not provided or invalid"));
    }
}
