package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ʕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0458 {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C1323 f929;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1199 f930;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ boolean f931;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ String f932;

    public C0458(C1323 c1323, String str, boolean z, C1199 c1199) {
        this.f929 = c1323;
        this.f932 = str;
        this.f931 = z;
        this.f930 = c1199;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m479(Object obj, Method method, Object[] objArr) {
        if (method != null) {
            try {
                String str = this.f932 + StringFog.decrypt("4g==\n", "zDuI2Uht9a4=\n") + method.getName();
                ArrayList arrayListM931 = C1323.m931(this.f929, objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(InterfaceC0672) obj});
                ArrayList arrayList = new ArrayList();
                if (this.f931) {
                    arrayList.add(arrayListM931);
                    arrayListM931 = arrayList;
                }
                C0752 c0752 = this.f930.f3626;
                C1199.m874(c0752.f1993, str, true, false, arrayListM931);
                C1199 c1199 = c0752.f1993;
                C0790 c0790 = new C0790(c0752, str, false, arrayListM931);
                c1199.getClass();
                try {
                    AbstractC4631n.m405(c0790);
                } catch (Throwable unused) {
                }
                C1199 c11910 = c0752.f1993;
                C0790 c0791 = new C0790(c0752, str, true, arrayListM931);
                c11910.getClass();
                try {
                    AbstractC4631n.m403(new C0628(c0791));
                } catch (Throwable unused2) {
                }
            } catch (Throwable th) {
                String strM877 = this.f930.m877();
                StringBuilder sb = new StringBuilder();
                sb.append(StringFog.decrypt("7qC+PX0Iec7dvac7YU8w\n", "q9LMUg8oEKA=\n"));
                sb.append(method.getName());
                sb.append(StringFog.decrypt("ZcAXvolxc6sqw1I=\n", "Ra1yyuEeF4s=\n"));
                sb.append(this.f932);
                AbstractC1290.m905(strM877, AbstractC1156.m868("1SzkDTdVSvaH\n", "9UCNfkMwJJM=\n", sb), th, false);
            }
        }
    }
}
