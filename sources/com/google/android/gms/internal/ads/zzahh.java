package com.google.android.gms.internal.ads;

import defpackage.ar4;
import defpackage.dq3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzahh {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    public final void a(zzap zzapVar) {
        zzao zzaoVar;
        ar4 ar4Var = zzgzb.b;
        zzgyy zzgyyVar = new zzgyy();
        zzao[] zzaoVarArr = zzapVar.a;
        int length = zzaoVarArr.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            zzao zzaoVar2 = null;
            if (i2 >= length) {
                break;
            }
            zzao zzaoVar3 = zzaoVarArr[i2];
            if (zzaka.class.isAssignableFrom(zzaoVar3.getClass())) {
                zzao zzaoVar4 = (zzao) zzaka.class.cast(zzaoVar3);
                if (((zzaka) zzaoVar4).c.equals("iTunSMPB")) {
                    zzaoVar2 = zzaoVar4;
                }
            }
            if (zzaoVar2 != null) {
                zzgyyVar.c(zzaoVar2);
            }
            i2++;
        }
        w wVarF = zzgyyVar.f();
        int i3 = wVarF.d;
        int i4 = 0;
        while (i4 < i3) {
            boolean zB = b(((zzaka) wVarF.get(i4)).d);
            i4++;
            if (zB) {
                return;
            }
        }
        dq3 dq3Var = dq3.b;
        ar4 ar4Var2 = zzgzb.b;
        zzgyy zzgyyVar2 = new zzgyy();
        for (zzao zzaoVar5 : zzapVar.a) {
            if (zzaki.class.isAssignableFrom(zzaoVar5.getClass())) {
                zzaoVar = (zzao) zzaki.class.cast(zzaoVar5);
                if (!dq3Var.zza(zzaoVar)) {
                    zzaoVar = null;
                }
            } else {
                zzaoVar = null;
            }
            if (zzaoVar != null) {
                zzgyyVar2.c(zzaoVar);
            }
        }
        w wVarF2 = zzgyyVar2.f();
        int i5 = wVarF2.d;
        while (i < i5) {
            boolean zB2 = b(((zzaki) wVarF2.get(i)).d);
            i++;
            if (zB2) {
                return;
            }
        }
    }

    public final boolean b(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            String str2 = zzfq.a;
            int i = Integer.parseInt(strGroup, 16);
            int i2 = Integer.parseInt(matcher.group(2), 16);
            if (i <= 0 && i2 <= 0) {
                return false;
            }
            this.a = i;
            this.b = i2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
