package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.Bundleable;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes.dex */
public final class C2165Lt {
    public static String[] A00 = {"4iWaQX9QL0TV7ciG", "xT1DBnx3cgqSI1EHRIJwYOLbDuZXZSSy", "zf4ERY3epGDBpzw7qq", "RVk2EvtAO6JxDlUsvytnaWlyeZGN0zQx", "4SbbE41KWjNAZ40flvn9aeYMmzNdDWTu", "VvpAlJlvg5jCIDhdzyGj2bOvFlVVLQ9f", "Y1o2uThHomph9fqnYqxDCn", "j5QvKsjh7m2QCLDYHybofUYs0e8V1AN4"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:656)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T extends InterfaceC2115Jt> AbstractC18519l<T> A01(InterfaceC2114Js<T> interfaceC2114Js, List<Bundle> list) {
        C17314e c17314eA01 = AbstractC18519l.A01();
        for (int i = 0; i < list.size(); i++) {
            c17314eA01.A04(interfaceC2114Js.A7F((Bundle) AbstractC2159Ln.A01(list.get(i))));
        }
        return c17314eA01.A05();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Js != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.Jt> */
    public static <T extends InterfaceC2115Jt> SparseArray<T> A00(InterfaceC2114Js<T> interfaceC2114Js, SparseArray<Bundle> sparseArray) {
        Bundleable.Creator<T> creator = new SparseArray<>(sparseArray.size());
        int i = 0;
        while (true) {
            int size = sparseArray.size();
            int i2 = A00[1].charAt(5);
            if (i2 == 84) {
                throw new RuntimeException();
            }
            A00[0] = "yJ7q7c4kcteAallN";
            if (i < size) {
                int i3 = sparseArray.keyAt(i);
                creator.put(i3, interfaceC2114Js.A7F(sparseArray.valueAt(i)));
                i++;
            } else {
                return creator;
            }
        }
    }

    public static void A02(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) N1.A0f(C2165Lt.class.getClassLoader()));
        }
    }
}
