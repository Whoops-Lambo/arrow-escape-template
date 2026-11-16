package com.vungle.ads.internal.task;

import android.os.Bundle;
import defpackage.gg0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes5.dex */
public final class a {
    public static e a(String str, List list, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            list = gg0.a;
        }
        list.getClass();
        e eVarH = new e("CleanupJob").h();
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("AD_ID_KEY", str);
        }
        if (str == null) {
            bundle.putStringArrayList("STALE_DIRS_KEY", new ArrayList<>(list));
        }
        return eVarH.a(bundle).a(str == null);
    }
}
