package com.ironsource;

import defpackage.e80;
import defpackage.n30;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public class C4804j1 implements InterfaceC4947r1 {

    @NotNull
    private final InterfaceC4858m1 a;

    @NotNull
    private final F7 b;

    @NotNull
    private final Ob<Integer, Integer> c;

    @NotNull
    private final InterfaceC4986t4 d;

    @NotNull
    private List<InterfaceC4894o1> e;

    private final JSONObject b(List<? extends InterfaceC4894o1> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC4894o1> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(linkedHashMap);
        }
        return new JSONObject(linkedHashMap);
    }

    public C4804j1(@NotNull InterfaceC4858m1 interfaceC4858m1, @NotNull F7 f7, @NotNull Ob<Integer, Integer> ob, @NotNull InterfaceC4986t4 interfaceC4986t4) {
        interfaceC4858m1.getClass();
        f7.getClass();
        ob.getClass();
        interfaceC4986t4.getClass();
        this.a = interfaceC4858m1;
        this.b = f7;
        this.c = ob;
        this.d = interfaceC4986t4;
        this.e = new ArrayList();
    }

    @Override // com.ironsource.InterfaceC4947r1
    public void a(int i, @NotNull List<InterfaceC4894o1> list) {
        list.getClass();
        try {
            ArrayList<InterfaceC4894o1> arrayListA = this.a.a();
            int size = arrayListA.size();
            int i2 = 0;
            while (i2 < size) {
                InterfaceC4894o1 interfaceC4894o1 = arrayListA.get(i2);
                i2++;
                list.add(interfaceC4894o1);
            }
            Iterator<InterfaceC4894o1> it = this.e.iterator();
            while (it.hasNext()) {
                list.add(it.next());
            }
            this.b.a(new C5(this.c.a(Integer.valueOf(i)).intValue(), this.d.a(), b(list)));
        } catch (Exception e) {
            C4950r4.d().a(e);
            System.out.println((Object) n30.y("LogRemote | Exception: ", e.getMessage()));
        }
    }

    public /* synthetic */ C4804j1(InterfaceC4858m1 interfaceC4858m1, F7 f7, Ob ob, InterfaceC4986t4 interfaceC4986t4, int i, e80 e80Var) {
        this(interfaceC4858m1, f7, ob, (i & 8) != 0 ? new InterfaceC4986t4.a() : interfaceC4986t4);
    }

    @NotNull
    public final List<InterfaceC4894o1> b() {
        return this.e;
    }

    public final void a(@NotNull List<InterfaceC4894o1> list) {
        list.getClass();
        this.e = list;
    }

    @Override // com.ironsource.InterfaceC4947r1
    public void a() {
        this.e.clear();
    }

    @Override // com.ironsource.InterfaceC4947r1
    public void a(@NotNull InterfaceC4894o1... interfaceC4894o1Arr) {
        interfaceC4894o1Arr.getClass();
        for (InterfaceC4894o1 interfaceC4894o1 : interfaceC4894o1Arr) {
            this.e.add(interfaceC4894o1);
        }
    }
}
