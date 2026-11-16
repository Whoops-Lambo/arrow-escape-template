package com.bytedance.sdk.component.ahm.kgy;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes.dex */
public final class ct extends twf {
    List<String> ahm;
    List<String> kgy;

    /* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
    public static final class kgy {
        private final List<String> kgy = new ArrayList();
        private final List<String> ahm = new ArrayList();

        public kgy kgy(String str, String str2) {
            this.kgy.add(str);
            this.ahm.add(str2);
            return this;
        }

        public ct kgy() {
            return new ct(this.kgy, this.ahm);
        }
    }

    public ct(List<String> list, List<String> list2) {
        this.kgy = list;
        this.ahm = list2;
    }
}
