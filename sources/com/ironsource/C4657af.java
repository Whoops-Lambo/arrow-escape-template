package com.ironsource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.af, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C4657af implements P8, P8.a {

    @NotNull
    private final Map<String, Integer> a = new HashMap();

    @NotNull
    private final Map<String, Integer> b = new HashMap();

    @Override // com.ironsource.P8
    public boolean a() {
        for (String str : this.b.keySet()) {
            str.getClass();
            String str2 = str;
            Integer num = this.a.get(str2);
            num.getClass();
            int iIntValue = num.intValue();
            Integer num2 = this.b.get(str2);
            num2.getClass();
            if (iIntValue < num2.intValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    @Override // com.ironsource.P8
    public boolean b(@NotNull P8.b bVar) {
        boolean z;
        bVar.getClass();
        synchronized (this) {
            String strC = bVar.c();
            if (this.a.containsKey(strC)) {
                Integer num = this.a.get(strC);
                num.getClass();
                if (num.intValue() >= bVar.b()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ironsource.P8.a
    public void a(@NotNull P8.b bVar) {
        bVar.getClass();
        synchronized (this) {
            String strC = bVar.c();
            if (this.a.containsKey(strC)) {
                Map<String, Integer> map = this.a;
                Integer num = map.get(strC);
                num.getClass();
                map.put(strC, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    @Override // com.ironsource.P8.a
    public void a(@NotNull List<? extends P8.b> list) {
        list.getClass();
        for (P8.b bVar : list) {
            this.a.put(bVar.c(), 0);
            this.b.put(bVar.c(), Integer.valueOf(bVar.b()));
        }
    }
}
