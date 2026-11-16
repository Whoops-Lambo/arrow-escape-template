package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x1;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class p extends g {
    public static p c(Node node) {
        p pVar = new p();
        super.b(node);
        x1.a(x1.d(node, "AdTitle"));
        x1.a(x1.d(node, "Description"));
        return pVar;
    }
}
