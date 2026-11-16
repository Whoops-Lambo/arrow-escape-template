package com.mbridge.msdk.config.component.common.express.node;

import defpackage.jc1;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes8.dex */
public class i extends d {
    String a;

    @Override // com.mbridge.msdk.config.component.common.express.node.d
    public Object a(com.mbridge.msdk.config.component.common.express.d dVar, com.mbridge.msdk.config.component.common.express.e eVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Object objJ;
        boolean zStartsWith = this.a.startsWith("$");
        String str = this.a;
        if (zStartsWith) {
            objJ = com.mbridge.msdk.config.component.common.express.c.a(str, aVar);
        } else if (str.startsWith("\\") && this.a.endsWith("\\\"")) {
            String str2 = this.a;
            objJ = str2.substring(1, str2.length() - 2).concat("\"");
        } else {
            objJ = (this.a.startsWith("\"") && this.a.endsWith("\"")) ? jc1.j(1, 1, this.a) : this.a;
        }
        if (eVar != com.mbridge.msdk.config.component.common.express.e.ASSIGNMENT) {
            return objJ;
        }
        com.mbridge.msdk.config.component.common.express.entities.a aVar2 = new com.mbridge.msdk.config.component.common.express.entities.a();
        aVar2.a(aVar);
        aVar2.a(this.a.substring(1));
        return aVar2;
    }

    public i(String str) {
        this.a = str;
    }
}
