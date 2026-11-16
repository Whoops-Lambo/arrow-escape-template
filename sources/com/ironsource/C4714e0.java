package com.ironsource;

import defpackage.e80;
import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4714e0 implements InterfaceC4732f0 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    private static final String c = "ext_";

    @NotNull
    private final Map<String, String> a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.e0$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class a {
        public /* synthetic */ a(e80 e80Var) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4732f0
    @NotNull
    public Map<String, String> get() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4732f0
    public void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a.put(str, str2);
    }

    @Override // com.ironsource.InterfaceC4732f0
    public void b(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a.put("ext_".concat(str), str2);
    }

    @Override // com.ironsource.InterfaceC4732f0
    public void a(@NotNull HashMap<String, String> map) {
        map.getClass();
        this.a.putAll(map);
    }
}
