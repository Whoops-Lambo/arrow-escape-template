package com.ironsource;

import defpackage.du;
import defpackage.eu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4787i1 implements InterfaceC4926pf<JSONArray> {

    @NotNull
    private final List<C4769h1> a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.i1$a */
    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4908of.values().length];
            try {
                iArr[EnumC4908of.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4908of.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    private final List<C4769h1> a() {
        List<C4769h1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C4769h1 c4769h1 = (C4769h1) obj;
            if (c4769h1.e() != EnumC4872mf.LoadSuccess && c4769h1.e() != EnumC4872mf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(eu.f(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((C4769h1) obj2).a());
        }
        Set setE0 = du.E0(arrayList2);
        List<C4769h1> list2 = this.a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list2) {
            C4769h1 c4769h2 = (C4769h1) obj3;
            if (c4769h2.e() == EnumC4872mf.LoadSuccess && !setE0.contains(c4769h2.a())) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    @Override // com.ironsource.InterfaceC4757g7
    @NotNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray a(@NotNull EnumC4908of enumC4908of) {
        enumC4908of.getClass();
        int i = a.a[enumC4908of.ordinal()];
        if (i != 1) {
            if (i == 2) {
                List<C4769h1> listA = a();
                ArrayList arrayList = new ArrayList(eu.f(listA, 10));
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C4769h1) it.next()).c());
                }
                return new JSONArray((Collection) arrayList);
            }
            io.p071bidmachine.ads.networks.adaptiverendering.e.b();
            return null;
        }
        List<C4769h1> listB = b();
        ArrayList arrayList2 = new ArrayList(eu.f(listB, 10));
        Iterator<T> it2 = listB.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C4769h1) it2.next()).d());
        }
        return new JSONArray((Collection) arrayList2);
    }

    private final List<C4769h1> b() {
        List<C4769h1> list = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C4769h1) obj).e() != EnumC4872mf.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void a(@NotNull C4769h1 c4769h1) {
        c4769h1.getClass();
        this.a.add(c4769h1);
    }
}
