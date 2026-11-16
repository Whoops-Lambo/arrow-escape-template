package com.google.android.gms.auth.api.accounttransfer;

import android.os.Bundle;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-42694b01eabe712a000aa644f349eba7ebddeb4be531d85a6ae3ce68c02c71c6 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzr implements Api.ApiOptions.Optional {
    static {
        Bundle bundle = new Bundle();
        if (bundle.containsKey("accountTypes")) {
            return;
        }
        bundle.putStringArrayList("accountTypes", new ArrayList<>(0));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzr) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
