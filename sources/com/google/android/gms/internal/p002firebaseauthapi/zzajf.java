package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzajf {
    public final List a;

    public zzajf(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            this.a = Collections.EMPTY_LIST;
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, Strings.emptyToNull((String) arrayList.get(i)));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    public zzajf(int i) {
        this.a = new ArrayList();
    }

    public zzajf() {
        this(0);
    }
}
