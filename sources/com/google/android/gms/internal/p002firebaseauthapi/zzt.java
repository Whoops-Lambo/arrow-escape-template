package com.google.android.gms.internal.p002firebaseauthapi;

import defpackage.d;
import defpackage.e05;
import defpackage.mb5;
import defpackage.nr4;
import defpackage.o45;
import defpackage.wc5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzt {
    public final zzf a;
    public final wc5 b;
    public final int c;

    public zzt(wc5 wc5Var) {
        e05 e05Var = e05.b;
        this.b = wc5Var;
        this.a = e05Var;
        this.c = Integer.MAX_VALUE;
    }

    public static zzt a() {
        o45 o45Var = new o45(Pattern.compile("[.-]"));
        if (o45Var.a("").a.matches()) {
            d.r(zzac.b("The pattern may not match the empty string: %s", o45Var));
            return null;
        }
        zzv zzvVar = new zzv();
        zzvVar.a = o45Var;
        return new zzt(zzvVar);
    }

    public static zzt b(char c) {
        nr4 nr4Var = new nr4(c);
        zzw zzwVar = new zzw();
        zzwVar.a = nr4Var;
        return new zzt(zzwVar);
    }

    public final List c(String str) {
        str.getClass();
        Iterator itA = this.b.a(this, str);
        ArrayList arrayList = new ArrayList();
        while (true) {
            mb5 mb5Var = (mb5) itA;
            if (mb5Var.hasNext()) {
                arrayList.add((String) mb5Var.next());
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }
}
