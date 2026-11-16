package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.x1;
import defpackage.nj;
import java.util.ArrayList;
import org.w3c.dom.Node;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class u {
    public String a;
    public ArrayList b;

    public static u a(Node node) {
        f fVar;
        u uVar = new u();
        uVar.a = x1.b(node, "version");
        ArrayList arrayListC = x1.c(node, "Ad");
        if (!arrayListC.isEmpty()) {
            uVar.b = new ArrayList();
            int size = arrayListC.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                Node node2 = (Node) obj;
                if (node2 == null) {
                    fVar = null;
                } else {
                    f fVar2 = new f();
                    fVar2.a = x1.b(node2, "id");
                    Node nodeD = x1.d(node2, "Wrapper");
                    if (nodeD != null) {
                        fVar2.b = a0.c(nodeD);
                    }
                    Node nodeD2 = x1.d(node2, "InLine");
                    if (nodeD2 != null) {
                        fVar2.c = p.c(nodeD2);
                    }
                    fVar = fVar2;
                }
                uVar.b.add(fVar);
            }
        }
        return uVar;
    }

    public final String toString() {
        return nj.q(new StringBuilder("Vast: version - "), this.a, "\nAds: ");
    }
}
