package com.mbridge.msdk.config.component.animation;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public class g {
    private boolean c;
    private int a = 1;
    private String b = "";
    private List<e> d = new ArrayList();

    public void a(List<e> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.d = list;
    }

    public List<e> b() {
        return this.d;
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public void a(boolean z) {
        this.c = z;
    }

    public String a() {
        return this.b;
    }
}
