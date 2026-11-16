package com.moloco.sdk.internal.ortb.model;

import defpackage.eu;
import defpackage.f93;
import defpackage.gd1;
import defpackage.pd1;
import defpackage.z92;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
@z92
public final class o {

    @NotNull
    public static final H$a Companion;
    public static final gd1 a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final /* synthetic */ o[] e;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    /* JADX INFO: loaded from: classes5.dex */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return o0.a;
        }
    }

    static {
        o oVar = new o("Top", 0);
        b = oVar;
        o oVar2 = new o("Center", 1);
        c = oVar2;
        o oVar3 = new o("Bottom", 2);
        d = oVar3;
        e = new o[]{oVar, oVar2, oVar3};
        Companion = new H$a();
        a = eu.v(pd1.b, new f93(13));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) e.clone();
    }
}
