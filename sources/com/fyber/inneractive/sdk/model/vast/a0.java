package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x1;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends g {
    public String i;

    public static a0 c(Node node) {
        a0 a0Var = new a0();
        super.b(node);
        a0Var.i = x1.a(x1.d(node, "VASTAdTagURI"));
        return a0Var;
    }

    public a0() {
        this.f = 1;
    }
}
