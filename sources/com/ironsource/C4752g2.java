package com.ironsource;

import defpackage.gg0;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.ironsource.g2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4752g2 implements InterfaceC4770h2 {

    @NotNull
    private final C5045w9 a;

    @NotNull
    private final com.ironsource.mediationsdk.d b;

    @Nullable
    private final C4895o2 c;

    public C4752g2(@NotNull C5045w9 c5045w9, @NotNull com.ironsource.mediationsdk.d dVar, @Nullable C4895o2 c4895o2) {
        c5045w9.getClass();
        dVar.getClass();
        this.a = c5045w9;
        this.b = dVar;
        this.c = c4895o2;
    }

    private final void a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.b.a(str, this.a.e(), com.ironsource.mediationsdk.d.b().a(it.next(), this.a.e(), this.a.f(), this.a.d(), "", "", "", ""));
        }
    }

    @Override // com.ironsource.InterfaceC4770h2
    public void b(@NotNull String str) {
        List<String> listA;
        str.getClass();
        C4895o2 c4895o2 = this.c;
        if (c4895o2 == null || (listA = c4895o2.a()) == null) {
            listA = gg0.a;
        }
        a(listA, str);
    }

    @Override // com.ironsource.InterfaceC4770h2
    public void c(@NotNull String str) {
        List<String> listC;
        str.getClass();
        C4895o2 c4895o2 = this.c;
        if (c4895o2 == null || (listC = c4895o2.c()) == null) {
            listC = gg0.a;
        }
        a(listC, str);
    }

    @Override // com.ironsource.InterfaceC4770h2
    public void a(@NotNull String str) {
        List<String> listB;
        str.getClass();
        C4895o2 c4895o2 = this.c;
        if (c4895o2 == null || (listB = c4895o2.b()) == null) {
            listB = gg0.a;
        }
        a(listB, str);
    }
}
